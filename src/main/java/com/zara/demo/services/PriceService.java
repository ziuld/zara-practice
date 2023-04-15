package com.zara.demo.services;

import com.zara.demo.exception.NotFoundException;
import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Contain the operations for the management of prices related services.
 *
 * @author LD
 */
public interface PriceService {

    /**
     * Get Price equals parameters are given.
     *
     * @param brand   code.
     * @param productId code.
     * @param date      code.
     * @return {@code Price} price details.
     */
    public Price getPriceOfProduct(final Brand brand, final long productId, final LocalDateTime date);
}
