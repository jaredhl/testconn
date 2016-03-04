package models;

import javax.persistence.*;
import com.avaje.ebean.Model;
import java.awt.*;
import org.apache.commons.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Exception;

import play.mvc.*;
import play.mvc.Http.*;
import play.data.*;

@Entity
public class Image extends Model{

    //TODO: image type doesn't check image type
    /*public static enum ImageType {
        GIF("uploadPicture/gif"),
        PNG("uploadPicture/png"),
        JPEG("uploadPicture/jpeg");

        public String contentType;

        private ImageType(String contentType) {
            this.contentType = contentType;
        }

        public static ImageType get(String contentType) {
            for (ImageType type: values()) {
                if (type.contentType.equals(contentType)) {
                    return type;
                }
            }
            return null;
        }
    }*/

    //image form generates a tag (long) for that image on upload, which gets associated with the user
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long internalId;

    //the file for this picture, stored on the filesystem
    @Basic
    @Lob
    public byte[] pic;

    //path to file (not sure why we need both, but it works)
    public String filePath;

    //find images by ID in database, used to retrieve images
    public static Finder<Long, Image> find = new Finder<Long, Image>(Image.class);

    public void picToByte(File f){
        try{
            this.pic = FileUtils.readFileToByteArray(f);
        } catch (Exception e){
            //fuck
        }
    }

    //return the file associated with this Image
    public File pic() {
        File f = new File("picture");
        try{
            FileUtils.writeByteArrayToFile(f, pic);
            return f;
        }
        catch(Exception e) {
            return new java.io.File("fuck");
        }
    }

    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }
}