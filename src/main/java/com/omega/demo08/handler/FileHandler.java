package com.omega.demo08.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Class FileHandler
 *
 * @author KennySo
 * @date 2024/7/18
 */
@Controller
@RequestMapping("/file")
public class FileHandler {

    private final String FILE_DOWNLOAD_PATH = "/demo07/download/test.png";
    private final String FILE_UPLOAD_PATH = "/demo07/upload/";

    /**
     * 下载文件
     */
    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFile(HttpServletRequest request,
                                               HttpServletResponse response) {
        ServletContext servletContext = request.getServletContext();
        try {
            InputStream inputStream = servletContext.getResourceAsStream(FILE_DOWNLOAD_PATH);
            // 创建一个 byte 数组, 可以支持存放二进制文件 [图片, 视频]
            // available() 可以获取文件的大小
            byte[] bytes = new byte[inputStream.available()];
            // 将文件数据读入到 byte[]
            inputStream.read(bytes);

            // 封装响应头
            HttpHeaders headers = new HttpHeaders();
            headers.add("content-type", servletContext.getMimeType(FILE_DOWNLOAD_PATH));
            headers.add("Content-Disposition", "inline;filename=test.jpg");

            // 封装响应
            return new ResponseEntity<> (bytes, headers, HttpStatus.OK);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 上传文件
     */
    @RequestMapping("/upload")
    public String fileUpload(@RequestParam(value="file") MultipartFile file,
                             HttpServletRequest request,
                             HttpServletResponse response) throws IOException {
        String originalFilename = file.getOriginalFilename();
        // 得到要上传文件要保存的路径
        String filePath = request.getServletContext().getRealPath(FILE_UPLOAD_PATH + originalFilename);
        File saveToFile = new File(filePath);
        // MultipartFile 封装了 fileItem.write() 方法, 把获取到的文件拷贝到目标文件
        file.transferTo(saveToFile);
        return "upload_success";
    }
}
