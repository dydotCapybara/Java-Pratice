/*创建一个Person类
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
 */
package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(22);
        person.setSalary(3000);
        System.out.println(person.info());

        System.out.println("=========smith===========");
        Person person1 = new Person("smith", 2000, 5000000);
        System.out.println(person1.info());
    }
}

class Person{
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;

    //构造器
    public Person() {
    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //将set方法写在构造器中，这样也可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6) {
            this.name = name;
        }else {
            System.out.println("Name is too long,默认名字:无名");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("你设置的年龄不对,年龄需要在1-120,默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}