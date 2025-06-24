package DecoratorPatternExample_5.code;

public class SMSNotifierDecorator  extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }
}
