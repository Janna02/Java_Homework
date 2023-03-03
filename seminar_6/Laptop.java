package seminar_6;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Laptop {

    private String name;
    private int hardDrive;
    private String operatingSystem;

    private static Scanner sc = new Scanner(System.in);

    public Laptop(String name, int hardDrive, String operatingSystem) {
        this.name = name;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
    }

    public String getName() {
        return this.name;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public String toString() {
        return "LAPTOP [NAME=" + this.name + ", HARDDRIVE=" + this.hardDrive + ", OS=" + this.operatingSystem;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : name.hashCode());
        result = prime * result + this.hardDrive;
        result = prime * result + ((this.operatingSystem == null) ? 0 : this.operatingSystem.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.hardDrive != other.hardDrive)
            return false;
        if (this.operatingSystem == null) {
            if (other.operatingSystem != null)
                return false;
        } else if (!this.operatingSystem.equals(other.operatingSystem))
            return false;
        return true;
    }

    // filter data by criterion
    public static Map<Object, Set<Laptop>> filterByCriterion(Set<Laptop> laptops) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - объём жёсткого диска,");
        System.out.println("2 - операционная система,");

        String choiceOfUser = sc.nextLine();
        System.out.println();

        Map<Object, Set<Laptop>> result = new TreeMap<>();

        if (choiceOfUser.equals("1")) {
            for (Laptop laptop : laptops) {
                if (result.containsKey(laptop.hardDrive)) {
                    result.get(laptop.hardDrive).add(laptop);
                } else {
                    Object key = (Object) laptop.hardDrive;
                    result.put(key, new HashSet<Laptop>());
                    result.get(laptop.hardDrive).add(laptop);
                }
            }
        } else if (choiceOfUser.equals("2")) {
            for (Laptop laptop : laptops) {
                if (result.containsKey(laptop.operatingSystem)) {
                    result.get(laptop.operatingSystem).add(laptop);
                } else {
                    Object key = (Object) laptop.operatingSystem;
                    result.put(key, new HashSet<Laptop>());
                    result.get(laptop.operatingSystem).add(laptop);
                }
            }
        } else {
            System.out.println("Попробуйте еще раз, варианты ввода: 1,2");
        }

        return result;
    }

    // filter data by min value of hardDrive
    public static Map<Object, Set<Laptop>> filterByMinValue(Set<Laptop> laptops) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - объём жёсткого диска,");

        String code = sc.nextLine();
        System.out.println();

        Map<Object, Set<Laptop>> result = new TreeMap<>();

        if (code.equals("1")) {
            for (Laptop laptop : laptops) {
                if (result.containsKey(laptop.hardDrive)) {
                    result.get(laptop.hardDrive).add(laptop);
                } else {
                    Object key = (Object) laptop.hardDrive;
                    result.put(key, new HashSet<Laptop>());
                    result.get(laptop.hardDrive).add(laptop);
                }
            }
        } else {
            System.out.println("Попробуйте еще раз, варианты ввода: 1");
            return result;
        }
        return result;
    }
}
