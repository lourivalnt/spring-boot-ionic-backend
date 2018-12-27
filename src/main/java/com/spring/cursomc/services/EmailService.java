package com.spring.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.spring.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
