package com.xhs.service.impl;

import com.xhs.service.ResumeService;
import org.springframework.stereotype.Service;

/**
 * @author 陈款
 * @since 2022/9/3
 */
@Service
public class ResumeServerImpl implements ResumeService {
    public Integer findDefaultResumeByUserId(Long userId){
        return userId.intValue() +10;
    }
}
