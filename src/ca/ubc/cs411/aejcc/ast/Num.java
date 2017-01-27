package ca.ubc.cs411.aejcc.ast;

public class Num extends AE {
    public final int n;
    public Num(int n) { this.n = n; }

    public int interp() { return n; }

    public String toString() {
        return "{Num: " + n + "}";
    }
}
