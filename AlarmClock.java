import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Music.wav";

        while (alarmTime == null) {

            try {
                
                System.out.print("Enter an alarm time (HH:mm:ss) : ");
                String inputTime = input.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for : " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format! use (HH:mm:ss)");
            }

        }

        Alarm clock = new Alarm(alarmTime, filePath, input);
        Thread alarmThread = new Thread(clock);
        alarmThread.start();

    }
}
