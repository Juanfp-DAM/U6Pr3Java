package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {

    private String iban;
    private String titular;

    //TODO CONSTRUCTOR
    /*public Compte(String iban, String titular){
        compruebaIban(iban);
        this.titular=titular;
    }*/

    public boolean compruebaIban(String ibanIntroducido){
        BigInteger DigitCCCBigInteger, Div97, Resta98, ResultDiv, ResultResta98;
        if(ibanIntroducido.matches("^[E][S][0-9]{22}$")){
            String digitPais=ibanIntroducido.substring(0,2);
            if(digitPais.equalsIgnoreCase("es")){
                String digitControl=ibanIntroducido.substring(2,4);
                String digitCCC=ibanIntroducido.substring(4);
                digitCCC=digitCCC+"142800";
                DigitCCCBigInteger= new BigInteger(digitCCC);
                Div97=BigInteger.valueOf(97);
                ResultDiv=DigitCCCBigInteger.remainder(Div97);
                Resta98=BigInteger.valueOf(98);
                ResultResta98=Resta98.subtract(ResultDiv);
                BigInteger convierteDigitControl=new BigInteger(digitControl);//Para poder comparar con equals deben ser del mismo tipo
                if(ResultResta98.equals(convierteDigitControl)){
                    return true;
                }
            }
        }
        return false;
    }

    public String generaIBAN(String entidad, String oficina, String dc, String cuenta) {
        try {
            String unificaDatos = entidad + oficina + dc + cuenta;
            String creandoIban = entidad + oficina + dc + cuenta + "142800";
            BigInteger BigCreaIban, DivIban97, Resta98, ResultadoDiv, ResultResta98;
            BigCreaIban = new BigInteger(creandoIban);//Se convierte string a BigInt
            DivIban97 = BigInteger.valueOf(97);//Se le asigna el valor 97
            ResultadoDiv = BigCreaIban.remainder(DivIban97);
            Resta98 = BigInteger.valueOf(98);//Se le asigna el valor 98
            ResultResta98 = Resta98.subtract(ResultadoDiv);
            String ibanFinal = "ES" + ResultResta98 + unificaDatos;
            if(!ibanFinal.matches("^[E][S][0-9]{22}$")){
                return null;
            }
            return ibanFinal;
        }catch(NumberFormatException e){
            return null;
        }
    }


}
