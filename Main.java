import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rafał on 2017-03-31.
 */
public class Main {

    private int x;
    static FilesReader fr = new FilesReader();
    static Algorithms al = new Algorithms();
    static FilesGenerator fg = new FilesGenerator();
    static ArrayList<Long> ar = new ArrayList();


    public static void main(String[] a) throws IOException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Menu\n1. type \"1\" to generate test files\n2. type \"2\" to read file and generate alghoritms");
        int x = sc.nextInt();

        // sc.close();


        switch (x) {
            case 0:
                System.exit(1);
                break;

            case 1:
                case1();
                break;

            case 2:
                case2();
                break;

            default:
        }
    }

    public static void case1() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj długość ciągu, procent posortowania");
        int length = sc.nextInt();
        int percent = sc.nextInt();

        //sc.close();

        if(length == 0){
            System.out.print("Koniec");
            System.exit(1);
        }
        if (percent == 0 || percent == 100 || percent == 50 || percent == -100) {
            fg.generate(length, percent);

        } else {
            System.out.print("jako stopień posortowania podaj jedną z liczb: 0, 50, 100, -100 \n");
            case1();

        }
    }


    public static void case2() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        long sum=0;

        System.out.println("Podaj numer algorytmu długosc ciagu i procent posortowania :\n1-shell sort \n2 - library sort \n3-quick sort \n4 wszystkie ");
        int num = scanner.nextInt();
        int length =scanner.nextInt();
        int percent = scanner.nextInt();
        if(num == -1){
            System.out.print("Koniec");
            System.exit(1);
        }

        switch(num){
            case 0:
                System.out.print("Koniec");
                System.exit(1);
                break;

            case 1:
                ar = fr.readFile(length, percent);

                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();
                sum = 0;
                break;

            case 2:
                ar.clear();
                ar = fr.readFile(length, percent);

                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();
                break;

            case 3:
                ar = fr.readFile(length, percent);

                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();

                break;

            case 4:
                ar = fr.readFile(length, percent);
                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();
                sum = 0;

                ar.addAll(fr.readFile(length, percent));
                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                sum = 0;
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();

                ar.addAll(fr.readFile(length, percent));
                fg.writeDataToGraph(ar);
                for(int z = 0; z < ar.size(); z++){
                    sum+=ar.get(z);
                }
                sum = 0;
                System.out.print("data for graph passed to the file, open python script to see results\navg time "+sum/ar.size());
                ar.clear();

                break;

            default:
                System.out.print("\npodaj poprawne dane lub wpisz \"-1\" by zamknąć program ");
                case2();
                break;
        }

    }











    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
