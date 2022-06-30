package sock;

public class SockColorHelper {
    public static SockColor getSockColorBasedOnColorCode(int colorCode) {
        if (colorCode == 1) {
            return SockColor.RED;
        }

        if (colorCode == 2) {
            return SockColor.BLACK;
        }

        if (colorCode == 3) {
            return SockColor.PURPLE;
        }
        if (colorCode == 4) {
            return SockColor.GREY;
        }

        if (colorCode == 5) {
            return SockColor.GREEN;
        }

        return SockColor.LEAKY;

    }

    public static String zokniValosSzin(SockColor szin) {
        if (szin == SockColor.RED) {
            return "Red";

        }
        if (szin == SockColor.BLACK) {
            return "Black";

        }
        if (szin == SockColor.PURPLE) {
            return "Purple";

        }
        if (szin == SockColor.GREY) {
            return "Grey";

        }
        if (szin == SockColor.GREEN) {
            return "Green";

        }

        return "Trash it !";

    }

}
