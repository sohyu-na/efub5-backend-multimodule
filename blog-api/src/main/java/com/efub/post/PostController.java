package com.efub.post;

import com.efub.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public String create(@RequestBody Post post) {
        Post returnPost = postService.create(post);
        return "name : " + returnPost.getTitle() + " post 생성 완료";
    }

    @GetMapping("/{id}")
    public Post find(@PathVariable Long id) {
        return postService.find(id);
    }
}