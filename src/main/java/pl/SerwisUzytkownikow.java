package pl;

import java.util.HashMap;
import java.util.Map;


// Serwis sprawdza, czy nazwa i haslo sa poprawne.
public class SerwisUzytkownikow {
    // static dlatego, zeby nie trzeba bylo tworzyc obiektu SerwisUzytkownikow (new SerwisUzytkownikow() - tak sie
    // tworzy obiekt).
    static Map<String, String> nazwyIHasla = new HashMap<>();

    //    static, bo to wyzej jest static
    static {
//        nazwa: admin, haslo: haslo
        nazwyIHasla.put("admin", "haslo");
//        nazwyIHasla.put("uzytkownik", "haselko");
    }

    //    Zwraca true (prawda), jesli nazwa i haslo uzytkownika sa poprawne. Sa poprawne jesli znajduje sie w mapie
    // powyzej. Poki co jest tylko admin, haslo. Jak sie chce dodac innego uzytownika, trzeba dodac haslo i nazwe
    // poprzez metode put.
    public static boolean czyUdaloSieZalogowac(String nazwaUzytkownika, String haslo) {
        String znalezioneHaslo = nazwyIHasla.get(nazwaUzytkownika);
        if (znalezioneHaslo == null) {
            return false;
        }
        if (!znalezioneHaslo.equals(haslo)) {
            return false;
        }
        return true;
    }
}
