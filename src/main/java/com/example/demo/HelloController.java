package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/{bucketName}/{objectKey}")
    public String getPresignedUrl(@PathVariable("bucketName") String bucketName,
                                  @PathVariable("objectKey") String objectKey) {
        return GeneratePresignedURL.presignUrl(bucketName, objectKey);
    }

}
