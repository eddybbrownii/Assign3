public class UserApplication {
    UserService userService =
            new UserService();
    User[] users = new User[4];
    for(
    int i = 0;
    i< 4;i++)

    {

        users[i] =
                userService.createUser("username" + i,
                        "password" + i, "name" + i);
    }
}