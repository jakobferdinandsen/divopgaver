package dk.jhaaf.jakob.div;

/**
 * Created by jakob on 11-10-16.
 */
public class ThisAndNotThis {

    private int x;


    public ThisAndNotThis(int x){
        this.x = x; // <--- Dette betyder bare at klassen x variable bliver den variable
                    // der blev givet med da metoden blev kalde

    }

    public void setX(int x){
        this.x = 0; // <--- this.x er x variablen på linje 8, hvor this, referer til klassen selv
        x = 0; // <--- x er x variablen methoden bliver kaldt med på linje 17.
    }
}
