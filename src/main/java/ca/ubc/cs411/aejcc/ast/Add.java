package ca.ubc.cs411.aejcc.ast;

public class Add extends AE {
    public final AE lhs, rhs;
    public Add(AE lhs, AE rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public int interp() {
        return lhs.interp() + rhs.interp();
    }

    public String toString() {
        return "{Add " + lhs + ", " + rhs + "}";
    }
}
