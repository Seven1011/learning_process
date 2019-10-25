package com.ch3.conditional;

public class WindowsListServices implements  ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
