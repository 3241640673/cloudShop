package com.whh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "pattern")
@Component
@Data
public class Properties {
    private String dataformat;
}
