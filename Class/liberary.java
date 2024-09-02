class centralliberary{
    String[] books;
    int no_pf_book;

    centralliberary(){
        this.books=new String[100];
        this.no_pf_book=0;
    }
    void add_book(String book)
    {
        this.books[no_pf_book]=book;
        no_pf_book++;
        System.out.println(book+" is added");
    }
    void show_book()
    {
        for(String book:this.books){
            if(book==null)
            {
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void allot_book(String book){
        for(int i=0;i<this.books.length;i++)
        {
            if(books[i]==book){
                System.out.println("Book is alloted!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This Book is not availabe");
    }
    void return_book(String book){
        
     for(int i=0;i<this.books.length;i++){
        if(this.books[i]==null){
            this.books[i]=book;
            return;
        }
     }
        
    }

}

public class liberary {
    public static void main(String[] args) {
        centralliberary ob=new centralliberary();
        ob.add_book("C++");
        ob.add_book("Rich dad");
        ob.add_book("paython");
        ob.show_book();
        ob.allot_book("Rich dad");
        ob.show_book();
        ob.return_book("Rich dad");
        ob.show_book();
    }
}
