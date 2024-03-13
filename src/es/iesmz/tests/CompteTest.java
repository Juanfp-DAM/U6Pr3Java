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
        //ASSERT
        assertTrue(verificaIban);
    }
    @org.junit.jupiter.api.Test
    void compruebaIban2() {
        //Arrange
        c=new Compte();
        String iban="ES6000491500051234567892";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        //ASSERT
        assertTrue(verificaIban);
    }
    @org.junit.jupiter.api.Test
    void compruebaIban3() {
        //Arrange
        c=new Compte();
        String iban="ES9420805801101234567891";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        //ASSERT
        assertTrue(verificaIban);
    }

    @org.junit.jupiter.api.Test
    void compruebaIban4() {
        //Arrange
        c=new Compte();
        String iban="ES7600246912501234567891 ";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        //ASSERT
        assertFalse(verificaIban);
    }

    @org.junit.jupiter.api.Test
    void compruebaIban5() {
        //Arrange
        c=new Compte();
        String iban="ES4721000418401234567891";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        //ASSERT
        assertFalse(verificaIban);
    }

    @org.junit.jupiter.api.Test
    void compruebaIban6() {
        //Arrange
        c=new Compte();
        String iban="ES8200491500051234567892";
        //ACT
        boolean verificaIban=c.compruebaIban(iban);
        //ASSERT
        assertFalse(verificaIban);
    }


    @org.junit.jupiter.api.Test
    void generaIBAN1() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("0030","2053","09","1234567895");
        //ASSERT
        assertEquals("ES7100302053091234567895",creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN2() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("0049","2352","08","2414205416");
        //ASSERT
        assertEquals("ES1000492352082414205416",creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN3() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("2085","2066","62","3456789011");
        //ASSERT
        assertEquals("ES1720852066623456789011",creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN4() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("2085","2066","62","3456AE9011");
        //ASSERT
        assertEquals(null,creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN5() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("208","2066","62","3456789011");
        //ASSERT
        assertEquals(null,creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN6() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("2080","20A6","62","3456789011");
        //ASSERT
        assertEquals(null,creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN7() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("2080","2086","6","3456789011");
        //ASSERT
        assertEquals(null,creaIban);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN8() {
        //ARRANGE
        c=new Compte();
        //ACT
        String creaIban=c.generaIBAN("2080","2086","63","345678911");
        //ASSERT
        assertEquals(null,creaIban);
    }


}