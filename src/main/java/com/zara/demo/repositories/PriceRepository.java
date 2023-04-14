package com.zara.demo.repositories;

import com.zara.demo.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

/** @author LD */
public interface PriceRepository extends JpaRepository<Price, Long> {
}
