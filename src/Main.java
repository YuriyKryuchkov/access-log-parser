import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        String path="";
        File file=null;
        boolean fileExists =false;
        boolean isDirectory=false;
        int rigth_input=0;
        while(true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>:");
            path = new Scanner(System.in).nextLine();
            file = new File(path);
            fileExists=file.exists();
            if (!fileExists) {
                System.out.println("Указанный файл не существует");
                continue;
            }
            isDirectory=file.isDirectory();
            if (isDirectory){
                System.out.println("Указанный файл вляется каталогом");
                continue;
            }
            System.out.println("Путь указан верно");
            rigth_input++;
            System.out.println("Это файл номер: "+rigth_input);
        }

    }
}
