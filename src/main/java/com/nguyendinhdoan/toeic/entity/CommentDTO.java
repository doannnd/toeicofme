package com.nguyendinhdoan.toeic.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "m_comment")
public class CommentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_CODE")
    private int commentCode;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;
    @ManyToOne
    @JoinColumn("USER_ID")
    private UserDTO userDTO;
    @ManyToOne
    @JoinColumn("LISTEN_GUIDE_LINE_CODE")
    private ListenGuideLineDTO listenGuideLineDTO;

    public int getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(int commentCode) {
        this.commentCode = commentCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public ListenGuideLineDTO getListenGuideLineDTO() {
        return listenGuideLineDTO;
    }

    public void setListenGuideLineDTO(ListenGuideLineDTO listenGuideLineDTO) {
        this.listenGuideLineDTO = listenGuideLineDTO;
    }
}
