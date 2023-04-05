package Test_Script;

import org.json.simple.JSONObject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Using_put_json {

	public static void main(String[] args) {
JSONObject Obj = new JSONObject();
Obj.put("name", "morpheus");
Obj.put("job", "zion resident");

RequestSpecBuilder resbuilder=new RequestSpecBuilder();
RequestSpecification request = resbuilder.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).setBody(Obj.toJSONString()).build();

ResponseSpecBuilder rspbuilder=new ResponseSpecBuilder();
ResponseSpecification response = rspbuilder.expectStatusCode(200).expectContentType(ContentType.JSON).build();



	}

}
