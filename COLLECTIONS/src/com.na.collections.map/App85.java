package com.na.collections.map;
public class App85 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put ("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put ("c#"," C Sharp");
        hashMap.put("PHP","PHP");
        hashMap.put("Java","Java");


       Set<Map.Entry<String,String>> setHashMap = hashMap.entrySet();

       System.out.println("cac entry co trong sethashmap: ");
       System.out.println(setHashMap);
    }
}
