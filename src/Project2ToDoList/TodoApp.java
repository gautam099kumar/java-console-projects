package Project2ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    //shows Menu

    static void showMenu(){
        System.out.println("\n1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Update Task");
        System.out.println("5. Exit");
    }
    //ask task to add

    static void addTask(Scanner sc,ArrayList<String> tasks){
        System.out.println("Enter yours task 1");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added");
    }
    // view tasks
    static  void viewTasks(ArrayList<String> tasks){
          if(tasks.isEmpty()){
              System.out.println("No tasks available");
              return;
          }
        System.out.println("\nYour Tasks:");
          for (int i=0;i< tasks.size();i++){
              System.out.println((i+1)+"."+tasks.get(i));
          }
    }

     // delelte tasks
    static  void deleteTask(Scanner sc,ArrayList<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("No tasks to delete.");
            return;
        }
        viewTasks(tasks);
        System.out.print("Enter task number to delete: ");
        int index = sc.nextInt();

        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.remove((index-1));
        System.out.println("Task removed");

    }
    static void updateTask(Scanner sc,ArrayList<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("Task is empty");
            return;
        }
        viewTasks(tasks);
        System.out.println("Enter the index u want to update and text");
        int updateIndex = sc.nextInt();
        sc.nextLine(); // clear buffer
        if (updateIndex < 1 || updateIndex > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        System.out.println("Enter new task");
        String newTask = sc.nextLine();
        tasks.set(updateIndex-1,newTask);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;
        System.out.println("=== GAUTAM'S TO-DO APP 📝 ===");
        while(running){
            showMenu();
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice==1){
                addTask(sc, tasks);
            }
            else if (choice==2){
                viewTasks(tasks);
            } else if (choice==3) {
                deleteTask(sc, tasks);
                
            }
            else if (choice==4){
                updateTask(sc,tasks);
            }
            else if (choice == 5) {
                System.out.println("App closed 👋");
                running = false;
            }
            else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }
}
