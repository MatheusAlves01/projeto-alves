import java.util.ArrayList;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) {
//        System.out.println("Olá mundo!");
        Pessoa pessoa = new Pessoa();
        pessoa.criarPessoa();
        pessoa.imprimePessoa();
//        pessoas.add(pessoa);
    }
}