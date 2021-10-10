package com.salah.tryjsondatabasedatatype;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test-json")
public class Controller {
    ARepository repository;

    public Controller(ARepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> addModel(@RequestBody TestJSONModel testJSONModel) {
        return new ResponseEntity<>(repository.save(testJSONModel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return  ResponseEntity.ok(repository.findAll());
    }

}
