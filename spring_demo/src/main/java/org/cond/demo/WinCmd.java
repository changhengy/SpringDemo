package org.cond.demo;
/*
 * @time 2021/1/28 14:23
 * @author chy
 */

public class WinCmd implements CmdImpl{
    public WinCmd() {
        System.out.println("WinCmd 无参构造");
    }

    public String showCmd() {
        return "dir";
    }
}
