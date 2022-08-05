package com.ztrzaska.elasticsearch.service;

import com.ztrzaska.elasticsearch.model.PersonDocument;
import com.ztrzaska.elasticsearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public void save(final PersonDocument personDocument) {
        personRepository.save(personDocument);
    }

    public PersonDocument findById(final String id) {
        return personRepository.findById(id).orElse(null);
    }

    public List<PersonDocument> findByFirstName(final String firstName) {
        return personRepository.findByFirstNameUsingCustomQuery(firstName);
    }
}
