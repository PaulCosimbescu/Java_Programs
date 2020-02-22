package sample;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double sum;
        sum = this.firstNumber + this.secondNumber;
        return sum;
    }

    public double getSubtractionResult() {
        double sum;
        sum = this.firstNumber - this.secondNumber;
        return sum;
    }

    public double getMultiplicationResult() {
        double sum;
        sum = this.firstNumber * this.secondNumber;
        return sum;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        }
        double sum;
        sum = this.firstNumber / this.secondNumber;
        return sum;
    }
}
