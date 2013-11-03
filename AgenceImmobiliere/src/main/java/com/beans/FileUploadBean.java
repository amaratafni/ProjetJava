package com.beans;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.File;

/**
 * @author Ilya Shaikovsky
 * 
 */
@Controller( "fileUploadBean" )
@Scope( "session" )
public class FileUploadBean {

    private ArrayList<File> files            = new ArrayList<File>();
    private int             uploadsAvailable = 5;
    private boolean         autoUpload       = false;
    private boolean         useFlash         = false;
    private byte[]          datas;

    public int getSize() {
        if ( getFiles().size() > 0 ) {
            return getFiles().size();
        } else
        {
            return 0;
        }
    }

    public FileUploadBean() {
    }

    public void listener( UploadEvent event ) throws Exception {
        UploadItem item = event.getUploadItem();
        datas = item.getData();
        // annonce.setBytes( datas );
        // creerAnnonce();
    }

    public byte[] getDatas() {
        return datas;
    }

    public void setDatas( byte[] datas ) {
        this.datas = datas;
    }

    public void paint( OutputStream stream, Object object ) throws IOException {
        stream.write( getFiles().get( (Integer) object ).getData() );
    }

    public String clearUploadData() {
        files.clear();
        setUploadsAvailable( 5 );
        return null;
    }

    public long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles( ArrayList<File> files ) {
        this.files = files;
    }

    public int getUploadsAvailable() {
        return uploadsAvailable;
    }

    public void setUploadsAvailable( int uploadsAvailable ) {
        this.uploadsAvailable = uploadsAvailable;
    }

    public boolean isAutoUpload() {
        return autoUpload;
    }

    public void setAutoUpload( boolean autoUpload ) {
        this.autoUpload = autoUpload;
    }

    public boolean isUseFlash() {
        return useFlash;
    }

    public void setUseFlash( boolean useFlash ) {
        this.useFlash = useFlash;
    }

}