package standartList;

public class MyMatrix {

    public static void outPutMatrix(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(a[i][j] + "\t");
            }
        }
    }
}

