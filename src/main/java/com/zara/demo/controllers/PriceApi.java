package com.zara.demo.controllers;

import com.zara.demo.models.Price;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * management of prices
 * @author LD
 */
@RequestMapping(value = "/api/prices")
public interface PriceApi {

    /**
     * Entry point to get price of a product
     *
     * @param brandId code.
     * @param productId code.
     * @param date code.
     * @return The {@code ResponseEntity<Price> }
     */@GetMapping(value = "/{date}/{productId}/{brandId}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Price> getPriceOfProduct(
            @PathVariable(value = "date") final LocalDateTime date,
            @PathVariable(value = "productId") final Long productId,
            @PathVariable(value = "brandId") final long brandId ) throws Exception;
}
