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
//        try {
//            File myFile = new File("films_manager.csv");
//            if (myFile.createNewFile()) {
//                System.out.println("File created: " + myFile.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter myWriter = new FileWriter("films_manager.csv");
//            myWriter.write(video.getHeaders() + "\n" + video.toCSV() + "\n");
//            myWriter.write(video1.getHeaders() + "\n" + video1.toCSV() + "\n");
//            myWriter.write(video2.getHeaders() + "\n" + video2.toCSV() + "\n");
//            myWriter.write(video3.getHeaders() + "\n" + video3.toCSV() + "\n");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }
}