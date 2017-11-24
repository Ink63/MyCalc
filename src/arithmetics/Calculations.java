package arithmetics;

public class Calculations {


    public static int sendDigit(String sDigit1, String sDigit2, Operations op ) {
        if (isCheck(sDigit1) && isCheck(sDigit2)) {
            try {
                int int1 = Integer.parseInt(sDigit1);
                int int2 = Integer.parseInt(sDigit2);
                switch (op) {
                    case PLUS: { return getPlus(int1,int2); }
                    case MINUS: { return getMinus(int1,int2); }
                    case DIV: { return getDiv(int1,int2); }
                    case MULT : { return getMult(int1,int2); }
                }

            }
            catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }
        else throw new ArithmeticException();
        return -1;
    }

    private static boolean isCheck(String digit1) {
        return digit1.length()>0;
    }

    private static int getPlus(int digit1, int digit2) {
        return digit1 + digit2;
    }

    private static int getMinus(int digit1, int digit2) {
        return digit1 - digit2;
    }

    private static int getMult(int digit1, int digit2) {
        return digit1 * digit2;
    }

    private static int getDiv(int digit1, int digit2) {
        return digit1 / digit2;
    }
}
