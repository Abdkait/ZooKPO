package zoo;

import zoo.services.CliMenuService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZooApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ZooApplication.class, args);
        CliMenuService cliMenu = context.getBean(CliMenuService.class);
        cliMenu.start();
    }
}