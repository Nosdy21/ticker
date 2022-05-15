package com.example.ticker.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "ticker")
@Data
public class TickerConfig {

   private final List<String> pairs;
}
