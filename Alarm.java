import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarm implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner input;

    Alarm (LocalTime alarmTime, String filePath, Scanner input) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.input = input;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }

        }

        System.out.println("== Alarm Noice ==");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File (filePath);

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press Enter to stop the alarm!");
            input.nextLine();
            clip.stop();
            input.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported!");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable!");
        } catch (IOException e) {
            System.out.println("Audio file not found!");
        }


    }

}


// Music I use: Bensound.com
// License code: DIXUFHKK80TFBGPR
// Artist: : Aventure