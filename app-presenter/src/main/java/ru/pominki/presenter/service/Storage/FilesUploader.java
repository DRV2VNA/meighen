package ru.pominki.presenter.service.Storage;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
import ru.pominki.presenter.model.CommitModel;

public interface FilesUploader {

    public boolean upload(MultipartFile file, CommitModel commitModel);
    public CommitModel createFolder() throws IOException;
}