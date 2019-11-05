package Controllers;

import Models.ModelUser;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerInscription implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelUser modelUser;

    public ControllerInscription(ViewHandler launcher, ModelUser modelUser){
        this.launcher=launcher;
        this.modelUser=modelUser;

        this.launcher.setEventHandlerInscription(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewInscription().getBtnValider())){
            modelUser.initUser(launcher.getViewInscription().getListTextFiled());

            launcher.launchViewConnexion();
        }
    }
}
