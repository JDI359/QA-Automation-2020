package lectures.lecture07;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    LinkedList <String> list = new LinkedList<String>();

    public List<String> getCompanyOffices(){
        list.add("Sofia");
        list.add("London");
        list.add("Madrid");
        list.add("Barcelona");

        System.out.println("Company offices are: " + list);
        return list;
    }

    public void addNewOffice(){
        list.add(3, "Paris");
        System.out.println("Company offices after adding new one: " + list);
    }

    public void removeOffice(){
        list.remove(2);
        System.out.println("Company offices after removal: " + list);
    }

    public int getOfficesCount(){
        System.out.println("Company offices after removal: " + list.size());
        return list.size();
    }

    public void sortOffice(){
        Collections.sort(list);
        System.out.println("Sorted offices: " + list);
    }

//        public String getOfficeByIndex(int index){
//            System.out.println("Company office by index %d", index, list.get(index));
//            return list.get(index);
//        }
}
