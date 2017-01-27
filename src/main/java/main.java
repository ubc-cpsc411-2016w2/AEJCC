import ca.ubc.cs411.aejcc.parser.AEParser;
import ca.ubc.cs411.aejcc.parser.ParseException;
import ca.ubc.cs411.aejcc.ast.AE;

public class main {
    public static void main(String[] args) {
        AEParser aep = new AEParser(System.in);

        try {
            AE result = aep.Root();
            System.out.println("AST: " + result);
            System.out.println("Interp: " + result.interp());
        }
        catch(ParseException pe) {
            System.out.println("exception: " + pe);
        }
    }
}
