package org.moltimate.moltimatebackend.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.moltimate.moltimatebackend.dto.MakeMotifRequest;
import org.moltimate.moltimatebackend.util.FileUtils;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/download")
@Slf4j
public class FileController {

    /**
     * Creates a new .motif file
     */
    @ApiOperation(value = "Creates a new .motif file")
    @RequestMapping(
            value = "/motif",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
    )
    public ResponseEntity<Resource> createMotif(@RequestBody MakeMotifRequest makeMotifRequest) {
        log.info("Received request to make a motif: " + makeMotifRequest);
        return FileUtils.createMotifFile(makeMotifRequest);
    }
}
