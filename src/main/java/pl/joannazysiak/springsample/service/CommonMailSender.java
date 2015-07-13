package pl.joannazysiak.springsample.service;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonMailSender implements MailSender {

	private static final Log LOG = LogFactory.getLog(MockMailSender.class);

	private String mailingList;
	
	
	CommonMailSender(String mailingList) {
		this.mailingList = mailingList;
	}
	
	
	@Override
	public void send() {
		
		// TODO common sending logic
		LOG.info("sending emails to: "+ mailingList);
	}
	
	@PostConstruct
	public void logCreated() {
		LOG.info(this.getClass().getSimpleName() + " for " + this.mailingList + " created");
	}
	

}
