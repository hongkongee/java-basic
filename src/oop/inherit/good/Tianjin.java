package oop.inherit.good;

public class Tianjin extends China {
    String port;

    public Tianjin(String port) {
        this.port = port;
    }

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 톈진 항구: " + port);
    }
}
