package homework.model;

public class Answer {

    private final int task;
    private final String answer;

    public Answer(int task, String answer) {
        this.task = task;
        this.answer = answer;
    }

    public int getTask() {
        return task;
    }

    public String getAnswer() {
        return answer;
    }
}
