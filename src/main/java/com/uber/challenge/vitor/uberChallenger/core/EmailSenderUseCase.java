package com.uber.challenge.vitor.uberChallenger.core;

public interface EmailSenderUseCase {
    void sendEmail(String to,String subject,String body);
}
