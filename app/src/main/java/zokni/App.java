package zokni;

public class App {

    public static void main(String[] args) {

        Zokni[] zoknik = new Zokni[10];

        for (int i = 0; i < 10; i++) {

            double random = Math.random() * 4;

            random = random + 1.0d;

            int kerekites = (int) Math.round(random);

            ZokniSzin szin = ZokniSzinHelper.zokniSzinSzinkodAlapjan(kerekites);

            zoknik[i] = new Zokni(szin);
        }

        for (int i = 0; i < 10; i++) {

            System.out.println(ZokniSzinHelper.zokniValosSzin(zoknik[i].szin));
        }

    }
}
