package com.example.kotlinpractice.controllers

import com.example.kotlinpractice.domain.Message
import com.example.kotlinpractice.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = service.findMessages();

    @PostMapping
    fun post(@RequestBody message: Message){
        service.post(message);
    }
}