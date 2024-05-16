# Spring Boot App with Kafka

## Creating a topic

``bin/kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092``

## Start the ZooKeeper service
Navigate to the directory for the Kafka that you just donwloaded and extracted and run the following command:

``bin/zookeeper-server-start.sh config/zookeeper.properties``

## Start the Kafka broker service
Open another terminal session in the same location and run:

``bin/kafka-server-start.sh config/server.properties``

## Listen to events in a topic

``bin/kafka-console-consumer.sh --topic test-topic --from-beginning --bootstrap-server localhost:9092``

## Listing all topics

$ bin/kafka-topics.sh --list --bootstrap-server localhost:9092
