package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class CalculatorController {
    Float data = 0f;
    int operation = -1;
	@FXML
	private Label label;
	@FXML
	private Button five;
	@FXML
	private Button two;
	@FXML
	private Button four;
	@FXML
	private Button minus;
	@FXML
	private Button plus;
	@FXML
	private Button three;
	@FXML
	private Button six;
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	@FXML
	private Button nine;
	@FXML
	private Button mult;
	@FXML
	private Button zero;
	@FXML
	private Button equals;
	@FXML
	private Button clear;
	@FXML
	private Button div;
	@FXML
	private Button one;
	@FXML
	private TextField display;

	// Event Listener on Button[#five].onAction
	@FXML
	public void handleButtonFiveAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "5");
	}
	// Event Listener on Button[#two].onAction
	@FXML
	public void handleButtonTwoAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "2");
	}
	// Event Listener on Button[#four].onAction
	@FXML
	public void handleButtonFourAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "4");
	}
	// Event Listener on Button[#minus].onAction
	@FXML
	public void handleButtonMinusAction(ActionEvent event) {
		// TODO Autogenerated
		data = Float.parseFloat(display.getText());
        operation = 2; //Minus 2
        display.setText("");
	}
	// Event Listener on Button[#plus].onAction
	@FXML
	public void handleButtonPlusAction(ActionEvent event) {
		// TODO Autogenerated
		data = Float.parseFloat(display.getText());
        operation = 1; //Addition
        display.setText("");
	}
	// Event Listener on Button[#three].onAction
	@FXML
	public void handleButtonThreeAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "3");
	}
	// Event Listener on Button[#six].onAction
	@FXML
	public void handleButtonsixAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "6");
	}
	// Event Listener on Button[#seven].onAction
	@FXML
	public void handleButtonSevenAction(ActionEvent event) {
		display.setText(display.getText() + "7");
		// TODO Autogenerated
	}
	// Event Listener on Button[#eight].onAction
	@FXML
	public void handleButtonEightAction(ActionEvent event) {
		display.setText(display.getText() + "8");
		// TODO Autogenerated
	}
	// Event Listener on Button[#nine].onAction
	@FXML
	public void handleButtonNineAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "9");
	}
	// Event Listener on Button[#mult].onAction
	@FXML
	public void handleButtonMultAction(ActionEvent event) {
		// TODO Autogenerated
		data = Float.parseFloat(display.getText());
        operation = 3; //Mult 3
        display.setText("");
	}
	// Event Listener on Button[#zero].onAction
	@FXML
	public void handleButtonZeroAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "0");
	}
	// Event Listener on Button[#equals].onAction
	@FXML
	public void handleButtonEqualsAction(ActionEvent event) {
		// TODO Autogenerated
        Float secondOperand = Float.parseFloat(display.getText());
        switch (operation) {
            case 1: //Addition
                Float ans = data + secondOperand;
                display.setText(String.valueOf(ans));break;
            case 2: //Subtraction
                ans = data - secondOperand;
                display.setText(String.valueOf(ans));break;
            case 3: //Mul
                ans = data * secondOperand;
                display.setText(String.valueOf(ans));break;
            case 4: //Div
                ans = 0f;
                try {
                    ans = data / secondOperand;
                }catch(Exception e){display.setText("Error");}
                display.setText(String.valueOf(ans));break;
        }
	}
	// Event Listener on Button[#clear].onAction
	@FXML
	public void handleButtonClearAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText("");
	}
	// Event Listener on Button[#div].onAction
	@FXML
	public void handleButtonDivAction(ActionEvent event) {
		// TODO Autogenerated
		data = Float.parseFloat(display.getText());
        operation = 4; //Div  4
        display.setText("");
		
	}
	// Event Listener on Button[#one].onAction
	@FXML
	public void handleButtonOneAction(ActionEvent event) {
		// TODO Autogenerated
		display.setText(display.getText() + "1");
	}
}
