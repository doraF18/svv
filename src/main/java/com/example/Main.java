package com.example;

public class Main {
	public static void main(String[] args) {
		
		Roata r1 = new Roata(2);
		Roata r2 = new Roata(4);
		Roata r3 = new Roata(5);
		Roata r4 = new Roata(6);
		Masina masina = new Masina("mert");
		masina.adaugaRoata(r1);
		masina.adaugaRoata(r2);
		masina.adaugaRoata(r3);
		masina.adaugaRoata(r4);
		masina.calculeazaArieTotala();
	}
	
	
}