package Views;

import Controllers.ControllerConnexion;
import Controllers.ControllerInformation;
import Controllers.ControllerInscription;
import Models.ModelUser;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene;
    private Group root;

    private ViewInscription viewInscription;
    private ViewConnexion viewConnexion;
    private ViewInformation viewInformation;
    private ModelUser modelUser;
    private ControllerInscription controllerInscription;
    private ControllerConnexion controllerConnexion;
    private ControllerInformation controllerInformation;

    public static final double squareSizeScene = 700;

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage=stage;
        root=new Group();
        scene=new Scene(root,squareSizeScene,squareSizeScene);

        launchViewInscription();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void launchViewInscription(){
        modelUser=new ModelUser();
        viewInscription=new ViewInscription(root);
        controllerInscription=new ControllerInscription(this,modelUser);
    }

    public void launchViewConnexion(){
        viewConnexion=new ViewConnexion(root);
        controllerConnexion=new ControllerConnexion(this,modelUser);

    }

    public void launchViewInformation(){
        viewInformation=new ViewInformation(root, modelUser);
        controllerInformation=new ControllerInformation(this,modelUser);

    }

    public void setEventHandlerInscription(ControllerInscription controllerInscription){
        viewInscription.setEvents(controllerInscription);
    }


    public void setEventHandlerConnexion(ControllerConnexion controllerConnexion){
        viewConnexion.setEvents(controllerConnexion);
    }

    public void setEventHandlerInformation(ControllerInformation controllerInformation){
        viewInformation.setEvents(controllerInformation);
    }

    public ViewInscription getViewInscription() {
        return viewInscription;
    }

    public ViewConnexion getViewConnexion() {
        return viewConnexion;
    }

    public ViewInformation getViewInformation() {
        return viewInformation;
    }
}
