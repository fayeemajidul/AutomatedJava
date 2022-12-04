package org.example;

public class JSONvalues {
    public static String bookKeep(String name, String isbn, String aisle, String author){

        return "{\n" +
                "\n" +
                "\"name\":\"" + name + "\",\n" +
                "\"isbn\":\"" + isbn + "\",\n" +
                "\"aisle\":\"" + aisle + "\",\n" +
                "\"author\":\"" + author + "\"\n" +
                "}\n";
    }
}
