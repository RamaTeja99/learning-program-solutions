package DecoratorPatternExample_5.code;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack Message: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }
}
