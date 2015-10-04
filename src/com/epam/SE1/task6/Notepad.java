package com.epam.SE1.task6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Notepad {
    static int n=0;
    static private List<Record> records = new ArrayList<>();

    public void AddRecord(String name, String text, Calendar data){
        Record x = new Record();
        x.setNum(n);
        x.setName(name);
        x.setText(text);
        x.setData(data);
        records.add(x);
        n++;
    }

    public void PrintAllRecords(){
        for (Record i: records) {
            System.out.println(i.getNum() + ": "+ i.getName() + "  " + i.getText()+ "  " + i.getData().get((Calendar.DAY_OF_MONTH))+"." + i.getData().get((Calendar.MONTH))+"." + i.getData().get((Calendar.YEAR)));
        }
        System.out.println();
    }

    public void DeleteRecord(int number){
        records.remove(number);
    }

    public void EditRecord(int index, String name, String text, Calendar data) {
        records.get(index).setName(name);
        records.get(index).setText(text);
        records.get(index).setData(data);
    }
}
