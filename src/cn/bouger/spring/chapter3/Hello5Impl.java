package cn.bouger.spring.chapter3;

import cn.bouger.spring.chapter2.helloworld.HelloApi;
import cn.bouger.spring.chapter3.bean.Printer;

public abstract  class Hello5Impl implements HelloApi {

	private Printer printer;  
    public void sayHello() {  
        printer.print("setter");  
        createPrototypePrinter().print("prototype");  
        createSingletonPrinter().print("singleton");
    }  
    public abstract Printer createPrototypePrinter();  
    public Printer createSingletonPrinter() {  
        System.out.println("该方法不会被执行，如果输出就错了");  
        return new Printer();  
    }  
    public void setPrinter(Printer printer) {  
        this.printer = printer;  
    }  

}
