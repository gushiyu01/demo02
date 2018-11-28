package com.example.demo02;

public enum TestEnum {

    MON(1,"周一"), TUE(2,"周二"), WED(3,"周三"), THU(4,"周四"), FRI(5,"周五"), SAT(6,"周六"), SUN(7,"周日");

    private final int index;
    private final String name;

    private TestEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    //根据中文名字获取英文缩写
    public static TestEnum getEngNameByCnName(String cnName){
        for (TestEnum week : values()) {
            if(week.getName().equals(cnName)){
                return week;
            }
        }
        return null;
    }
    //根据Id获取英文缩写
    public static TestEnum getEngNameByIndex(int index){
        for (TestEnum week : values()) {
            if(week.getIndex() == (index)){
                return week;
            }
        }
        return null;
    }
    //根据英文名字获取中文名字
    public static String getCnNameByEngName(TestEnum engName){
        for(TestEnum week : values()){
            if(week.equals(engName)){
                return week.getName();
            }
        }
        return null;
    }
    //根据英文名字获取Id
    public static int getIndexByEngName(TestEnum engName){
        for(TestEnum week : values()){
            if(week.equals(engName)){
                return week.getIndex();
            }
        }
        return -1;
    }

    //main
    public static void main(String[] args) {
        //根据中文名输出英文名
        TestEnum week = TestEnum.getEngNameByCnName("周三");
        System.out.println(week);
        //根据id输出英文名
        TestEnum week2 = TestEnum.getEngNameByIndex(3);
        System.out.println(week2);
        //根据英文名获取中文名
        String name = TestEnum.getCnNameByEngName(TestEnum.WED);
        System.out.println(name);
        //根据英文名获取index
        int index = TestEnum.getIndexByEngName(TestEnum.WED);
        System.out.println(index);
        //修改
    }
}
