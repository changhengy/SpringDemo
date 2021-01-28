package org.cond.demo;
/*
 * @time 2021/1/28 14:27
 * @author chy
 */

public class LinuxCmd implements CmdImpl{
    public LinuxCmd() {
        System.out.println("LinuxCmd 无参 构造");
    }

    public String showCmd() {
        return "ls";
    }
}
