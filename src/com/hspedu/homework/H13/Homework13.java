package com.hspedu.homework.H13;

/**
 * 定义多态数组，里面保存2个学生和2个教师。要求按年龄从高到低排序。
 * 
 * 定义方法，形成多态数组，调用学生的study或教师的teach方法。
 */
public class Homework13 {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("小明", 15, '男', "00023102");
        people[1] = new Student("小红", 21, '女', "00023103");
        people[2] = new Teacher("张飞老师", 30, '男', 5);
        people[3] = new Teacher("王老师", 28, '女', 3);

        Person.SortByAge(people);
        for (Person p : people) {
            p.printInfo();
            if (p instanceof Student) {
                Student s = (Student) p;
                s.study();
            } else if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                t.teach();
            }
            System.out.println(p.play());
            System.out.println("=============================");
        }

            System.out.println("项目上线");
    }
}
