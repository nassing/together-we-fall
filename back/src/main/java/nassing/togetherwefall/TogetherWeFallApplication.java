package nassing.togetherwefall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "nassing.togetherwefall")
@EnableJpaRepositories(basePackages = "nassing.togetherwefall")
public class TogetherWeFallApplication {

	public static void main(String[] args) {
		SpringApplication.run(TogetherWeFallApplication.class, args);
	}

}
