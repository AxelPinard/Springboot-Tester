package org.example;

public class SaveCRSE {

    private String[] list;

    public SaveCRSE() {
        list = new String[10];
    }

    public void addtolist(String crse){
        list[list.length-1] = crse;
    }
}
