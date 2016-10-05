package com.mkyong.core.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";
	   MessageUtil messageUtil = new MessageUtil(message);
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      assertEquals(message,messageUtil.salutationMessage());
	   }
}
