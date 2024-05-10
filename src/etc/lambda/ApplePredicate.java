package etc.lambda;

@FunctionalInterface // 해당 인터페이스가 람다 표혀닉으로 객체 생성이 가능한 인터페이스 인자를 문법 검사.
public interface ApplePredicate {
    
    // 사과를 전달받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);
}
