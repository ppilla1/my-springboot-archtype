package ${package};

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        log.info("${greeting-msg}");
        SpringApplication.run(${package}.App.class, args);
    }

}