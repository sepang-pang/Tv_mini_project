import java.util.Scanner;

public class channelControl implements RemoteControl{
    @Override
    public void tvControl () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ 채널 변경 ]");
        System.out.println("1. 다음       2. 이전      3. 채널 입력      4. 종료");
        while (true) {
            int channelNum = scanner.nextInt();
            switch (channelNum) {
                case 1:
                    tv.setChannel(tv.getChannel() + 1);
                    break;
                case 2:
                    tv.setChannel(tv.getChannel() - 1);
                    break;
                case 3:
                    Scanner selectScanner = new Scanner(System.in);
                    System.out.println("원하시는 채널을 입력해주세요");
                    int selectChannel = selectScanner.nextInt();
                    tv.setChannel(selectChannel);
                    break;
                case 4:
                    System.out.println("채널 조작을 종료합니다.");
                    return;
            }
            System.out.println("현재 채널 : " + tv.getChannel());
        }
    }
}
