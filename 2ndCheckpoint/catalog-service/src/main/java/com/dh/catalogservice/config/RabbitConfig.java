package com.dh.catalogservice.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Value("${queue.movie.name}")
    private String movieQueue;

    @Bean
    public Queue movieQueue() {
        return new Queue(this.movieQueue, false);
    }

    @Value("${queue.serie.name}")
    private String serieQueue;

    @Bean
    public Queue serieQueue() { return new Queue(this.serieQueue, false); }
}
