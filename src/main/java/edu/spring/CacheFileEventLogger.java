package edu.spring;

import java.util.List;

/**
 * Created by Evgeniy on 17.09.2017.
 */
public class CacheFileEventLogger extends FileEventLogger{

    private int cacheSize;

    private List<Event> cache;

    public CacheFileEventLogger(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public CacheFileEventLogger() {
    }

    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy(){
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache(){
        for (Event event : cache){
            super.logEvent(event);
        }
    }
}
