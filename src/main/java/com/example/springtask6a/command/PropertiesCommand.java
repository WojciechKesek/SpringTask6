package com.example.springtask6a.command;

import com.example.springtask6a.config.Properties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PropertiesCommand implements CommandLineRunner {
    private final Properties properties;
    @Override
    public void run(String... args) throws Exception {
        log.info(properties.toString());
    }
}
