package com.leanthoughts.sky.resources;

import java.util.Date;

/**
 * @author ffazil
 * @since 26/08/15
 */
public class FileReferenceResource {
    private String fileReference;
    private Date created;

    public FileReferenceResource(String fileReference){
        this.fileReference = fileReference;
        this.created = new Date();
    }

    public String getFileReference() {
        return fileReference;
    }

    public void setFileReference(String fileReference) {
        this.fileReference = fileReference;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
