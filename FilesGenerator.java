import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rafał on 2017-04-07.
 */
public class FilesGenerator {

    void generate(int length, int percent) throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = null;
        switch (percent){
            case 100:


                for (int i = 0; i < 100; i++) {
                    arrayList = new ArrayList(); arrayList.clear();
                    out = new ObjectOutputStream(new FileOutputStream(".\\Data\\"+length+"\\"+percent+"\\"+(i+1)));
                    for (int j = 0; j < length*1000; j++) {
                        arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
                    }
                    Collections.sort(arrayList);
                    int[] tab = new int[arrayList.size()];
                    for (int k = 0; k < tab.length; k++) {
                        tab[k] = arrayList.get(k);
                    }
                    out.writeObject(tab);

                }
                out.close();
                break;

            case -100:


                for (int i = 0; i < 100; i++) {
                    arrayList = new ArrayList();arrayList.clear();
                    out = new ObjectOutputStream(new FileOutputStream(".\\Data\\"+length+"\\"+percent+"\\"+(i+1)));
                    for (int j = 0; j < length*1000; j++) {
                        arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
                    }
                    int[] tab = new int[arrayList.size()];
                    Collections.sort(arrayList, Collections.reverseOrder());
                    for(int p = 0; p < arrayList.size(); p++){
                        tab[p] = arrayList.get(p);
                    }
                    out.writeObject(tab);

                }
                out.close();
                break;

            case 0:
                int[] tab = null;

                for (int i = 0; i < 100; i++) {
                    tab = new int[length*1000];
                    out = new ObjectOutputStream(new FileOutputStream(".\\Data\\" + length + "\\" + percent + "\\" + (i + 1)));
                    for (int j = 0; j < length * 1000; j++) {
                        tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
                    }
                    out.writeObject(tab);
                }

                out.close();
                break;

            case 50:
                int[] ar = null;

                for (int i = 0; i < 100; i++) {
                    arrayList = new ArrayList();arrayList.clear();
                    out = new ObjectOutputStream(new FileOutputStream(".\\Data\\"+length+"\\"+percent+"\\"+(i+1)));
                    for (int j = 0; j < length*1000/2; j++) {
                        arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
                    }
                    Collections.sort(arrayList);

                    for (int p = 0; p < length*1000/2; p++) {
                        arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
                    }
                    ar = new int[arrayList.size()];
                    for (int k = 0; k < arrayList.size(); k++) {
                        ar[k] = arrayList.get(k);
                    }
                    out.writeObject(ar);

                }
                out.close();
                break;

            default: System.out.print("podaj liczbe 0 | 50 | 100 | -100");

                break;
        }
    }



    public void writeDataToGraph(ArrayList arrayList) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("values.txt"));
        bw.write(arrayList.get(0).toString()+"");
        for (int i = 1; i < arrayList.size(); i++) {
            bw.write("/"+arrayList.get(i).toString());
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        FilesGenerator fg = new FilesGenerator();
        fg.generate(10,0);
        //   fg.generate(10,50);
//    fg.generate(10,100);
        //   fg.generate(10,-100);

        fg.generate(50,0);
        //   fg.generate(50,50);
//    fg.generate(50,100);
        //   fg.generate(50,-100);

        fg.generate(100,0);
        //  fg.generate(100,50);
        //   fg.generate(100,100);
        //  fg.generate(100,-100);

//
        fg.generate(1000,0);
        //   fg.generate(1000,50);
        //   fg.generate(1000,100);
//    fg.generate(1000,-100);

    }

}










