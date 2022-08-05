package com.ztrzaska.elasticsearch.repository;

import com.ztrzaska.elasticsearch.model.PersonDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PersonRepository extends ElasticsearchRepository<PersonDocument, String> {


    Page<PersonDocument> findByFirstName(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"firstName\": \"?0\"}}]}}")
    List<PersonDocument> findByFirstNameUsingCustomQuery(String firstName);

}
