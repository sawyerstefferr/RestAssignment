package edu.wctc.wholesale.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @Column(name="product_id")
    private int productId;
    @Column(name="name")
    private String name;
    @Column(name="cost")
    private double cost;
}
