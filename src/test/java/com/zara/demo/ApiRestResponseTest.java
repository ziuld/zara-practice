package com.zara.demo;

import com.zara.demo.config.Constants;
import com.zara.demo.controllers.PriceControllerRest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.time.LocalDateTime;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TEST of management of prices
 * @author LD
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiRestResponseTest {
    @Autowired
    private PriceControllerRest priceControllerRest;

    private final long brandId = 1;
    private final long productId = 35455;


    @Test
    void getTest1() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-14T10:00");
        assertEquals(HttpStatus.OK,priceControllerRest.getPriceOfProduct(date, productId, brandId).getStatusCode());
        System.out.print(Constants.JUMP_LINE_TEST
                +"Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA) :\n"
                +(Objects.requireNonNull(priceControllerRest.getPriceOfProduct(date, productId, brandId).getBody()).toBuilder())
                +Constants.JUMP_LINE_TEST);
    }

    @Test
    void getTest2() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-14T16:00");
        assertEquals(HttpStatus.OK,priceControllerRest.getPriceOfProduct(date, productId, brandId).getStatusCode());
        System.out.print(Constants.JUMP_LINE_TEST+"Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA) :\n"
                +(Objects.requireNonNull(priceControllerRest.getPriceOfProduct(date, productId, brandId).getBody()).toBuilder())
                +Constants.JUMP_LINE_TEST);
    }

    @Test
    void getTest3() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-14T21:00");
        assertEquals(HttpStatus.OK,priceControllerRest.getPriceOfProduct(date, productId, brandId).getStatusCode());
        System.out.print(Constants.JUMP_LINE_TEST+"Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA) :\n"
                +(Objects.requireNonNull(priceControllerRest.getPriceOfProduct(date, productId, brandId).getBody()).toBuilder())
                +Constants.JUMP_LINE_TEST);  }

    @Test
    void getTest4() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-15T10:00");
        assertEquals(HttpStatus.OK,priceControllerRest.getPriceOfProduct(date, productId, brandId).getStatusCode());
        System.out.print(Constants.JUMP_LINE_TEST+"Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA) :\n"
                +(Objects.requireNonNull(priceControllerRest.getPriceOfProduct(date, productId, brandId).getBody()).toBuilder())
                +Constants.JUMP_LINE_TEST);   }

    @Test
    void getTest5() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-16T21:00");
        assertEquals(HttpStatus.OK,priceControllerRest.getPriceOfProduct(date, productId, brandId).getStatusCode());
        System.out.print(Constants.JUMP_LINE_TEST+"Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA) :\n"
                +(Objects.requireNonNull(priceControllerRest.getPriceOfProduct(date, productId, brandId).getBody()).toBuilder().toString())
                +Constants.JUMP_LINE_TEST);   }

}