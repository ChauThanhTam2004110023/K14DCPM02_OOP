package tamct2004110023k14dcpm02.Buoi04;

public class GuessGame {
    Player player = new Player();
    Player p1;
    Player p2;
    Player p3;

    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Tôi đang nghĩ đến một số từ 0 -> 9: ....");
        while(true)
        {
            System.out.println("Số guess là:  " +targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Một người chơi đoán là:  " +guessp1);
            guessp2 = p2.number;
            System.out.println("Hai người chơi đoán là:  " +guessp2);
            guessp3 = p3.number;
            System.out.println("Ba người chơi đoán là:  " +guessp3);

            if(guessp1 == targetNumber)
            {
                p1isRight = true;
            }
            if(guessp2 == targetNumber)
            {
                p2isRight = true;
            }
            if(guessp3 == targetNumber)
            {
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("Chúng tôi có một người chiến thắng!");
                System.out.println("Người chơi một đã hiểu đúng?" +p1isRight);
                System.out.println("Người chơi hai đã hiểu đúng?" +p2isRight);
                System.out.println("Người chơi ba đã hiểu đúng?" +p3isRight);
                System.out.println("Cuộc chơi đã kết thúc");
                break;
            }
            else
            {
                System.out.println("players will have to try again");
            }
        }
    }
}
