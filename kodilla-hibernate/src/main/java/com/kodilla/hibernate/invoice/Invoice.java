package com.kodilla.hibernate.invoice;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<AbstractReadWriteAccess.Item> items = new ArrayList<>();

    public Invoice(String number, List<AbstractReadWriteAccess.Item> items) {
        this.number = number;
        this.items = items;
    }

    public Invoice (String number){
        this.number = number;
    }

    public Invoice() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = AbstractReadWriteAccess.Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @Column(name = "ITEM_ID", nullable = false)
    public List<AbstractReadWriteAccess.Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<AbstractReadWriteAccess.Item> items) {
        this.items = items;
    }
}