package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("orderList",orderService.getOrders());
        return "index";
    }
}
