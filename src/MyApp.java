import conf.AppConfig;
import conf.Engine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Engine voiture = context.getBean(Engine.class);
    Engine voiture2 = context.getBean(Engine.class);
    System.out.println(voiture);
    System.out.println(voiture2);
    System.out.println(voiture.getCircle());
    System.out.println(voiture2.getCircle());

  }

}
