# Exercise 02

## Description 
> In this section, the goal is to run CRUD operations

## JSON server documentation 
https://github.com/typicode/json-server

## Instructions 

* Start your own REST API with 
    * Install or update `json-server` (from npm) 
    * Run the command from the module root `json-server src/test/resources/data.json`
* Analyse the test `test_add_cat_fact_ok`
    * Run the test 
    * Run it again
    * Fix the test
* Create a new test scenario following these steps
   * Fetch a record from the endpoint `catFacts` using a query parameter `id`
   * Delete that record
   * Try to fetch the deleted record and match the status code
* Create a new test scenario following these steps
   * Fetch a record from the endpoint `catFacts` using an `id`
   * Update that record with operation PUT
   * Fetch the updated record 
   * Assert the changes made to the record 

## Resources
* [JSON escape](https://www.freeformatter.com/json-escape.html)
