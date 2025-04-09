import greenfoot.*;

/**
 * Οθόνη ήττας όταν ο παίκτης χάνει όλες τις ζωές ή 
 * εξαντλείται ο χρόνος.
 * 
 * @Author Sidiraki Eleni,Serious Game in Master in Applied Informatics
 * @version 1.0 2025
 */
public class GameOverScreen extends World {
    
    private InfoBoard messageBoard;
    
    public GameOverScreen(int score) {
        super(800, 600, 1);
        setBackground("final_bg.png");
        Greenfoot.playSound("gameover.mp3");
        String message = "GAME OVER\n\n" +
                        "Η αποστολή σου απέτυχε.\n" +
                        "Η μαύρη τρύπα σε κατάπιε ή δεν πρόλαβες.\n\n" +
                        "Μην απογοητεύεσαι,μπορείς να προσπαθήσεις ξανά!\n\n" +
                        "➤ Πάτησε ENTER για να ξεκινήσεις από την αρχή.";

        messageBoard = new InfoBoard(message);
        addObject(messageBoard, getWidth()/2, getHeight()/2);
        
        SoundManager.playLoop("space_theme.mp3", 60);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            SoundManager.stop();
            Greenfoot.setWorld(new StartScreen());
        }
    }
     
}
