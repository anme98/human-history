package de.anybytes.humanhistorybackend.controller;

import de.anybytes.humanhistorybackend.entity.Image;
import de.anybytes.humanhistorybackend.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1")
class ImageController {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @GetMapping(value="/image/{imageId}")
    public ResponseEntity<byte[]> getImageById(@PathVariable("imageId") Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return image.map(value -> ResponseEntity.ok().contentType(MediaType.valueOf(value.getType())).body(value.getImageAsByte())).orElse(null);
    }

    @GetMapping(value = "/image/details/{imageId}")
    public ResponseEntity<Image> getImageEntityById(@PathVariable("imageId") Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return ResponseEntity.ok(image.orElse(null));
    }

    @GetMapping(value = "/image")
    public ResponseEntity<List<Image>> getAllImages() {
        return ResponseEntity.ok( (List<Image>) imageRepository.findAll());
    }

    @PostMapping(value = "/image")
    public Long uploadImage2(@RequestParam MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setType(file.getContentType());
        image.setImageAsByte(file.getBytes());
        return imageRepository.save(image).getId();
    }

}
