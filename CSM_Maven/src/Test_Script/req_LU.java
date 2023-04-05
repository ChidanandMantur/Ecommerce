package Test_Script;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class req_LU {

	public static void main(String[] args) {
		RequestSpecBuilder R = new RequestSpecBuilder();
		RequestSpecification req = R.setBaseUri("https://reqres.in/").setBasePath("/api/users?page=2").build();
		given().spec(req).get().then().statusCode(200);
		System.out.println("completed");

	}

}




