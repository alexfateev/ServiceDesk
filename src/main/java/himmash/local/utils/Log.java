package himmash.local.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private static Path path = Paths.get(System.getenv("USERPROFILE") + "\\ServiceCat");
    private static File file = new File(path + "\\log.txt");

    public static void writeToLog(String message)  {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String mess = date + ": " + message + "\n";
        if (Files.notExists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Files.notExists(Paths.get(file.getAbsolutePath()))) {
            try {
                Files.write(Paths.get(file.getAbsolutePath()), mess.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Files.write(Paths.get(file.getAbsolutePath()), mess.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
