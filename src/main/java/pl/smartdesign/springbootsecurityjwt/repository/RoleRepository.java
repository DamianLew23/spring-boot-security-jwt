package pl.smartdesign.springbootsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.smartdesign.springbootsecurityjwt.models.ERole;
import pl.smartdesign.springbootsecurityjwt.models.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}