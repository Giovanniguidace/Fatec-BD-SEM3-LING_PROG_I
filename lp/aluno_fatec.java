package lp;

import java.util.ArrayList;

public class aluno_fatec {
    public String nome;
    private String curso;
    private int semestre;
    private String materia;
    private int andar = 1;


    private ArrayList <String> materias = new ArrayList<>();
    public aluno_fatec(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
        this.materias.add("Estatistica");
        this.materias.add("Linguagem de programacao");
        this.materias.add("java");
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }


    public void proximo_semestre(){
        System.out.println(this.semestre + 1);
    }

    public void puxar_materia(String materia){
        this.materias.add(materia);
        System.out.println(this.materias.toString());
    }

    public void subir_andar(){
        System.out.println(this.andar + 1);
    }

    public void descer_andar(){
        System.out.println(this.andar - 1);
    }

}
