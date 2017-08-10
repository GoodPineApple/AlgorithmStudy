package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class UserTest {

    public static void main(String[] argv) {
        new UserTest().compare();
    }

    private void compare() {
        User a = new User("J", "Lee");
        User b = new User("J", "Lee");
        User c = a;

        System.out.println(a == b);     // false; a와 b의 주소값은 다르다.
        System.out.println(a == c);     // true; a와 c의 주소값은 같다.
        System.out.println(a.equals(b));    // a객체와 b객체는 완전히 같지않다.
    }

    public class User {
        private String firstName;
        private String lastName;

        public User(String firstName, String lastName) {
            this.firstName = new String(firstName);
            this.lastName = new String(lastName);
        }

        public boolean equals(User other) {
            System.out.println(match(firstName, other.firstName));
            System.out.println(match(lastName, other.lastName));
            return match(firstName, other.firstName)
                    || match(lastName, other.lastName);
        }

        private boolean match(String part1, String part2) {
            System.out.println(part1);
            System.out.println(part2);
            return part1 == part2 && part1.equals(part2);       // part1 == part2는 주소값은 묻고있다. 같지 않으므로 false가 리턴된다.
        }
    }
}

