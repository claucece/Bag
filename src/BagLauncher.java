public class BagLauncher {

    public static void main (String[] args) {
        System.out.println("Three Rings for the Elven-kings under the sky, \n" +
                "Seven for the Dwarf-lords in halls of stone, \n" +
                "Nine for Mortal Men, doomed to die, \n" +
                "One for the Dark Lord on his dark throne \n" +
                "In the Land of Mordor where the Shadows lie. \n" +
                "One Ring to rule them all, One Ring to find them, \n" +
                "One Ring to bring them all and in the darkness bind them. \n" +
                "In the Land of Mordor where the Shadows lie.");
        System.out.println("=====================================================");
        Mordor Khand = new Mordor();
        Khand.printStory();
        Bag frodosBag = new Bag("big", "brown");
        System.out.println("The hobbit bag that Sauron is holding is " +
                frodosBag.getColor() + " and its " + frodosBag.getSize() + ".");
        frodosBag.pullOneObject();
    }
}
