package com.example.home.registry.mapper

import com.example.home.registry.db.entity.Address
import com.example.home.registry.dto.AddressDto
import org.springframework.stereotype.Component

@Component
class AddressMapper {
    fun toEntity(dto: AddressDto): Address =
        Address().apply {
            country = dto.country
            city = dto.city
            streetName = dto.streetName
            buildingNumber = dto.buildingNumber
            flatNumber = dto.flatNumber
            addressType = dto.addressType
            zipCode = dto.zipCode
        }

    fun toDto(address: Address): AddressDto =
        AddressDto().apply {
            id = address.id
            country = address.country
            city = address.city
            streetName = address.streetName
            buildingNumber = address.buildingNumber
            flatNumber = address.flatNumber
            addressType = address.addressType
            zipCode = address.zipCode
        }
}