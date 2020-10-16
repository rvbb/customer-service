package om.rvbb.b2b.backend.customer.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Customer-Service")
				.apiInfo(apiInfo())
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.smartosc.lending.lms.backend.customer.controller"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("LMS#loan-service APIs",
				"SmartOSC fintech | Lending | LMS | Loan Service", "1.0.0-dev",
				"https://developer.smartosc.com/policy", null, "Copyright of N.V Hoang",
				"https://developer.smartosc.com/license", Collections.emptyList());
	}

}
