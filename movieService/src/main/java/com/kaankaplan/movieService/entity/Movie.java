package com.kaankaplan.movieService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movieId;
    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private boolean isDisplay;
    private String movieTrailerUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne(mappedBy = "movie")
    private MovieImage image;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    @OneToMany(mappedBy = "movie")
    private List<Actor> actors;

    @OneToMany(mappedBy = "movie")
    private List<City> cities;

    @OneToMany(mappedBy = "movie")
    private List<Comment> comments;
}


//@Component
//class DirectorEntityLoader implements CommandLineRunner {
//
//    @Autowired
////    TypingRepo typingRepo;
//
//    /**
//     *
//     * creates default user with id=1, username=user@user.at, password=user1234
//     */
//    @Override
//    public void run(String... args) {
//        if (typingRepo.findAll().isEmpty()) {
//            String[] wordlist = {"and", "but", "cat", "dog", "run", "fun", "hop", "top", "hat", "eat",
//                    "pat", "rat", "bit", "sit", "map", "lip", "cap", "lap", "pen", "hen",
//                    "gem", "sun", "one", "two", "red", "led", "fog", "jog", "bug", "mug",
//                    "dig", "pig", "jog", "log", "zap", "yap", "nap", "sap", "dad", "add",
//                    "ice", "ace", "den", "men", "wet", "jet", "hit", "pit", "lot", "dot",
//                    "rot", "cut", "hut", "nut", "bun", "fun", "mud", "bud", "hot", "dot",
//                    "pot", "got", "jog", "jog", "box", "fox", "mix", "fix", "bag", "rag",
//                    "tag", "jam", "ram", "dam", "ham", "jar", "car", "bar", "tar", "par",
//                    "bat", "rat", "fat", "cat", "hat", "mat", "pat", "sat", "vat", "bet",
//                    "pet", "get", "set", "jet", "let", "met", "net", "wet", "yet", "hum",
//                    "gum", "sum", "rum", "bum", "run", "sun", "fun", "bun", "nun", "gun"};
//            String word;
//            for(int i = 0; i < wordlist.length; i++) {
//                word = wordlist[i];
//                TypingEntity entity = new TypingEntity();
//                entity.setWord(word);
//                typingRepo.save(entity);
//            }
//        }
//
//    }
//}

