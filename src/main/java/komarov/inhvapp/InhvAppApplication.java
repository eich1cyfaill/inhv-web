package komarov.inhvapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InhvAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(InhvAppApplication.class, args);
        // docker run --name inhv-postgres -p 5432:5432 -e POSTGRES_PASSWORD=123kolbassa -v inhv-volume:/var/lib/postgresql/data -d postgres
    }
}
