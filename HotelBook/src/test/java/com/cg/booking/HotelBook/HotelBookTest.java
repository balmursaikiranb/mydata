/**
 * 
 */
package com.cg.booking.HotelBook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author learning
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature" }, glue = { "com.cg.booking.HotelBook.step" }, tags = { "@execute" })
public class HotelBookTest {

}
