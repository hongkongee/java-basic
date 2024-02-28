package oop.inter.threekingdom;

public class Liubei extends Alive {
    @Override
    public void force(String weapon) {
        System.out.println("유비가 " + weapon + "으로 맞섭니다.");

    }

    @Override
    public boolean sleep() {
        return false;
    }

}
