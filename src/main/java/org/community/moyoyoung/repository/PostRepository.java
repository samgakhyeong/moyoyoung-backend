package org.community.moyoyoung.repository;

import org.community.moyoyoung.dto.PostMiniDTO;
import org.community.moyoyoung.entity.Group;
import org.community.moyoyoung.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select p, mu from Post p left join p.myUser mu where p.delFlag = false")
    Page<Object[]> selectList(Pageable pageable);

}
