package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.model.LoginPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.*;

import static io.restassured.RestAssured.given;

public class BookingPostTest extends TestBase {

    @Test
    public void createToken() {
        LoginPojo loginPojo = new LoginPojo();
        loginPojo.setUsername("admin");
        loginPojo.setPassword("password123");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(loginPojo)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void createBooking() {
        BookingPojo bookingPojo = new BookingPojo();
        HashMap<Object, Object> bookingDate = new HashMap<>();
        bookingDate.put("checkin", "2023 - 04 - 25");
        bookingDate.put("checkout", "2024 - 04 - 25");
        bookingPojo.setFirstName("abc");
        bookingPojo.setLastName("xyz");
        bookingPojo.setTotalPrice(111);
        bookingPojo.setDepositPaid(true);
        bookingPojo.setBookingDates(bookingDate);
        bookingPojo.setAdditionalNeeds("Dudhi Halvo");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("cookie", "token=55d67a600afd246")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
