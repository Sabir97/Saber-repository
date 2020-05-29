import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.Box;

public class PredefinedShapes extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    public void start(Stage stage){

        //create 3D BOX
        Box box = new Box(100,100,100);
        PointLight light = new PointLight();
        light.setTranslateX(300);
        light.setTranslateY(100);
        light.setTranslateZ(300);

        box.setTranslateX(150);
        box.setTranslateY(0);
        box.setTranslateZ(400);

        Group root = new Group(box,light);

        Scene scene = new Scene(root,800,600,true);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.setTitle("3D Shapes !");

        stage.show();
    }
}