package RedesSociais;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class perfil {
    public static void main(String[] args) throws ParseException{

    SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    comentarios c1 = new comentarios("Forças");
    comentarios c2 = new comentarios("Boa viagem");

    Post p1 = new Post(
        fmt1.parse("21/06/2019 13:05:44"),
        "Viajando para Lua",
        "Mas o david não está comigo ;-;",
        12);

        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);
    }
}
