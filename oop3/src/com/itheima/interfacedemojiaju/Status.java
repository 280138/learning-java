package com.itheima.interfacedemojiaju;

public enum Status {
    UP,OFF;
    public Status toggle(){
        return this == Status.UP ? Status.OFF : Status.UP;
    }
}


