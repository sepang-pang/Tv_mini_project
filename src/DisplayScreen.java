import java.util.Scanner;

public class DisplayScreen {
    RemoteControl remoteControl;

    Scanner scanner = new Scanner(System.in);

    public void tvAction() {
        while (true) {
            System.out.println("1. 채널 조작      2. 볼륨 조작     3. 종료");
            int controlNum = scanner.nextInt();
            switch (controlNum) {
                case 1:
                    remoteControl = new channelControl();
                    remoteControl.tvControl();
                    break;
                case 2:
                    remoteControl = new volumeControl();
                    remoteControl.tvControl();
                    break;
                case 3:
                    System.out.println("TV를 종료합니다.");
                    return;
            }
        }
    }
}
