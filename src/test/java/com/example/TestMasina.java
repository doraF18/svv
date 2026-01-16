package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMasina {

    @Test
	public void testExample() {
      Masina m = new Masina("audi");
      m.adaugaRoata(new Roata(1));
      m.adaugaRoata(new Roata(2));
      m.adaugaRoata(new Roata(3));
      m.adaugaRoata(new Roata(4));
      m.adaugaRoata(new Roata(4));
      Assertions.assertThrows(PreaMulteRoti.class, ()-> m.adaugaRoata(null));
  
  }
  @Test
  public void testArie(){
    Masina m = new Masina("audi");
      m.adaugaRoata(new Roata(1));
      m.adaugaRoata(new Roata(2));
      m.adaugaRoata(new Roata(3));
      m.adaugaRoata(new Roata(4));
      Assertions.assertEquals(98.596, m.calculeazaArieTotala());
  }
  
}