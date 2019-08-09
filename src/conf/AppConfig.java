package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean
  @Scope("prototype")
  public Engine engine(){
    return new Car(circle());
  }

  @Bean
  public Circle circle(){
    return new Wheel();
  }
}
