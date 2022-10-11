import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String opcao;
        do {
            opcao = Menu.MenuMain();
            switch (opcao.toLowerCase()) {
                case "1": {
//                    System.out.println("Cadastro...");
                    Menu.Cadastro();
                    break;
                }
                case "2": {
                    System.out.println("Listando pessoas...");
                    Menu.ListaPessoas();
                    break;
                }

                case "3": {
                    System.out.println("Listando alunos...");
                    Menu.ListaAlunos();
                    break;
                }

                case "4": {
                    System.out.println("Deletando usuários...");
                    break;
                }
            }
        } while (!opcao.toLowerCase().equals("s"));
        System.out.println("Saindo...");
    }
}