package oop.inter.threekingdom;

public class Lvbu extends Alive implements General {

    @Override
    public void command(Character character) {
        System.out.println("여포가 서량군을 통솔합니다.");
    }

    @Override
    public void strategy() {

    }

    @Override
    public void force(String weapon) {

    }

    @Override
    public boolean sleep() {
        return false;
    }
}
