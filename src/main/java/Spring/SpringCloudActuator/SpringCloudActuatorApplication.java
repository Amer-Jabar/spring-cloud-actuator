package Spring.SpringCloudActuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringCloudActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudActuatorApplication.class, args);
    }
}


@Component
class Info implements InfoContributor {

    @Override
    public void contribute(org.springframework.boot.actuate.info.Info.Builder builder) {
        builder.withDetail("additional info", "additional value");
    }

}
