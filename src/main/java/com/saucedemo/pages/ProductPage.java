package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By productsText = By.xpath("//span[@class='title']");
    By countProduct = By.xpath("//div[@class='inventory_item_name']");

   public String getTextProducts(){
       return getTextFromElement(productsText);
   }
   public int totalProductOnPage(){
       List<WebElement> totalElementsOnPage = driver.findElements(countProduct);
       int totalProducts = totalElementsOnPage.size();
       return totalProducts;
   }

}
