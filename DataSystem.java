import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DataSystem {
    static void showUser() {
        final File folder = new File("./data");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
    // Tao nguoi dung moi; bao gom ten dang nhap, mat khau va so tien trong tai
    // khoan
    public static void CreaterUser(String username, String Password, int AccBalance) {
        try {
            File newUser = new File("./data/" + username + ".txt");
            newUser.createNewFile();
            FileWriter file = new FileWriter("./data/" + username + ".txt");
            file.write(Password + "\n");
            file.write(String.valueOf(AccBalance));
            file.close();
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    // Kiem tra ten nguoi dung da ton tai hay chua; tra ve gia tri true hoac false
    // Dung de kiem tra dang ki
    public static boolean checkUsername(String username) {
        username += ".txt";
        final File folder = new File("./data");
        for (File file : folder.listFiles()) {
            if (file.getName().equals(username))
                return true;
        }
        return false;
    }
    // Kiem tra mat khau cua nguoi dung; tra ve gia tri true hoac false
    // Dung de kiem tra dang nhap
    public static boolean checkPass(String username, String Password) {
        final File folder = new File("./data");
        boolean check = false;
        // Duyet tung file trong folder data
        for (File file : folder.listFiles()) {
            if (file.getName().equals(username)) {
                try {
                    File tmp = new File(file.getPath());
                    Scanner sc = new Scanner(tmp);
                    if (sc.nextLine().equals(Password))
                        check = true;
                    else
                        check = false;
                    sc.close();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
            }
        }
        return check;
    }
    // Xoa tai khoan nguoi dung
    public static void deleteUser(String username) {
        File file = new File("./data/" + username + ".txt");
        file.delete();
    }
    public static void main(String[] args) {
        File folder = new File("data");
        for (File file : folder.listFiles())
            System.out.println(file.getName());
    }
}
