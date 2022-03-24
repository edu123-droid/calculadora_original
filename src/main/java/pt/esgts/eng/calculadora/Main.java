package pt.esgts.eng.calculadora;

import pt.esgts.eng.calculadora.lib.Operations;

import java.util.List;

public class Main {

    public static void main(String[] Args){
        double result = Operations.sum(10, 20);
        double result2 = Operations.sum(List.of(result, 10d, 5.0, 5d));

        System.out.println(result2);
    }
}
