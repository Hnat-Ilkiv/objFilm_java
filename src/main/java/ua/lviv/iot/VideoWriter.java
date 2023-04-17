package ua.lviv.iot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class VideoWriter {
    public String writeToFile(final List<Video> videos, final String fileName) {
        if (videos.isEmpty()) {
            return null;
        } else {
            File file = new File(fileName);
            try {
                FileWriter fw = new FileWriter(fileName);
                Video videoType = videos.get(0);
                fw.write(videoType.getHeaders() + "\n");
                for (var video : videos) {
                    if (videoType.getClass() != video.getClass()) {
                        videoType = video;
                        fw.write(videoType.getHeaders() + "\n");
                    }
                    fw.write(video.toCSV() + "\n");
                }
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return fileName;
        }
    }
}