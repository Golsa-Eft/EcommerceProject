import common.*;
import com.bookStore.service.UserService_Insert;

public class Main {
    public static void main(String[] args){
        UserService_Insert.getInstance().simpleInsert_01("java1234", "morad moradi");
        UserService_Insert.getInstance().simpleInsert_01("java12", "ali alavi");
    }
}
