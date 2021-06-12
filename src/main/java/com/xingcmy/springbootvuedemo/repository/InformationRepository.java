package com.xingcmy.springbootvuedemo.repository;

import com.xingcmy.springbootvuedemo.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information,String> {
}
