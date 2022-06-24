package open.source.event.ticketing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

/**
 * config for bcrypt and restTemplate
 *
 * @author musaddiqr
 * @version ServiceConfiguration.java, v 0.1 22 June 2022 13.27:28 raufi-musaddiq Exp $$
 */

@Configuration
public class ServiceConfiguration {
  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder(){
    return new BCryptPasswordEncoder();
  }

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
