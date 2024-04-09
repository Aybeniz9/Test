package org.example;
import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void mainV1(String[] args) {
        Player []players=getPlayer();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
    }
    public static void mainV2(String[] args) {
        Player []players=getPlayer();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players,new PlayerCOmparatorByNameAsc());
        System.out.println(Arrays.toString(players));
    }
    public static void mainV3(String[] args) {
        Player []players=getPlayer();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players,new PlayerComparatorByNameDesc());
        System.out.println(Arrays.toString(players));
    }
    public static void mainV4(String[] args) {
        Player []players=getPlayer();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players,new PlayerComparatorByScoreAndName());
        System.out.println(Arrays.toString(players));
    }

    public static void main(String[] args) {
        Player []players=getPlayer();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {//anonimous class });
            @Override
            public int compare(Player player1, Player player2) {
                return Long.compare(player2.id, player1.id);
            }
        });
        System.out.println(Arrays.toString(players));

 Arrays.sort(players, new Comparator<Player>() {//anonimous class });
        @Override
        public int compare(Player player1, Player player2) {

            return player2.score>player1.score?
                    1:
                    player2.score<player1.score?-1:
                            player1.name.compareTo(player2.name)!=0?
                                    player1.name.compareTo(player2.name):
                                    Long.compare(player1.id,player2.id);
        }
});
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, new Comparator<Player>() {//anonimous class });
            @Override
            public int compare(Player player1, Player player2) {
                return player2.name.compareTo(player2.name);
            }
        });
        System.out.println(Arrays.toString(players));}


    private static Player[]getPlayer(){

        return new Player[]{
                new Player(4,"Aybeniz", 98),
                new Player(6,"Aybeniz", 98),
               new Player(2,"Aydin", 10),

        };
    }
    }

