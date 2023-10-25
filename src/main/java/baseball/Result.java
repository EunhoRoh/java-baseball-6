import camp.nextstep.edu.missionutils.Console;

import java.util.List;

//결과를 출력하는 클래스
public class Result {

    private boolean onGoingGame;
    private boolean gameContinue;

    void printResult(User user){
        int strike = user.getStrike();
        int ball = user.getBall();
        String input;

        if (strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            input = Console.readLine();
            if (input.charAt(0) == '2') {
                onGoingGame = false;
                gameContinue = false;
            }
            else if(input.charAt(0) == '1'){
                onGoingGame = false;
            }
            else {
                throw new IllegalArgumentException("잘못된 게임 종료 입력입니다. 게임을 종료합니다.");
            }
        }
        else if (strike != 0 && ball != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
        else if(strike == 0 && ball == 0){
            System.out.println("낫싱");
        }
        else if (strike == 0) {
            System.out.println(ball + "볼");
        }
        else if (ball == 0) {
            System.out.println(strike + "스트라이크");
        }
    }

    public Result(){
        this.gameContinue = true;
        this.onGoingGame = true;
    }

    public boolean isOnGoingGame() {
        return onGoingGame;
    }

    public boolean isGameContinue() {
        return gameContinue;
    }

    public void setOnGoingGame(boolean onGoingGame) {
        this.onGoingGame = onGoingGame;
    }
}