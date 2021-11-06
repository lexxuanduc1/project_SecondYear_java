import java.util.Scanner;

public class CLI {
    //Hien thi menu chinh
    static void MainMenu(){
        System.out.println("Moi ban chon: ");
        System.out.println("1. Dang nhap");
        System.out.println("2. Dang ki");
        System.out.println("0. Thoat");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch(option){
            case 1: Login(); break;
            case 2: Singin(); break;
            case 0: break;
            default: System.out.println("Wrong input !");
        }
        sc.close();
    }
    //Hien thi man hinh dang nhap
    static void Login(){
        System.out.println("Ten dang nhap: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Mat khau: ");
        String password = sc.nextLine();
        if(DataSystem.checkPass(name, password)==true){
            System.out.println("Dang nhap thanh cong");
        }
        else System.out.println("Dang nhap that bai !");
        sc.close();
    }
    //Hien thi man hinh dang ki
    static void Singin(){
        System.out.println("Ten dang nhap: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Mat khau: ");
        String password = sc.nextLine();
        if(DataSystem.checkUsername(name)==true){
            DataSystem.CreaterUser(name, password, 0);
            System.out.println("Dang ki thanh cong !");
        }
        else{
            System.out.println("Ten dang nhap da ton tai.");
        }
        sc.close();
    }
}
