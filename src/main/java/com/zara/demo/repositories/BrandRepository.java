package com.zara.demo.repositories;

import com.zara.demo.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * management of prices
 * @author LD
 */@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
