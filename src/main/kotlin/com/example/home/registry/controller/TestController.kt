package com.example.home.registry.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/application")
class TestController {

    @GetMapping
    fun testController(): ResponseEntity<String> {
        return ResponseEntity.ok("SUCCESS")
    }
}