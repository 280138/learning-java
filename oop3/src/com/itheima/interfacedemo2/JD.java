package com.itheima.interfacedemo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    private String name;
    private boolean status;//可以用枚举

    @Override
    public void press() {
        status = !status;//控制当前设备开和关的功能
    }
}
