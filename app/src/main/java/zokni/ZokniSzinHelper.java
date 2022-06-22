package zokni;

public class ZokniSzinHelper {
    public static ZokniSzin zokniSzinSzinkodAlapjan(int szinkod) {
        if (szinkod == 1) {
            return ZokniSzin.PIROS;
        }

        if (szinkod == 2) {
            return ZokniSzin.FEKETE;
        }

        if (szinkod == 3) {
            return ZokniSzin.LILA;
        }
        if (szinkod == 4) {
            return ZokniSzin.SZURKE;
        }

        if (szinkod == 5) {
            return ZokniSzin.ZOLD;
        }

        return ZokniSzin.LYUKAS;

    }

    public static String zokniValosSzin(ZokniSzin szin) {
        if (szin == ZokniSzin.PIROS) {
            return "Piros";

        }
        if (szin == ZokniSzin.FEKETE) {
            return "Fekete";

        }
        if (szin == ZokniSzin.LILA) {
            return "Lila";

        }
        if (szin == ZokniSzin.SZURKE) {
            return "Szürke";

        }
        if (szin == ZokniSzin.ZOLD) {
            return "Zöld";

        }

        return "Dobd ki a faszba !";

    }

}
