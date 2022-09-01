
package fr.m2i.springapicrm.service;

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
        throw new UnsupportedOperationException("");
    }
    
    @Override
    public Customer findBydId(Long id) throws NotFoundException {
        return repo.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Product with id: " + id + " was not found");
        });
    }
    
}
