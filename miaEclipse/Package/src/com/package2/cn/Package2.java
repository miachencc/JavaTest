package com.package2.cn;

import com.package3.cn.Packsge3;
/*
* 为了简化类名的书写，使用了关键字import 包名.*
* 导入的包中的所有类（不包含包中包的类）
*
* 建议不要写通配符**/

public class Package2 extends Packsge3{  //类需要公有
    public void show(){  //类公有后，被访问的成员也要公有才能被访问
        System.out.println("package2 run");
        method();
    }
}
/*
* 1. 包与包之间进行访问，被访问的包中的类以及类中的成员需要public修饰
* 2. 不同包中的子类可以直接访问父类中被potected权限修饰的成员
*
 *  包与包之间可以使用的权限只有2种，public protected
*
*              public  protected  default   private
* 同一个类中    ok       ok         OK        ok
* 同一个包中    ok       ok         ok
* 子类          ok       ok
* 不同包中       ok
*
* 一个java文件中不能出现2个以上的公有类或者接口*/