# Elasticsearch implementation with Spring Boot

### Getting Started

Main purpose of project is using elasticsearch with spring boot. It has simple queries to database and rest endpoints. Logs are configured with logstash and can be seen via kibana.

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

Logstash
```
logstash -f <file_path>
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

Putting data from file, db via logstash to elasticearch

```
logstash -f "D:\\logstash.conf"
logstash -f "D:\\logstash-csv.conf"
logstash -f "D:\\logstash-db.conf"
```


### Reference Documentation

For further reference, please consider the following sections:

* [Elasticsearch documentation](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html)
* [Kibana Guide](https://www.elastic.co/guide/en/kibana/current/index.html)
* [Logstash](https://www.elastic.co/guide/en/logstash/master/index.html)
* [Spring Data Elasticsearch](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#data.nosql.elasticsearch)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)

