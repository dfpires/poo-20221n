package br.edu.fatecfranca.exe2;
public final class Aluno {
    private int nroAluno, idade;
    private float p1, p2;
    private String nome;
    
    public Aluno(){}
    public Aluno(int nroAluno, int idade, float p1, float p2, String nome){
        this.setNroAluno(nroAluno);
    }
    public void setNroAluno(int nroAluno){
        if (String.valueOf(nroAluno).length() == 6){
            this.nroAluno = nroAluno;
        }
        else {
            System.out.println("Nro do aluno inválido");
            this.nroAluno = 0;
        }
    }
}
