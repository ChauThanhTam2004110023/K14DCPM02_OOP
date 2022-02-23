package tamct2004110023k14dcpm02.Lab4;

public class GuessGame {
    //Player player = new Player();
    private Player game1 = new Player();
    private Player game2 = new Player();
    private Player game3 = new Player();

    private int guess1;
    private int guess2;
    private int guess3;

    public void playGame()
    {
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;


        int targetNumber = (int) (Math.random() * 10);
        System.out.println("tôi đang nghĩ đến một số từ 0 -> 9 la: ");
        while(true)
        {
            System.out.println("Số guess là: " +targetNumber);
            game1.guess();
            game2.guess();
            game3.guess();

            guess1 = game1.number;
            System.out.println("Người chơi một là: " +guess1);
            guess2 = game2.number;
            System.out.println("Người chơi hai là: " +guess2);
            guess3 = game3.number;
            System.out.println("Người chơi ba là: " +guess3);

            if(guess1 == targetNumber)
            {
                p1isRight = true;
            }
            if(guess2 == targetNumber)
            {
                p2isRight = true;
            }
            if(guess3 == targetNumber)
            {
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("Chúng ta đã có người chiến thắng");
                System.out.println("Người chơi một đã hiểu đúng " +p1isRight);
                System.out.println("Người chơi hai đã hiểu đúng " +p2isRight);
                System.out.println("người chơi ba đã hiểu đúng " +p3isRight);
                System.out.println("Cuộc chơi đã kết thúc"); break;
            }
            else
            {
                System.out.println("Người chơi sẽ phải thử lại");
            }
        }
    }
}
