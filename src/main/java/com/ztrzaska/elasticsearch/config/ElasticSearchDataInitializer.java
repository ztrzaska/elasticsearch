package com.ztrzaska.elasticsearch.config;

import com.ztrzaska.elasticsearch.model.PersonDocument;
import com.ztrzaska.elasticsearch.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ElasticSearchDataInitializer implements ApplicationRunner  {

    private final PersonService personService;

    @Override
    public void run(ApplicationArguments args) {
        initialize();
    }

    public void initialize() {
        if (personService.findById("1") == null) {
            createPerson("1", "Jeff", "Bezos", 55);
            createPerson("2", "Bill", "Gates", 65);
            createPerson("3", "Warren", "Buffet", 70);
            createPerson("4", "Gautam", "Adani", 60);
            createPerson("5", "Mukesh", "Ambani", 54);

        }
    }

    private void createPerson(String id, String firstName, String lastName, Integer age) {
        PersonDocument personDocument =
                PersonDocument.builder().id(id).firstName(firstName).lastName(lastName).age(age).build();
        personService.save(personDocument);
    }

}
