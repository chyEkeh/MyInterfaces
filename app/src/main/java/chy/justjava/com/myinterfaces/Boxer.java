package chy.justjava.com.myinterfaces;

public class Boxer implements Fighting {

    @Override
    public String throwJab() {
        return "Boxer Throws Faster Jab";
    }

    @Override
    public String throwCross() {
        return "Boxer Throws Faster Cross";
    }

    @Override
    public String upperCut() {
        return "Boxer Throws Faster Cut";
    }

    @Override
    public String throwHook() {
        return "Boxer Throws Faster Hook";
    }
}
