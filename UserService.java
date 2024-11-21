import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        User user = new User();

        String username = null;
        String password = null;
        String name = null;
        // Integer invalidLogInAttempts;
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setinvalidLogInAttempts(0);
        Scanner scanner = new Scanner(System.in);
    }
}
