package Test_Script;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Using_post_json {

	public static void main(String[] args) 
	{
		//JSON Body
		JSONObject Obj = new JSONObject();
		Obj.put("name", "morpheus");
		Obj.put("job", "leader");

		//Request
		RequestSpecBuilder reqBuilder=new RequestSpecBuilder();
		RequestSpecification req = reqBuilder.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON)
				.setBody(Obj.toJSONString()).build();

		//Response
		ResponseSpecBuilder resBuilder=new ResponseSpecBuilder();
		ResponseSpecification res = resBuilder.expectStatusCode(201).expectContentType(ContentType.JSON).build();

		//Gherkin_Language
		Response response = given().spec(req).when().post("/api/users").then().spec(res).extract().response();
		response.prettyPrint();



	}

}
