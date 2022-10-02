package com.side.toon.domain.file;

import com.side.toon.lib.entity.CreateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "file")
@Setter
@NoArgsConstructor
@Entity
public class File extends CreateDate {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "group_idx")
    private Long groupIdx;

    @Column(name = "origin_name")
    private String originName;

    @Column(name = "host")
    private String host;

    @Column(name = "path")
    private String path;

    @Column(name = "use_at")
    private boolean useAt;
}
