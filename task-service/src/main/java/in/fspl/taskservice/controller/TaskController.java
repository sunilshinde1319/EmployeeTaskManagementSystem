package in.fspl.taskservice.controller;

import in.fspl.taskservice.model.Task;
import in.fspl.taskservice.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller  // ✅ FIXED: Use @Controller for Thymeleaf
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepo;

    // List all tasks
    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskRepo.findAll());
        return "task-list";
    }

    // Show form to create new task
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("task", new Task());
        return "task-form";
    }

    // Save new or updated task
    @PostMapping
    public String saveTask(@ModelAttribute("task") Task task) {
        taskRepo.save(task);
        return "redirect:/tasks";
    }

    // Edit existing task
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Task> optionalTask = taskRepo.findById(id);
        if (optionalTask.isPresent()) {
            model.addAttribute("task", optionalTask.get());
            return "task-form";
        } else {
            return "redirect:/tasks";
        }
    }

    // Delete task
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskRepo.deleteById(id);
        return "redirect:/tasks";
    }

    // View tasks by employee
    @GetMapping("/employee/{employeeId}")
    public String viewTasksByEmployee(@PathVariable Long employeeId, Model model) {
        model.addAttribute("tasks", taskRepo.findByEmployeeId(employeeId));
        return "task-list";
    }

    // Update only task status
    @PostMapping("/update-status/{id}")
    public String updateTaskStatus(@PathVariable Long id, @RequestParam("status") Task.Status status) {
        Optional<Task> optionalTask = taskRepo.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setStatus(status);
            taskRepo.save(task);
        }
        return "redirect:/tasks";
    }
}
