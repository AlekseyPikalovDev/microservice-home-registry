package com.example.home.registry.controller

import com.example.home.registry.dto.AddressDto
import com.example.home.registry.service.AddressService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/address")
class AddressController(
    val addressService: AddressService
) {
    @PostMapping
    fun create(@RequestBody dto: AddressDto) =
        ResponseEntity(addressService.create(dto), HttpStatus.CREATED)

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long) = addressService.getById(id)

    @GetMapping
    fun getAll() = addressService.getAll()

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Long) = addressService.deleteById(id)

    @PutMapping
    fun update(@RequestBody dto: AddressDto) = addressService.update(dto)
}