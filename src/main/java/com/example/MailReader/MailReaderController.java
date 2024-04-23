package com.example.MailReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailReaderController {
	
	@Autowired
	private MailService mailService;
	
	@GetMapping("/mail-reader")
	public String readEmails() {
		mailService.readEmails();
		return "Reading Mail";
	}

}
