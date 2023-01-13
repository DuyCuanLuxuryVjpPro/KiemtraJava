package Bai2;

import java.util.*;

public class HoneyManage {
    ArrayList<Honey> list = new ArrayList<>();
    
    public String title() {
        return String.format("%-10s %-30s %-10s %-20s %-20s %-10s",
                "ID", "Tên", "Tuổi", "SĐT", "Giới tính", "Trạng thái");
    }
    
    public void addHoney(Honey h) {
        list.add(h);
    }
    
    public void showHoneys() {
        System.out.println(title());
        for (Honey h : list) {
            System.out.printf("%-10d %-30s %-10d %-20s %-20s %-10d\n",
                    h.getId(), h.getName(), h.getAge(), h.getPhone(), h.getGender(), h.getStatus());
        }
    }
    
    public void deleteById(int id) {
        for (Honey h : list) {
            if (h.getId() == id)
                list.remove(h);
        }
    }
    
    public void sortByName() {
        list.sort((h1, h2) -> {
            return h1.getName().compareTo(h2.getName());
        });
    }
}
