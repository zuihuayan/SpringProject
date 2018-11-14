package com.yan.interview;

public class Base {
    private String baseName=  "base";
    public Base() {
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }
    
    static class Sub extends Base{
        private String baseName = "sub";
        public void callName(){
            System.out.println(baseName);
        }
    }
    public static void main(String[] args) {
    	Base a = new Base();
    	System.out.println(a);
    	System.out.println("-------------------");
    	
    	Sub c = new Sub();
    	System.out.println(c);
    	System.out.println("------------------------");
    	
        Base b = new Sub();
        System.out.println(b);
    }
}
