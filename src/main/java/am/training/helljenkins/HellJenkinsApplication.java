package am.training.helljenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellJenkinsApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        System.out.println("Hello Jenkins!");
        System.out.println("Hello Docker!");
    }

    public static void main(String[] args) {
        SpringApplication.run(HellJenkinsApplication.class, args);
    }

}
