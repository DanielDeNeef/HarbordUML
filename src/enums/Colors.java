package enums;

public enum Colors {

    BLACK(0,0,0),
    WHITE(255,255,255),
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);

    private int [] rgb=new int[3];

    Colors(int r,int g,int b) {
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
    }
}
