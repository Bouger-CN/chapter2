package cn.bouger.spring.chapter2.helloworld;

public class HelloApiStaticFactory {
	//��������  
    public static HelloApi newInstance(String message) {  
           //������Ҫ��Beanʵ��  
        return new Hello2Impl(message);  
}  
}
