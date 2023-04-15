package com.zara.demo.services;

import com.zara.demo.config.Constants;
import com.zara.demo.exception.NotFoundException;
import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import com.zara.demo.repositories.PriceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * TEST of management of prices
 * @author LD
 */
public class PriceServiceImplTest{

    @InjectMocks
    private PriceServiceImpl priceService;

    @Mock
    private PriceRepository priceRepository;

    private final long productId = 35455;
    private LocalDateTime date = null;
    private List<Price> priceDetails = null;
    private Brand brand = null;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        date = LocalDateTime.parse("2020-06-14T10:00");
        Price expectedPrice = new Price();
        brand=new Brand();
        long brandId = 1;
        brand.setBrandId(brandId);
        brand.setName("ZARA");
        expectedPrice.setProductId(productId);
        expectedPrice.setPrice(BigDecimal.valueOf(35.50));
        expectedPrice.setPriceListId(1L);
        expectedPrice.setEndDate(LocalDateTime.parse("2020-06-14T00:00"));
        expectedPrice.setStartDate(LocalDateTime.parse("2020-12-31T23:59"));
        expectedPrice.setPriority(0);
        expectedPrice.setCurrency("EUR");

        priceDetails = new ArrayList<>();
        priceDetails.add(expectedPrice);
    }

    @Test
    void testGetPriceOfProductSuccessTest() {
        when(priceRepository.findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, date, date))
                .thenReturn(priceDetails);
        Price expectedPrice = priceDetails.stream().max(Comparator.comparingInt(Price::getPriority)).orElse(null);
        Price actualPrice = priceService.getPriceOfProduct(brand, productId, date);

        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void testGetPriceOfProductNotFoundExceptionTest() throws NotFoundException{

        lenient().when(priceRepository.findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, date, date)).thenThrow(new NotFoundException(productId+ Constants.NOT_FOUND));
        assertThrows(NotFoundException.class, () -> {
            priceService.getPriceOfProduct(brand, productId, date);
        });
    }
}
