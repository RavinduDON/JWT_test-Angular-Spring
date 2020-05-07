package lk.cyberston.v1.cyberston.repository;

import lk.cyberston.v1.cyberston.models.Role;
import lk.cyberston.v1.cyberston.models.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findById(UserRoles name);
}
