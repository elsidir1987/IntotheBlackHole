import greenfoot.*;

/**
 * Οθόνη νίκης με συνολικό σκορ και μήνυμα ολοκλήρωσης της αποστολής.
 * 
 * @Author Sidiraki Eleni,Serious Game in Master in Applied Informatics
 * @version 1.0 2025
 */
public class VictoryScreen extends World {
    private InfoBoard messageBoard;

    public VictoryScreen(int score,int lives) {
        super(800, 600, 1);
        setBackground("final_bg.png"); 
        
        SoundManager.stop();
        String message = "🎉 Κέρδισες! 🎉\n\n" +
                         "Η αποστολή σου ήταν επιτυχής!\n" +
                        "Μάζεψες συνολικά " + score + " data capsules.\n" +
                        "Ζωές που απέμειναν: " + lives + "\n\n" +
                        "You're A Guardian of the Galaxy!\n\n" +
                        "➤ Πάτησε ENTER για να παίξεις ξανά.";

        messageBoard = new InfoBoard(message);
        addObject(messageBoard, getWidth()/2, getHeight()/2);
        Greenfoot.playSound("victory.mp3");
    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            SoundManager.stop();
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
