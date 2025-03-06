package fptu.sep490.commonlibrary.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "fptu.services")
public record ServiceUrlConfig(String media, String product) {
}