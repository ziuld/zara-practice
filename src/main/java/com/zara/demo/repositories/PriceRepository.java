package com.zara.demo.repositories;

import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * management of prices
 * @author LD
 */@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    /**
     * Get Price equals parameters are given.
     *
     * @param brand code.
     * @param productId code.
     * @param startDate code.
     * @param endDate code.
     * @return {@code List<Price> } price details.
     */
     List<Price> findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(final Brand brand, final long productId, final LocalDateTime startDate, final LocalDateTime endDate);
}

