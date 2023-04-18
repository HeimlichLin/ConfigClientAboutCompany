package idv.heimlich.ccacompany.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MainController {

	@Value("${text.copyright: Default Copyright}")
	private String copyright;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.datasource.password}")
	private String password;

	@Autowired
	private DataSource dataSource;

	@Autowired
	ApplicationContext applicationContext;

	@RequestMapping("/showConfig")
	@ResponseBody
	public String showConfig() {
		final String configInfo = "Copy Right: " + this.copyright //
				+ "<br/>spring.datasource.driver-class-name=" + this.driverClassName //
				+ "<br/>spring.datasource.url=" + this.url //
				+ "<br/>spring.datasource.username=" + this.userName //
				+ "<br/>spring.datasource.password=" + this.password;
		return configInfo;
	}

	@RequestMapping("/pingDataSource")
	@ResponseBody
	public String pingDataSource() {
		try {
			// 獲取組態的資料源
			return this.dataSource.toString();
		} catch (final Exception e) {
			e.printStackTrace();
			return "Error: " + e.getMessage();
		}
	}

}
