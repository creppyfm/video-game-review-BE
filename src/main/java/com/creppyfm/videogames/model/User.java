package com.creppyfm.videogames.model;

import com.creppyfm.videogames.model.Game;
import com.creppyfm.videogames.model.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @DocumentReference
    private List<Review> reviews;
    @DocumentReference
    private List<String> watchlist;
    @DocumentReference
    private List<Game> watchlistGame;
    private String gameId;


    public User (String userId, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}


//ALSO, LOOK BACK AT CREATING ENV VARIABLES TO HOLD GOOGLE OAUTH KEYS
//ALSO, LOOK BACK AT ASSIGNING CLASSES TO COLLECTIONS EX: ADD USERS TO 'USERS' COLLECTION
