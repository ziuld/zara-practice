package com.zara.demo.controllers.price;

import com.zara.demo.services.PriceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller implementation for Price API
 *
 * @author LD
 */
@RestController
public class PriceControllerRest implements PriceApi{

    private PriceServiceImpl priceService;

    private static Logger logger = LoggerFactory.getLogger(PriceControllerRest.class);

    public PriceControllerRest(PriceServiceImpl priceService){
        this.priceService = priceService;

    }


}
