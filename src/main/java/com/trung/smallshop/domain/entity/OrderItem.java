/*
 * Created on 24 Mar 2018 ( Time 17:48:00 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.trung.smallshop.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

/**
 * Persistent class for entity stored in table "OrderItem"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="UnitPrice", nullable=false)
    private BigDecimal unitPrice    ;

    @Column(name="Quantity", nullable=false)
    private Integer    quantity     ;

	// "orderid" (column "OrderId") is not defined by itself because used as FK in a link 
	// "productid" (column "ProductId") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="ProductId", referencedColumnName="Id")
    private Product product     ;

    @ManyToOne
    @JoinColumn(name="OrderId", referencedColumnName="Id")
    private Order order       ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public OrderItem() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : UnitPrice ( decimal ) 
    public void setUnitPrice( BigDecimal unitPrice ) {
        this.unitPrice = unitPrice;
    }
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    //--- DATABASE MAPPING : Quantity ( int ) 
    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return this.quantity;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setProduct( Product product ) {
        this.product = product;
    }
    public Product getProduct() {
        return this.product;
    }

    public void setOrder( Order order ) {
        this.order = order;
    }
    public Order getOrder() {
        return this.order;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(unitPrice);
        sb.append("|");
        sb.append(quantity);
        return sb.toString(); 
    } 

}
