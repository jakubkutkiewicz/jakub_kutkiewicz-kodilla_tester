package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

        @Autowired
        private TaskListRepository tasklistRepository;

        private static final String DESCRIPTION = "Test: testFindByListName";

        @Test
        public void testFindByListName() {

            //Given

            TaskList taskList = new TaskList("zadania2", DESCRIPTION);
            tasklistRepository.save(taskList);
            String listName = taskList.getListName();

            //When

            List<TaskList> readTaskList = tasklistRepository.findByListName(listName);

            //Then
            Assert.assertEquals(1, readTaskList.size());

            //CleanUp
            int id = readTaskList.get(0).getId();
            tasklistRepository.deleteById(id);
        }
    }

