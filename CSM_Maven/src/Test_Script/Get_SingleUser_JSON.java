package Test_Script;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Get_SingleUser_JSON {

	public static void main(String[] args) 
	{

		//Request
		RequestSpecBuilder reqbuilder=new RequestSpecBuilder();
		RequestSpecification req = reqbuilder.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();

		//Response
		ResponseSpecBuilder resbuilder=new ResponseSpecBuilder();
		ResponseSpecification res = resbuilder.expectStatusCode(200).expectContentType(ContentType.JSON).build();

		//Gerhkin_Language_Result
		Response response = given().spec(req).when().get("/api/users?page=2").then().spec(res).extract().response();
		response.prettyPrint();

	}

}
