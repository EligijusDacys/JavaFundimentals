package House;

/*package House;

/*                 double  String      int         String
House objektas: houseArea, district, builtYear, condition (fitted, partially finished, not finished)

(rasti ir atspausdinti naujausio namo objekta)
(rasti visus irengtus namus - fitted, partially finished, not finished)
(rasti ir atspausdinti maziausia pagal plota namo objekta)
* */

import House.using_enum.HouseCondition;

class HouseMainUsingArray {

    public static void main(String[] args) {
        House[] houses = buildHouses();

        printNewestHouse(houses);
        printFittedHouses(houses);
        printSmallestHouses(houses);
    }

    public static void printNewestHouse(House[] houses) {
        System.out.println("Newest houses");
        House newestHouse = houses[0];

        for (House h : houses) {
            if (newestHouse.getBuiltYear() < h.getBuiltYear()) {
                newestHouse = h;
            }
        }

        for (House h : houses) {
            if (h.getBuiltYear() == newestHouse.getBuiltYear()) {
                System.out.println(h);
            }
        }
    }

    public static void printFittedHouses(House[] houses) {
        System.out.println("\n\nFitted houses");
        for (House h : houses) {
            if (h.getCondition().equals("fitted")) {
                System.out.println(h);
            }
        }
    }

    public static void printSmallestHouses(House[] houses) {
        System.out.println("\n\nSmallest houses");
        House newestHouse = houses[0];

        for (House h : houses) {
            if (newestHouse.getHouseArea() > h.getHouseArea()) {
                newestHouse = h;
            }
        }

        for (House h : houses) {
            if (h.getHouseArea() == newestHouse.getHouseArea()) {
                System.out.println(h);
            }
        }
    }

    public static House[] buildHouses() {
        return new House[]{
                new House(200.2, "Antakalnis", 2012, HouseCondition.FITTED),
                new House(400.1, "Seskine", 2008, HouseCondition.FITTED),
                new House(320.9, "Zverynas", 2019, HouseCondition.NOT_FINISHED),
                new House(840.5, "Senamiestis", 2019, HouseCondition.PARTIALLY_FINISHED)
        };
    }
}