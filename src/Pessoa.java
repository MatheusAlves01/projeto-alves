import java.util.Date;
import java.util.Scanner;

public class Pessoa {
    private String name;
    private int phone;
    private String dtBorn;
//    private Date dtRegister;
//    private Date lastUpdate;

//    public Pessoa(String name, int phone, String dtBorn) { //, Date dtRegister, Date lastUpdate) {
//        this.name = name;
//        this.phone = phone;
//        this.dtBorn = dtBorn;
//        this.dtRegister = dtRegister;
//        this.lastUpdate = lastUpdate;
   //  }

    public Pessoa() {

    }

    public void criarPessoa() {
        Date dtB = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome:");
        this.name = input.nextLine();
        System.out.println("Informe o número de telefone:");
        this.phone = input.nextInt();
        input.nextLine();
        System.out.println("Informe a data de nascimento:");
        this.dtBorn = input.nextLine();
    }

    public void imprimePessoa() {
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println(this.dtBorn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDtBorn() {
        return dtBorn;
    }

    public void setDtBorn(String dtBorn) {
        this.dtBorn = dtBorn;
    }

//    public Date getDtRegister() {
//        return dtRegister;
//    }
//
//    public void setDtRegister(Date dtRegister) {
//        this.dtRegister = dtRegister;
//    }
//
//    public Date getLastUpdate() {
//        return lastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }
}