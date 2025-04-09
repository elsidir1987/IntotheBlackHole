import greenfoot.*;

/**
 * Κεντρική διαχείριση της μουσικής υπόκρουσης για όλες 
 * τις οθόνες/επίπεδα.
 * 
 * Author Sidiraki Eleni,Serious Game in Master in Applied Informatics
 * @version 1.0 2025
*/
public class SoundManager {
    private static GreenfootSound currentMusic;

    public static void playLoop(String filename, int volume) {
        stop(); // σταματά προηγούμενη μουσική
        currentMusic = new GreenfootSound(filename);
        currentMusic.setVolume(volume);
        currentMusic.playLoop();
    }

    public static void stop() {
        if (currentMusic != null) {
            currentMusic.stop();
        }
    }
}
