# spring-boot-kafka-splunk

**To run app:**

1. Start Apache Zookeeper-

'apache-installed-directory'>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start Apache Kafka-

'apache-installed-directory'>.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Start Spring Boot Application
4. Start the Consumer

'apache-installed-directory'>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic sample_topic_to_send --from-beginning

5. Start the URL:

http://localhost:8080/kafka/producer?message=test
