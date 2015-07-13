package pl.joannazysiak.springsample.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonMailSenderConfiguration {


	@Bean
	public MailSender newsletterMailSender() {
		return new CommonMailSender("newsletterSubscribents");
	}
	
	@Bean
	public MailSender vouchersMailSender() {
		return new CommonMailSender("vouchersSubscribents");
	}
}
