package com.example.home.registry.controller

import com.example.home.registry.dto.AddressDto
import com.example.home.registry.service.AddressService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/application")
class AddressController(
    val addressService: AddressService
) {

    @PostMapping
    fun create(@RequestBody addressDto: AddressDto): ResponseEntity<AddressDto> {
        return ResponseEntity.ok(
            addressService.create(addressDto)
        )
    }
}