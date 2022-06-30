package sock;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Sock> allTheSocks = Generator.generateSocks(10);

        for (Sock actualSock : allTheSocks) {

            System.out.println(SockColorHelper.zokniValosSzin(actualSock.color));
        }

    }
}
