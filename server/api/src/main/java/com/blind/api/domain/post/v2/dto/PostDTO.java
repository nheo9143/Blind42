package com.blind.api.domain.post.v2.dto;

import com.blind.api.domain.board.v1.domain.Board;
import com.blind.api.domain.post.v2.domain.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class PostDTO {
    private Long id;
    private Long authorId;
    private String title;
    private Long commentCnt;
    private Long viewCnt;
    private Long likeCnt;
    private Boolean isNotice;
    private Long blameCnt;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public static PostDTO from(Post post) {
        return PostDTO.builder()
                .id(post.getId())
                .authorId(post.getAuthorId())
                .title(post.getTitle())
                .viewCnt(post.getViewCnt())
                .blameCnt(post.getBlameCnt())
                .likeCnt(post.getLikeCnt())
                .commentCnt(post.getCommentCnt())
                .isNotice(post.getIsNotice())
                .createdDate(post.getCreatedDate())
                .modifiedDate(post.getModifiedDate())
                .build();
    }

    @Builder
    private PostDTO(Long id, Long authorId, String title, Long commentCnt, Long viewCnt, Long likeCnt, Boolean isNotice, Long blameCnt, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.commentCnt = commentCnt;
        this.viewCnt = viewCnt;
        this.likeCnt = likeCnt;
        this.isNotice = isNotice;
        this.blameCnt = blameCnt;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}