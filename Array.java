import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataProgram = tampilkanDataProgram();
        System.out.println("===================================================");
        tampilkanDataStudent();

        //inputan
        System.out.println("PILIH NO. PROGRAM : ");
        int noProgram;
        noProgram = input.nextInt();
        String namaProgramDiPIlih = dataProgram[noProgram - 1][1];

        System.out.println("NAMA PROGRAM YANG DIPILIH ADALAH ".concat(namaProgramDiPIlih));

    }

    static String[][] tampilkanDataProgram(){
        String[][] program2 = {
                {"1", "FE"},
                {"2", "BE"},
                {"3", "SA"},
                {"4", "QA"},
                {"5", "QC"},
                {"6", "BA"},
        };


        System.out.println("NO |  NAMA PROGRAM");

        for(int i = 0; i < program2.length; i++){
            System.out.println(program2[i][0] + " | "+ program2[i][1]);
        }

        return program2;

    }

    static void tampilkanDataStudent(){
        String[][] student = {
                {"1", "DANNY","12345","KARAWANG","20"},
                {"2", "TIOKI","54321","SUBANG","23"},
                {"3", "RAFLI","112233","BEKASI","24"},
                {"4", "GILANG","12345","BANDUNG","25"},
        };

        System.out.println("ID \t| NAME \t| NIK \t| ADDRESS \t| AGE");
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i][0] + " \t| "+student[i][1]+ " \t| "+student[i][2]+ " \t| "+student[i][3]+ " \t| "+student[i][4]);
        }

    }

}
