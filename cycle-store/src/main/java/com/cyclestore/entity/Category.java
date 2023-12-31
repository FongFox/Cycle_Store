package com.cyclestore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "category")
@Getter @Setter
@ToString
public class Category {
    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "create_at")
    @CreatedDate
    private Date createAt;

    //Already have no Arg Constructor
}
