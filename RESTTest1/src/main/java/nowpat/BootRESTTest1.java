package nowpat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Patryk on 2017-03-04.
 */
@SpringBootApplication
@EnableSwagger2
public class BootRESTTest1 {

    public static void main(String[] args) {
        SpringApplication.run(BootRESTTest1.class, args);
    }
}
