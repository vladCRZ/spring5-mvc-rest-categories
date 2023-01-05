package com.infomedia.spring5mvcrestcategories.repositories;

import com.infomedia.spring5mvcrestcategories.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}