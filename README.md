# Spring Boot App with Kafka

## Start the ZooKeeper service
Navigate to the directory for the Kafka that you just donwloaded and extracted and run the following command:

``bin/zookeeper-server-start.sh config/zookeeper.properties``

## Start the Kafka broker service
Open another terminal session in the same location and run:

``bin/kafka-server-start.sh config/server.properties``