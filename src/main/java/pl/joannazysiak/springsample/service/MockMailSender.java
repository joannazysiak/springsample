package pl.joannazysiak.springsample.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class MockMailSender implements MailSender {

	private static final Log LOG = LogFactory.getLog(MockMailSender.class);

	
	@Override
	public void send() {
		
		// TODO mock mail sending
		LOG.info(this.getClass().getSimpleName());
	}
}
