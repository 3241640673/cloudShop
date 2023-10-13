package com.whh.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "pattern")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Properties {
    private String dateformat;
    private String str;
}
