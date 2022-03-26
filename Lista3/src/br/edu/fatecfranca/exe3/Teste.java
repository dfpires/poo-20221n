package br.edu.fatecfranca.exe3;

public class Teste {

    public static void main(String[] args) {
        Post p1 = new Post(100, "Guerra na Ucrânia", "Fulano");
        Comment c1 = new Comment(101, "Muito triste ver as crianças passando por isso", 
                "Beltrano");
        Comment c2 = new Comment(102, "Tomara que acabe logo", "Ciclano");
        Comment c3 = new Comment(103, "E tudo fica bem", "João");
        
        p1.addComment(c1);
        p1.addComment(c2);
        p1.addComment(c3);
        p1.darLike(); p1.darLike();
        System.out.println(p1.toString());
        p1.removeComment(c1);
        p1.tirarLike();
        System.out.println(p1.toString());
    }
    
}
