package ca.ubc.cs411.aejcc;

import ca.ubc.cs411.aejcc.parser.AEParser;
import ca.ubc.cs411.aejcc.parser.ParseException;
import ca.ubc.cs411.aejcc.ast.AE;
import ca.ubc.cs411.aejcc.parser.TokenMgrError;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AE!\nType \"exit\" to end.");

        AEParser aep = new AEParser(System.in);

        try {
            AE result;
            do {
                System.out.print("> ");
                result = aep.REPLCmd();
                if (result != null) {
                    System.out.println("AST: " + result);
                    System.out.println("Pretty Print: " + result.prettyPrint());
                    System.out.println("Interp: " + result.interp());
                }
            } while(result != null);
        }
        catch(ParseException e) {
            System.out.println("exception: " + e);
        }
        catch(TokenMgrError e) {
            System.out.println("error: " + e);
        }
        System.out.println("Goodbye!");
    }
}
