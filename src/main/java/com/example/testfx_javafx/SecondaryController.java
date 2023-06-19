package com.example.testfx_javafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Window;

public class SecondaryController {
    String str = " ";
    @FXML
    private CheckBox c1,c2,c3,c4;

    @FXML
    private AnchorPane anchorPane1;

    @FXML
    private AnchorPane anchorPane2;

    @FXML
    private Button buttonA;

    @FXML
    private Button buttonB;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonD;

    @FXML
    private Button buttonE;

    @FXML
    private Button buttonF;

    @FXML
    private Menu helpMenu;

    @FXML
    private Menu menuButton;

    @FXML
    private MenuItem aboutMenu;

    @FXML
    private BorderPane borderPane;


    @FXML
    void btnClickedPageA(ActionEvent event) throws FileNotFoundException {
        anchorPane1.getChildren().clear();
        anchorPane1.setStyle("-fx-background-color:#ADD8E6");
        TextField root = new TextField("Page A");
        root.setId("textFieldA");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));

        //Tool Bar
        // FileInputStream fis = new FileInputStream("/home/ubuntu/Downloads/download.png");
        // Image image = new Image(fis,20,20,true,true);
        // ImageView imageView  = new ImageView(image);
        // menuButton.setGraphic(imageView);

        //Table View
        Button button = new Button("Table View");
        button.setId("tableViewButton");

        button.setLayoutY(27);
        button.setOnAction(e -> {
            TableView tableView = new TableView();
            tableView.setId("tableView");
            tableView.setLayoutX(70);
            tableView.setLayoutY(100);
            tableView.setPrefSize(300, 250);
            TableColumn<Person, String> column1 = new TableColumn<>("First Name");
            column1.setId("column");
            column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));

            TableColumn<Person, String> column2 = new TableColumn<>("Last Name");
            column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));

            TableColumn<Person, String> column3 = new TableColumn<>("Address");
            column3.setCellValueFactory(new PropertyValueFactory<>("address"));

            tableView.getColumns().add(column1);
            tableView.getColumns().add(column2);
            tableView.getColumns().add(column3);

            tableView.getItems().add(new Person("Ram" , "Pawar","Ahmednagar"));
            tableView.getItems().add(new Person("Ankit" , "More","Jalgaon"));

            anchorPane1.getChildren().add(tableView);
        });

        Button treeViewbtn = new Button("Tree View");
        treeViewbtn.setId("treeViewButton");
        treeViewbtn.setLayoutY(27);
        treeViewbtn.setLayoutX(90);

        treeViewbtn.setOnAction(e -> {
            TreeTableView<Person> treeTableView = new TreeTableView<Person>();
            treeTableView.setId("treeTableView");
            treeTableView.setLayoutX(70);
            treeTableView.setLayoutY(100);
            treeTableView.setPrefSize(300, 250);
            TreeTableColumn<Person, String> treeTableColumn1 = new TreeTableColumn<>("First Name");
            TreeTableColumn<Person, String> treeTableColumn2 = new TreeTableColumn<>("Last Name");
            TreeTableColumn<Person, String> treeTableColumn3 = new TreeTableColumn<>("Address");

            treeTableColumn1.setCellValueFactory(new TreeItemPropertyValueFactory<>("firstName"));
            treeTableColumn2.setCellValueFactory(new TreeItemPropertyValueFactory<>("lastName"));
            treeTableColumn3.setCellValueFactory(new TreeItemPropertyValueFactory<>("address"));

            treeTableView.getColumns().add(treeTableColumn1);
            treeTableView.getColumns().add(treeTableColumn2);
            treeTableView.getColumns().add(treeTableColumn3);

            TreeItem t1 = new TreeItem(new Person("Alia","Bhat", "Pune"));
            TreeItem t2 = new TreeItem(new Person("Sidharth","Malhotra", "Mumbai"));
            TreeItem t3 = new TreeItem(new Person("Ram","Pawar", "Maharashtra"));

            TreeItem alia = new TreeItem(new Person("Alia","Bhat", "Pune"));
            alia.getChildren().addAll(t1,t2,t3);

            TreeItem t4 = new TreeItem(new Person("Virat","Kohli", "Mumbai"));
            TreeItem t5 = new TreeItem(new Person("Ms","Dhoni", "Ranchi"));
            TreeItem t6 = new TreeItem(new Person("Ram","Pawar", "Maharashtra"));

            TreeItem virat = new TreeItem<>(new Person("Virat","Kohli", "Mumbai"));
            virat.getChildren().addAll(t4,t5,t6);

            TreeItem celebrities = new TreeItem<>(new Person("celebrities","-----","-----"));
            
            celebrities.getChildren().addAll(alia,virat);
            treeTableView.setRoot(celebrities);
            anchorPane1.getChildren().add(treeTableView);
        });

        Button listViewBtn = new Button("Languages");
        listViewBtn.setId("listViewBtn");
        listViewBtn.setLayoutY(51);
        listViewBtn.setOnAction(event1 -> {
            ListView<String> listView1 = new ListView<>();
            listView1.setLayoutX(70);
            listView1.setLayoutY(100);
            listView1.setPrefSize(300, 250);
            listView1.setId("listView");
            listView1.setItems(FXCollections.observableArrayList("Java","C", "C++", "PHP", "JavaScript"));
            listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            anchorPane1.getChildren().add(listView1);
        });

        Button dialogBoxBtn = new Button("DialogBox");
        dialogBoxBtn.setId("dialogBoxBtn");
        dialogBoxBtn.setLayoutX(89);
        dialogBoxBtn.setLayoutY(51);
        dialogBoxBtn.setOnAction(e -> {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sxunday"};
            String defaultValue = days[0];

            ChoiceDialog<String> dialog = new ChoiceDialog<String>(defaultValue, days);
            dialog.setTitle("Days Selection");
            dialog.setHeaderText("Select a day");
            dialog.showAndWait();
        });
        
        anchorPane1.getChildren().addAll(button,root,treeViewbtn,listViewBtn,dialogBoxBtn);
    }

    @FXML
    void btnClickedPageB(ActionEvent event) {
        // Stage secondaryStage = new Stage();
        VBox box = new VBox();
        
        TextField root = new TextField("Page B");
        root.setId("textFieldB");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.getChildren().clear();
        
        
        anchorPane1.setStyle("-fx-background-color:#ADD8E6");
        box.setStyle("-fx-background-color:#e1ffev");
        Label label1 = new Label("Old Password");
        label1.setId("label1");
        label1.setLayoutX(50);
        label1.setLayoutY(100);

        PasswordField pass1 = new PasswordField();
        pass1.setId("pass1");
        pass1.setPrefWidth(210);
        pass1.setLayoutX(150);
        pass1.setLayoutY(97);
        pass1.setPromptText("Enter your old password");
        anchorPane1.getChildren().addAll(label1,pass1);
        
        Label label2 = new Label("New Password");
        label2.setId("label2");
        label2.setLayoutX(50);
        label2.setLayoutY(150);
        PasswordField pass2 = new PasswordField();
        pass2.setId("pass2");
        pass2.setPrefWidth(210);
        pass2.setLayoutX(150);
        pass2.setLayoutY(147);
        pass2.setPromptText("Enter your new password");
        anchorPane1.getChildren().addAll(label2,pass2);

        Label label3 = new Label("Confirm Password");
        label3.setId("label3");
        label3.setLayoutX(25);
        label3.setLayoutY(200);
        PasswordField pass3 = new PasswordField();
        pass3.setId("pass3");
        pass3.setPrefWidth(210);
        pass3.setLayoutX(150);
        pass3.setLayoutY(197);
        
        anchorPane1.getChildren().addAll(label3,pass3);

        Button saveButton = new Button("Save");
        saveButton.setId("saveButton");
        saveButton.setLayoutX(235);
        saveButton.setLayoutY(250);
        saveButton.setPrefWidth(60);
        saveButton.setPrefHeight(35);
        saveButton.setStyle("-fx-background-color:BLACK");
        saveButton.setTextFill(Color.WHITE);
        
        Window owner = anchorPane1.getScene().getWindow();
        saveButton.setOnAction(e -> {
            if(new String(pass2.getText()).equals(new String(pass3.getText()))){   
                showAlert(Alert.AlertType.CONFIRMATION, owner, "Changed", "Password changed successfully!");
                System.out.println(pass1.getText());
                System.out.println(pass2.getText());
                System.out.println(pass3.getText());
                pass1.setText("");
                pass2.setText("");
                pass3.setText("");
            }else{
                showAlert(Alert.AlertType.ERROR, owner, "Wrong password", "Please enter correct password");
                return;
            }  
        });

        TextField root1 = new TextField();
        root1.setPrefWidth(418);
        root1.setPrefHeight(15);
        root1.setLayoutY(350);
        root1.setEditable(false);
        anchorPane1.getChildren().addAll(saveButton,root,root1); 
    }

    @FXML
    void btnClickedPageC(ActionEvent event) {
        TextField root = new TextField("Page C");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.getChildren().clear();
        anchorPane1.setStyle("-fx-background-color:#ADD8E6");
        Label label = new Label("Select Gender");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,24));
        label.setLayoutX(115);
        label.setLayoutY(50);

        RadioButton male = new RadioButton("Male");
        male.setId("male");
        male.setLayoutX(100);
        male.setLayoutY(140);
        male.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));

        RadioButton female = new RadioButton("Female");
        female.setId("female");
        female.setLayoutX(210);
        female.setLayoutY(140);
        female.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Button saveButton = new Button("Save");
        saveButton.setId("saveButton");
        saveButton.setLayoutX(150);
        saveButton.setLayoutY(230);
        saveButton.setPrefWidth(100);
        saveButton.setPrefHeight(35);
        saveButton.setStyle("-fx-background-color:BLACK");
        saveButton.setTextFill(Color.WHITE);

        TextField textField = new TextField();
        textField.setId("textField");
        textField.setPrefSize(210, 30);
        textField.setLayoutX(95);
        textField.setLayoutY(290);

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> obj, Toggle oldVal, Toggle newVal) {
                RadioButton radio = (RadioButton)newVal;
                saveButton.setOnAction(e -> {
                    textField.setText(radio.getText()+" Selected");
                });
            }
        }); 

        TextField root1 = new TextField();
        root1.setPrefWidth(418);
        root1.setPrefHeight(15);
        root1.setLayoutY(350);
        root1.setEditable(false);
        anchorPane1.getChildren().addAll(label,male,female,saveButton,textField,root,root1);
    }

    @FXML
    void btnClickedPageD(ActionEvent event) {
        TextField root = new TextField("Page D");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.setStyle("-fx-background-color:#ADD8E6");
        Label label = new Label("Select Fav Series");
        label.setLayoutX(90);
        label.setLayoutY(40);
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
        anchorPane1.getChildren().clear();

        ChoiceBox<String> b1 = new ChoiceBox<>();
        b1.setId("choiceBox");
        ObservableList<String> list = b1.getItems();
        list.addAll("Vampire Dairies","Aspirants","TVF Pictures","Scam 1992","Operation MBBS");
        b1.setFocusTraversable(true);
        b1.setPrefWidth(140);
        b1.setLayoutX(250);
        b1.setLayoutY(140);

        ComboBox<String> b2 = new ComboBox<>();
        b2.setId("comboBOx");
        ObservableList<String> list1 = b2.getItems();
        list1.addAll("Business Proposal","Kota Factory","Aspirants","TVF Pictures","Scam 1992");
        b2.setPrefWidth(140);
        b2.setLayoutX(50);
        b2.setLayoutY(140);
        b2.setEditable(true);
        b2.setPromptText("Type Here");
        b2.setFocusTraversable(false);

        Button saveButton = new Button("Save");
        saveButton.setId("saveButton");
        saveButton.setLayoutX(165);
        saveButton.setLayoutY(210);
        saveButton.setPrefWidth(100);
        saveButton.setPrefHeight(35);
        saveButton.setStyle("-fx-background-color:BLACK");
        saveButton.setTextFill(Color.WHITE);

        TextArea textField = new TextArea();
        textField.setPrefSize(320, 70);
        textField.setLayoutX(50);
        textField.setLayoutY(260);
        textField.setWrapText(true);
        textField.setEditable(false);

        saveButton.setOnAction(e -> {
            b2.setOnAction(e1 -> {
                b2.getValue().toString();
            });

            b1.setOnAction(e2 -> {
                b1.getValue().toString();
            });
            textField.setText(b2.getValue()+" selected from combobox "+" \n & \n"+b1.getValue()+" selected from choicebox ");
        });

        TextField root1 = new TextField();
        root1.setPrefWidth(418);
        root1.setPrefHeight(15);
        root1.setLayoutY(350);
        root1.setEditable(false);
        anchorPane1.getChildren().addAll(label,b1,b2,saveButton,textField,root,root1);
    }

    @FXML
    void btnClickedPageE(ActionEvent event) {
        double sliderWidth = 220;
        TextField root = new TextField("Page E");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.getChildren().clear();

        anchorPane1.setStyle("-fx-background-color:#ADD8E6");
        Label label1 = new Label("Slider");
        label1.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label1.setLayoutX(30);
        label1.setLayoutY(90);

        Label label2 = new Label("Progreass Indicator");
        label2.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label2.setLayoutX(30);
        label2.setLayoutY(160);

        Label label3 = new Label("Progreass Bar");
        label3.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label3.setLayoutX(30);
        label3.setLayoutY(230);

        Slider slider = new Slider();
        slider.setId("slider");
        slider.setLayoutX(180);
        slider.setLayoutY(90);
        slider.setMin(0);
        slider.setMax(100);
        slider.setMinWidth(sliderWidth);
        slider.setMaxWidth(sliderWidth);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(4);
        // System.out.println(slider);

        ProgressIndicator pi = new ProgressIndicator(0);
        pi.setId("pi");
        pi.setLayoutX(200);
        pi.setLayoutY(155);
        pi.setMinWidth(sliderWidth);
        pi.setMaxWidth(sliderWidth);

        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setId("progressBar");
        progressBar.setPrefSize(260, 20);
        progressBar.setLayoutX(180);
        progressBar.setLayoutY(230);
        progressBar.setMinWidth(sliderWidth);
        progressBar.setMaxWidth(sliderWidth);

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> obj, Number oldVal, Number newVal) {
                progressBar.setProgress(newVal.doubleValue()/100);
                pi.setProgress(newVal.doubleValue()/100);
                System.out.println(newVal);
            }  
        });

        TextField root1 = new TextField();
        root1.setPrefWidth(418);
        root1.setPrefHeight(15);
        root1.setLayoutY(350);
        root1.setEditable(false);
        anchorPane1.getChildren().addAll(label1,root,label2,label3,slider,pi,progressBar,root1);
    }

    @FXML
    void btnClickedPageF(ActionEvent event) throws FileNotFoundException {
        TextField root = new TextField("Page F");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.getChildren().clear();
        
        anchorPane1.setStyle("-fx-background-color:#ADD8E6");

        Label label = new Label("Choose your DOB");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label.setLayoutX(20);
        label.setLayoutY(80);

        DatePicker dp = new DatePicker();
        dp.setId("dp");
        dp.setValue(LocalDate.now());
        dp.setLayoutX(220);
        dp.setLayoutY(75);
        dp.setPrefSize(170, 30);
        System.out.println(dp.getValue());

        Label label1 = new Label("Click on image");
        label1.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label1.setLayoutX(20);
        label1.setLayoutY(140);

        Hyperlink hp = new Hyperlink();
        Image image = new Image(new FileInputStream("/home/ubuntu/Downloads/youtube.png"),50,50,true,true);
        ImageView imageView = new ImageView(image);
        imageView.setId("imageView");
        hp.setGraphic(imageView);
        hp.setLayoutX(210);
        hp.setLayoutY(120);
        hp.setOnAction(e -> {
            System.out.println("Link Clicked");
        });

        Label label2 = new Label("Select your Age");
        label2.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
        label2.setLayoutX(20);
        label2.setLayoutY(200);

        Spinner<Integer> spinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100);
        spinner.setLayoutX(215);
        spinner.setLayoutY(195);
        spinner.setValueFactory(valueFactory);
        spinner.setEditable(true);

        Button saveButton = new Button("Save");
        saveButton.setId("saveButton");
        saveButton.setLayoutX(140);
        saveButton.setLayoutY(250);
        saveButton.setPrefWidth(100);
        saveButton.setPrefHeight(35);
        saveButton.setStyle("-fx-background-color:BLACK");
        saveButton.setTextFill(Color.WHITE);

        TextArea textField = new TextArea();
        textField.setPrefSize(220, 15);
        textField.setLayoutX(80);
        textField.setLayoutY(300);

        spinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> obj, Integer aroldVal, Integer newVal) {
                spinner.getValue();
            }   
        });

        dp.setOnAction(e1 -> {
            dp.getValue().toString();
        });
        saveButton.setOnAction(e -> {    
            textField.setText("Date :"+dp.getValue().toString()+" And "+"Age : "+spinner.getValue());
        });

        TextField root1 = new TextField();
        root1.setPrefWidth(418);
        root1.setPrefHeight(15);
        root1.setLayoutY(350);
        root1.setEditable(false);
        anchorPane1.getChildren().addAll(label,dp,label1,hp,label2,spinner,saveButton,textField,root,root1);
    }

    @FXML
    void handleAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("This is a JavaFX Assignment-2!");
        alert.setContentText("Simple JavaFx Program");
        alert.show();
    }

    @FXML
    void handleExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void handleTheam(ActionEvent event) {
        anchorPane1.getChildren().clear();
        anchorPane1.setStyle("-fx-background-color:White");
        TextField root = new TextField("Title");
        root.setPrefWidth(418);
        root.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        anchorPane1.getChildren().add(root);
    }

    @FXML
    void menuAction(ActionEvent event) {
        Slider volumeSlider = new Slider();
            volumeSlider.setMin(0);
            volumeSlider.setMax(100);
            volumeSlider.setValue(50);
            volumeSlider.setOrientation(Orientation.HORIZONTAL);
            volumeSlider.valueProperty().addListener((observale, oldValue, newValue) -> {
                System.out.println(newValue);
            });
    }


    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    // @Override
    // public void initialize(URL location, ResourceBundle resources) {
    //     try (FileInputStream fis = new FileInputStream("/home/ubuntu/Downloads/download.png")) {
    //         Image image = new Image(fis,20,20,true,true);
    //         ImageView imageView  = new ImageView(image);
    //         menuButton.setGraphic(imageView);
    //     } catch (IOException e) {
            
    //         e.printStackTrace();
    //     }
    // }


//     @FXML
//     public void initialize() {
//     Image icon = new Image(getClass().getResourceAsStream("$PATH_TO_ICON_IMAGE"));
//     menuButton.setGraphic(new ImageView(icon));
// }
}

