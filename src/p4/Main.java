package p4;

//
//CSC164 Section 402
//

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    List<studentForm> studentFormList = new ArrayList<>();
    List<courseForm> courseFormList = new ArrayList<>();
    List<enrollmentForm> enrollmentFormList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Display to user
        Scene scene = new Scene(getTabs());
        primaryStage.setHeight(300);
        primaryStage.setWidth(325);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Enrollment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    protected TabPane getTabs() {
        TabPane fullLayout = new TabPane();
        fullLayout.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        //create tabs and set content
        Tab studentForm = new Tab("Student Form");
        studentForm.setContent(studentForm());
        Tab courseForm = new Tab("Course Form");
        courseForm.setContent(courseForm());
        Tab enrollmentForm = new Tab("Enrollment Form");
        enrollmentForm.setContent(enrollmentForm());

        fullLayout.getTabs().addAll(studentForm, courseForm, enrollmentForm);
        fullLayout.setPadding(new Insets(10, 10, 10, 10));

        return fullLayout;
    }
    protected GridPane studentForm(){
        //Create student form
        GridPane studentFormLayout = new GridPane();
        studentFormLayout.setPadding(new Insets(10, 10, 10, 10));
        studentFormLayout.setVgap(10);
        studentFormLayout.setHgap(10);
        studentFormLayout.setAlignment(Pos.CENTER);

        Button first = new Button("First");
        Button back  = new Button("Back");
        Button next  = new Button("Next");
        Button last  = new Button("Last");

        //Create the first HBox to store Buttons
        HBox buttonLayoutOne = new HBox(20);
        buttonLayoutOne.setAlignment(Pos.CENTER);
        buttonLayoutOne.getChildren().addAll(first, back);

        //Create the second HBox to store the Buttons
        HBox buttonLayoutTwo = new HBox(20);
        buttonLayoutTwo.setAlignment(Pos.CENTER);
        buttonLayoutTwo.getChildren().addAll(next,last);

        //create labels
        Label StudentID  = new Label("StudentID: ");
        Label firstName  = new Label("First Name: ");
        Label lastName   = new Label("Last Name: ");
        Label major      = new Label("Major: ");
        Label department = new Label("Department: ");

        //create text fields
        TextField tfStudentID = new TextField();
        TextField tfFirstName= new TextField();
        TextField tfLastName = new TextField();
        TextField tfMajor = new TextField();
        TextField tfDepartment = new TextField();

        //layout labels and text fields
        studentFormLayout.addRow(0, StudentID, tfStudentID);
        studentFormLayout.addRow(1, firstName, tfFirstName );
        studentFormLayout.addRow(2, lastName,  tfLastName);
        studentFormLayout.addRow(3, major,tfMajor);
        studentFormLayout.addRow(4, department, tfDepartment);
        studentFormLayout.addRow(5, buttonLayoutOne, buttonLayoutTwo);

        return studentFormLayout;
    }
    protected GridPane courseForm(){
        //Create course form
        GridPane courseFormLayout = new GridPane();
        courseFormLayout.setPadding(new Insets(10, 10, 10, 10));
        courseFormLayout.setVgap(10);
        courseFormLayout.setHgap(10);

        Button first = new Button("First");
        Button back  = new Button("Back");
        Button next  = new Button("Next");
        Button last  = new Button("Last");

        //Create the first HBox to store Buttons
        HBox buttonLayoutOne = new HBox(20);
        buttonLayoutOne.setAlignment(Pos.CENTER);
        buttonLayoutOne.getChildren().addAll(first, back);

        //Create the second HBox to store the Buttons
        HBox buttonLayoutTwo = new HBox(20);
        buttonLayoutTwo.setAlignment(Pos.CENTER);
        buttonLayoutTwo.getChildren().addAll(next,last);

        //create labels
        Label CRN = new Label("CRN: ");
        Label title = new Label("Title: ");
        Label major = new Label("Major: ");
        Label number = new Label("Number: ");
        Label department = new Label("Department: ");

        //create text fields
        TextField tfCRN = new TextField();
        TextField tfTitle = new TextField();
        TextField tfMajor = new TextField();
        TextField tfNumber = new TextField();
        TextField tfDepartment = new TextField();

        //layout information
        courseFormLayout.setAlignment(Pos.CENTER);
        courseFormLayout.addRow(0,CRN, tfCRN);
        courseFormLayout.addRow(1, title, tfTitle);
        courseFormLayout.addRow(2,major, tfMajor);
        courseFormLayout.addRow(3,number, tfNumber);
        courseFormLayout.addRow(4,department , tfDepartment);
        courseFormLayout.addRow(5, buttonLayoutOne, buttonLayoutTwo);

        return courseFormLayout;
    }
    protected GridPane enrollmentForm(){
        //Create enrollment form
        GridPane enrollmentFormLayout = new GridPane();
        enrollmentFormLayout.setPadding(new Insets(10, 10, 10, 10));
        enrollmentFormLayout.setVgap(10);
        enrollmentFormLayout.setHgap(10);

        Button first = new Button("First");
        Button back  = new Button("Back");
        Button next  = new Button("Next");
        Button last  = new Button("Last");

        //Create the first HBox to store Buttons
        HBox buttonLayoutOne = new HBox(20);
        buttonLayoutOne.setAlignment(Pos.CENTER);
        buttonLayoutOne.getChildren().addAll(first, back);

        //Create the second HBox to store the Buttons
        HBox buttonLayoutTwo = new HBox(20);
        buttonLayoutTwo.setAlignment(Pos.CENTER);
        buttonLayoutTwo.getChildren().addAll(next,last);

        //create labels
        Label StudentID= new Label("studentID: ");
        Label CRN= new Label("CRN: ");

        //create text fields
        TextField tfStudentID = new TextField();
        TextField tfCRN = new TextField();

        enrollmentFormLayout.setAlignment(Pos.CENTER);
        enrollmentFormLayout.addRow(0, StudentID,tfStudentID);
        enrollmentFormLayout.addRow(1, CRN, tfCRN);
        enrollmentFormLayout.addRow(2, buttonLayoutOne, buttonLayoutTwo);

        return enrollmentFormLayout;
    }
}
class studentForm{

}
class courseForm{

}
class enrollmentForm{
    
}

