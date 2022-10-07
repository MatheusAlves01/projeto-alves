import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) {
//        System.out.println("Olá mundo!");
        Main.Menu();



//        Pessoa pessoa = new Pessoa();
//        pessoa.criarPessoa();
//        pessoa.imprimePessoa();
//        pessoas.add(pessoa);
    }

    public static void Menu() {
        int op = 10;

        while (op != 0) {
            Scanner input = new Scanner(System.in);

            System.out.println("MENU INICIAR");
            System.out.println("------------");
            System.out.println("Escolha uma opção");
            System.out.println("0. Encerrar programa");
            System.out.println("1. Entrar");
            System.out.println("2. Cadastrar");
            System.out.println("3. Ver registros de pessoas");
            op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Encerrou");
                    break;

                case 1:
                    System.out.println("Entrou");
                    break;

                case 2:
                    Pessoa p = new Pessoa();
                    p.criarPessoa();
                    p.imprimePessoa();
                    pessoas.add(p);
//                    System.out.println(pessoas.size());
                    System.out.println("Cadastrou");
                    break;

                case 3:
                    System.out.println(pessoas.size());
                    break;
            }
        }
    }
}