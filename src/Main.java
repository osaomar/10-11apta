import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Abiturient ab[]=new Abiturient[3];
        ab[0] = new Abiturient("Akylbek", "Zhk akku", "+77088010919", 98);
        ab[1] = new Abiturient("Aduna", "Zhk lebed", "+77777777777", 90);
        ab[2] = new Abiturient("Sanzhar", "Zhk ptitca", "+77081067152", 0);


        for (int i = 0; i < ab.length; i++) {
            if(ab[i].getMark()>50){
                System.out.println("Otken "+ab[i].toString());
            }else
                System.out.println("Otpegen "+ab[i].toString());

        }
        System.out.println("\nSpisok po ballam");
        for (int i = 0; i < ab.length; i++) {
            for (int j = 2; j > i; j--)
                if (ab[j - 1].mark > ab[j].mark) {
                    Abiturient x = ab[j - 1];
                    ab[j - 1] = ab[j];
                    ab[j] = x;

                }
            System.out.println(" "+ab[i].toString());


        }
    }
}
class Abiturient{
    private   String FIO,adress,phone,prohod;
    int mark;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProhod() {
        return prohod;
    }

    public void setProhod(String prohod) {
        this.prohod = prohod;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    int baga=50;
    public Abiturient() {
    }
    public Abiturient(String FIO, String adress, String phone, int mark) {
        this.FIO = FIO;
        this.adress = adress;
        this.phone = phone;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "FIO='" + FIO + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", mark=" + mark +
                '}';
    }
}
