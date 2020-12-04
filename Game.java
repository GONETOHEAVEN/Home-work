import java.util.Scanner;

public class Game {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы прошли собеседование и вот-вот станете сотрудником Корпорации. \n "
                + "Осталось уладить формальности - подпись под договором (Введите ваше имя):");
        manager = new Character(in.next());
        story = new Story();
        while (true) {
            manager.A += story.currentSituation.dA;
            manager.K += story.currentSituation.dK;
            manager.R += story.currentSituation.dR;
            System.out.println("=====\nКарьера:" + manager.K + "\tАктивы:"
                    + manager.A + "\tРепутация:" + manager.R + "\n=====");
            System.out.println("============="
                    + story.currentSituation.subject + "==============");
            System.out.println(story.currentSituation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}

