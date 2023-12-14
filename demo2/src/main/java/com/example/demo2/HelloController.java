package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Label info;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    public TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private TextField secondName;
    @FXML
    private TextField country;
    @FXML
    public TextField address;
    @FXML
    private TextField phone;
    @FXML
    private VBox container;


    protected void changeInformation(String pass){
        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        String secondName = this.secondName.getText();
        String email = this.email.getText();
        String currentPassword = this.password.getText();
        if(pass!=null) {
            currentPassword = pass;
        }
        String phone = this.phone.getText();
        String address = this.address.getText();
        String country = this.country.getText();

        info.setText("email: " + email + "\n password: " + currentPassword + "\n firstName: " + firstName
                + "\n lastName: " + lastName + "\n secondName: " + secondName + "\n address: " + address
                + "\n phone: " + phone + "\n country: " + country);
    }


    @FXML
    protected void registerUser() {
        changeInformation(null);
        String currentPassword = this.password.getText();
        Label label = new Label("Edit password");
        TextField text = new TextField(currentPassword);
        Button button = new Button("Zmień hasło");
        button.setOnAction(actionEvent -> {
            String newPassword = text.getText();
            this.password.setText(newPassword);
            changeInformation(newPassword);
        });
        container.getChildren().addAll(label, text, button);
    }

    @FXML
    protected void onClickBtn() {
        info.setText("Welcome to JavaFX Application!");
    }
}