/*
 * Copyright Paolo Patierno.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.ppatierno.formula1;

public class F1ConsumerAppConfig {

    private static final String KAFKA_BOOTSTRAP_SERVERS_ENV = "KAFKA_BOOTSTRAP_SERVERS";
    private static final String F1_DRIVERS_GROUP_ID_ENV = "F1_DRIVERS_GROUP_ID";
    private static final String F1_EVENTS_GROUP_ID_ENV = "F1_EVENTS_GROUP_ID";
    private static final String F1_DRIVERS_MAX_SPEED_GROUP_ID_ENV = "F1_DRIVERS_MAX_SPEED_GROUP_ID";
    private static final String F1_DRIVERS_TOPIC_ENV = "F1_DRIVERS_TOPIC";
    private static final String F1_EVENTS_TOPIC_ENV = "F1_EVENTS_TOPIC";
    private static final String F1_DRIVERS_MAX_SPEED_TOPIC_ENV = "F1_DRIVERS_MAX_SPEED_TOPIC";

    private static final String DEFAULT_KAFKA_BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String DEFAULT_F1_DRIVERS_GROUP_ID = "f1-drivers-group";
    private static final String DEFAULT_F1_EVENTS_GROUP_ID = "f1-events-group";
    private static final String DEFAULT_F1_DRIVERS_MAX_SPEED_GROUP_ID = "f1-drivers-max-speed-group";
    private static final String DEFAULT_F1_DRIVERS_TOPIC = "f1-telemetry-drivers";
    private static final String DEFAULT_F1_EVENTS_TOPIC = "f1-telemetry-events";
    private static final String DEFAULT_F1_DRIVERS_MAX_SPEED_TOPIC = "f1-telemetry-drivers-max-speed";

    private final String kafkaBootstrapServers;
    private final String f1DriversGroupId;
    private final String f1EventsGroupId;
    private final String f1DriversMaxSpeedGroupId;
    private final String f1DriversTopic;
    private final String f1EventsTopic;
    private final String f1DriversMaxSpeedTopic;

    private F1ConsumerAppConfig(String kafkaBootstrapServers, String f1DriversGroupId, String f1EventsGroupId, String f1DriversMaxSpeedGroupId,
                                String f1DriversTopic, String f1EventsTopic, String f1DriversMaxSpeedTopic) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
        this.f1DriversGroupId = f1DriversGroupId;
        this.f1EventsGroupId = f1EventsGroupId;
        this.f1DriversMaxSpeedGroupId = f1DriversMaxSpeedGroupId;
        this.f1DriversTopic = f1DriversTopic;
        this.f1EventsTopic = f1EventsTopic;
        this.f1DriversMaxSpeedTopic = f1DriversMaxSpeedTopic;
    }

    public static F1ConsumerAppConfig fromEnv() {
        String kafkaBootstrapServers = System.getenv(KAFKA_BOOTSTRAP_SERVERS_ENV) == null ? DEFAULT_KAFKA_BOOTSTRAP_SERVERS : System.getenv(KAFKA_BOOTSTRAP_SERVERS_ENV);
        String f1DriversGroupId = System.getenv(F1_DRIVERS_GROUP_ID_ENV) == null ? DEFAULT_F1_DRIVERS_GROUP_ID : System.getenv(F1_DRIVERS_GROUP_ID_ENV);
        String f1EventsGroupId = System.getenv(F1_EVENTS_GROUP_ID_ENV) == null ? DEFAULT_F1_EVENTS_GROUP_ID : System.getenv(F1_EVENTS_GROUP_ID_ENV);
        String f1DriversMaxSpeedGroupId = System.getenv(F1_DRIVERS_MAX_SPEED_GROUP_ID_ENV) == null ? DEFAULT_F1_DRIVERS_MAX_SPEED_GROUP_ID : System.getenv(F1_DRIVERS_MAX_SPEED_GROUP_ID_ENV);
        String f1DriversTopic = System.getenv(F1_DRIVERS_TOPIC_ENV) == null ? DEFAULT_F1_DRIVERS_TOPIC : System.getenv(F1_DRIVERS_TOPIC_ENV);
        String f1EventsTopic = System.getenv(F1_EVENTS_TOPIC_ENV) == null ? DEFAULT_F1_EVENTS_TOPIC : System.getenv(F1_EVENTS_TOPIC_ENV);
        String f1DriversMaxSpeedTopic = System.getenv(F1_DRIVERS_MAX_SPEED_TOPIC_ENV) == null ? DEFAULT_F1_DRIVERS_MAX_SPEED_TOPIC : System.getenv(F1_DRIVERS_MAX_SPEED_TOPIC_ENV);
        return new F1ConsumerAppConfig(kafkaBootstrapServers, f1DriversGroupId, f1EventsGroupId, f1DriversMaxSpeedGroupId, f1DriversTopic, f1EventsTopic, f1DriversMaxSpeedTopic);
    }

    public String getKafkaBootstrapServers() {
        return kafkaBootstrapServers;
    }

    public String getF1DriversGroupId() {
        return f1DriversGroupId;
    }

    public String getF1EventsGroupId() {
        return f1EventsGroupId;
    }

    public String getF1DriversMaxSpeedGroupId() {
        return f1DriversMaxSpeedGroupId;
    }

    public String getF1DriversTopic() {
        return f1DriversTopic;
    }

    public String getF1EventsTopic() {
        return f1EventsTopic;
    }

    public String getF1DriversMaxSpeedTopic() {
        return f1DriversMaxSpeedTopic;
    }

    @Override
    public String toString() {
        return "F1ConsumerAppConfig[" +
                "kafkaBootstrapServers=" + this.kafkaBootstrapServers +
                ", f1DriversGroupId=" + this.f1DriversGroupId +
                ", f1EventsGroupId=" + this.f1EventsGroupId +
                ", f1DriversMaxSpeedGroupId=" + this.f1DriversMaxSpeedGroupId +
                ", f1DriversTopic=" + this.f1DriversTopic +
                ", f1EventsTopic=" + this.f1EventsTopic +
                ", f1DriversMaxSpeedTopic=" + this.f1DriversMaxSpeedTopic +
                "]";
    }
}
