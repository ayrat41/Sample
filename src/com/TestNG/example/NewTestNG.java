package com.TestNG.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import javax.swing.SingleSelectionModel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNG {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @Test
  public void f1() {
	  System.out.println("test1");
  }
  @BeforeClass
  public void beforeClass() {
	 System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeMethod
  public void beforeTest() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("After method");
	  
  }

}
