package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by dengtianyue on 2017/8/28.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
