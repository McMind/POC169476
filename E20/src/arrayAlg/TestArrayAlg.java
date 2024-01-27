package arrayAlg;

import static arrayAlg.MaxIndex.findMaxIndex;

public class TestArrayAlg {
    public static void main(String[] args) {
        VideoGame[] videoGames = new VideoGame[5];
        videoGames[0] = new VideoGame("aaa","bbb",2);
        videoGames[1] = new VideoGame("aaa","bbb",4);
        videoGames[2] = new VideoGame("aaa","bbb",4);
        videoGames[3] = new VideoGame("aaa","bbb",2);
        videoGames[4] = new VideoGame("aaa","bbb",3);
        try{
            System.out.println(findMaxIndex(videoGames));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
