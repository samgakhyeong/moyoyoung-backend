
package org.community.moyoyoung.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

// 양수연
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostListDTO {

    private Long id;
    private String title;
    private String name;
    private String nickname;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDate;


}
