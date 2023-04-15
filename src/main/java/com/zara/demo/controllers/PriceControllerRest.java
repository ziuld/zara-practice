package com.zara.demo.controllers;

import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import com.zara.demo.services.PriceService;
import com.zara.demo.services.PriceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * The controller implementation for Price API
 *
 * @author LD
 */
@RestController
public class PriceControllerRest implements PriceApi{

    private final PriceService priceService;

    private static final Logger logger = LoggerFactory.getLogger(PriceControllerRest.class);

    public PriceControllerRest(PriceServiceImpl priceService){
        this.priceService = priceService;

    }

    /** {@inheritDoc} */
    @Override
    public ResponseEntity<Price> getPriceOfProduct(LocalDateTime date, Long productId, long brandId){
        logger.info(date
                    + ": the date to consult of the product whose code is "
                    + productId
                    + " in "
                    +brandId);
        return new ResponseEntity<>(priceService.getPriceOfProduct(new Brand(brandId),productId,date), HttpStatus.OK);
    }

}
