package com.cyclestore.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_product")
public class UserProduct {
    /*
     * properties
     * entity relation
     * constructor
     * getters, setters,
     * methods
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name="fk_user"))
    private User user;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "pro_id", foreignKey = @ForeignKey(name="fk_product"))
    private Product product;
}
