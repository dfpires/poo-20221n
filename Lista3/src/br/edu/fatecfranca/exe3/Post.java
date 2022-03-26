package br.edu.fatecfranca.exe3;
import java.util.ArrayList;
public class Post {
    private int code, likes;
    private String text, author;
    // objeto-parte
    private ArrayList<Comment> comments;
    public Post() {
        this.comments = new ArrayList();
    }
    public Post(int code, int likes, String text, String author, ArrayList<Comment> comments) {
        this.code = code;
        this.likes = likes;
        this.text = text;
        this.author = author;
        this.comments = comments;
    }
    public Post(int code, String text, String author) {
        this.code = code;
        this.text = text;
        this.author = author;
        this.comments = new ArrayList();
        this.likes = 0;
    }
    public void addComment(Comment comment){
        this.comments.add(comment);
        System.out.println("Comment adicionado com sucesso");
    }
    public void removeComment(Comment comment){
        if (this.comments.remove(comment)){
            System.out.println("Comment removido com sucesso");
        }
        else {
            System.out.println("Comment não existe");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void darLike(){
        this.likes++;
    }
    public void tirarLike(){
        this.likes--;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" + "code=" + code + ", likes=" + likes + ", text=" + text +
                ", author=" + author + ", comments=" + comments + '}';
    }
    
}
