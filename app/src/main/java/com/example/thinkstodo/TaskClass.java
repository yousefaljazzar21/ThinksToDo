package com.example.thinkstodo;

public class TaskClass {

    private String taskName;
    private Boolean isChecked;

    public TaskClass() {
    }

    public TaskClass(String taskName, Boolean isChecked) {
        this.taskName = taskName;
        this.isChecked = isChecked;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean checked) {
        isChecked = checked;
    }


}
