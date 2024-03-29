package com.example.onlinebookstore.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @OneToMany(targetEntity = Book.class)
    private List<Book> books = new ArrayList<>();

    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public void setUserId(Long userId) {
        // You can implement this method if needed, but typically setting the user ID directly is not recommended
    }

    // Constructors, getters and setters are automatically generated by Lombok
}
