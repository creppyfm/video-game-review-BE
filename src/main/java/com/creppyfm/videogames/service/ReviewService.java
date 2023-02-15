package com.creppyfm.videogames.service;

import com.creppyfm.videogames.model.Game;
import com.creppyfm.videogames.model.Review;
import com.creppyfm.videogames.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String gameId) {
        Review review = reviewRepository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        mongoTemplate.update(Game.class)
                .matching(Criteria.where("gameId").is(gameId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }

//    public void deleteReview (String ObjectId) {
//        mongoTemplate.remove(Review.class)
//                .matching(Criteria.where("id").is(ObjectId));
//    }
}
