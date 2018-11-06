package com.package1.cn;


import com.package2.cn.Package2;
import com.package3.cn.Packsge3;

public class Package {
    public static void main(String[] args){

        System.out.println("hello package1");

        //new Packsge3().method();

        Package2 pck2 = new Package2();
        pck2.show();
        //pck2.method();
    }
}
