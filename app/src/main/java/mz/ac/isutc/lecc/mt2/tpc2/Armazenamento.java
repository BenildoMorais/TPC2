package mz.ac.isutc.lecc.mt2.tpc2;

import java.util.ArrayList;

public class Armazenamento {

    public static int listar;
    private static ArrayList<Estudante> lista = new ArrayList<Estudante>();

    public static void add(String nome, String curso, int idade){
        Estudante controle = new Estudante(nome,curso,idade);
        lista.add(controle);
    }
}
