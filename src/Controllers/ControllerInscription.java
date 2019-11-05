package Controllers;

import Models.FormChecker;
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

        FormChecker.addEventOnChangeForAllTextViewToDisableValidationButton(launcher.getViewInscription().getListTextField(),launcher.getViewInscription().getBtnValider());
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewInscription().getBtnValider().isArmed())){
                modelUser.initUser(launcher.getViewInscription().getListTextField());
                launcher.launchViewConnexion();
        }
    }



}
