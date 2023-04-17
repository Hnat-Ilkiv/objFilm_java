package ua.lviv.iot;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class VideoWriterTest {
    private static final String EXPECTED_FILENAME = "expected.csv";
    private static final String RESULT_FILENAME = "result.csv";

    private VideoManager videoManager;
    private VideoWriter videoWriter;
    @Before
    public void setup() {
        videoManager = new VideoManager();
        videoWriter = new VideoWriter();
    }

    @Test
    public void testEmptyWrite() throws IOException {
        assertNull(videoWriter.writeToFile(videoManager.getVideos(), RESULT_FILENAME));
    }

    @Test
    public void testWriteListOfVideo() throws IOException {
        videoManager.addVideo(new Film());
        videoManager.addVideo(new Clip());
        videoManager.addVideo(new Podcast());
        videoManager.addVideo(new Short());
        videoManager.addVideo(new Film("File Title", "Video Title", "Director", 2021, 8, 5));
        videoManager.addVideo(new Clip("File Title", "Video Title", "Director", 2021, "Song Title", "Songwriter", 50, 1000));
        videoManager.addVideo(new Podcast("fileTitle", "videoTitle", "director", 2022, "podcastHost", "podcastTopic", 5, 10));
        videoManager.addVideo(new Short("fileTitle", "videoTitle", "director", 2022, 5));

        videoWriter.writeToFile(videoManager.getSortedVideosList(), RESULT_FILENAME);

        File expected = new File(EXPECTED_FILENAME);
        File result = new File(RESULT_FILENAME);

        assertTrue(FileUtils.contentEquals(expected, result));
    }

    @Test
    public void testFileOverride() throws IOException {
        FileWriter overrideFileWriter = new FileWriter(RESULT_FILENAME);
        overrideFileWriter.write("Hello world!\n");
        overrideFileWriter.close();
        assertFalse(FileUtils.contentEquals(new File(RESULT_FILENAME), new File(EXPECTED_FILENAME)));
        testWriteListOfVideo();
    }
}