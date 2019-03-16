package pl.edu.wszib.todolist.springtodolist;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import java.util.List;

@Repository
public interface TodoDao extends CrudRepository<Todo, Integer> {

    List<Todo> findAll();
    List<Todo> findTop5ByStatusIsNotOrderByDueDateAsc(Status status);
    int countAllByStatusIs(Status status); //BO
    List<Todo> findAllByStatusIs(Status status);

   // @Query("select t from Todo t where t.status not like 'COMPLITED' order by t.dueDate desc")
   // List<Todo> query ();

}
