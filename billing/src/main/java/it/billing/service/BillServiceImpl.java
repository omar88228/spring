package it.billing.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import it.billing.entity.Bill;
import it.billing.entity.Customer;
import it.billing.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {

	private BillRepository repository;
	private StreamBridge bridge;
	private Customer customer ;

	@Autowired
	public BillServiceImpl(BillRepository repository, StreamBridge bridge ) {
		super();
		this.repository = repository;
		this.bridge = bridge;
		
		
	}
	
	@Override
	public Bill add(Bill bill) {
		bridge.send("T1", bill.getCustomerId());
		
		repository.save(bill);
		System.out.println("omar");
		return bill;
	}
	@Override
	public List<Bill> showAll() {
		
		return null;
	}
	@Override
	public Bill showById(int id) {
		Bill bill = repository.findById(id).get();
		bridge.send("T1", bill.getCustomerId());
		bill.setCustomer(customer);
		System.out.println(customer+" fuckk");
		return bill;
	}
	@Override
	public Bill deleteById(int id) {
		
		return null;
	}
	@Override
	public Bill addProductItem(int id, int productItemId) {
		
		return null;
	}
	@Override
	public Bill updateBillCustomerId(int idBill, int customerId) {
		
		return null;
	}
	@Override
	public Bill updateBillingDate(int id, Date date) {
		
		return null;
	}

	@Bean
	public Consumer<Customer> customerConsumer(){
		return (input)->{
			System.out.println(input);
			customer= new Customer();
			customer.setId(input.getId());
			customer.setMail(input.getMail());
			customer.setName(input.getName());
			System.out.println(customer+"heyyy");
		};
		
	}

}
