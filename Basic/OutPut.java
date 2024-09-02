import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OutPut {
    public static void main(String[] args) {
        
        // format
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatteddateTime=now.format(formatter);
        System.out.println(formatteddateTime);
    }
}
