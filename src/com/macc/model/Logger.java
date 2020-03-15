package com.macc.model;

public class Logger {

    private static Logger log;
    private String value;

    private Logger() {

    }

    public static synchronized Logger getIntance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }
    
    public static void msg(String msg){
        System.out.println(msg);
    }
    
    public void setValue(String msg){
        value = msg;
    }
    
    public String getvalue(){
        return value;
    }

}
