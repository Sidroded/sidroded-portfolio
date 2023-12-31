package com.example.sidrodedportfolio.controllers;

import com.example.sidrodedportfolio.database.repository.PostRepository;
import com.example.sidrodedportfolio.models.Post;
import com.example.sidrodedportfolio.utils.MarkdownConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/portfolio")
    public String blog(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "portfolio-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogAddPost(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, @RequestParam int priority, @RequestParam String image_link_1, @RequestParam String image_link_2, @RequestParam String image_link_3, @RequestParam String git_hub_link, Model model) {
        Post post = new Post(title, anons, full_text, image_link_1, image_link_2, image_link_3, git_hub_link, priority);
        postRepository.save(post);
        return "redirect:/portfolio";
    }

    @GetMapping("/portfolio/{id}")
    public String blogDetails(@PathVariable(value = "id") String id, Model model) {
        if (!postRepository.existsById(id)) {
            return "redirect:/portfolio";
        }

        Post post = postRepository.findById(id).orElseThrow();
        post.setViews(post.getViews() + 1);
        String markdownFullProjectText = post.getFull_text();
        String htmlFullText = MarkdownConverter.convertToHtml(markdownFullProjectText);
        postRepository.save(post);
        model.addAttribute("htmlFullText", htmlFullText);
        model.addAttribute("post", post);
        return "portfolio-details";
    }

    @GetMapping("/portfolio/{id}/edit")
    public String blogEdit(@PathVariable(value = "id") String id, Model model) {
        if (!postRepository.existsById(id)) {
            return "redirect:/portfolio";
        }

        Optional<Post> post = postRepository.findById(id);
        List<Post> postArr = new ArrayList<>();
        post.ifPresent(postArr::add);
        model.addAttribute("post", postArr);
        return "portfolio-edit";
    }

    @PostMapping("/portfolio/{id}/edit")
    public String blogEditPost(@PathVariable(value = "id") String id, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text) {
        Post post = postRepository.findById(id).orElseThrow();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        postRepository.save(post);
        return "redirect:/portfolio/" + id;
    }

    @PostMapping("/portfolio/{id}/delete")
    public String blogRemovePost(@PathVariable(value = "id") String id) {
        postRepository.deleteById(id);
        return "redirect:/portfolio";
    }
}
