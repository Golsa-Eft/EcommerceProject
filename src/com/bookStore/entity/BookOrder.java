package com.bookStore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity(name = "BookOrder")
@Table(name = "BookOrder")
public class BookOrder implements Serializable {
    private int BookOrderId;
    private String ShippingAddress;
    private int fk_customer_id;
    private Date fk_order_detail;
    /*relation with orderDetail*/
    @Id
    @Column(name = "BOOKORDERID", columnDefinition = "NUMBER", unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQ",
            initialValue = 1, allocationSize = 1)
    public int getBookOrderId() {
        return BookOrderId;
    }

    public void setBookOrderId(int bookOrderId) {
        BookOrderId = bookOrderId;
    }
    @Column(name = "ShippingAddress")
    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public int getFk_customer_id() {
        return fk_customer_id;
    }

    public void setFk_customer_id(int fk_customer_id) {
        this.fk_customer_id = fk_customer_id;
    }

    public Date getFk_order_detail() {
        return fk_order_detail;
    }

    public void setFk_order_detail(Date fk_order_detail) {
        this.fk_order_detail = fk_order_detail;
    }
}
