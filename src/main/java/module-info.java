module org.example.flight_training_academy {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.flight_training_academy to javafx.fxml;
    exports org.example.flight_training_academy;
    exports Exam_Evaluator;
    opens Exam_Evaluator to javafx.fxml;
    exports Finance_Officer;
    opens Finance_Officer to javafx.fxml;

    opens Shrabony to javafx.fxml;
    exports Shrabony;
}