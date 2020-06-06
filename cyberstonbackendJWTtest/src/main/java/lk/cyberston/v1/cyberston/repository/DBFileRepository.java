package lk.cyberston.v1.cyberston.repository;

import lk.cyberston.v1.cyberston.models.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile,String> {
}
