package com.xhs.controller;

import com.xhs.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈款
 * @since 2022/9/3
 */
@RequestMapping("/resume")
@RestController
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @GetMapping("/openstate/{userId}")
    public Integer findDefaultByUserId(@PathVariable Long userId){
        return resumeService.findDefaultResumeByUserId(userId);
    }

}
