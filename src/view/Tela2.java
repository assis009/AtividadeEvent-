package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tela2 extends Application implements EventHandler<MouseEvent> {

	private TextField txtNumeros;
	
	private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnCe;
    
    private Button btnSoma;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;
    private Button btnIgual;
    private Button btnVirgula;
	
	@Override 
	public void start(Stage stage){
		
		FlowPane paneTxt = new FlowPane();
		paneTxt.setHgap(5);
		
		BorderPane pane = new BorderPane();
		
        GridPane paneBotoes = new GridPane();
        paneBotoes.setHgap(15);
        paneBotoes.setVgap(15);

        Scene scn = new Scene(pane);
 
        txtNumeros = new TextField("  ");
        
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnCe = new Button("CE");
        
        btnSoma = new Button("+");
        btnSub = new Button("-");
        btnMult = new Button("*");
        btnDiv = new Button("/");
        btnIgual = new Button("=");
        btnVirgula = new Button(",");
        
        
        pane.setTop(paneTxt);
        pane.setRight(btnCe);
        
        paneTxt.getChildren().addAll(txtNumeros, btnCe);
        paneBotoes.add(btn1, 1, 0);
        paneBotoes.add(btn2, 2, 0);
        paneBotoes.add(btn3, 3, 0);
        paneBotoes.add(btnSoma, 4, 0);
        
        paneBotoes.add(btn4, 1, 1);
        paneBotoes.add(btn5, 2, 1);
        paneBotoes.add(btn6, 3, 1);
        paneBotoes.add(btnSub, 4, 1);
        
        paneBotoes.add(btn7, 1, 2);
        paneBotoes.add(btn8, 2, 2);
        paneBotoes.add(btn9, 3, 2);
        paneBotoes.add(btnMult, 4, 2);
        
        paneBotoes.add(btnVirgula, 1, 3);
        paneBotoes.add(btn0, 2, 3);
        paneBotoes.add(btnIgual, 3, 3);
        paneBotoes.add(btnDiv, 4, 3);
        
        
        btn1.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn2.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn3.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn3.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn4.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn5.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn6.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn7.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn8.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn9.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btn0.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        
        btnCe.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnSoma.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnSub.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnDiv.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnMult.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnIgual.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        btnVirgula.addEventFilter(MouseEvent.MOUSE_PRESSED, this);
        
        pane.setCenter(paneBotoes);
        pane.setTop(paneTxt);
        

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        
        stage.setWidth(200);
        stage.setHeight(250);
        stage.show();
    }
	
	@Override
	public void handle(MouseEvent event) {
		
		String btn = Character.toString( (event.getSource().toString().charAt(35)));
		txtNumeros.setText(btn);
		
	}
	
	public static void main(String[] args) {
		Application.launch(Tela2.class, args);

	}

	

}
