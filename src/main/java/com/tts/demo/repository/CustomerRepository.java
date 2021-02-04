package com.tts.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.demo.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
