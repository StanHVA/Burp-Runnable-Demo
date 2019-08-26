package burp;

import java.time.LocalDateTime;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;

public class BurpExtender implements IBurpExtender {

    ScheduledFuture task;
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public void registerExtenderCallbacks (IBurpExtenderCallbacks callbacks) {

        System.out.println("Plugin Starts...");

        this.task = this.executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running, time: " + LocalDateTime.now());
            }
        }, 5, 5, TimeUnit.SECONDS);
    }
}
