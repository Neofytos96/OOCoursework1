//Neofytos Neokleous
//C1615033

public class students {

    private String name;
    private String studentNumber;
    private String courseName;
    private String courseID;
    private String houseNumber;
    private String streetName;
    private String town;
    private String postCode;



    public students(){
        this.name = "";
        this.studentNumber = "";
        this.courseName = "";
        this.courseID = "";
        this.houseNumber = "";
        this.streetName = "";
        this.town = "";
        this.postCode = "";


    }

    public students(String name, String studentNumber, String courseName, String courseID,
                    String houseNumber, String streetName, String town, String postCode ){
        this.name = name;
        this.studentNumber = studentNumber;
        this.courseName = courseName;
        this.courseID = courseID;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.town = town;
        this.postCode = postCode;

    }

    //getter and setter methods for every column of the table
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}