package RedesSociais;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    public String titulo;
    public String conteudo;
    private Integer likes;

    public Post(Date momento, String titulo, String conteudo, Integer likes){
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }
    public List<comentarios> comentarios = new ArrayList<>();

    public void adicionarComentario(comentarios comentario){
        comentarios.add(comentario);
    }
    public void removerComentario(comentarios comentario){
        comentarios.remove(comentario);
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(conteudo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(fmt1.format(momento) + "\n");
        sb.append("Comentários: \n");
        for(comentarios c : comentarios){
            sb.append(c.texto + "\n");
        }
        return sb.toString();
    }
}
