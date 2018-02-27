public class Rectangle {
    private int width;
    private int height;

    public void setwidth(int newwidth, int newheight){
        width = newwidth;
        height = newheight;

    }

    public Rectangle(){
        setwidth(1, 1);
    }

    public Rectangle(int w, int h){
        setwidth(w, h);
    }
    public int area(){
        return width * height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    
    public void print() {
    	System.out.println("Width: " + width);
    	System.out.println("Height: " + height);
    }

}

