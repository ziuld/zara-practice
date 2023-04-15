package com.zara.demo.services;

import com.zara.demo.config.Constants;
import com.zara.demo.exception.NotFoundException;
import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import com.zara.demo.repositories.PriceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Contain the operations for the management of prices related services.
 *
 * @author LD
 */
@Service
public class PriceServiceImpl implements PriceService{

    private final PriceRepository priceRepository;
    /** Autowired */
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Price getPriceOfProduct(final Brand brand, final long productId, final LocalDateTime date) {
        Optional<List<Price>> priceDetail= Optional.ofNullable(priceRepository.findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, date, date));
        return priceDetail
                    .get()
                    .stream()
                    .max(Comparator.comparingInt(Price::getPriority))
                    .orElseThrow(()-> new NotFoundException(productId+ Constants.NOT_FOUND));
    }
}
