public class suru {
    public static void main(String[] args) {
        //premative data type
        byte age=11;
        int phone=1234567890;
        double ph=145678990L;
        float ag=12.2F;
        System.out.println(ag);
        //Non-premative data type
        String name="ABHISHEKkl";
        System.out.println(name.length());
        String name2="Aku";
        String name3=name+name2;
        System.out.println(name3);
        String name4=name+" And "+name2;
        System.out.println(name4);
        System.out.println(name4.charAt(2));
        //replace
        String naam=name.replace('E', 'w');
        //not change in original string only made new string
        System.out.println(naam);
        System.out.println(name);
        System.out.println(name4);
        System.out.println(name4.substring(0,8));
        //it print char between two index


        // System.out.println("Hello JAVa");
       /*String name="Abhi";
       int age=19;
       int age2=18;
       String neighbour="Akku";
       String friend=neighbour;
       System.out.println(name);
       System.out.println(age);
       System.out.println(friend);
       int age3=age+age2;
       System.out.println(age3);
        */
    }
}