package Prototype;

public class PrototypeExample implements Copyable {
    private int id;
    private String name;
    private double mark;

    PrototypeExample(int id, String name, double mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return "id: " + this.id +
                "\nname: " + this.name +
                "\nmark: " + this.mark;
    }

    @Override
    public Copyable copy() {
        return new PrototypeExample(this.id, this.name, this.mark);
    }
}
