package com.dsalgo.basics;

/**
 * @author haris
 */
class Basics {

    private int num = 10;

    /**
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @param name
     * @return
     */
    public boolean checkGivenName(String name) {
        if (name == null || name.equals("") || name.contains("sha")) return false;
        return true;
    }

}

 
