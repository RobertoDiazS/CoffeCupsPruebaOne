package com.bobbyman.coffecups.view;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Bobby1982 on 07-11-2016.
 */

public class CoffysCups {
    private int sugar = 0;
    private String cupType;
    private boolean user = false;
    private List<String> strains = new ArrayList<>();

    public void setStrains(){
        strains.add("arabic");
        strains.add("columbian");
        strains.add("venezolan");
        strains.add("moka");
        strains.add("java");
        strains.add("brazil");
        strains.add("etiopia");


    }



    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getCupType() {
        return cupType;
    }

    public void setCupType(String cupType) {
        this.cupType = cupType;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public CoffysCups(int sugar, String cupType, boolean user) {
        this.sugar = sugar;
        this.cupType = cupType;
        this.user = user;

    }

    public String recommendedStrain() {
        if (sugar < 0) {
            return "Put sugar on it!";
        } else if (sugar >= 7) {
            return "Calm with the sugar..";
        } else {
            return strains.get(sugar);
        }

    }
    {
     //   for (int i = 0; i < strains.size; i++) {
      //      String strain=strains.get(i);
      //  }
       // return null;
   // }

       //     Log.d("myLog", strain);
       // }
       // return null;
    }
}

