/**
 * Created by jj on 27.03.2016.
 */
public class Recurs {
    public void rec(char [] str,int i) {
        if (i >= 0) {
            System.out.print(str[i] + " ");
            rec(str, i - 1);

        }
        else return;
    }
//    Recurs rec = new Recurs();
//    char[] stroka = {'q', 'w', 'e', 'r', 't', 'y'};
//
//    System.out.print("Строка1: ");
//    for (int i = 0; i < stroka.length; i++) {
//        System.out.print(stroka[i] + " ");
//    }
//    System.out.print("Строка2: ");
//
//    rec.rec(stroka, stroka.length-1 );
}
