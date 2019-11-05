package Controllers;

import Models.ModelUser;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerConnexion implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelUser modelUser;

    public ControllerConnexion(ViewHandler launcher, ModelUser modelUser){
        this.launcher=launcher;
        this.modelUser=modelUser;

        this.launcher.setEventHandlerConnexion(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewConnexion().getBtnValider())){

            String txtLogin = launcher.getViewConnexion().getFieldLogin().getText();
            String txtMdp = launcher.getViewConnexion().getFieldMdp().getText();

            if(modelUser.connection(txtLogin,txtMdp)){
                launcher.launchViewInformation();
            }
        }
        if(mouseEvent.getSource().equals(launcher.getViewConnexion().getBtnRetour())){
            launcher.launchViewInscription();
        }
    }
}
