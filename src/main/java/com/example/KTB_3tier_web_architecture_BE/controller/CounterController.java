package com.example.KTB_3tier_web_architecture_BE.controller;

import com.example.KTB_3tier_web_architecture_BE.entity.Counter;
import com.example.KTB_3tier_web_architecture_BE.repository.CounterRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/counter")
public class CounterController {

    private final CounterRepository repository;

    public CounterController(CounterRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public int get() {
        return repository.findById(1L).map(Counter::getCount).orElse(0);
    }

    @PostMapping("/up")
    public int increase() {
        Counter counter = repository.findById(1L).orElse(new Counter(0));
        counter.increase();
        repository.save(counter);
        return counter.getCount();
    }

    @PostMapping("/down")
    public int decrease() {
        Counter counter = repository.findById(1L).orElse(new Counter(0));
        counter.decrease();
        repository.save(counter);
        return counter.getCount();
    }
}