package video.user.repository;

import video.movie.domain.Movie;
import video.order.domain.Order;
import video.user.domain.Grade;
import video.user.domain.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private static final Map<Integer, User> userDatabase = new HashMap<>();

    static { // 더미 데이터
        User test1 = new User("김테스트", "010-1234-5667", Grade.BRONZE);
        User test2 = new User("이테스트", "010-1234-5222", Grade.BRONZE);
        User test3 = new User("박테스트", "010-1234-4444", Grade.BRONZE);
        User test4 = new User("최테스트", "010-1234-8888", Grade.BRONZE);
        User test5 = new User("정테스트", "010-1234-9876", Grade.BRONZE);
        userDatabase.put(test1.getUserNumber(), test1);

        Movie testMovie = new Movie("무비", "국가", 2024);
        Order testOrder = new Order(test1, testMovie);
        testOrder.setOrderDate(LocalDate.of(2024, 3, 1));
        testOrder.setReturnDate(LocalDate.of(2024, 3, 4));
        test1.addOrder(testOrder);

    }

    // 회원 추가 기능
    public static void addUser(User user) {
        userDatabase.put(user.getUserNumber(), user);
    }
    
    // 회원 탐색 기능
    public List<User> findUserByName(String userName) {
        List<User> userList = new ArrayList<>();

        for (Integer key : userDatabase.keySet()) {
            User user = userDatabase.get(key); // key값을 통해 User 객체를 얻기
            if (user.getUserName().equals(userName)) { // User 객체의 name이 매개값으로 받은 name과 같다면
                userList.add(user); // 리스트에 객체를 추가
            }
        }
        
        return userList;
    }

    // 회원 삭제 기능
    public static User deleteUser(int delUserNum) {
        return userDatabase.remove(delUserNum);
    }

    public User findUserByNumber(int userNumber) {
        return userDatabase.get(userNumber);
    }
}
