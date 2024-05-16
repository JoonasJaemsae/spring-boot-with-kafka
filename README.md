# Spring Boot App with Kafka

## Start the ZooKeeper service

Navigate to the directory for Kafka and run the following command:

``bin/zookeeper-server-start.sh config/zookeeper.properties``

## Start the Kafka broker service
Open another terminal session in the same location and run:

``bin/kafka-server-start.sh config/server.properties``

## Sending requests to the app via REST API

By default, a topic called ``myTopic`` has been configured to listen to messages of type ``String``.
Similarly, a topic called ``myJsonTopic`` has been configured to listen to JSON messages.

Use the run command in your IDE to run the app,
or open yet another terminal session and run the app in the project root:

``mvn spring-boot:run``

String messages can be sent as a GET request to the address

``http:localhost:8080/api/v1/kafka/publish?message={your message here}``

JSON messages can be sent as a POST request to the address

``http://localhost:8080/api/v1/kafka/publish``

## Handy commands

#### Create a topic

``bin/kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092``

#### List all events and listen to new ones in a topic

``bin/kafka-console-consumer.sh --topic myTopic --from-beginning --bootstrap-server localhost:9092``

#### List all topics

``bin/kafka-topics.sh --list --bootstrap-server localhost:9092``