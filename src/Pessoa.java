import java.math.BigInteger;
import java.util.Date;

public class Pessoa {
    private static String name;
    private static BigInteger phone;
    private static int dayBorn;
    private static int monthBorn;
    private static int yearBorn;

    public Pessoa(String name, BigInteger phone, int dayBorn, int monthBorn, int yearBorn) {
        this.name = name;
        this.phone = phone;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
    }

    private static Date dtRegister;
    private static Date dtLastUpdate;

    public static String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public static int getDayBorn() {
        return dayBorn;
    }

    public void setDayBorn(int dayBorn) {
        this.dayBorn = dayBorn;
    }

    public static int getMonthBorn() {
        return monthBorn;
    }

    public void setMonthBorn(int monthBorn) {
        this.monthBorn = monthBorn;
    }

    public static int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public static Date getDtRegister() {
        return dtRegister;
    }

    public void setDtRegister(Date dtRegister) {
        this.dtRegister = dtRegister;
    }

    public static Date getDtLastUpdate() {
        return dtLastUpdate;
    }

    public void setDtLastUpdate(Date dtLastUpdate) {
        this.dtLastUpdate = dtLastUpdate;
    }
}
