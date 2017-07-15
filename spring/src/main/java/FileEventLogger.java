import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by antonandreev on 09/07/2017.
 */
public class FileEventLogger implements EventLogger {
    private File file;
    private String filename;

    public FileEventLogger(String fileName) {
        this.file = new File(fileName);
        this.filename = fileName;
    }

    public void logEvent(Event event) {
        try {
            FileUtils.write(file, event.toString() + "\n", "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new IllegalArgumentException("Can't create file", e);
            }

        }
    }
}
