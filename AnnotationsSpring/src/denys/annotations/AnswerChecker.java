package denys.annotations;

public class AnswerChecker {

    public AnswerChecker() {
        System.out.println("AnswerChecker constructor");
    }

    void checkAnswer(){
        System.out.print("Checking answers: ");
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        }
    }
}
