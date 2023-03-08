package repository;

import domain.dto.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarkRepository extends CrudRepository<Mark, Long> {
    @Override
    List<Mark> findAll();

    @Override
    Optional<Mark> findById(Long markId);

    @Override
    Mark save(Mark mark);

    @Override
    void deleteById(Long markId);
}