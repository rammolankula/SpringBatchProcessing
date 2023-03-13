package ram.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ram.learn.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}