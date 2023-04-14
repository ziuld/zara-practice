package com.zara.demo.services;

import com.zara.demo.repositories.PriceRepository;

/**
 * Contain the operations for the management of prices related services.
 *
 * @author LD
 */
public class PriceServiceImpl implements PriceService{

    private PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }


}
