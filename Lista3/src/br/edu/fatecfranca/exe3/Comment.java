package br.edu.fatecfranca.exe3;
public class Comment {
    private int code;
    private String text, author;

    public Comment() {
    }

    public Comment(int code, String text, String author) {
        this.code = code;
        this.text = text;
        this.author = author;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "\n Comment{" + "code=" + code + ", text=" + text + ", author=" + author + '}';
    }
    
}
