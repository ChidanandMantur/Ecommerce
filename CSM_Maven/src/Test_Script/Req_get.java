package Test_Script;

import     static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Req_get {

	public static void main(String[] args) {
		RequestSpecBuilder rsb=new RequestSpecBuilder();
		RequestSpecification req = rsb.setBaseUri("https://reqres.in/").setBasePath("/api/users?page=2").build();
		
     given().spec(req).get().then().statusCode(200);
     
     System.out.println("done");

	}

}

