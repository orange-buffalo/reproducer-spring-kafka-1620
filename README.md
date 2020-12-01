# Reproducer for spring-kafka#1620

1. Start Kafka. Reproducer expects it to be available at `localhost:9092`.
1. Start `com.example.demo.DemoApplication`.
1. Wait until `kakfa-coordinator-heartbeat-thread` threads spin up.
1. Stop Kafka.
1. Observe CPU usage and threads behaviour (see spring-projects/spring-kafka#1620 for details).

