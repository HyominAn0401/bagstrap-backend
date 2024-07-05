package com.bagstrap.controller;

import com.bagstrap.pdf.PdfService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.ByteArrayInputStream;

public class PdfController {

    private PdfService pdfService;

    public ResponseEntity<InputStreamResource> generatePdf(@PathVariable String content){
        ByteArrayInputStream bis = pdfService.createPdf(content);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=bagstrapCV.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
}
