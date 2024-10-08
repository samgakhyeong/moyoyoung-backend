package org.community.moyoyoung.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
// 김용
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeetingDTO {

    private Long id;
    private String title;
    private String meetingDate;
    private String content;
    private LocalDate createDate;
    private String nickname;
    private String name;

//    private Post post;

    private Long groupId;
}
