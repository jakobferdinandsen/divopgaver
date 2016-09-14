package dk.jhaaf.jakob.opgave311;

/**
 * Created by jakob on 14-09-16.
 */
public class Gates {
    public static void main(String[] args) {
        Gates gates = new Gates();

        System.out.println(gates.exor(false, false));
        System.out.println(gates.exor(false, true));
        System.out.println(gates.exor(true, false));
        System.out.println(gates.exor(true, true));
    }

    public boolean not(boolean n) {
        return !n;
    }

    public boolean or(boolean n, boolean x) {
        if (n || x) {
            return true;
        } else {
            return false;
        }
    }

    public boolean and(boolean n, boolean x) {
        if (n && x) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nand(boolean n, boolean x) {
        return not(and(n, x));
    }

    public boolean exor(boolean n, boolean x) { //Hedder XOR, ikke EXOR.
        if (and(!n, !x)) {
            return false;
        } else if (and(!n, x)) {
            return true;
        } else if (and(n, !x)) {
            return true;
        } else {
            return false;
        }

    }
}
