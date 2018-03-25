package com.trung.smallshop.domain.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
// Order is a Reserve Word and needs to be escaped in query using square bracket [] while querying.
// Otherwise, you will get error incorrect syntax near the keyword 'OrderDto'.
@Table(name = "`Order`")
public class Order implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    private String orderNumber;
    private BigDecimal totalAmount;

    @OneToMany(mappedBy="order", cascade = CascadeType.ALL,
            orphanRemoval = true, targetEntity=OrderItem.class)
    private List<OrderItem> listOfOrderItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerId")
    private Customer customer;

    public Order() {
    }

    public Order(Date orderDate, String orderNumber, BigDecimal totalAmount, Customer customer) {
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getListOfOrderItem() {
        return listOfOrderItem;
    }

    public void setListOfOrderItem(List<OrderItem> listOfOrderItem) {
        this.listOfOrderItem = listOfOrderItem;
    }
}
