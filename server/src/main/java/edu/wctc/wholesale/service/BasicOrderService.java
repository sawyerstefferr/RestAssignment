package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicOrderService implements OrderService {
    @Autowired
    private OrderRepository orderRepo;
    @Override
    public List<Order> getOrders(){
        List<Order> list = new ArrayList<>();
        orderRepo.findAll().forEach(list::add);
        return list;
    }
}
