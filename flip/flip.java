package flip;

import java.util.Scanner;

//编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
//        “To be or not to be"，将变成"oT eb ro ton ot eb."。
public class flip {
    public static void main(String[] args) {
        final String str = "to be or not to be";
        final String[] array = str.split(" ");
        for(String s:array){
            final StringBuilder builder = new StringBuilder();
            System.out.print(builder.append(s).reverse()+ " ");
        }
    }
}
