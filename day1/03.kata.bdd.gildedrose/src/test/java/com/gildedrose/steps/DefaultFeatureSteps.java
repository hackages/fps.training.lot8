package com.gildedrose.steps;

import com.gildedrose.GildedRose;
import com.gildedrose.refactored.model.Item;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class DefaultFeatureSteps {

    public GildedRose gildedRose;
    public Item addedItem;

    @Before
    public void beforeAll() {
        //  Initialisation of the system
        gildedRose = new GildedRose();
        addedItem = new Item();
    }

    @Given("^an item \"([^\"]*)\"$")
    public void an_item(String arg1) throws Throwable {
        addedItem.setName(arg1);
    }

    @Given("^the quality is (\\d+)$")
    public void the_quality_is(int arg1) throws Throwable {
        addedItem.setQuality(arg1);
    }

    @Given("^the sell in is (\\d+)$")
    public void the_sell_in_is(int arg1) throws Throwable {
        addedItem.setSellIn(arg1);
    }

    @Given("^that item is added to the inventory$")
    public void item_added_to_inventory() throws Throwable {
        gildedRose.getInventory().addItem(addedItem);
    }

    @When("^I update quality$")
    public void i_update_quality() throws Throwable {
        gildedRose.updateQuality();
    }

    @Then("^the item's name is \"([^\"]*)\"$")
    public void the_item_s_name_is(String arg1) throws Throwable {
        assertEquals(gildedRose.getInventory().getLastItem().getName() , arg1);
    }

    @Then("^the quality is updated to (\\d+)$")
    public void the_quality_is_updated_to(int arg1) throws Throwable {
        assertEquals(gildedRose.getInventory().getLastItem().getQuality() , arg1);
    }

    @Then("^the sell in is updated to (\\d+)$")
    public void the_sell_in_is_updated_to(int arg1) throws Throwable {
        assertEquals(gildedRose.getInventory().getLastItem().getSellIn() , arg1);
    }
}
