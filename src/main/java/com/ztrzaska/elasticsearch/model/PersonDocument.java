package com.ztrzaska.elasticsearch.model;

import com.ztrzaska.elasticsearch.helper.Indexes;
import org.springframework.data.elasticsearch.annotations.FieldType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = Indexes.PERSON_INDEX)
@Setting(settingPath = "static/persons-settings.json")
@Getter @Setter
public class PersonDocument {

    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String firstName;
    @Field(type = FieldType.Text)
    private String lastName;
    @Field(type = FieldType.Integer)
    private Integer age;

}
