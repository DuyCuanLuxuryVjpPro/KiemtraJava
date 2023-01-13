package Bai2;

import java.util.Scanner;

public class Main {
    
    public static void MENU() {
        System.out.println(
            "\n__________MENU__________"
            + "\n1. Thêm Honey"
            + "\n2. Danh sách Honey"
            + "\n3. Xóa Honey"
            + "\n4. Edit Honey"
            + "\n5. Thêm sở thích"
            + "\n6. Sắp xếp Honey"
            + "\n7. Thoát"
            + "\n________________________"
        );
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        HoneyManage QuanHoneys = new HoneyManage();
        
        do {
            MENU();
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        System.out.print("Status: ");
                        int status = sc.nextInt();
                        System.out.print("Name: ");
                        String name = sc.next();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        System.out.print("Gender: ");
                        String gender = sc.next();
                        System.out.print("Phone: ");
                        String phone = sc.next();
                        Honey h = new Honey(id, status, name, age, gender, phone);
                        QuanHoneys.addHoney(h);
                        break;
                    }
                case 2:
                    QuanHoneys.showHoneys();
                    break;
                case 3:
                    {
                        System.out.print("ID muốn xóa: ");
                        int id = sc.nextInt();
                        QuanHoneys.deleteById(id);
                        break;
                    }
                case 4:
                    {
                        System.out.print("ID muốn sửa: ");
                        int id = sc.nextInt();
                        System.out.print("1. Name\n2.Age\n3.Phone\n4.Status\nMuốn sửa: ");
                        int otp = sc.nextInt();
                        for (Honey h : QuanHoneys.list)
                            if (h.getId() == id) {
                                switch (otp) {
                                    case 1:
                                        h.setName(sc.next());
                                        break;
                                    case 2:
                                        h.setAge(sc.nextInt());
                                        break;
                                    case 3:
                                        h.setPhone(sc.next());
                                        break;
                                    case 4:
                                        h.setStatus(sc.nextInt());
                                        break;
                                    default:
                                        break;
                                }
                            }   break;
                    }
                case 5:
                    {
                        System.out.print("ID sở thích: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Sở thích: ");
                        String s = sc.nextLine();
                        Favorite f = new Favorite(id, s);
                        System.out.print("ID muốn sửa: ");
                        int idHoney = sc.nextInt();
                        for (Honey h : QuanHoneys.list)
                            if (h.getId() == idHoney) {
                                h.addFavorite(f);
                            }   break;
                    }
                case 6:
                    QuanHoneys.sortByName();
                    break;
                default:
                    break;
            }
        }
        while(option < 7);
    }
}
