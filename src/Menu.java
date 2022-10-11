import javax.naming.Name;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Aluno> alunos = new ArrayList<>();

    static ArrayList<Pessoa> users = new ArrayList<>();


    public static String MenuMain() {
        System.out.println("-------MENU-PRINCIPAL------");
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao sistema!");
        System.out.println("O que deseja fazer?");
        System.out.println("1) Cadastro");
        System.out.println("2) Listar pessoas");
        System.out.println("3) Listar alunos");
        System.out.println("4) Deletar usuários");
        System.out.println("S) Sair");
        String opcao = input.nextLine();
        System.out.println("---------------------------");
        return opcao;

    }

    public static Pessoa Cadastro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira as seguintes informações para efetuar o cadastro no sistema:");
        System.out.println("Nome: ");
        String name = input.nextLine();
        System.out.println("Telefone: ");
        BigInteger phone = input.nextBigInteger();
        input.nextLine();
        System.out.println("Dia do nascimento:");
        int dayBorn = input.nextInt();
        input.nextLine();
        System.out.println("Mês do nascimento:");
        int monthBorn = input.nextInt();
        input.nextLine();
        System.out.println("Ano do nascimento:");
        int yearBorn = input.nextInt();
        input.nextLine();

        System.out.println("Você possui nota final?");
        System.out.println("(1) Sim");
        System.out.println("(2) Não");
        int opNota = input.nextInt();
        input.nextLine();

        if (opNota == 2) {
            Pessoa pessoa = new Pessoa(name, phone, dayBorn, monthBorn, yearBorn);
            imprimePessoa();
            pessoas.add(pessoa);
            users.add(pessoa);
            return pessoa;
        } else {
            if (opNota == 1) {
                System.out.println("Informe o valor da nota: ");
                Double NotaFinal = input.nextDouble();
                input.nextLine();
                Aluno aluno = new Aluno(name, phone, dayBorn, monthBorn, yearBorn, NotaFinal);
                imprimeAluno();
                alunos.add(aluno);
                users.add(aluno);
                return aluno;
            }
        }
        return null;
    }

    public static void imprimePessoa() {
        Date dateRegister = new Date();
        System.out.println("---------------------------");
        System.out.println("Cadastro de PESSOA efetuado com sucesso!");
        System.out.println("Data do cadastro: " + dateRegister);
        System.out.println("---------------------------");
        System.out.println("Informações de cadastro:");
        System.out.println("Nome: " +Pessoa.getName());
        System.out.println("Telefone: " +Pessoa.getPhone());
        System.out.println("Data de Nascimento: " +Pessoa.getDayBorn()+ "/" +Pessoa.getMonthBorn()+ "/" +Pessoa.getYearBorn());
        System.out.println("---------------------------");
    }

    public static void imprimeAluno() {
        Date dateRegister = new Date();
        System.out.println("---------------------------");
        System.out.println("Cadastro de ALUNO efetuado com sucesso!");
        System.out.println("Data do cadastro: " +dateRegister);
        System.out.println("---------------------------");
        System.out.println("Informações do cadastro:");
        System.out.println("Nome: " +Aluno.getName());
        System.out.println("Telefone: " +Aluno.getPhone());
        System.out.println("Data de Nascimento: " +Aluno.getDayBorn()+ "/" +Aluno.getMonthBorn()+ "/" +Aluno.getYearBorn());
        System.out.println("Nota final: " +Aluno.getNotaFinal());
        System.out.println("---------------------------");
    }
    public static void ListaAlunos() {
        for (int i = 1; i <= alunos.size(); i++) {
            System.out.println("LISTA DE TOTAL DE ALUNOS: " +pessoas.size());
        }
    }
    public static void ListaPessoas() {
        for (int i = 1; i<= pessoas.size(); i++) {
            System.out.println("LISTA DE TOTAL DE PESSOAS: "+ pessoas.size());
        }
//        System.out.println("LISTA DE TOTAL DE USUÁRIOS: " +users.size());
//        System.out.println("LISTA DE TOTAL DE ALUNOS: "+ alunos.size());
    }
}
