package github.veikkoroc.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/8 9:11
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

}
