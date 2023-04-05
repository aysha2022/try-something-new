package com.bit.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\shanu\\eclipse-workspace\\CucUMberBDDProJEct\\login.feature"},tags= {"Reg"})
public class Runner {
	@Before
	
public void Start() {
		System.out.println("run before Sce");
	}
	@After
	public void endh() {
		System.out.println("run After Sce");
	}
	@Before("@Smoke")
	public void Start1() {
		System.out.println("run before Sce");
	}
	@After("@Smoke")
	public void end1() {
		System.out.println("run before Sce");
	}
}
