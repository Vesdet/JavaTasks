package com.epam.SE2.task1;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Pen {
    private String type;
    private String color;
    private String producer;

    public Pen(){
        type = "ballpoin";
        color = "blue";
        producer = "Parker";
    }

    public Pen(String type, String color, String producer){
        this.type = type;
        this.color = color;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Pen. " + "Type:" + type + "     Color:" + color + "   Producer:" + producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (type != null ? !type.equals(pen.type) : pen.type != null) return false;
        if (color != null ? !color.equals(pen.color) : pen.color != null) return false;
        return !(producer != null ? !producer.equals(pen.producer) : pen.producer != null);

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        return result;
    }
}
