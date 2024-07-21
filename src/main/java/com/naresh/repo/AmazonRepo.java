package com.naresh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.model.Amazon_table;
@Repository
public interface AmazonRepo extends JpaRepository<Amazon_table, Integer> {

}
