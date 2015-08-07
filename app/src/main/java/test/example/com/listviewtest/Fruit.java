package test.example.com.listviewtest;

/**
 * Created by echo on 2015/8/4.
 */
public class Fruit {
    private  String name;
    private int imageId;
    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return  name;
    }
    public int getImageId(){
        return imageId;
    }
}
