package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //GIVEN
        TaskList taskList = new TaskList("ToDoList", "TaskList: Learn Hibernate");
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();
        //WHEN
        List<TaskList> readTaskLists = taskListDao.findByListName(taskListName);
        //THEN
        assertEquals(1, readTaskLists.size());
        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
