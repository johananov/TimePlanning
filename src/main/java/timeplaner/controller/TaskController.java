package timeplaner.controller;


import timeplaner.gui.layouts.TaskLayout;
import timeplaner.plugin.LocalSession;
import timeplaner.documents.subdocuments.impl.Task;
import javafx.scene.Parent;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;


public class TaskController {


    private LocalSession localSession;

    public TaskController(LocalSession localSession) {
        this.localSession = localSession;
    }

    private Task getTaskById(int taskId) {
        try {
            try {
                return localSession.findTaskById(taskId);
            } catch (IOException e) {
                System.out.println("Task with Id: " + taskId + " was not found");
            } catch (ClassNotFoundException e) {
                System.out.println("Not correct type for Id: " + taskId);
            }
        } catch (ParseException e) {
            System.out.println("task was not found");
        }
        return null;
    }

    public Task returnTaskById(int taskId) {
        return getTaskById(taskId);

    }

//    public Parent returnNewTaskParent(){
//        Date date = new Date();
//        long id = date.getTime();
//
//        taskLayout = new TaskLayout();
//        return taskLayout.returnNewTaskParent();
//    }

    public void saveTask(Task task){
        try {
            System.out.println("Try to save task with Id:" +task.getId());
            localSession.saveTask(task);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}