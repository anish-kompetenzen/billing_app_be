package com.billing.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.app.models.ProductModel;
import com.billing.app.models.CashierModel;
import com.billing.app.repositories.ProductRepository;

@Service
public class ProductServImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public ProductModel addProduct(ProductModel model) {
		return repository.save(model);
	}

	@Override
	public ProductModel updateProduct(ProductModel model) {
		Optional<ProductModel> op = repository.findById(model.getProductId());
		if (op.isPresent()) {
			return repository.save(model);
		}
		return new ProductModel();
	}

	@Override
	public ProductModel deleteProduct(Integer id) {
		Optional<ProductModel> op = repository.findById(id);
		if (op.isPresent()) {
			repository.deleteById(id);
			return op.get();
		}
		return new ProductModel();
	}

	@Override
	public ProductModel viewProduct(Integer id) {
		Optional<ProductModel> op = repository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return new ProductModel();
	}

	@Override
	public List<ProductModel> viewProducts() {
		return repository.findAll();
	}

	@Override
	public ProductModel increaseProductQty(Integer id) {
		Optional<ProductModel> op = repository.findById(id);
		if (op.isPresent()) {
			ProductModel pdt = op.get();
			if (pdt.getProductQuantity() >= 100) {
				pdt.setProductQuantity(100);
			} else {
				pdt.setProductQuantity(pdt.getProductQuantity() + 1);
			}
			return repository.save(pdt);
		}
		return new ProductModel();
	}

	@Override
	public ProductModel decreaseProductQty(Integer id) {
		Optional<ProductModel> op = repository.findById(id);
		if (op.isPresent()) {
			ProductModel pdt = op.get();
			if (pdt.getProductQuantity() <= 0) {
				pdt.setProductQuantity(0);
			} else {
				pdt.setProductQuantity(pdt.getProductQuantity() - 1);
			}
			return repository.save(pdt);
		}
		return new ProductModel();
	}
}
