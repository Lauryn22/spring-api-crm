
package fr.m2i.springapicrm.service;

import fr.m2i.springapicrm.model.Customer;
import java.util.List;


public interface ICustomerService {
    List<Customer> findAll();
    Customer findBydId(Long id);
}

