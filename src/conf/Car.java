package conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Engine{

  @Qualifier("wheel")
  final Circle circle;

  public Car(Circle circle) {
    this.circle = circle;
  }

  public String getCircle() {
    return "circle"+circle.toString();
  }
}
