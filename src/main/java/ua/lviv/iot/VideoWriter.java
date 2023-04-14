package ua.lviv.iot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class VideoWriter {
    Video video1 = new Film("file1", "title1", "director1", 2021, 200, 50);
    Video video2 = new Clip("file2", "title2", "director2", 2022, "songtitle", "songwriter", 500, 650);
    Video video3 = new Podcast("file3", "title3", "director3", 2021, "podcasthost", "podcasttopic", 800, 930);
    Video video = new Short();
    public void writeToFile() {
        try {
            File myFile = new File("films_manager.csv");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("films_manager.csv");
            myWriter.write(video.getHeaders() + "\n" + video.toCSV() + "\n");
            myWriter.write(video1.getHeaders() + "\n" + video1.toCSV() + "\n");
            myWriter.write(video2.getHeaders() + "\n" + video2.toCSV() + "\n");
            myWriter.write(video3.getHeaders() + "\n" + video3.toCSV() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}