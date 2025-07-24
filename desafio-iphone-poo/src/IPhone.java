import model.ApplicationMannager;

public class IPhone {


    public static void main(String[] args) {
        ApplicationMannager.runApplication(ApplicationMannager.getMusicApp());
        ApplicationMannager.getMusicApp().stopMusic();
        ApplicationMannager.getPhoneApp().answerCall();
        ApplicationMannager.runApplication(ApplicationMannager.getPhoneApp());
        ApplicationMannager.getPhoneApp().answerCall();
    }
}
