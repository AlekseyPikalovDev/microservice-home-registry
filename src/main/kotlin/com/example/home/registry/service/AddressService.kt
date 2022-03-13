package com.example.home.registry.service

import com.example.home.registry.db.repository.AddressRepository
import com.example.home.registry.dto.AddressDto
import com.example.home.registry.mapper.AddressMapper
import org.springframework.stereotype.Service

@Service
class AddressService(
    private val addressRepository: AddressRepository,
    private val mapper: AddressMapper
) {
    fun create(dto: AddressDto): AddressDto =
        mapper.toDto(
            addressRepository.save(
                mapper.toEntity(dto)
            )
        )

}