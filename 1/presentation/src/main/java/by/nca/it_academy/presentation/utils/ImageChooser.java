package by.nca.it_academy.presentation.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.util.Log;

import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by user on 18.04.2018.
 */

public class ImageChooser {

    private static final int CAMERA_REQUEST_CODE = 123;
    private static final int GALERY_REQUEST_CODE = 235;

    public static void StartCamera(Activity activity) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        //проверяет наличине такого Intent в телефоне
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            File photo = getCameraFile(activity);

            if (photo.exists()) {
                photo.delete();
            }

            Log.e("aaa", " File path = " + photo.getAbsolutePath());

            Uri uri = FileProvider.getUriForFile(activity, "by.nca.it_academy.presentation.utils.MyFileProvider", photo);

            intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            activity.startActivityForResult(intent, CAMERA_REQUEST_CODE);
        }

    }

    public static void StartGalery(final Activity activity) {
        RxPermissions rxPermissions = new RxPermissions(activity);

        rxPermissions
                .request(Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean granted) {
                        if (granted) {
                            StartCamera(activity);

                        } else {
                            //если нет разрешения, выводим диалог о том, что не можем открыть галерею
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        startChooseGalery(activity);
    }

    private static void startChooseGalery(Activity activity){
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        //проверяет наличине такого Intent в телефоне
        if (intent.resolveActivity(activity.getPackageManager()) != null) {

            activity.startActivityForResult(intent, GALERY_REQUEST_CODE);
        }
    }

    public static File getCameraFile(Activity activity) {
        File root = activity.getExternalFilesDir(null);
        if (root == null) {
            root = activity.getFilesDir();
        }

        File myDir = new File(root.getAbsoluteFile() + "/myDir");
        if (!myDir.exists()) {
            root.mkdir();
        }

        return new File(myDir.getAbsoluteFile() + "/" + /*System.currentTimeMillis()*/"image.jpg");
    }

    public static File getImageFromResult(Activity activity, int requestCode, int ResultCode, Intent data) {
        switch (requestCode) {
            case CAMERA_REQUEST_CODE: {
                File file = getCameraFile(activity);

                if (file.exists()) {
                    return file;
                } else {
                    return null;
                }
            }
            case GALERY_REQUEST_CODE: {
                Uri uri = data.getData();
                Cursor cursor = activity.getApplicationContext().getContentResolver().query(uri, new String[]{MediaStore.Images.Media.DATA}, null, null, null);
                if (cursor == null) {
                    return null;
                }
                cursor.moveToFirst();
                int index = cursor.getColumnIndex(MediaStore.Images.Media.DATA);
                String file = cursor.getString(index);
                cursor.close();
                return new File(file);
            }
        }
        return null;
    }


}
