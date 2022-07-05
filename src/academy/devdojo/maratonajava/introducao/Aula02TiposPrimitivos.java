package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
// int, double, float, char, byte, short, long, boolean
        int idade = (int)10000000000L;
        long numeroGrande = (long)155.23;
        double salaraioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Goku";


        System.out.println("A idade é "+idade+" anos.");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("numeroGrande");
        System.out.println("Oi meu nome é "+nome);
    }
}
