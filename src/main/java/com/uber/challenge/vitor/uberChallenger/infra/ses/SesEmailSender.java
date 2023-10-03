package com.uber.challenge.vitor.uberChallenger.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.uber.challenge.vitor.uberChallenger.adapters.EmailSenderGateway;
import com.uber.challenge.vitor.uberChallenger.core.exceptions.EmailServiceExcepetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }


    @Override
    public void sendEmail(String to, String subject, String body){
        SendEmailRequest request = new SendEmailRequest()
                .withSource("vitorcrispim@yahoo.com.br")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message().withSubject(new Content(subject)).withBody(new Body().withText(new Content(body))));

        try{
            this.amazonSimpleEmailService.sendEmail(request);
        }catch (AmazonServiceException e){
            throw new EmailServiceExcepetion("Erro ao enviar email ",e);
        }
    }



}
