package com.trello.trello.Repository;


import com.trello.trello.Entity.SiteUserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface SiteUserRepository extends JpaRepository<SiteUserEntity,Integer> {

    //lay danh sach user
    @Query(value = "select u.name, u.email, u.image, u.password, u.signup_date, u.status " +
            "from site_user u " +
            "where u.role = 'user' and  u.status = 'active' ",nativeQuery = true)
    Page<Object[]> findAllUserActive(Pageable pageable);

}
