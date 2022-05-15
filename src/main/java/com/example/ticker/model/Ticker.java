package com.example.ticker.model;

import java.time.LocalDateTime;
import java.util.UUID;

import static java.time.LocalDateTime.now;

public class Ticker {

   private UUID id;
   private LocalDateTime timestamp;
   private String pairName;
   private String tickerData;

   public Ticker(String pairName, String tickerData) {
      this.id = UUID.randomUUID();
      this.timestamp = now();
      this.pairName = pairName;
      this.tickerData = tickerData;
   }

   public UUID getId() {
      return id;
   }

   public LocalDateTime getTimestamp() {
      return timestamp;
   }

   public String getPairName() {
      return pairName;
   }

   public String getTickerData() {
      return tickerData;
   }
}
