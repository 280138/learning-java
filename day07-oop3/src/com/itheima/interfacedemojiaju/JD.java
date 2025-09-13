package com.itheima.interfacedemojiaju;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    private String name;
    private Status status;//可以用枚举

    @Override
    public void press() {
        status = status.toggle();//控制当前设备开和关的功能
    }
}
