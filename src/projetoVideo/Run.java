package projetoVideo;

public class Run {
    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Classes Java");
        v[1] = new Video("Métodos java");
        v[2] = new Video("Legado de Java");

        Usuario u[] = new Usuario[2];

        u[0] = new Usuario("João", 23, "M", "teste@.com.br");
        u[1] = new Usuario("Maria", 28, "F", "teste2@.com.br");

        System.out.println("---------- Vídeos ---------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println();
        System.out.println("##################################");
        System.out.println();

        System.out.println("----------- Usuários -------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());

        System.out.println();
        System.out.println();

        Visualizacao view[] = new Visualizacao[5];
        view[0] = new Visualizacao(u[0], v[1]);
        view[0].avaliar();
        System.out.println(view[0].toString());

        System.out.println();
        view[1] = new Visualizacao(u[0], v[1]);
        view[1].avaliar(35.0f);
        System.out.println(view[1].toString());

    }

}
