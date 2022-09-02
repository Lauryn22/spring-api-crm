
package fr.m2i.springapicrm.service;

import fr.m2i.springapicrm.dto.CustomerMapper;
import fr.m2i.springapicrm.exception.NotFoundException;
import fr.m2i.springapicrm.model.Customer;
import fr.m2i.springapicrm.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    private final CustomerRepository repo;

    @Autowired
    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Customer with id: " + id + " was not found"));
    }

    @Override
    public Customer save(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        return null;
    }
}
