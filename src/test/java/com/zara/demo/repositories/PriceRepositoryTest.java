package com.zara.demo.repositories;

import com.zara.demo.models.Brand;
import com.zara.demo.models.Price;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * TEST of management of prices
 * @author LD
 */
@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class PriceRepositoryTest {

    @Mock
    private PriceRepository priceRepository;

    @Mock
    private JpaRepository<Price, Long> jpaRepository;

    private Brand brand = null;

    @BeforeEach
    void setUp() {
        brand = new Brand();
        brand.setBrandId(1L);
    }

    @Test
    void testFindProductByParametersSuccessTest() {
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDateTime.now();
        List<Price> expectedPrices = new ArrayList<>();

        long productId = 35455;
        when(priceRepository.findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, startDate, endDate)).thenReturn(expectedPrices);
        List<Price> actualPrices = priceRepository.findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, startDate, endDate);

        verify(priceRepository, times(1)).findByBrandAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(brand, productId, startDate, endDate);
        assertEquals(expectedPrices, actualPrices);
    }
}
