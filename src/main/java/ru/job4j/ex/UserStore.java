package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                rsl = i;
                break;
            }
        }
        if (users == null) {
            throw new UserNotFoundException("This user not found");
        }
        return null;
}

    public static boolean validate(User user) throws UserInvalidException {
        String username = new String();
        int name = username.length();
        if (!user.isValid() && name < 3) {
            throw new UserInvalidException("This user not validate");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (user != null && validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
            System.out.println("This user not validate");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println("This user not found");
        }
    }
}
