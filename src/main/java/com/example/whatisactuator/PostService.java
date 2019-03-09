package com.example.whatisactuator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class PostService {

    @Autowired
    PostRepository postRepository;

    @GetMapping(value = "/")
    public String index(){
        return "hello world!";
    }

    @GetMapping(value = "/test")
    public String indextest(){
        return "test hello world!";
    }


    @GetMapping(value = "/new")
    public List<Post> neww(){
        Post post = new Post();
        post.setTitle("abc");
        post.setContent("asdf");
        postRepository.save(post);
        List<Post> list = postRepository.findAll();
        return list;
    }
}
