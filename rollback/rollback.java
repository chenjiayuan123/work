package rollback;

import java.util.Scanner;

public class rollback {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个带中文的字符串，和要截取的字节数：");
            String str=scan.next();
            int num=scan.nextInt();

            byte[] buf=str.getBytes();
            if(num<=buf.length) {
                int times=0;
                for(int i=0;i<num;i++) {
                    if(buf[i]<0) {
                        times++;
                    }
                }
                if(times%2==1) {
                    num--;
                }
                String out=new String(buf,0,num);//字节转成字符串
                System.out.println("截取的字符串是："+out);
                System.out.println();
            }else {
                try {
                    throw new MyException("截取字节数超出字符串长度．．．");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class MyException extends Exception{
    public MyException(String msg) {
        super(msg);
    }

}
