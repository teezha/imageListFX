package sample;

/** ==============================================================================
 * File         : some_file.java
 *
 * Current Author: Robert Hewlett
 *
 * Previous Author: None
 *
 * Contact Info: somebody@somewhere.com
 *
 * Purpose :
 *
 * Dependencies: None
 *
 * Modification Log :
 *    --> Created MMM-DD-YYYY (fl)
 *    --> Updated MMM-DD-YYYY (fl)
 *
 * =============================================================================
 */

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {

    @FXML
    Pane root;

    @FXML
    ListView list;

    @FXML
    Label lot;



    /** ===========================================================
     * The following block does ....
     * ===========================================================
     */



    public void load() throws FileNotFoundException {

        try {
            FileChooser fileChooser = new FileChooser();
            File file;

            file = fileChooser.showOpenDialog(null);

            /** ===========================================================
             * The following block does ....
             * ===========================================================
             */


            if(file != null)
            {
                Scanner keyboard = new Scanner(file);
                while (keyboard.hasNext())
                {
                    list.getItems().add(keyboard.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /** ===========================================================
     * The following block does ....
     * ===========================================================
     */


    public  void close()
    {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();
    }

    /** ===========================================================
     * The following block does ....
     * ===========================================================
     */


    public void updateImage(MouseEvent mouseEvent) {

        String filename = "FILE:H:\\var\\gist\\7132\\m07_data\\images\\"+list.getSelectionModel().getSelectedItem()+".jpg";
        lot.setGraphic(new ImageView(new Image(filename)));
    }
}
