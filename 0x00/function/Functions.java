import java.util.Date;

public class Functions {

    private IncomeRepository inRepo = new IncomeRepository();
    private ExpenseRepository outRepo = new ExpenseRepository();
    private UserService userService = new UserService();
    private UserRepository userRepository = new UserRepository();
    private VersionService versionService = new VersionService();
    private EnvironmentService environmentService = new EnvironmentService();
    private ReleaseService releaseService = new ReleaseService();

    // Do only 1 thing
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    // Only 1 level of abstraction
    public User saveUser(User user) {
        return userService.save(user);
    }

    // Arguments
    public void saveUserData(User user) {
    }

    // No side effects
    public User saveUserRepository(User user) {
        return userRepository.save(user);
    }

    public void setRole(User user) {
        user.setRole(user);
    }

    // Avoid duplicates by extracting into new methods
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }
}

class Income {
}

class Expense {
}

class User {

    public void setRole(User user) {
    }
}

class Environment {
}

class Release {
}

class IncomeRepository {

    public void save(Income income) {
    }
}

class ExpenseRepository {

    public void save(Expense expense) {
    }
}

class UserRepository {

    public User save(User user) {
        return user;
    }
}

class UserService {

    public User save(User user) {
        return user;
    }
}

class VersionService {

    public String getVersion() {
        return "1.0";
    }
}

class EnvironmentService {

    public Environment getEnvironment(String version) {
        return new Environment();
    }
}

class ReleaseService {

    public Release getRelease(String version) {
        return new Release();
    }
}
