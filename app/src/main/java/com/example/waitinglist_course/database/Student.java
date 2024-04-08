package com.example.waitinglist_course.database;

public class Student {

    public static final String TABLE_NAME = "WaitingList";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_STUDENT_NAME = "name";
    public static final String COLUMN_PRIORITY = "priority";

    private int id;
    private String name;
    private String priority;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_STUDENT_NAME + " TEXT,"
                    + COLUMN_PRIORITY + " TEXT"
                    + ")";


    public Student() {
        //Empty constructor
    }


    public Student(int id, String name, String priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getPriority() {
        return priority;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }
}
