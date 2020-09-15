package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-01 09:29
 **/
public class TemplateDemo {

    public String test(String person, String name, Integer age, String sex) {
        return this.test(person, new MyExecutorSetter(name, age, sex));
    }

    public String test(String name, ExecutorSetter executorSetter) {
        return this.test(new B(name), (ExecutorSetter) executorSetter);
    }

    /**
     * protected修饰的方法只能在与当前类同包下的其他类中被使用
     */
    protected String test(B b, ExecutorSetter executorSetter) {
        return this.execute(b, new TemplateCallback<String>() {
            @Override
            public String doCallback(Executor executor) {
                System.out.println("开始执行回调方法");
                executorSetter.setValues(executor);
                return executor.execute();
            }
        });
    }

    public <T> T execute(B b, TemplateCallback<T> callback) {
        String s = b.eatLunch(b.getName());
        System.out.println("s===" + s);
        System.out.println("大家好，开始执行execute方法");
        Executor executor = new ExecutorOne("tom");
        T t = callback.doCallback(executor);
        return t;
    }
}
