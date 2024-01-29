package com.javaesimerkki.rajapinta;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        TekstiTiedostonKasittelija kasittelija = new TekstiTiedostonKasittelija();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(kasittelija);
        
        while (true) {
            System.out.println("1) Tallenna tiedosto");
            System.out.println("2) Lopeta");
            System.out.print("Valitse toiminto (1-2): ");
            
            int valinta = scanner.nextInt();
            scanner.nextLine(); // Tyhjentää rivinvaihdon puskurista
            // Tuo kommentti liittyy siihen, miten Scanner-luokka käsittelee syötteen lukemista Java-ohjelmissa. Kun käytetään Scanner-luokan nextInt()-metodia, se lukee kokonaisluvun syötteestä, mutta ei lue rivinvaihtoa (\n) luvun perästä. Rivinvaihto jää siis syötteen puskuriin.
            // Kun seuraavaksi yrität lukea syötettä, esimerkiksi nextLine()-metodilla, se lukee syötteen puskurista aina rivinvaihtoon asti. Jos puskurissa on jäljellä vain rivinvaihto (esimerkiksi edellisen nextInt()-kutsun jäljiltä), nextLine() palauttaa tyhjän merkkijonon, koska se lukee vain rivinvaihdon ja päättyy siihen.
            // Rivi scanner.nextLine(); käytetään tässä kontekstissa "tyhjentämään" tämä ylimääräinen rivinvaihto puskurista, jotta seuraava nextLine()-kutsu ei törmää odottamattomaan rivinvaihtoon ja palauta tyhjää merkkijonoa. Se varmistaa, että ohjelma käsittelee käyttäjän syötteen oikein ja että seuraava nextLine() lukee todellisen syötteen, jota käyttäjä tarkoitti antaa.
            
            if (valinta == 1) {
                System.out.print("Anna tiedoston nimi: ");
                String tiedostonNimi = scanner.nextLine();
                
                System.out.print("Anna tallennettava teksti: ");
                String sisalto = scanner.nextLine();
                
                kayttoliittyma.tallennaTiedosto(tiedostonNimi, sisalto);
            } else if (valinta == 2) {
                System.out.println("Ohjelma lopetetaan.");
                break;
            } else {
                System.out.println("Virheellinen valinta, yritä uudelleen.");
            }
        }
    }
}
