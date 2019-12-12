package gain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//请设计一个方法，可以实现获取任意范围内的随机数。
public class gain {
    public static void main(String[] args) {

            System.out.println(getRandom(200,300));

    }
    public static int getRandom(int start ,int end){
        int number = (int)(Math.random() *(end -start+1) +start);
        return number;
    }
}
