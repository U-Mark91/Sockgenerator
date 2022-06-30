package sock;

import java.util.Arrays;
import java.util.List;

public class Generator {

    static List<Sock> generateSocks(int numberOfSocks) {

        Sock[] socks = new Sock[10];

        for (int i = 0; i < 10; i++) {

            double random = Math.random() * 4;

            random = random + 1.0d;

            int colorCode = (int) Math.round(random);

            SockColor color = SockColorHelper.getSockColorBasedOnColorCode(colorCode);

            socks[i] = new Sock(color);

        }

        return Arrays.asList(socks);
    }

}
