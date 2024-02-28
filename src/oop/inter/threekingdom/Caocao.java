package oop.inter.threekingdom;

public class Caocao extends Alive implements Intelligence, General {

    @Override
    public void force(String weapon) {
        System.out.println("조조가 " + weapon + "으로 싸웁니다.");
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void opinion() {
        System.out.println(this.name + "이 의견을 제시합니다.");
    }

    @Override
    public void opposite() {
        System.out.println(this.name + "이 의견에 반대합니다.");
    }

    @Override
    public void command(Character character) {
        System.out.println("부대를 통솔합니다.");
    }

    @Override
    public void strategy() {
        System.out.println("전략을 구성합니다. (병법)");
    }
}
