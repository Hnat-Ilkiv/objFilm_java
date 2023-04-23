package ua.lviv.iot.writer;

import ua.lviv.iot.models.Video;

import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.List;

public class VideoWriter {
    public void writeToFile(final List<Video> videos, final String fileName) {
        if (videos.isEmpty()) {
            File file = new File(fileName);
        } else {
            List<Video> sortedVideo = videos.stream()
                    .sorted(Comparator.comparing(video -> video.getClass().getName()))
                    .toList();

            File file = new File(fileName);
            try {
                FileWriter fw = new FileWriter(fileName);
                Video videoType = sortedVideo.get(0);
                fw.write(videoType.getHeaders() + "\n");
                for (var video : sortedVideo) {
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
        }
    }
}