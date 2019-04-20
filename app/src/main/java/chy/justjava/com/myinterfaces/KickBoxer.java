package chy.justjava.com.myinterfaces;

public class KickBoxer implements Fighting {

    @Override
    public String throwJab() {
        return "KickBoxer Throws Harder Jabs";
    }

    @Override
    public String throwCross() {
        return "KickBoxer Throws Harder Cross";
    }

    @Override
    public String upperCut() {
        return "KickBoxer Throws Harder UpperCut";
    }

    @Override
    public String throwHook() {
        return "KickBoxer Throws Harder Hook";
    }
}


