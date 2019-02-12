package com.nguyendinhdoan.toeic.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "m_listen_guide_line")
public class ListenGuideLineDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LISTEN_GUIDE_LINE_CODE")
    private int listenGuideLineCode;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "IAMGE")
    private String iamge;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;
    @Column(name = "MODIDY_DATE")
    private Timestamp modifyDate;
    @OneToMany(mappedBy = "listenGuideLineDTO", fetch = FetchType.LAZY)
    private List<CommentDTO> commentList;
}
