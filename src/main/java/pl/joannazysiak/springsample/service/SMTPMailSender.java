package pl.joannazysiak.springsample.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("smtp")
public class SMTPMailSender implements MailSender{

	private static final Log LOG = LogFactory.getLog(SMTPMailSender.class);
	
	
	@Override
	public void send() {
		
		// TODO implement mail sending
		LOG.info(this.getClass().getSimpleName());
	}
}
