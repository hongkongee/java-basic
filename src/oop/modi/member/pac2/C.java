package oop.modi.member.pac2;

import basic.method.MethodExample1;
import oop.modi.member.pac1.A;

public class C {

    public C() {
        A a = new A();

        a.x = 1;
//        a.y = 2; (x) default
//        a.z = 3; (x) private

        a.method1();
//        a.method2(); (x) default
//        a.method3(); (x) private

    }
}
