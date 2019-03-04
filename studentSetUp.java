//Neofytos Neokleous
//C1615033

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.util.function.Predicate;
import java.util.Arrays;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class studentSetUp extends Application {

    Stage window;
    TableView<students> table;
    ObservableList<students> allStudents = FXCollections.observableArrayList();
    ObservableList<students> studentsSelected;
    FilteredList<students> filteredData = new FilteredList<>(allStudents, e->true);
    List<students> newListStudents = new ArrayList<>();
    TextField nameInput;
    TextField courseNameInput;
    TextField studentNumberInput;
    TextField courseIDInput;
    TextField houseNumberInput;
    TextField streetNameInput;
    TextField townInput;
    TextField postCodeInput;
    TextField searchInput;
    String COMMA_DELIMITER = ",";
    String NEW_LINE_SEPARATOR = "\n";


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Student's Table");

//        Name column
        TableColumn<students, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

//        studentNumber column
        TableColumn<students, String> studentNumberColumn = new TableColumn<>("Sudent Number");
        studentNumberColumn.setMinWidth(150);
        studentNumberColumn.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));

//        courseName column
        TableColumn<students, String> courseNameColumn = new TableColumn<>("Course Name");
        courseNameColumn.setMinWidth(150);
        courseNameColumn.setCellValueFactory(new PropertyValueFactory<>("courseName"));

//        courseID column
        TableColumn<students, String> courseIDColumn = new TableColumn<>("Course ID");
        courseIDColumn.setMinWidth(150);
        courseIDColumn.setCellValueFactory(new PropertyValueFactory<>("courseID"));

//        houseNumber column
        TableColumn<students, String> houseNumberColumn = new TableColumn<>("House Number");
        houseNumberColumn.setMinWidth(150);
        houseNumberColumn.setCellValueFactory(new PropertyValueFactory<>("houseNumber"));

//        streetName Column
        TableColumn<students, String> streetNameColumn = new TableColumn<>("Street Name");
        streetNameColumn.setMinWidth(150);
        streetNameColumn.setCellValueFactory(new PropertyValueFactory<>("streetName"));

//        town column
        TableColumn<students, String> townColumn = new TableColumn<>("Town");
        townColumn.setMinWidth(150);
        townColumn.setCellValueFactory(new PropertyValueFactory<>("town"));

//        postCode column
        TableColumn<students, String> postCodeColumn = new TableColumn<>("Post Code");
        postCodeColumn.setMinWidth(150);
        postCodeColumn.setCellValueFactory(new PropertyValueFactory<>("postCode"));


//        name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setPrefWidth(100);

        //        studentNumber input
        studentNumberInput = new TextField();
        studentNumberInput.setPromptText("Student Number");
        studentNumberInput.setPrefWidth(100);

        //        courseName input
        courseNameInput = new TextField();
        courseNameInput.setPromptText("Course Name");
        courseNameInput.setPrefWidth(100);

        //        courseID input
        courseIDInput = new TextField();
        courseIDInput.setPromptText("Course ID");
        courseIDInput.setPrefWidth(100);

        //        houseNumber input
        houseNumberInput = new TextField();
        houseNumberInput.setPromptText("House Number");
        houseNumberInput.setPrefWidth(100);

        //        streetName input
        streetNameInput = new TextField();
        streetNameInput.setPromptText("Street Name");
        streetNameInput.setPrefWidth(100);

        //        town input
        townInput = new TextField();
        townInput.setPromptText("Town");
        townInput.setPrefWidth(100);

        //        postCode input
        postCodeInput = new TextField();
        postCodeInput.setPromptText("Post Code");
        postCodeInput.setPrefWidth(100);




//add every field in the table
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, studentNumberColumn, courseNameColumn, courseIDColumn, houseNumberColumn, streetNameColumn, townColumn, postCodeColumn);


        // button to add question
        Button addStudent = new Button("Add");
        addStudent.setOnAction(e -> addSudentClicked());

        // button to delete question
        Button delStudent = new Button("Delete");
        delStudent.setOnAction(e-> delStudentClicked());

        //button to save changes
        Button saveBtn = new Button("Save");
        saveBtn.setOnAction(e-> saveBtnClicked());

        // Search input
        searchInput = new TextField();
        searchInput.setPromptText("Search");
        searchInput.setMinWidth(100);




//add the input fields to the hbox
        HBox hbox = new HBox();
        hbox.setPadding( new Insets(10,10,10,10));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(nameInput, studentNumberInput, courseNameInput, courseIDInput, houseNumberInput, streetNameInput, townInput,postCodeInput,addStudent, delStudent,saveBtn );

//add everything to the vbox
        VBox vBox = new VBox();
        vBox.getChildren().addAll( table, hbox, searchInput);

//search table
        searchInput.setOnKeyReleased(e ->{
            searchInput.textProperty().addListener(((observable, oldValue, newValue) -> {
                filteredData.setPredicate((Predicate<? super students>) Students ->{
                    if (newValue == null || newValue.isEmpty()){
                        return true;
                    }
                    String lowCaseSearch = newValue.toLowerCase();
                    if (Students.getName().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getStudentNumber().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getCourseName().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getCourseID().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }

                    if (Students.getHouseNumber().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getStreetName().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getTown().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    if (Students.getPostCode().toLowerCase().contains(lowCaseSearch)){
                        return true;
                    }
                    return false;
                });
            }));
            SortedList<students> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(table.comparatorProperty());
            table.setItems(sortedData);
        });


        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Get all of the students from the file
    public ObservableList<students> getProduct(){
        String fileName = "students.txt";
        File file = new File (fileName);
        try {
            Scanner inputStreams = new Scanner(file);
            while (inputStreams.hasNext()){
                String line = inputStreams.nextLine();

                String[] splitted = line.split(",");
                allStudents.add(new students(splitted[0],splitted[1], splitted[2],splitted[3], splitted[4], splitted[5], splitted[6],splitted[7]));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


        return allStudents;

    }
//procedure to delete students
    public void delStudentClicked(){
        allStudents = table.getItems();
        studentsSelected = table.getSelectionModel().getSelectedItems();
        allStudents.removeAll(studentsSelected);
        System.out.println("Deleted");
        Alert alertError = new Alert(Alert.AlertType.INFORMATION);
        alertError.setTitle("Delete");
        alertError.setHeaderText("The student was deleted successfully");
        alertError.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Pressed OK.");}
        });



    }
//add student to the table and use regex to verify the input
    public void addSudentClicked(){
        if (nameInput.getText().matches("^[a-zA-Z\\s]+")&&
                studentNumberInput.getText().matches("^C\\d{6}")&&
                courseNameInput.getText().matches("^[a-zA-Z\\s]+") &&
                courseIDInput.getText().matches("^[A-Z]{2}\\d{4}") &&
                  houseNumberInput.getText().matches("^[0-9]+[a-z]?")&&
                streetNameInput.getText().matches("^[a-zA-Z\\s]+") &&
                townInput.getText().matches("^[a-zA-Z\\s]+") &&
                postCodeInput.getText().matches("^[A-Z]{2}\\d{1}[A-Z]{2}"))
        {

            students Student = new students();
            Student.setName(nameInput.getText());
            Student.setStudentNumber(studentNumberInput.getText());
            Student.setCourseName(courseNameInput.getText());
            Student.setCourseID(courseIDInput.getText());
            Student.setHouseNumber(houseNumberInput.getText());
            Student.setStreetName(streetNameInput.getText());
            Student.setTown(townInput.getText());
            Student.setPostCode(postCodeInput.getText());




            String name = nameInput.getText();
            String studentNumber = studentNumberInput.getText();
            String courseName = courseNameInput.getText();
            String courseID = courseIDInput.getText();
            String houseNumber = houseNumberInput.getText();
            String streetName = streetNameInput.getText();
            String town = townInput.getText();
            String postCode = postCodeInput.getText();

            table.getItems().add(Student);
//add the student to the list
            newListStudents.add(new students(name,studentNumber,courseName,courseID,houseNumber,streetName,town, postCode));
//clear the input fields for the next input
            nameInput.clear();
            studentNumberInput.clear();
            courseNameInput.clear();
            courseIDInput.clear();
            houseNumberInput.clear();
            streetNameInput.clear();
            townInput.clear();
            postCodeInput.clear();
            System.out.println(newListStudents);
            //save the file with the new inputed file
            try {
                FileWriter fileWriter = new FileWriter("students.txt", true);//true is to overwrite the existing file

                for (students q: newListStudents){

                    fileWriter.append(q.getName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getStudentNumber());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getCourseName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getCourseID());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getHouseNumber());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getStreetName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getTown());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(q.getPostCode());
                    fileWriter.append(NEW_LINE_SEPARATOR);


                }
                fileWriter.flush();
                fileWriter.close();

                System.out.println("Student added");



            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
//message box to show that the input entered by the user was not valid
        else {
            System.out.println("error");
            Alert alertError = new Alert(Alert.AlertType.ERROR);
            alertError.setTitle("Error");
            alertError.setHeaderText("Invalid input");
            alertError.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");}
            });
        }

    }

    //same as above so that the table will be saved in the txt file
    public void saveBtnClicked(){
        try {
            FileWriter filesaver = new FileWriter("students.txt");
            System.out.println("Saved button pressed");
            System.out.println(allStudents);
            for (students q : allStudents){
                filesaver.append(q.getName());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getStudentNumber());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getCourseName());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getCourseID());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getHouseNumber());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getStreetName());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getTown());
                filesaver.append(COMMA_DELIMITER);
                filesaver.append(q.getPostCode());
                filesaver.append(NEW_LINE_SEPARATOR);
            }
            filesaver.flush();
            filesaver.close();
            System.out.println("Saved");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Save  ");
            alert.setHeaderText("Students saved successfully");
//            alert.setContentText("Preferences added successfully" );
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");}
            });


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




}