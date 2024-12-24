import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main (String[] args){
        frame newFrame = new frame();
        label newLabel = new label();
        newFrame.add(newLabel);

        while(true){
            SimpleDateFormat format = new SimpleDateFormat("dd. MM. yyyy HH:mm:ss");
            String time = format.format(Calendar.getInstance().getTime());
            newLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}