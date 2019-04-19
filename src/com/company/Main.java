package com.company;


public class Main {

    public static void main(String[] args) {

//            CopyThread copyThreed = new CopyThread();
//            copyThreed.start();
                UIThread uiThreed = new UIThread();
                uiThreed.start();
    }

}
