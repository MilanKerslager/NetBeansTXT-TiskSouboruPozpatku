// vytiskněte soubor v obráceném pořadí řádků
// (první řádek bude vytištěn až jako poslední)

package tisksouborupozpatku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiskSouboruPozpatku {

    public static void main(String[] args) {
        ArrayList<String> seznamradku = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("d:/pokus.txt"));
            String radek;
            while ((radek = br.readLine()) != null) {
                // zapamatujeme si řádek
                seznamradku.add(radek);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TiskSouboruPozpatku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TiskSouboruPozpatku.class.getName()).log(Level.SEVERE, null, ex);
        }
        // projdeme ArrayList od posledního k prvnímu prvku a vytiskneme
        for (int i=seznamradku.size()-1; i>=0; i--) {
            System.out.println(seznamradku.get(i));
        }
    }
    
}
