package com.juanmello.projectspringboot.services;

import org.springframework.mail.SimpleMailMessage;

import com.juanmello.projectspringboot.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
