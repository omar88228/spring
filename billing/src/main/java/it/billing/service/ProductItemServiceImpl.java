package it.billing.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.billing.entity.Product;
import it.billing.entity.ProductItem;
import it.billing.openfeign.ProductRestClient;
import it.billing.repository.ProductItemRepository;

@Service
public class ProductItemServiceImpl implements ProductItemService {

	private ProductItemRepository repository;
	private ProductRestClient productRestClient;
	@Override
	public ProductItem add(ProductItem productItem) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProductItem> showAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductItem showById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductItem deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductItem updateById(int id, ProductItem productItem) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductItem updatePrice(int id, double price) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductItem updateQuantity(int id, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
