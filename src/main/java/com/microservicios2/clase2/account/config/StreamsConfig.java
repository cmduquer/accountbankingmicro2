package com.microservicios2.clase2.account.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase2.account.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
