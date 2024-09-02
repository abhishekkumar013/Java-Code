public class Strings {
    public static void main(String[] args) {
        char[] chararray={'A','B','C'};
        System.out.println(chararray);
        System.out.println(chararray[1]);

        String str="ABC";
        System.out.println(str);
        System.out.println(str.charAt(1));

        String str1="ABC";
        String str2="ABC";

        // str1 & str2 pointing same value then no new address
        System.out.println(str1==str2); // checking instance not value

        // here str3 is at new address
        String str3=new String("ABC"); //checking instance not value

        System.out.println(str1==str3);

        // check value
        System.out.println(str1.equals(str3));


        // TODO: STRING BUFFER
        StringBuffer str4=new StringBuffer("ABHI");
        System.out.println(str4);
        str4.append("SHEK");
        System.out.println(str4);
        
        str4.deleteCharAt(0);
        System.out.println(str4);

        str4.delete(0,2);
        System.out.println(str4);

        str4.insert(0, 'A');
        System.out.println(str4);


    }
}
