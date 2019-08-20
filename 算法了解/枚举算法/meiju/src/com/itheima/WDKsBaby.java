package com.itheima;

public enum WDKsBaby {


    WANG_XIAO_GUANG("王小光"),
    WANG_L_M("王流氓");



    private String name;

    WDKsBaby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
