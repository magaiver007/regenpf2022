package com.movies.acmeflix.model;
import com.movies.acmeflix.base.BaseModel;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="SEASONS")
@SequenceGenerator(name = "idGenerator", sequenceName = "SEASONS_SEQ", initialValue = 1, allocationSize = 1)

public class Season extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    private Series series;
    @Min(1)
    private int seasonNumber;
    @OneToMany (fetch=FetchType.LAZY,mappedBy = "season",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Episode> episodes =  new HashSet<>();
}
