package mz.ac.isutc.lecc.mt2.tpc2;

import androidx.annotation.NonNull;

public class Estudante {

    private String nome;
    private String curso;
    private int idade;

    public Estudante(String nome,String curso, int idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @NonNull
    @Override
    public String toString() {
        return this.nome.toUpperCase()+" "+this.curso+" "+this.idade;
    }
}
