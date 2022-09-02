
package fr.m2i.springapicrm.service;

import fr.m2i.springapicrm.model.Customer;
import java.util.List;


public interface ICustomerService {
    List<Customer> findAll();
    
    Customer findById(Long id);
    
    Customer save(Customer customer);
    
    Customer update(Long id, Customer customer);
}

