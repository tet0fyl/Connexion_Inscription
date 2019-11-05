package Controllers;

import Models.User;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerInformation implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private User user;

    public ControllerInformation(ViewHandler launcher, User user){
        this.launcher=launcher;
        this.user = user;

        this.launcher.setEventHandlerInformation(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewInformation().getBtnRetour())){
            launcher.launchViewInscription();
        }
    }
}
