package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;


class CompteTest {
    static Compte c;
    @org.junit.jupiter.api.Test
    void compruebaIban1() {
        //Arrange
        c=new Compte();
        String iban="ES6621000418401234567891";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        assertTrue(verificaIban);
    }
    @org.junit.jupiter.api.Test
    void compruebaIban2() {
        //Arrange
        c=new Compte();
        String iban="ES6000491500051234567892";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        assertTrue(verificaIban);
    }
    @org.junit.jupiter.api.Test
    void compruebaIban3() {
        //Arrange
        c=new Compte();
        String iban="ES9420805801101234567891";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        assertTrue(verificaIban);
    }



    @org.junit.jupiter.api.Test
    void generaIBAN() {
    }
}