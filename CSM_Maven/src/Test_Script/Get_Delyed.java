package Test_Script;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Get_Delyed {

	public static void main(String[] args)
	{
	RequestSpecBuilder rsb=new RequestSpecBuilder();
	RequestSpecification request = rsb.setBaseUri("https://reqres.in/").setBasePath("/api/users?delay=3").build();
	given().spec(request).get().then().statusCode(400);  //Customer expected 200
	System.out.println("Output is ok");
	
	}

}
