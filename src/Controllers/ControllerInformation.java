package Controllers;

import Models.ModelUser;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerInformation implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelUser modelUser;

    public ControllerInformation(ViewHandler launcher, ModelUser modelUser){
        this.launcher=launcher;
        this.modelUser=modelUser;

        this.launcher.setEventHandlerInformation(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

    }
}
