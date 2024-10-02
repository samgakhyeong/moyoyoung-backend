package org.community.moyoyoung.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.community.moyoyoung.entity.Comment;
import org.community.moyoyoung.entity.Meeting;
import org.community.moyoyoung.entity.MyUser;
import org.community.moyoyoung.entity.PostImage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDTO {

    private Long id; // 글번호
    private String userNickname;
    private String name;
    private String title; // 글제목
    private String content; // 글내용
    private LocalDateTime dueDate; // 작성일자

    private PostImage postImage;

    private List<Comment> commentList;

    private MyUser myUser;
}
