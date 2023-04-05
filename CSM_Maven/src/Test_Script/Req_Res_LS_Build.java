package Test_Script;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Req_Res_LS_Build {

	public static void main(String[] args)
	{
		//Request
		RequestSpecBuilder R = new RequestSpecBuilder();
		RequestSpecification req = R.setBaseUri("https://reqres.in/")
				.setContentType(ContentType.JSON).build();

		//Response
		ResponseSpecBuilder S=new ResponseSpecBuilder();
		ResponseSpecification resonse = S.expectStatusCode(200).expectContentType(ContentType.JSON).build();


        //Gerkhin_Language
		Response response = given().spec(req).when().get("/api/users?page=2").then().spec(resonse).extract().response();
		response.prettyPrint();


	}

}
