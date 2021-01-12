package part1.lessons8.task2;

public class Main {

    enum Operation {

        PLUS("+") {
            double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            double apply(double x, double y) {
                return x - y;
            }
        },
        TIMES("*") {
            double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            double apply(double x, double y) {
                return x / y;
            }
        };

        private final String symbol;

        Operation(String symbol) {
            this.symbol = symbol;
        }


        public String toString() {
            return symbol;
        }

        abstract double apply(double x, double y);
    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operation op : Operation.values()) {
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.apply(x, y));

        }
    }

}
