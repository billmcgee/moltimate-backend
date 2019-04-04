package org.moltimate.moltimatebackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlignmentRecord {

    @NonNull
    private String pdbId;

    @NonNull
    private String motifId;

    @Id
    @GeneratedValue
    @NonNull
    private int id;

    private LocalDate creationDate;

    @NonNull
    private boolean aligned;
}
