public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if ( bottlesNum == 1) {
                word = "bottle"; // singular
            }
        System.out.println(bottlesNum +  " green " + word + " , hanging on the wall");
        //System.out.println(bottlesNum + " green " + word + " , hanging on the wall");
        System.out.println("ANd if one green bottle sould accidentally fall,");
        bottlesNum = bottlesNum - 1;
        if (bottlesNum > 0) {
            System.out.println(" Threr will be " + bottlesNum + 
            " green " + word + ", hanging on the wall");
        }
        else { System.out.println("There will be no green bottles haning on the wall");}

        }
    }
}
