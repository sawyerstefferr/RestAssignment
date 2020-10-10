package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="wholesale_order")
public class Order {
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="purchase_order_num")
    private String purchaseOrderNum;

    @Column(name="terms")
    private String terms;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name="purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name="shipped_date")
    private LocalDateTime shippedDate;

    /*
            create table wholesale_order
        (
            order_id int auto_increment,
            purchase_order_num varchar(100) not null,
            terms varchar(100) not null,
            customer_id int not null,
            product_id int not null,
            purchase_date timestamp not null,
            shipped_date timestamp,
            constraint order_pk
                primary key (order_id),
            constraint order_customer_customer_id_fk
                foreign key (customer_id) references customer (customer_id),
            constraint order_product_product_id_fk
                foreign key (product_id) references product (product_id)
        );
     */
}
