package com.jdk_source_code.demo.util.lang;

/**
 * @author lilin
 * @date 2019-09-29
 */
public enum EnumDemo {
    COPPER("COPPER","铜卡"),
    SILVER("SILVER","银卡"),
    GOLD("GOLD","金卡"),
    PLATINUM("PLATINUM","铂金卡"),
    DIAMOND("DIAMOND","钻石卡");
    private String type;
    private String msg;
    EnumDemo(String type,String msg){
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public String getMsg() {
        return msg;
    }

    public static EnumDemo getValue(String type){
        if(type == null){
            return null;
        }

        for(EnumDemo item:EnumDemo.values()){
            if(type.equals(item.getType())){
                return item;
            }
        }
        return null;
    }
}
