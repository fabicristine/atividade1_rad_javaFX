package cadastrodealuno;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Fabiane
 */
public class CadastroDeAluno extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        Text scenetitle = new Text("Cadastro de Aluno");
        scenetitle.setFont(Font.font("Lucida Calligraphy", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label RA = new Label("RA:");
        grid.add(RA, 0, 1);
        TextField RATextField = new TextField();
        grid.add(RATextField, 1, 1);
        
        Label nome = new Label("nome:");
        grid.add(nome, 0, 2);
        TextField nomeTextField = new TextField();
        grid.add(nomeTextField, 1, 2);
        
        Label estado = new Label("estado:");
        grid.add(estado, 0, 3);
               
        ComboBox cb = new ComboBox();
        cb.getItems().addAll(
            "MS",
            "DF",
            "SC"
        );
        
        grid.add(cb,1,3);
        
        
        Label sexo = new Label("sexo:");
        grid.add(sexo, 0, 4);
        
        HBox caixa = new HBox(2);
        grid.add(caixa,1,4);
        
        RadioButton rb2 = new RadioButton();
        rb2.setText("fem");
        caixa.getChildren().add(rb2);
        
        RadioButton rb1 = new RadioButton();
        rb1.setText("masc");
        caixa.getChildren().add(rb1);
        
        
        HBox caix2 = new HBox(2);
        Button b1 = new Button("salvar");
        caix2.getChildren().add(b1);
        
        Button b2 = new Button("cancelar");
        caix2.getChildren().add(b2);
        
        grid.add(caix2, 1, 5);
        
        Scene scene = new Scene(grid, 325, 275);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
