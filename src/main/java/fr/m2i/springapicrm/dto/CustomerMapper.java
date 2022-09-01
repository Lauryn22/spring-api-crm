
package fr.m2i.springapicrm.dto;

import fr.m2i.springapicrm.model.Customer;


public class CustomerMapper {
    public static CustomerDTO buildCustomerDTO(Customer customer) {
        if (customer == null){
            return new CustomerDTO();
        }
        String state = customer.getState() != null && customer.getState()? "ACTIF" : "INACTIF"; 
        return new CustomerDTO(
        customer.getId(),
        customer.getLastname(),
        customer.getFirstname(),
        customer.getCompany(),
        customer.getMail(),
        customer.getPhone(),
        customer.getAddress(),
        customer.getZipCode(),
        customer.getCity(),
        customer.getCountry(),
        state
        );
    }
    
    public static Customer buildCustomer(CustomerDTO dto) {
        return null;
    }
    
    public static Customer copy(Customer customer, Customer content) {
        return null;
    }
}
