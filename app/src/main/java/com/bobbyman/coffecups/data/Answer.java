package com.bobbyman.coffecups.data;

/**
 * Created by Bobby1982 on 07-11-2016.
 */

public class Answer {

    private String cups;
    private int otherCups;




    public String getCups() {
        return cups;
    }

    public void setCups(String cups) {
        this.cups = cups;
    }

    public int getOtherCups() {
        return otherCups;
    }

    public void setOtherCups(int otherCups) {
        this.otherCups = otherCups;
    }

    public String allStrains() {
        String menu = "";
        for (String strain : strains) {
            menu = menu + strain + " ";
        }
        return menu;
    }
}
