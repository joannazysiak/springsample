package pl.joannazysiak.springsample.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.joannazysiak.springsample.service.MailSender;
import pl.joannazysiak.springsample.service.MockMailSender;

@RestController
public class MailController {

	private static final Log LOG = LogFactory.getLog(MockMailSender.class);
	
	//by type
	@Autowired private List<MailSender> mailSenders ;
	
	//by class name
	@Autowired private MailSender mockMailSender;
	
	//by qualifier
	@Autowired @Qualifier("smtp") private MailSender smtpSender;
	
	
	@RequestMapping("/mail")
	public String mail() {
		
		// TODO call senders
		
		return "sent";
	}
	

	@PostConstruct
	public void logCreated() {
		
		LOG.info(this.getClass().getSimpleName() + " created");
		
		LOG.info("Autowired by type:");
		for (MailSender mailSender: mailSenders) {
			LOG.info(mailSender.getClass().getSimpleName());
		}
		
		LOG.info("Aurowired by class name:");
		LOG.info(mockMailSender.getClass().getSimpleName());
		
		LOG.info("Aurowired by qualifier:");
		LOG.info(smtpSender.getClass().getSimpleName());
		
	}
	
	
}
