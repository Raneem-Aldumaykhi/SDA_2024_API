package practice;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class StaticImportBaseURI {
    /*
Given Send GET request by adding static import to the class
Then assert that status code is 200
And assert that status line is HTTP/1.1 200 OK
 */
    @Test
    public void Test01(){
        String url ="https://reqres.in/api/users?page=2";
        Response response= given().get(url);
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(response.statusCode(),"HTTP/1.1 200 OK");

    }


}
