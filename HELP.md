# Elasticsearch with Spring Boot

### Reference Documentation


Running elasticsearch and kibana server
>docker run -d -p 9200:9200 -p 5601:5601 nshou/elasticsearch-kibana

Elasticsearch
```
http://localhost:9200?pretty
```

Kibana devtools
```
http://localhost:5601/app/dev_tools#/console
```

Example kibana query

```
POST /persons/_search
{
  "query": {
    "match_all": {}
  }
}
```

For further reference, please consider the following sections:

* [Elasticsearch documentation](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html)
* [Spring Data Elasticsearch (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#data.nosql.elasticsearch)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)

