import java.util.LinkedList;
import java.util.Scanner;

public class volumeControl implements RemoteControl {

    @Override
    public void tvControl() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> volumeStack = new LinkedList<>();
        int volumeLevelNum = 0;
        System.out.println("[ 볼륨 조절 ]");
        System.out.println("현재 볼륨 : " + volumeLevelNum);
        for (String currentVolume : tv.getVolume()) {
            System.out.print(currentVolume);
        }
        System.out.println();
        System.out.println("1. Volume Up       2. Volume Down      3. Exit");

        while (true) {
            int volumeNum = scanner.nextInt();

            switch (volumeNum) {
                case 1:
                    volumeStack.push("▮");
                    ++volumeLevelNum;
                    break;
                case 2:
                    volumeStack.pop();
                    --volumeLevelNum;
                    break;
                case 3:
                    System.out.println("볼륨 조작을 종료합니다.");
                    return;
            }
            tv.setVolume(volumeStack);
            System.out.println("음량 : " + volumeLevelNum);

            for (String level : tv.getVolume()) {
                System.out.print(level);
            }
            System.out.println();
        }
    }
}


