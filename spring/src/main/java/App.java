import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by antonandreev on 28/06/2017.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public App (Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = ctx.getBean(App.class);

        Event event1 = ctx.getBean(Event.class);
        Thread.sleep(5000);
        Event event2 = ctx.getBean(Event.class);
        event1.setMsg("Hello");
        event2.setMsg("Hi");
        app.logEvent(event1);
        app.logEvent(event2);

        app.eventLogger = ctx.getBean("fileEventLogger", FileEventLogger.class);
        app.logEvent(event1);
        app.logEvent(event2);

        app.eventLogger = ctx.getBean("cacheFileEventLogger", CacheFileEventLogger.class);
        app.logEvent(event1);
        app.logEvent(event2);

        ctx.close();
    }

    private void logEvent(Event event) {
        eventLogger.logEvent(event);
    }
}
