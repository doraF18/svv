package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRoata {
@Test
	public void testExample() {
		Roata r1 = new Roata(2);
		Assertions.assertEquals(19.7192, r1.calculeazaArie());
	}
}