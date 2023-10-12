package com.uber.challenge.vitor.uberChallenger.adapters;


//Representa a camada de regra de negocio
public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
