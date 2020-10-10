package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.CustomerRepository;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicCustomerService implements CustomerService {
    @Autowired
    private CustomerRepository customerRepo;
    @Override
    public Customer getCustomer(int id){

        Optional<Customer> c = customerRepo.findById(id);
        if (c.isPresent()) {
            return c.get();
        }

        return null;
    }
}
