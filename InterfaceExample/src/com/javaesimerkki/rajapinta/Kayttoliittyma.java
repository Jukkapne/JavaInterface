package com.javaesimerkki.rajapinta;

// Käyttöliittymä, joka käyttää TiedostonKasittelija-rajapintaa.
class Kayttoliittyma {
    private TiedostonKasittelija tiedostonKasittelija;
    
    public Kayttoliittyma(TiedostonKasittelija kasittelija) {
        this.tiedostonKasittelija = kasittelija;
    }
    
    public void tallennaTiedosto(String tiedostonNimi, String sisalto) {
        tiedostonKasittelija.avaaTiedosto(tiedostonNimi);
        tiedostonKasittelija.kirjoitaTiedostoon(sisalto);
        tiedostonKasittelija.suljeTiedosto();
    }
}