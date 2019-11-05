package Views;

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
    private ModelUser modelUser;
    private ControllerInscription controllerInscription;

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

    void launchViewInscription(){
        modelUser=new ModelUser();
        viewInscription=new ViewInscription(root);
        controllerInscription=new ControllerInscription(this,modelUser);
    }

    public void setEventHandlerInscription(ControllerInscription controllerInscription){
        viewInscription.setEvents(controllerInscription);
    }

    public ViewInscription getViewInscription() {
        return viewInscription;
    }
}
