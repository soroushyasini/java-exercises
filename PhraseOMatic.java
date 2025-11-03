public class PhraseOMatic {
    public static void main(String[] args) {

        // define some strings with random words  

        String [] WordListOne = {"severe","linguistic", "Common sense", "savage",
                                "live" , "Stress", "feeling","constant", "contain"};
        String [] WordListTwo = {"goethe","calibration","sinamatic","loosely","karma","kino"};

        String [] WordListThree = {"kindness","corona", "king kong", " heartbeat", "hint", "harmony"};
        
        // count the number of words

        int OneLenth = WordListOne.length;
        int TwoLenth = WordListTwo.length;
        int ThreeLenth = WordListThree.length;
    
        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(OneLenth);
        int rand2 = randomGenerator.nextInt(TwoLenth);
        int rand3 = randomGenerator.nextInt(ThreeLenth);

        // int [] AllLenths = {rand1,rand2,rand3};
        // for ( int i = 0; i < 3; i = i +1  ) {
        //       System.out.println(AllLenths[i]);
        // }

        String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];
        System.out.println("want to be dead, " + phrase);


      



    }
}
