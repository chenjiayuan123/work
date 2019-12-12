package StrungBuffer;
//定义一个StringBuffer类对象，
//        1）使用append方法向对象中添加26个字母，并倒序遍历输入
//        2）删除前五个字符
public class StringBuffer {
    public static void main(String[] args) {

    StringBuilder stringBuilder = new StringBuilder();
    Character a = 'a';

        for (int i = 0; i < 26; i++) {
            stringBuilder.append(a);
            a = (char) (a + 1);
        }
        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.delete(0,5));
    }

}
