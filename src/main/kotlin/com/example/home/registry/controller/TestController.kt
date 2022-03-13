package com.example.home.registry.controller

import com.example.home.registry.db.entity.Address
import com.example.home.registry.db.entity.AddressType
import com.example.home.registry.db.repository.AddressRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/application")
class TestController(
    val addressRepository: AddressRepository
) {

    @GetMapping
    fun testController(): ResponseEntity<Address> {
        return ResponseEntity.ok(
            addressRepository.save(
                Address().apply {
                    country = "Russia"
                    city = "Moscow"
                    streetName = "Lenina street"
                    buildingNumber = 1
                    flatNumber = 1
                    addressType = AddressType.FLAT
                }
            )
        )
    }
}