package Classes;

public class Item {

    protected String name;
    protected int unit;

    public Item(String name, int unit){
        this.name = name;
        this.unit = unit;
    }

    public Item(String name) {
        this.name = name;
        this.unit = 1;
    }

    //add unity
    public void add(){
        unit++;
    }

    //remove unity
    public void remove(){
        unit--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit(){
        return unit;
    }

    public void setUnit(int unit){
        this.unit = unit;
    }
}

