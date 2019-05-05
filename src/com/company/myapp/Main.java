package com.company.myapp;
import com.company.calcengine.*;

public class Main {

    static void useMathEquation() {

        MathCommand command;


        MathEquation testEquation = new MathEquation();
//        testEquation.execute();

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.print("result = ");
//            System.out.print(equation.getResult());
//        }

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

//        MathEquation equationOverload = new MathEquation('d');
//        equationOverload.execute(leftDouble, rightDouble);
    }

    static void useCalculateBase() {
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.println("result= ");
            System.out.println(calculator.getResult());
        }
    }

    public static void main(String[] args) {

//        System.out.println(MathCommand.Add.toString() == "Add");

        String[] statements = {
//                "divide 100.0 50.0",
                "1addX 25.0 25.0",
//                "add 25.0 92.0",
//                "add xx 25.0",
//                "subtract 225.0 17.0",
//                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println(" Original exception: " + e.getCause().getMessage());
            }

        }

    }


}

