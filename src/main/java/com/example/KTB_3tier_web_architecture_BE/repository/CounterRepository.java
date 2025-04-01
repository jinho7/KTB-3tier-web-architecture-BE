package com.example.KTB_3tier_web_architecture_BE.repository;

import com.example.KTB_3tier_web_architecture_BE.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Long> {
}