package video.order.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverduePolicy {

    private static final int BASE_OVERDUE_CHARGE = 300; // 기본 연체료

    // 연체 일자 계산
    public static int calculateOverdueDay(Order order) {
        LocalDate now = LocalDate.now(); // 현재 날짜
        LocalDate returnDate = order.getReturnDate(); // 반납 날짜

        if (returnDate.isBefore(now)) { // 반납일자를 지났는가? -> 연체료 발생
            return (int) ChronoUnit.DAYS.between(now, returnDate);
        }

        return 0;

    }

    // 연체료 계산
    public static int calculateOverdueCharge(Order order) {
        int overdueDay = calculateOverdueDay(order);
        return overdueDay * BASE_OVERDUE_CHARGE;
    }



}
