package Dbconnect;




public class Main {
    public static void main(String[] args) {
        Student st=new Student();
//        st.createdatabse("JavaDB");
//        st.createTable("JavaDB");
//        st.createData("JavaDB");
//      st.readData("JavaDB");  
//        st.updateData("javaDB");
        st.deleteData("javaDB");
        st.readData("JavaDB"); 
    }
}
