package examen;

import java.util.Collections;
import java.util.Arrays;

public class amicinv{

    public static void main(String[] args){
    	String canvi;
        String[] numexpedient = {"Daniel Barbancho Montero",
        		"Xavier Berm�dez Molg�",
        		"Joel Berrocal Urbina",
        		"Marc Bouzas Guadalupe",
        		"Nil Carvajal Playa",
        		"Quim Comas Navarro",
        		"Aleix Deumal Tripiana",
        		"Pau Dom�nech Pacheco",
        		"Gerard Fern�ndez Requena",
        		"Sergio Garcia Ruiz",
        		"Adri�n Gil Moreno",
        		"Oriol Pacheco Acevedo",
        		"Marcel Josep Paul� Lara",
        		"Pol Pavon Pozo",
        		"Gerard Pedrero Carbonell",
        		"Mart� Puig Mart�n",
        		"Ruben Recolons Reig",
        		"Josep Recolons Rodriguez",
        		"Pau Riera Mas",
        		"Carlos Abel Silva Teixeira",
        		"Joan Pardo"};
        String[] nom = {"Daniel Barbancho Montero",
        		"Xavier Berm�dez Molg�",
        		"Joel Berrocal Urbina",
        		"Marc Bouzas Guadalupe",
        		"Nil Carvajal Playa",
        		"Quim Comas Navarro",
        		"Aleix Deumal Tripiana",
        		"Pau Dom�nech Pacheco",
        		"Gerard Fern�ndez Requena",
        		"Sergio Garcia Ruiz",
        		"Adri�n Gil Moreno",
        		"Oriol Pacheco Acevedo",
        		"Marcel Josep Paul� Lara",
        		"Pol Pavon Pozo",
        		"Gerard Pedrero Carbonell",
        		"Mart� Puig Mart�n",
        		"Ruben Recolons Reig",
        		"Josep Recolons Rodriguez",
        		"Pau Riera Mas",
        		"Carlos Abel Silva Teixeira",
        		"Joan Pardo"};
        Collections.shuffle(Arrays.asList(nom));
        for (int i = 0; i < nom.length; ++i){
        	if (nom[i] == numexpedient[i]) {
        		System.out.println("");
        		System.out.println(nom[i]);
        		System.out.println("");
        		
        		canvi=nom[i];
        		nom[i]=nom[i-1];
        		nom[i-1]=canvi;
        		
        		
        		
        	}
        }
       

      
        
        
        for (int i = 0; i < nom.length; ++i){
        	System.out.println(numexpedient[i] + "  --->  " + nom[i]);
        }
    }
}
