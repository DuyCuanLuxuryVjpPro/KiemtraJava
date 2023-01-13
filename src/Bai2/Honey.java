package Bai2;

import java.util.ArrayList;

public class Honey extends Person{
    private int id;
    private int status;
    private ArrayList<Favorite> favorite = new ArrayList<>();

    public Honey(int id, int status, String name, int age, String gender, String phone) {
        super(name, age, gender, phone);
        this.id = id;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setFavorite(ArrayList<Favorite> favorite) {
        this.favorite = favorite;
    }
    
    public void addFavorite(Favorite f) {
        favorite.add(f);
    }
    
    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }
    

    public ArrayList<Favorite> getFavorite() {
        return favorite;
    }
}
