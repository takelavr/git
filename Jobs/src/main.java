import java.util.Scanner;

//
public class main {
    public static void main(String[] args) {

        Rab rab1 = new Rab();
        Scanner scanner = new Scanner("Игорь,\n" + "Алла,\n");
        String s1 = scanner.nextLine();
        rab1.setName(s1);
        rab1.setDoljnost("Директор");
        rab1.setZP(1000);
        rab1.present();

        Rab rab2 = new Rab();
        s1 = scanner.nextLine();
        rab2.setName(s1);
        rab2.setDoljnost("бухгалтер");
        rab2.setZP(800);
        rab2.present();
        Rab rab3 = new Rab();
        rab3.setName("Петр");
        rab3.setDoljnost("менеджер");
        rab3.setZP(300);
        rab3.present();
        Rab rab4 = new Rab();
        rab4.setName("Василий");
        rab4.setDoljnost("менеджер");
        rab4.setZP(350);
        rab4.present();
        Uvol uvol1 = new Uvol();
        uvol1.setName("Анна");
        uvol1.setDoljnost("грузчик");
        uvol1.jaloba();
        Uvol uvol2 = new Uvol();
        uvol2.setName("Николай");
        uvol2.setDoljnost("аудитор");
        uvol2.jaloba();


    }
}