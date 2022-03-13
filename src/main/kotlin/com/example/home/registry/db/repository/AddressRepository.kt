package com.example.home.registry.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.example.home.registry.db.entity.Address

interface AddressRepository : JpaRepository<Address, Long>
