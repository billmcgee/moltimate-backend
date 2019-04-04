package org.moltimate.moltimatebackend.repository;

import org.moltimate.moltimatebackend.model.AlignmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlignmentRepository extends JpaRepository<AlignmentRecord, String> {
    AlignmentRecord findByMotifIdAndPdbId(String motifId, String pdbId);
}
