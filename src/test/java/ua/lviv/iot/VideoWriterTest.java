package ua.lviv.iot;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class VideoWriterTest {
    @Before
    public void setup() {
        VideoWriter fileWriter = new VideoWriter();
        fileWriter.writeToFile();
    }

    @Test
    public void testWriteToFile() {
    }
}