package com.ex.andz16.tetrislight;

/**
 * Created by Andz16 on 26.04.2016.
 */
public class Continer {
    Person person;
    Adress adress;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Continer(Person person, Adress adress) {
        this.person = person;
        this.adress = adress;
    }
}
