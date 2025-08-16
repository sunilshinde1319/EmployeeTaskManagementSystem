package in.fspl.taskservice.service;



import java.util.List;

import in.fspl.taskservice.model.Task;

public interface TaskService {
	
    Task saveTask(Task task);
    
    
    List<Task> getAllTasks();
    
    
    Task getTaskById(Long id);
    
    
    void deleteTask(Long id);
    
    
}
