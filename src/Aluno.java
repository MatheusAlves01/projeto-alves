import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class Aluno
                extends Pessoa {
    private static Double notaFinal;
    public Aluno(String name, BigInteger phone, int dayBorn, int monthBorn, int yearBorn, Double notaFinal) {
        super(name, phone, dayBorn, monthBorn, yearBorn);
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Nome = " + getName();
    }

    public static Double getNotaFinal() {
        return notaFinal;
    }

    public static void setNotaFinal(Double notaFinal) {
        Aluno.notaFinal = notaFinal;
    }
}
