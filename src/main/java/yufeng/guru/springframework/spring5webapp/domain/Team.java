/*
 * This file is generated by jOOQ.
 */
package yufeng.guru.springframework.spring5webapp.domain;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(
    name = "team",
    schema = "springbootdb",
    uniqueConstraints = {
        @UniqueConstraint(name = "KEY_team_PRIMARY", columnNames = { "TEAM_NAME" })
    }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    @NotNull
    private Integer          id;
    
    @Column(name = "TEAM_NAME", nullable = false, length = 40)
    @NotNull
    @Size(max = 40)
    private String        teamName;
    
    @Column(name = "CONFERENCE", nullable = false, length = 40)
    @NotNull
    @Size(max = 40)
    private String        conference;
    
    @Column(name = "DIVISION", nullable = false, length = 40)
    @NotNull
    @Size(max = 40)
    private String        division;
    
    @Column(name = "DESCRIPTION", length = 500)
    @Size(max = 500)
    private String        description;
    
    @Column(name = "COACH_NAME", length = 40)
    @Size(max = 40)
    private String        coachName;
    
    @Column(name = "CREATE_DATE")
//    @Builder.Default 
//    private LocalDateTime createDate = LocalDateTime.now();
    @CreationTimestamp
    private LocalDateTime createDate;
    
    /**
     * 使用@Builder.Default時，不用自己建立無參數的constructor，否則@Builder.Default不會生效
     * @param value
     */
//    public Team() {}

//    public Team(Team value) {
//    	this.id = value.id;
//        this.teamName = value.teamName;
//        this.conference = value.conference;
//        this.division = value.division;
//        this.description = value.description;
//        this.coachName = value.coachName;
//        this.createDate = value.createDate;
//    }

}