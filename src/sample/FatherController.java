package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class FatherController {

    public void loadPage( String name ) {
        Parent root = null;
        try{
            root = FXMLLoader.load( getClass().getResource( "/" + name + ".fxml" ) );
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
