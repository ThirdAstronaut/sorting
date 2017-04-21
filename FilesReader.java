import java.io.*;
import java.util.ArrayList;


/**
 * Created by Rafał on 2017-03-31.
 */
public class FilesReader {

    public ArrayList<Long> readFile(int length, int percent) throws IOException, ClassNotFoundException {
        Algorithms al = new Algorithms();
        ObjectInputStream ois = null;
        int[] array;
        ArrayList ar = new ArrayList();

        for (int i = 0; i < 100; i++) {
            File file = new File(".\\Data\\"+length+"\\"+percent+"\\"+(i+1));
            ois = new ObjectInputStream(new FileInputStream(file));
            array = (int[]) ois.readObject();
            ar.add(al.shellSort(array));
        }
        ois.close();
        return ar;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FilesReader fr = new FilesReader();
        //  fr.readFile("1Mtest.txt");
    }
}




       /*  FileInputStream fis = null;
        ArrayList ar;
       int[] array = null;
       String[] s = null;
        try {
            File file = new File(fileName);
            fis = new FileInputStream(file);
            ar = new ArrayList();


            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
               s = line.split("/");
                for(int k = 0; k < s.length; k++){
                    ar.add(Integer.parseInt(s[k]));
                }
                array = new int[ar.size()];
                for(int i = 0; i < ar.size(); i++){
                    array[i] = (Integer)ar.get(i);
                }*/















/*    String[] s = line.split("/n");
    String[] p = new String[1000];
                for (String string : s) {
                System.out.println(string);
        p = string.split("/");
    }

    for(String str : p){
        System.out.println(str);

    }
    */
//   System.out.println("length " + p.length);
//  for (int j = 0; j < p.length - 110; j++) {

// // a.add(Integer.parseInt(s[j]));
//  System.out.println((s[j]));

//}
            /*
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }*/
//  }

   /* } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return array;
        }*/
    /*BufferedReader reader = null;

try {
    File file = new File("sample-file.dat");
    reader = new BufferedReader(new FileReader(file));

    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}*/


