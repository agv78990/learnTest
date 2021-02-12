package mathematic;

import org.testng.annotations.Test;

public class Hello {

    public static void main(String[] args) {
        Hello hello=new Hello();
        hello.sum(23,23);
        hello.minus(54,54);

    }

    public int sum(int a, int b){
        int result=a-b;
        System.out.println("please run the result "+ result);
        return result;
    }
    public int minus(int a, int b){
        int result=a-b;
        System.out.println("do this "+ result);
        return result;

    }






}
