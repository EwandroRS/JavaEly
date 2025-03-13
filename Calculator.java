public class Calculator {
    int num1,num2;

    public Calculator(int num1, int num2) {
        this.num1 = 0;
        this.num2 = 0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sumNum(){
        return num1 + num2;
    }

    public int subNum(){
        return num1 - num2;
    }

    public int multNum(){
        return num1 * num2;
    }

    public int divNum(){
        return num1 / num2;
    }
}

