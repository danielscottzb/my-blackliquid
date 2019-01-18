package com.zb.blackliquid;
import java.sql.Timestamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println( "Hello World!" + timestamp);
    }

    public static boolean isHot(int temperature){
        if (temperature>100)
            return true;
        else
            return false;
    }
}
