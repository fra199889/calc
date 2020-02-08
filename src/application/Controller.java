package application;
//controller grafico



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	@FXML 
	private Label result;
	private float number1=0;
	private String operation="";
	private boolean start=true;
	private Graphics graphics=new Graphics();//il controller grafico chiama quello applicativo
	private float number2;
	@FXML
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
		
		
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		if(!value.contentEquals("=")) {
			if(!operation.isEmpty()) 
				return;
			
				operation=value;
				number1=Float.parseFloat(result.getText());
				result.setText("");}
		else {
			if(operation.isEmpty()) 
				return;
			
			number2=Float.parseFloat(result.getText());
			float output=graphics.calculator(number1, number2, operation);
			result.setText(String.valueOf(output));
			operation="";
			start=true;
			
			}
		}
	
	}


