package fptu.sep490.sample.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
@EnableJpaRepositories("fptu.sep490.sample.repository")
@EntityScan("fptu.sep490.sample.model")
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DatabaseAutoConfig {
    @Bean
    public AuditorAware<String> auditorAware() {
//        return () -> {
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            if (auth == null) {
//                return Optional.of("");
//            }
//            return Optional.of(auth.getName());
//        };
        return () -> Optional.of("admin");
    }
}
