package com.trung.smallshop.domain.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Product implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;
    private String productName;
    private BigDecimal unitPrice;

    @Column(name = "package")
    private String productPackage;
    @Column(name = "IsDiscontinued")
    private Boolean isDiscontinued;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SupplierId")
    private Supplier supplier;

    @OneToMany(mappedBy="product", targetEntity=OrderItem.class)
    private List<OrderItem> listOfOrderItem;

    public Product() {
    }

    public Product(Integer id, String productName, BigDecimal unitPrice, String productPackage, Boolean isDiscontinued) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.productPackage = productPackage;
        this.isDiscontinued = isDiscontinued;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductPackage() {
        return productPackage;
    }

    public void setProductPackage(String productPackage) {
        this.productPackage = productPackage;
    }

    public Boolean getDiscontinued() {
        return isDiscontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        isDiscontinued = discontinued;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<OrderItem> getListOfOrderItem() {
        return listOfOrderItem;
    }

    public void setListOfOrderItem(List<OrderItem> listOfOrderItem) {
        this.listOfOrderItem = listOfOrderItem;
    }
}
