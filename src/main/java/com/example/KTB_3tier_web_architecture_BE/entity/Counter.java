package com.example.KTB_3tier_web_architecture_BE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int count;

    public Counter() {}

    public Counter(int count) {
        this.count = count;
    }

    public Long getId() { return id; }
    public int getCount() { return count; }

    public void increase() { this.count++; }
    public void decrease() { this.count--; }
}