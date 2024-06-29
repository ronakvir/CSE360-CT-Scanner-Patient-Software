module cse_360_group_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse_360_hw_4 to javafx.fxml;
    exports cse_360_hw_4;
    exports cse_360_hw_4.Controllers;
    opens cse_360_hw_4.Controllers to javafx.fxml;
    exports cse_360_hw_4.Lib;
    opens cse_360_hw_4.Lib to javafx.fxml;
    exports cse_360_hw_4.Objects;
}