package com.creppyfm.videogames.controller;

import com.creppyfm.videogames.model.Review;
import com.creppyfm.videogames.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping()
    public ResponseEntity<Review> createReview (@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Review>(
                reviewService.
                    createReview(payload.
                            get("reviewBody"), payload.
                            get("gameId")), HttpStatus.OK);
    }

//    @DeleteMapping("/api/v1/reviews/{imdbId}")
//    public void deleteReview (@RequestBody String ObjectId) {
//        ResponseEntity<Review> reviewResponseEntity;
//        reviewService.deleteReview(ObjectId);
//    }
}
