package com.uber.challenge.vitor.uberChallenger.controllers;


import com.uber.challenge.vitor.uberChallenger.application.EmailSenderService;
import com.uber.challenge.vitor.uberChallenger.core.exceptions.EmailServiceExcepetion;
import com.uber.challenge.vitor.uberChallenger.core.dtos.EmailRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }


    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequestDTO requestDTO){
        try{
            this.emailSenderService.sendEmail(requestDTO.to(),requestDTO.subject(),requestDTO.body());
            return ResponseEntity.ok("Email enviado com sucesso");
        }catch (EmailServiceExcepetion e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new StringBuilder().append("Erro ao " +
                    "enviar email").append(e).toString()) ;
        }

    }



}
