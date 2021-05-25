package platform.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import platform.model.Code;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodeRepository extends CrudRepository<Code, String> {
    Optional<Code> findById(String id);
    void deleteById(String id);
    List<Code> findFirst10ByTimeLessThanEqualAndViewsLessThanEqualOrderByCreateDateDesc(long time, long views);
}
