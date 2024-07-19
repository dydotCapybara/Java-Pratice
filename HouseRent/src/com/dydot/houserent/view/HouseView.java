package com.dydot.houserent.view;

import com.dydot.houserent.domain.House;
import com.dydot.houserent.service.HouseService;
import com.dydot.houserent.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(10);//设置数组的大小为10

    //编写addHouse()接受输入House对象,调用add()方法
    public void addHouse() {
        System.out.println("=================添加房源=================");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //注:id是系统自己分配的,用户不能自己创建
        //创建一个新的newHouse对象
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)) {
            System.out.println("=================添加房屋成功=================");
        } else {
            System.out.println("=================添加房屋失败=================");
        }
    }

    //查找房源
    public void searchHouse() {
        System.out.print("请输入您要查找的房源编号: ");
        int searchID = Utility.readInt();
        House house = houseService.search(searchID);
        if (house != null) {
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            System.out.println(house);
            System.out.println("成功查找到房源");
        } else {
            System.out.println("查找房源失败");
        }
    }

    //编写delHouse() 接收输入的id,调用Service 的del方法
    public void deleteHouse() {
        System.out.println("=================删除房源=================");
        System.out.print("请输入待删除房屋的编号(-1退出): ");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("已放弃删除");
            return;
        } else {
            char choice = Utility.readConfirmSelection();//该方法本身就有循环和判断的功能
            if (choice == 'Y') {//选择删除,调用删除方法
                boolean tag = houseService.delete(delId);
                if (tag == true) {
                    System.out.println("房屋信息删除成功");
                }
            } else {
                System.out.println("已放弃删除");
            }
        }
    }

    //修改房屋信息
    public void updateHouse() {
        System.out.println("=================修改房源=================");
        System.out.print("请输入待修改房屋的编号(-1退出): ");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("已放弃修改");
            return;
        }else{
           boolean tag = houseService.updateHouse(updateId);
           if (tag == true) {
               System.out.println("房屋信息修改成功");
           }else {
               System.out.println("未查找到该房屋,房屋信息修改失败");
           }
        }
    }
    //编写listHouses()显示房屋信息
    public void listHouses() {
        System.out.println("=================房屋列表=================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=================房屋列表显示完毕=================\n");
    }

    public void exit() {
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            loop = false;
        }
    }

    //显示一个主菜单
    public void mainMenu() {
        do {
            System.out.println("=================房屋出租系统菜单=================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 列 表");
            System.out.println("\t\t\t6 退           出");
            System.out.print("请输入您的选择(1~6) :");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();//增添房源
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    deleteHouse();//删除房源
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();//显示房源信息
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("选择有误,重新选择.");
                    break;
            }
        } while (loop);
    }
}
