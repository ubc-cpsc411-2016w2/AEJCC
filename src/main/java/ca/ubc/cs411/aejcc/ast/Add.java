package ca.ubc.cs411.aejcc.ast;

public class Add extends AE {
    public final AE lhs, rhs;
    public Add(AE lhs, AE rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public String prettyPrint() { return "(+ " + lhs.prettyPrint() + " " + rhs.prettyPrint() + ")"; }

    public int interp() {
        return lhs.interp() + rhs.interp();
    }

    public String toString() {
        return "new Add(" + lhs + ", " + rhs + ")";
    }
}
