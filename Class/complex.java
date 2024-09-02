// class complexs{
//     int real;
//     int img;
//     public complexs(int real,int img)
//     {
//         this.real=real;
//         this.img=img;
//     }
//     public complexs add(complexs c2){
//         int reals=this.real+c2.real;
//         int imgs=this.img+c2.img;
//         complexs res=new complexs(reals, imgs);
//         return res;
//     }
//     public void show()
//     {
//         System.out.println(this.real+"i"+this.img);
//     }
// }
class complexs{
    int real;
    int img;
    public complexs(int img,int real)
    {
        this.real=real;
        this.img=img;
    }
    public complexs add(complexs c2){
        int imga=this.img+c2.img;
        int reals=this.real+c2.real;
        complexs ob=new complexs(imga, reals);
        return ob;
    }
    public void show()
    {
        System.out.println(this.real+"i"+this.img);
    }
}
public class complex {
    public static void main(String[] args) {
        complexs ob=new complexs(3, 4);
        complexs ob2=new complexs(2, 5);
        ob2=ob2.add(ob);
        ob2.show();
    }
}
