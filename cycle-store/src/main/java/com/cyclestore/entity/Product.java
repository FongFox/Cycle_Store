package com.cyclestore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "product")
@Getter @Setter
@ToString
public class Product {
    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "stock")
    private int stock;
    @Column(name = "create_at")
    @CreatedDate
    private Date createAt;

    //Already have no Arg Constructor
}
