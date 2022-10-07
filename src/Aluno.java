import java.util.Date;

public class Aluno
                extends Pessoa{
    private int notaFinal;
    public Aluno(String name, int phone, String dtBorn){ //, Date dtRegister, Date lastUpdate) {
        // super(name, phone, dtBorn);
        this.notaFinal = notaFinal;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}
