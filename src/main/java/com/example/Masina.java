package com.example;
import java.util.List;
import java.util.ArrayList;

public class Masina {
    public String marca;
    public List<Roata> roti;
    
    public Masina(String marcamasina){
     this.marca = marcamasina;
     roti = new ArrayList<>(4);
    }
    public List adaugaRoata(Roata roata){
     if(roti.size() > 4)
        throw new PreaMulteRoti("Masina contine deja 4 roti");
      roti.add(roata);
      return roti;
    }
      
    public double calculeazaArieTotala(){
        double sum = 0;
        for (Roata roata : roti){
        sum = sum + roata.calculeazaArie();
        }
        return sum;
     }
    
}