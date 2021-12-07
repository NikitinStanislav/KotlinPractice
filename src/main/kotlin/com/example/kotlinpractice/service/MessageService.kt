package com.example.kotlinpractice.service

import com.example.kotlinpractice.domain.Message
import com.example.kotlinpractice.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

        fun findMessages(): List<Message> = db.findMessages();

        fun post(message: Message) {
            db.save(message);
        }
}