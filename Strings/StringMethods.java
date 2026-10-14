package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name="reeshika";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.replace("reeshika","reeshi"));
        System.out.println(name.equals("reeshika"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.compareTo("reeshi"));
        System.out.println(name.startsWith("r"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(3));
        System.out.println(name.concat("yelchuru"));
        System.out.println(name.substring(2,5));
        System.out.println(name.equalsIgnoreCase("reeshika"));
        System.out.println(name.contains("varsha"));
        System.out.println(name.valueOf(546));
        System.out.println(name.toString());
    }
}
