package fptu.sep490.sample;

import fptu.sep490.commonlibrary.config.CorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"fptu.sep490.sample", "fptu.sep490.commonlibrary"})
@EnableConfigurationProperties({CorsConfig.class})
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}
