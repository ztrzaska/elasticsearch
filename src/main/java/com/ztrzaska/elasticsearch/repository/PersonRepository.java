package com.ztrzaska.elasticsearch.repository;

import com.ztrzaska.elasticsearch.model.PersonDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<PersonDocument, String> {
}
