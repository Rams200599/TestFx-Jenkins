package com.example.testfx_javafx;

import org.junit.jupiter.api.Test;
import org.junit.BeforeClass;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

class TestfxJavafxApplicationTests extends ApplicationTest{

	private TestfxJavafxApplication application;
	// private static Scene scene;
	// private SecondaryController secondaryController;

	// @BeforeClass
	// public static void setUpHeadlessMode(){
	// 		System.setProperty("testfx.robot", "glass");
	// 		System.setProperty("testfx.headless", "true");
	// 		System.setProperty("prism.order", "sw");
	// 		System.setProperty("prism.text", "t2k");
	// 		System.setProperty("java.awt.headless", "true");
	// }

	 @Override
    public void init() throws Exception {
        super.init();
	    
        System.setProperty("testfx.robot", "monocle");
        System.setProperty("testfx.headless", "true");
	// System.setProperty("java.awt.headless", "true");
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// scene = new Scene(loadFXML("secondary"));
		// primaryStage.setScene(scene);
		// primaryStage.setTitle("HCI");
		// primaryStage.show();
		application = new TestfxJavafxApplication();
		application.start(primaryStage);

		
	}
	// private static Parent loadFXML(String fxml) throws IOException {
	// 	FXMLLoader fxmlLoader = new FXMLLoader(TestfxJavafxApplication.class.getResource("/secondary.fxml"));
	// 	return fxmlLoader.load();
	// }

	

	/***************************TestFx-Test-Cases******************************/
	@Test
	public void testButtonA(){
	//Click the button
	// FxRobot robot = new FxRobot();
	clickOn("#buttonA");

        // FxRobot robot = new FxRobot();
        // robot.clickOn("#buttonA");

// 	//Robot object created
// 	FxRobot robot = new FxRobot();

// 	//Test case for Dialog 
// 	clickOn("#dialogBoxBtn");
// 	sleep(500);

// 	clickOn("Monday").sleep(500);
// 	clickOn("Wednesday");
// 	sleep(500);
// 	clickOn("OK");

// 	//test case for TextField
// 	TextField textField = robot.lookup("#textFieldA").query();
// 	// assertEquals("Page A", textField.getText());
// 	sleep(500);

// 	clickOn("#tableViewButton");
// 	sleep(500);

// 	//test case for TableView
// 	TableView tableView = robot.lookup("#tableView").query();
// 	// assertNotNull(tableView);
// 	// assertEquals(2, tableView.getItems().size());

// 	// assertTrue(TableViewMatchers.containsRow("Ram", "Pawar", "Ahmednagar").matches(tableView));
// 	// assertTrue(TableViewMatchers.containsRow("Ankit", "More", "Jalgaon").matches(tableView));

// 	clickOn("#treeViewButton");
// 	sleep(500);

// 	//Test case for TreeTableView
// 	TreeTableView treeTableView = robot.lookup("#treeTableView").query();
// 	// assertNotNull(treeTableView);
// 	// assertEquals(3, treeTableView.getColumns().size());

// 	doubleClickOn("celebrities");
// 	sleep(500);

// 	doubleClickOn("Alia");
// 	sleep(500);

// 	doubleClickOn("Virat");
// 	sleep(500);

// 	clickOn("#listViewBtn");
//     sleep(500);

//     clickOn("#listView")
//         .press(KeyCode.CONTROL)
//         .clickOn("Java")
//         .sleep(500)
//         .clickOn("PHP")
//         .sleep(500)
//         .clickOn("C++")
//         .sleep(500)
//         .release(KeyCode.CONTROL);
// }

// //Test case for Button B
// @Test
// public void testButtonB(){
// 	clickOn("#buttonB");
// 	sleep(500);

// 	FxRobot robot = new FxRobot();

// 	//Test case for Label
// 	Label label1 = robot.lookup("#label1").query();
// 	// assertEquals("Old Password", label1.getText());
// 	sleep(500);

// 	robot.clickOn("#pass1").write("P@ss1234").type(KeyCode.ENTER);
// 	sleep(500);

// 	robot.clickOn("#pass2").write("R@ms1234").type(KeyCode.ENTER);
// 	sleep(500);

// 	robot.clickOn("#pass3").write("R@ms1234").type(KeyCode.ENTER);
// 	sleep(500);

// 	clickOn("#saveButton");
// 	sleep(500);

// 	clickOn("OK");
// }

// //Test case for Button C
// @Test
// public void testButtonC(){
// 	clickOn("#buttonC");
// 	sleep(500);

// 	FxRobot robot = new FxRobot();

// 	// Test case for RadioButton
// 	RadioButton male = robot.lookup("#male").query();
// 	clickOn("#male");
// 	sleep(500);

// 	clickOn("#saveButton");
// 	sleep(500);

// 	// assertEquals("Male selected", male.getText()+" selected");

// 	RadioButton female = robot.lookup("#female").query();
// 	clickOn("#female");
// 	sleep(500);

// 	clickOn("#saveButton");
// 	sleep(500);
// 	// assertEquals("Female selected", female.getText()+" selected");
// }

// //Test case for Button D
// @Test
// public void testButtonD(){
// 	FxRobot robot = new FxRobot();
// 	clickOn("#buttonD");
// 	sleep(500);

// 	//Test case for ComboBox
// 	// clickOn("#comboBOx");
// 	clickOn(1015, 395);
// 	sleep(500);

// 	ComboBox b2 = robot.lookup("#comboBOx").query();
// 	// assertNotNull(b2);
// 	// assertEquals(5, b2.getItems().size());

// 	//select an item in the ComboBox
// 	clickOn("Aspirants");
// 	interact(() -> b2.getSelectionModel().select("Aspirants"));

// 	//verify the selected item
// 	// assertEquals("Aspirants", b2.getSelectionModel().getSelectedItem());
// 	sleep(500);

// 	clickOn("#choiceBox");
// 	sleep(500);

// 	//Test case for choice box
// 	ChoiceBox b1 = robot.lookup("#choiceBox").query();
// 	// assertNotNull(b1);
// 	// assertEquals(5, b1.getItems().size());

// 	// select an item in the ChoiceBox
// 	clickOn("Scam 1992");
// 	interact(() -> b1.getSelectionModel().select("Scam 1992"));

// 	//verify the selected item
// 	// assertEquals("Scam 1992", b1.getSelectionModel().getSelectedItem());
// 	sleep(500);

// 	clickOn("#saveButton");
// 	sleep(500);
// }

// //Test case for Button E
// @Test
// public void testButtonE(){
// 	clickOn("#buttonE");
// 	sleep(500);

// 	FxRobot robot = new FxRobot();

// 	//Test cse for Slider
// 	Slider slider = robot.lookup("#slider").query();
// 	clickOn("#slider");
// 	// clickOn("80");
// 	slider.setValue(50.0);
// 	sleep(500);
// }

// @Test
// public void testButtonF(){
// 	clickOn("#buttonF");
// 	// clickOn("#dp");

// 	clickOn(1215, 340);
// 	sleep(500);
// 	clickOn("20");
// 	sleep(500);

// 	clickOn("#imageView");
// 	sleep(200);

// 	clickOn(1216, 447).sleep(700).clickOn().sleep(700).clickOn();
// 	sleep(500);

// 	clickOn("#saveButton").sleep(500);
}
}
