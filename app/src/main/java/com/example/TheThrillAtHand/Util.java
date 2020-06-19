// 작성자 : 2016039002 박성진
// 설  명 : 토스트 보여주기 및 스토리지 관련 class

package com.example.TheThrillAtHand;

import android.app.Activity;
import android.util.Patterns;
import android.widget.Toast;

import java.net.URLConnection;

public class Util {
    public Util(){/* */}

    public static final String INTENT_PATH = "path";
    public static final String INTENT_MEDIA = "media";

    public static final int GALLERY_IMAGE = 0;
    public static final int GALLERY_VIDEO = 1;

    public static void showToast(Activity activity, String msg){
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

//    public static boolean isStorageUrl(String url){
//        return Patterns.WEB_URL.matcher(url).matches() && url.contains("https://firebasestorage.googleapis.com/v0/b/sns-project-3e2c2.appspot.com/o/post");
//    }
    public static boolean isStorageUrl(String url){
        return Patterns.WEB_URL.matcher(url).matches() && url.contains("gs://thethrillathand-59948.appspot.com/posts");
    }


    public static String storageUrlToName(String url){
        return url.split("\\?")[0].split("%2F")[url.split("\\?")[0].split("%2F").length - 1];
    }

    public static boolean isImageFile(String path) {
        String mimeType = URLConnection.guessContentTypeFromName(path);
        return mimeType != null && mimeType.startsWith("image");
    }

    public static boolean isVideoFile(String path) {
        String mimeType = URLConnection.guessContentTypeFromName(path);
        return mimeType != null && mimeType.startsWith("video");
    }
}
