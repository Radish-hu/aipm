package utils;

import java.util.UUID;

public class UtilRandom {
    public static String projectName(){
        String uuid=UUID.randomUUID().toString();
        return uuid.substring(24);
    }
}
