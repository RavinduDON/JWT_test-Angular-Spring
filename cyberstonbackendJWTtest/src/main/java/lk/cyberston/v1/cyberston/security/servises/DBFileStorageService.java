package lk.cyberston.v1.cyberston.security.servises;

import lk.cyberston.v1.cyberston.exception.FileStorageException;
import lk.cyberston.v1.cyberston.exception.MyFileNotFoundException;
import lk.cyberston.v1.cyberston.models.DBFile;
import lk.cyberston.v1.cyberston.repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;

    public DBFile storeFile(MultipartFile file){
        String fileName= StringUtils.cleanPath(file.getOriginalFilename());

        try {
        if(fileName.contains("..")){
            throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
        }

            DBFile dbFile=new DBFile(fileName,file.getContentType(),file.getBytes());

        return  dbFileRepository.save(dbFile);
        } catch (IOException e) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", e);
        }
    }

    public DBFile getFile(String fileId){
        return dbFileRepository.findById(fileId).orElseThrow(()->new MyFileNotFoundException("File not found with id " + fileId));
    }

}
