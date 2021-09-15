package gui_class;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable{

	@FXML
	private TextField num;
	@FXML
	private Button gerar;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnGerar() {
		
		int num = Integer.parseInt(this.num.getText());
		
		int fat = 1;
		
		for(int cont = 1; cont <= num; cont++) {
			
			fat*=cont;
			
		}
		
		this.resul.setText(String.format("%d", fat));
		
	}
	
	private static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		setTextFieldInteger(this.num);
		
	}
	
}
