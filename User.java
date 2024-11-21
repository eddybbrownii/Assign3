public class User {
    //POJO
    String username;
    String password;
    String name;
    Integer invalidLogInAttempts;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public Integer getInvalidLogInAttempts() {
        return invalidLogInAttempts;
    }

    public void setInvalidLogInAttempts(Integer invalidLogInAttempts) {
        this.invalidLogInAttempts = invalidLogInAttempts;
    }

    public void setinvalidLogInAttempts(int i) {
    }
}
