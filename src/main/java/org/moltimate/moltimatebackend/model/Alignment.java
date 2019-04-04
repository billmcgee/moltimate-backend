package org.moltimate.moltimatebackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.List;

/**
 * Represents the results of performing a single alignment between two active sites.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alignment {

    private String motifPdbId;
    private List<Residue> activeSiteResidues;
    private List<Residue> alignedResidues;
    private int minDistance;
    private int maxDistance;
    private double rmsd;
    private String ecNumber;
}
