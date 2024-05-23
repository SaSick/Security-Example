package com.mxrxss.todo.repository;

import com.mxrxss.todo.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM task t WHERE t.user_id = :userId AND t.task_id = :taskId", nativeQuery = true)
    Optional<Task> findByUserAndTask(@Param("userId") Long userId, @Param("taskId") Long taskId);

    @Query(value = "SELECT * FROM task t WHERE t.user_id = :userId", nativeQuery = true)
    List<Task> findAllByUserId(@Param("userId") Long userId);
}
