package com.example.stck;

public class Version {

    private String codeName,version,apilevel,decription;
    private boolean expandble;

    public Version(String codeName,String decription) {
        this.codeName = codeName;

        this.decription = decription;
        this.expandble = false;
    }

    public boolean isExpandble() {
        return expandble;
    }

    public void setExpandble(boolean expandble) {
        this.expandble = expandble;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }


    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return "Version{" +
                "codeName='" + codeName + '\'' +
                ", decription='" + decription + '\'' +
                '}';
    }
}
