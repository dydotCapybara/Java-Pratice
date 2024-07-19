package com.dydot.houserent.service;

import com.dydot.houserent.domain.House;
import com.dydot.houserent.utils.Utility;


/**
 * HouseService.java<=>类 [业务层]
 * //定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {

    private House[] houses;//保存House对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前id增长到哪个值了

    //构造器
    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象,指定数组大小
        //测试信息
        houses[0] = new House(1, "Jack", "112", "海淀区", 2000, "未出租");

    }

    //add方法,添加新对象,返回boolean
    public boolean add(House newHouse) {

        // 判断是否还可以继续添加(考虑数组扩容)
        if (houseNum == houses.length) {
            // 扩容
            House[] newHouses = new House[houses.length * 2];
            System.arraycopy(houses, 0, newHouses, 0, houses.length);
            houses = newHouses;
        }
//        //判断是否还可以继续添加(不考虑数组扩容)
//        if (houseNum == houses.length) {
//            System.out.println("=================数组已满,不能再添加了=================");
//            return false;
//        }
        //把newHouse对象加入到houses
        houses[houseNum++] = newHouse;
        //设置一个id自增长的机制,然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //查找房源信息
    public House search(int id) {

        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == id) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean updateHouse(int id) {
        House house = search(id);
        if (house != null) {
            System.out.print("姓名" + "(" + house.getName() + ")" + ": ");
            String name = Utility.readString(8, " ");//这里如果回车表示不修改该信息,默认" "
            house.setName(name);
            System.out.print("电话" + "(" + house.getPhone() + ")" + ": ");
            String phone = Utility.readString(12, " ");
            house.setPhone(phone);
            System.out.print("地址" + "(" + house.getAddress() + ")" + ": ");
            String address = Utility.readString(16, " ");
            house.setAddress(address);
            System.out.print("月租" + "(" + house.getRent() + ")" + ": ");
            int rent = Utility.readInt(0);
            house.setRent(rent);
            System.out.print("状态" + "(" + house.getState() + ")" + ": ");
            String state = Utility.readString(3, " ");
            house.setState(state);
            return true;
        }
        return false;
    }

    //删除一个房屋信息
    public boolean delete(int delID) {
        //应当找到要删除房屋信息的下标
        //注意:1号房屋在数组中的下标为0
        //    2号房屋在数组中的下标为1
        //故可以得到结论 delID - 1 为所要删除房屋在数组中的位置
        //首先判断删除的房屋编号在不在数组中
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == delID) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该房屋不存在");
            return false;
        } else {

            // 删除房屋信息
            for (int i = index; i < houseNum - 1; i++) {
                houses[i] = houses[i + 1];
            }
            houses[--houseNum] = null;
            for (int i = 0; i < houseNum; i++) {//更新ID
                int newID = houses[i].getId();
                newID--;
                houses[i].setId(newID);
            }//这里存在Bug,如果只剩下一间房子,删除唯一的这间房子,再添加数据
            //此时的ID会乱套
            return true;
        }

    }
//    public boolean delete(int delID) {
//
//        if(delID > houseNum || delID <= 0) {
//            System.out.println("该房屋不存在");
//            return false;
//        }else{//开始删除
//            houses[--delID] = null;
//            for(int i = delID; i < houseNum - 1; i++){
//                houses[i] = houses[i + 1];//把后面的每一个元素往前移一位
//            }
//            houses[houseNum - 1] = null;
//            houseNum--;
//            for(int i = 0; i < houseNum; i++){//更新ID
//                int newID = houses[i].getId();
//                newID--;
//                houses[i].setId(newID);
//            }
//            return true;
//        }
//
//    }


    //list方法，返回houses
    public House[] list() {
        return houses;
    }
}
