package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookingGetTest extends TestBase {

    @Test
    public void getBookingInfo(){
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleBooking(){
        Response response = given()
                .when()
                .get("/booking/508");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
