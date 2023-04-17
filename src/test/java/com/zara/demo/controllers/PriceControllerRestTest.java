package com.zara.demo.controllers;

import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import com.zara.demo.services.PriceServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TEST of management of prices
 * @author LD
 */
@ExtendWith(MockitoExtension.class)
public class PriceControllerRestTest {

    @Mock
    private PriceServiceImpl priceService;

    @InjectMocks
    private PriceControllerRest priceControllerRest;


    private final long brandId = 1;
    private final long productId = 35455;
    private LocalDateTime date = null;
    private Price expectedPrice = null;
    private Brand brand = null;


    @BeforeEach
    void setUp() {
        date = LocalDateTime.parse("2020-06-14T10:00");
        expectedPrice = new Price();
        brand=new Brand();
        brand.setBrandId(brandId);
        brand.setName("ZARA");
        expectedPrice.setBrand(brand);
        expectedPrice.setProductId(productId);
        expectedPrice.setPrice(BigDecimal.valueOf(35.50));
        expectedPrice.setPriceListId(1L);
        expectedPrice.setEndDate(LocalDateTime.parse("2020-06-14T00:00"));
        expectedPrice.setStartDate(LocalDateTime.parse("2020-12-31T23:59"));
        expectedPrice.setPriority(0);
        expectedPrice.setCurrency("EUR");

    }

    @Test
    public void getPriceOfProductTest() throws Exception {
        //when(priceService.getPriceOfProduct("2020-06-14T10:00", "35455", "1")).thenReturn(expectedPrice);

        when(priceService.getPriceOfProduct(Mockito.any(Brand.class), Mockito.eq(productId), Mockito.eq(date)))
                .thenReturn(expectedPrice);

        ResponseEntity<Price> response = priceControllerRest.getPriceOfProduct(date, productId, brandId);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedPrice.getPrice(), Objects.requireNonNull(response.getBody()).getPrice());

        verify(priceService).getPriceOfProduct(Mockito.any(Brand.class), Mockito.eq(productId), Mockito.eq(date));



    }
}
