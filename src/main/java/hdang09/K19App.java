package hdang09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(
//        info = @Info(
//                title = "F19 Recruitment API",
//                version = "1.0.0",
//                description = "An API for recruiting F19 generation in F-Code Club."
//        ),
//        servers = {
//                @Server(url = "https://recruit.f-code.tech"),
//                @Server(url = "https://recruit.hdang09.live"),
//                @Server(url = "https://recruit.hdang09.tech"),
//                @Server(url = "http://localhost:8080")
//        }
//)
public class K19App {

    public static void main(String[] args) {
        SpringApplication.run(K19App.class, args);
    }

}
