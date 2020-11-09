# Exercise 00

## Description 
> In this section, the goal is to explore some GET endpoints

## The REST API Documentation
[API endpoint](https://restcountries.eu/#api-endpoints)

## Instructions 
* Check out the API documentation for the endpoints

* Following the format of `test_status_code_ok`, create a test using the endpoint `code` for `Belgium`
   * Assert that response `statusCode` is 200 

* Same as previous, with a not existing parameter `code` for example `zz`
   * Assert that response `statusCode` is `HttpStatus.SC_NOT_FOUND`

* Refactor your code 
> Set up a TestBaseClass
```java
public class BaseClass {
	
	@BeforeClass
	public static void setUp() {
		baseURI = "http://url.of.the.api";
		port = 8080;
		basePath = "/restApi/apiVersion/";
	}
}
```

* New test with a different header, this time use a Map to define the headers  
```java
Map<String, String> headers = new HashMap<String, String>();
headers.put("Accept", "application/text");
new URI("/name/aruba?fullText=true")
```
   * Assert that response `statusCode` is 406 

* New test for the response content, using the endpoint `code` for `Belgium`
```java
// Example
given().accept(ContentType.JSON).when().get("/find/201").then().body("Features.Feature", hasSize(2));
```
   * It works also for content type `ContentType.XML` 

* New test for the response content, this time we will do multiple checks using `JsonPath` 
```java 
// First fetch the JSON response as String		
String s = given()
		.accept(ContentType.JSON)
		.when()
		.get("/find/933")
		.thenReturn()
		.asString();
// Next parse the JSON with JsonPath
JsonPath json = new JsonPath(s);
Assert.assertEquals(933, json.getInt("Id"));		 
```
   * Use `assertThat` with different fields in the response object