package com.ztrzaska.elasticsearch.controller;

import com.ztrzaska.elasticsearch.model.PersonDocument;
import com.ztrzaska.elasticsearch.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/create")
    public void save(@RequestBody PersonDocument personDocument) {
        personService.save(personDocument);
    }

    @GetMapping("/{id}")
    public PersonDocument findById(@PathVariable String id) {
        return personService.findById(id);
    }
}
