public class Person {

    public boolean checkUser(String username) {
        if (username == null) return false;

        if (username.length() < 8) return false;

        // No special characters allowed
        if (!username.matches("^[a-zA-Z0-9]+$")) return false;

        return true;
    }

    public boolean checkPassword(String password) {
        if (password == null) return false;

        if (password.length() < 8) return false;

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");

        return hasUpper && hasNumber && hasSpecial;
    }
}
