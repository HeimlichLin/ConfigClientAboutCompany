package idv.heimlich.ccacompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ConfigClientAboutCompanyApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ConfigClientAboutCompanyApplication.class, args);
	}

}
