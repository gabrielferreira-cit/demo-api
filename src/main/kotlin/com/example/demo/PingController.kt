package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@Controller
@RequestMapping("/ping")
class PingController {

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    fun ping() {
        println("Tudo funcionando")
    }
}