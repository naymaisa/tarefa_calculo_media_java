/**
 * @author nayara.maisa
 */

public class Notas {

    static float media;

    public static void main(String args[]) {
        mediaDeNotas();
        exibirMedia();
    }

    public static void mediaDeNotas() {
        float nota1 = 5;
        float nota2 = 7;
        float nota3 = 9;
        float nota4 = 3;


        media = (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void exibirMedia() {
        System.out.println("A média é: " + media);
    }
}
