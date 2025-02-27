# Common Library For Kafka Project

This project provides libraries for Kafka Producer-Consumer projects.

## Classes
#### [LogMessage.java](src/main/java/com/kafein/common/model/LogMessage.java): Common model class for kafka/redis message
#### [RedisConfig.java](src/main/java/com/kafein/common/config/RedisConfig.java): Config for redis
#### [GlobalExceptionHandler.java](src/main/java/com/kafein/common/exception/GlobalExceptionHandler.java): Common exception handler

## Resources

#### [docker-compose.yml](src/main/resources/docker/docker-compose.yml): to initialize kafka and redis in the docker
#### [JMeter_Test_Kafka_Producer](src/main/resources/test/JMeter_Test_Kafka_Producer.jmx): JMeter test plan for log-producer-service


## 📋 Requirements  
- Java 17+   
- Maven  

## 🚀 Build the Application

```bash
mvn clean install
```
