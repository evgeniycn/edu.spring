package edu.spring;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Evgeniy on 17.09.2017.
 */
public class FileEventLogger implements EventLogger {

    private String filename;

    private File file;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public FileEventLogger() {
    }

    public void init() throws IOException {
        this.file = new File(filename);
        //check if file is writable
    }

    public void logEvent(Event event) {
        this.file = new File(filename);
        try {
            FileUtils.writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
