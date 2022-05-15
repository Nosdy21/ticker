package com.example.ticker.service;

import com.example.ticker.config.TickerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class TickerService {

   private TickerConfig tickerConfig;

   public TickerService(TickerConfig tickerConfig) {
      this.tickerConfig = tickerConfig;
   }

   @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
   public void getKrakenData() {
      log.info("Starting getKrakenData...");
   }
}
