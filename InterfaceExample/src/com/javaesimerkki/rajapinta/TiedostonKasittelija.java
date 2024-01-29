package com.javaesimerkki.rajapinta;
// Rajapinta tiedoston käsittelyä varten.
public interface TiedostonKasittelija {
    void avaaTiedosto(String tiedostonNimi);
    void kirjoitaTiedostoon(String data);
    void suljeTiedosto();
}