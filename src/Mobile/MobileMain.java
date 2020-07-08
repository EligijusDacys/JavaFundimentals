package Mobile;

public class MobileMain {

    public static void main(String[] args) {
        Mobile[] mobiles = getMobileArray();

        Util.printMostExpensiveMobile(mobiles);
        printMobilesWhichManufacturerStartsWithA(mobiles);

    }

    private static Mobile[] getMobileArray(){
        Mobile[] mobiles = new Mobile [3];

        mobiles[0] = new Mobile("3310", "Nokia", 1500);
        mobiles[1] = new Mobile("X10", "Sony", 500);
        mobiles[2] = new Mobile("pocketPhone", "Apoo", 1234);

        return mobiles;
    }


    private static void printMobilesWhichManufacturerStartsWithA(Mobile[] mobiles){

        for (Mobile m : mobiles) {
            if (m.getManufacturer().startsWith("A") == true) {
                System.out.println(m);
            }
        }
    }

}
