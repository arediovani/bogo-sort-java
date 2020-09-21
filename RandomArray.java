package randomarray;

public class RandomArray {

    public static void main(String[] args) {
        Array AR = new Array();
        AR.CreateArray();
        boolean sorted = false;
        int sorts = 0;
        long lStartTime = System.nanoTime();
        while (sorted == false) {
            AR.RandomIndexSwap();
            AR.Print();
            sorts =sorts +1;
            if (AR.CheckSort() == true) {
                sorted = true;
            }

        }
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("**********************************************");
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
        System.out.println("Number of total Sorts: " + sorts);

    }
}
