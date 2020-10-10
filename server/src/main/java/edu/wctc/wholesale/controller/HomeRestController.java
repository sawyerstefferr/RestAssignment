package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.dto.OrderInfo;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.service.OrderService;
import edu.wctc.wholesale.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/orders/")
public class HomeRestController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;


    @Autowired
    private ModelMapper modelMapper;

    private OrderInfo convertToDto(Order order) {
        OrderInfo orderInfo = modelMapper.map(order, OrderInfo.class);
        return orderInfo;
    }

    private Order convertToEntity(OrderInfo orderInfo) throws Exception {
        Order order = modelMapper.map(orderInfo, Order.class);
        // Can't save a parent object with transient child objects
        Customer customer = customerService.getCustomer(order.getCustomer().getCustomerId());
        order.setCustomer(customer);
        return order;
    }
    @GetMapping("/")
    public String getOrdersPage(){
        return "index";
    }
    @PutMapping("/")
    public List<OrderInfo> getOrders() {
        return orderService
                .getOrders()
                .stream()
                .map(this::convertToDto).collect(Collectors.toList());
    }
}
