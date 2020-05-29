import javafx.application.ConditionalFeature;
import javafx.application.Platform;

public class Check3DSupport{
    public static void main(String[] args){
        boolean supported = Platform.isSupported(ConditionalFeature.SCENE3D);
        if(supported){
            System.out.println("3D is supported by your computer !");
        }else{
            System.out.println("Your pc doesn't support Java 3D !");
        }
    }
}