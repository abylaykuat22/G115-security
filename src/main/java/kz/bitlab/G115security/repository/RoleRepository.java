package kz.bitlab.G115security.repository;

import kz.bitlab.G115security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  @Query("select r from Role r where r.name = 'ROLE_USER'")
  Role getRoleUser();

}
