package PrototypeAndRegistry;

import java.util.HashMap;

public class StudenRegistry {
    HashMap<String,Student> map= new HashMap<>();

    public void register(String key,Student st){
        map.put(key,st);
    }
    public Student get(String key){
        return map.get(key);

    }

}
