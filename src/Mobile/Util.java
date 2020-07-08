package Mobile;

public class Util {

    public static void printMostExpensiveMobile(Mobile[] mobiles) {
        Mobile mostExpensive = mobiles[0];

        for (Mobile mobile : mobiles) {
            if (mostExpensive.getPrice() < mobile.getPrice()) {
                mostExpensive = mobile;
            }
        }

        System.out.println(mostExpensive);
    }
}
