package edu.wctc.wholesale.dto;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OrderInfo {
    private String poNumber;
    private String productName;
    private String customerName;
    private String terms;
    private LocalDateTime date;
    private LocalDateTime shipped;
    private double total;
    /*
                tr.append("<td>" + order.customerName + "</td>");
            tr.append("<td>" + order.date + "</td>");
            tr.append("<td>" + order.poNumber + "</td>");
            tr.append("<td>" + order.productName + "</td>");
            tr.append("<td>" + order.terms + "</td>");
            tr.append("<td>" + order.shipped + "</td>");
            tr.append("<td>" + order.total + "</td>");
     */
}
