package com.uspsfast.github_demo.customer;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling customer-related business logic.
 */
@Service
public class CustomerService {
    private final CustomerDao customerDao;

    /**
     * Constructs a CustomerService with the specified CustomerDao.
     *
     * @param customerDao the CustomerDao to be used for data access operations
     */
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    /**
     * Retrieves all customers.
     *
     * @return a list of all customers
     */
    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }

    /**
     * Retrieves a customer by their ID.
     *
     * @param id the ID of the customer to retrieve
     * @return the customer with the specified ID
     * @throws IllegalArgumentException if no customer with the specified ID is found
     */
    public Customer getCustomer(Integer id) {
        return customerDao.selectCustomerById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "customer with id [%s] not found".formatted(id)
                ));
    }
}