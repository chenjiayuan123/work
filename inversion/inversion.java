package inversion;

public class inversion {
    public static void main(String[] args) {
        String str = "acbadsbvaljsfhbv";

        int start = 3;
        int end = 10;

        System.out.println("原本字符："+str);

        String strNew=strReverse(str, start, end);

        System.out.println("变完字符："+strNew);
    }

    private static String strReverse(String strArg, int start, int end) {
        String strStart=strArg.substring(0,start);

        String strEnd=strArg.substring(end+1,strArg.length());

        String strSub=strArg.substring(start, end+1);

        StringBuffer sb=new StringBuffer(strSub);
        strSub=sb.reverse().toString();

        return strStart.concat(strSub).concat(strEnd);
    }
}
