package com.cn.duotai;

/**
 * @description:
 * Java实现多态有三个必要条件：继承、重写、向上转型。
 *
 *     继承：在多态中必须存在有继承关系的子类和父类。
 *
 *     重写：子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
 *
 *     向上转型：在多态中需要将子类的引用赋给父类对象，只有这样该引用才能够具备技能调用父类的方法和子类的方法。
 *
 * 多态机制遵循的原则概括为：当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
 * 但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法，如果子类没有覆盖，直接调用父类的该方法。
 * 但是它仍然要根据继承链中方法调用的优先级来确认方法，该优先级为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
 *
 * @author: helisen
 * @create: 2020-07-31 10:25
 **/
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C  c = new C();
        D d = new D();
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));

        /**
         * java继承调用链优先级为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
         * 下面这个方法，父类引用变量a2 指向 子类B实例对象，
         * 规则：编译的时候看左边，运行时看右边 ，A a2 = new B()，所以编译时候a2只能调用A的方法，
         * 然后运行的时候需要看右边具体是什么类型，如果是B类，然后调用的方法B类有重写，就会调用B类中的方法。
         * 注意：this指的是类B。
         * 先看第一个级别：this.show(O)，因为是向上转型，所以a2没法调用子类B中的show(B b)方法，因为编译不会通过
         * 再看第二个级别：super.show(O)，尝试调用父类的show(B b)方法，而父类中没有该方法，编译也不会通过
         * 再看第三个级别：this.show(super(O))，先把O转换成父类即A，这样就变成调用this.show(A a)，而B类自己有这个方法，就直接调用了。
         */
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        //类B本身没有show(D d)方法，但是B的父类A有，所以就调用父类A的show(D d)方法
        System.out.println("6--" + a2.show(d));
    }
}
