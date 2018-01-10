import java.time.Clock;
public class clock3 {
    public static void main(String[]args){
      Clock TZ= Clock.systemDefaultZone();
      System.out.println(TZ.getZone());
    }
    
}