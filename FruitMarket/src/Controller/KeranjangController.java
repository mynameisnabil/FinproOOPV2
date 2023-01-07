package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class KeranjangController implements Initializable{
    // @FXML
    // private HBox 
    @FXML
    private VBox idListKeranjang = null; 

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[1000];
        for (int i = 0; i < 10; i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../views/itemListKeranjang.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #FFFF");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #FFFF");
                });

                // set the data to the labels
                idListKeranjang.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            
        }
    }

        
    }
    

    
}
