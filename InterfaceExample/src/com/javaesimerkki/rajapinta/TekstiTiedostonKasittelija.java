package com.javaesimerkki.rajapinta;

// Toteuttaa TiedostonKasittelija-rajapinnan.
class TekstiTiedostonKasittelija implements TiedostonKasittelija {
    @Override
    public void avaaTiedosto(String tiedostonNimi) {
        // Toteuttaa tiedoston avaamisen.
        System.out.println("Tiedosto " + tiedostonNimi + " avattu.");
    }
    @Override
    public void kirjoitaTiedostoon(String tiedostonNimi) {
        // Toteuttaa tiedoston kirjoittamisen.
        System.out.println("Tiedostoon " + tiedostonNimi + " kirjoitettu.");
    }

    @Override
    public void suljeTiedosto() {
        // Toteuttaa tiedoston sulkemisen.
        System.out.println("Tiedosto suljettu.");
    }
}
