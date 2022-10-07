import java.util.Date;
import java.util.Scanner;

public class Aluno
                extends Pessoa{
    private int notaFinal = 0;
    public Aluno(String name, int phone, String dtBorn){ //, Date dtRegister, Date lastUpdate) {
        // super(name, phone, dtBorn);
        this.notaFinal = notaFinal;
    }

    public Aluno() {

    }

    public void MenuAluno() {
        Scanner input = new Scanner(System.in);
//        Aluno a = new Aluno();

        System.out.println("Informe a nota (OBS: caso você não seja um aluno, informe 0):");
        this.notaFinal = input.nextInt();
        input.nextLine();

        if(getNotaFinal() == 0) {
            System.out.println("Não aluno");
        } else {
            if(getNotaFinal() != 0) {
                System.out.println("Aluno");
//                Aluno a = new Aluno();
            }
        }
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}
