package com.example.csser;

import static java.security.AccessController.getContext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.annotation.TargetApi;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import androidx.core.content.FileProvider;
import androidx.palette.graphics.Palette;

import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;

public class CameraActivity extends AppCompatActivity {


    public static final int CAMERA_PERMISSION_CODE = 101;
    Button btnCapture, btnExtract;
    ImageView img;
    TextView textUri;
    TextView textVibrant, textVibrantDark, textVibrantLight;
    TextView textMuted, textMutedDark, textMutedLight;
    View viewVibrant, viewVibrantDark, viewVibrantLight;
    View viewMuted, viewMutedDark, viewMutedLight;

    private static final int RQS_OPEN_IMAGE = 1;

    Uri targetUri = null;

    public static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 143;
    private File photoFile;
    private String photoFileName = "photo.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnCapture = findViewById(R.id.btnCapture);
        btnExtract = findViewById(R.id.btnExtract);
        img = findViewById(R.id.ivImage);

        textUri = findViewById(R.id.texturi);

        viewVibrant = (View)findViewById(R.id.viewVibrant);
        viewVibrantDark = (View)findViewById(R.id.viewVibrantDark);
        viewVibrantLight = (View)findViewById(R.id.viewVibrantLight);
        viewMuted = (View)findViewById(R.id.viewMuted);
        viewMutedDark = (View)findViewById(R.id.viewMutedDark);
        viewMutedLight = (View)findViewById(R.id.viewMutedLight);

        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                askPermission();
                openCamera();

            }

    });
        btnExtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //createPalette(targetUri);
            }
        });

}

    private void askPermission() {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED)
        {

            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.CAMERA},
                    CAMERA_PERMISSION_CODE);
        }
        else{
            openCamera();
        }
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();

            }
            else{
               Toast.makeText(this,"Need camera permission to use this feature!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void openCamera() {
        // create Intent to take a picture and return control to the calling application
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RQS_OPEN_IMAGE);
        // Create a File reference to access to future access
        //photoFile = getPhotoFileUri(photoFileName);

        // wrap File object into a content provider
        // required for API >= 24
        // See https://guides.codepath.com/android/Sharing-Content-with-Intents#sharing-files-with-api-24-or-higher
        //Uri fileProvider = FileProvider.getUriForFile(getContext(), "com.codepath.fileprovider", photoFile);
        //intent.putExtra(MediaStore.EXTRA_OUTPUT, fileProvider);

        // If you call startActivityForResult() using an intent that no app can handle, your app will crash.
        // So as long as the result is not null, it's safe to use the intent.
        //if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            // Start the image capture intent to take photo
          //  startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
        //}
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @NonNull Intent data) {
        if(resultCode == Activity.RESULT_OK){
          //  Uri dataUri = data.getData();
            if(requestCode == RQS_OPEN_IMAGE){
                Bitmap image = (Bitmap) data.getExtras().get("data");
                img.setImageBitmap(image);
                //targetUri = dataUri;
                //textUri.setText(dataUri.toString());
                //try {
                    //updateImage(dataUri);
                //} catch (FileNotFoundException e) {
                  //  e.printStackTrace();
                //}
            }

        }

    }

    private void updateImage(Uri uri) throws FileNotFoundException {
        Bitmap bm;
        if(uri != null){
            bm = BitmapFactory.decodeStream(
                    getContentResolver()
                            .openInputStream(uri));
            img.setImageBitmap(bm);

            extractProminentColors(bm);

            img.setImageBitmap(bm);

            extractProminentColors(bm);

        }

    }

    private void extractProminentColors(Bitmap image) {
        int defaultColor = 0x000000;

        Palette p = Palette.from(image).generate();

        int VibrantColor = p.getVibrantColor(defaultColor);
        textVibrant.setText("VibrantColor: " + String.format("#%X", VibrantColor));
        viewVibrant.setBackgroundColor(VibrantColor);

        int VibrantColorDark = p.getDarkVibrantColor(defaultColor);
        textVibrantDark.setText("VibrantColorDark: " + String.format("#%X", VibrantColorDark));
        viewVibrantDark.setBackgroundColor(VibrantColorDark);

        int VibrantColorLight = p.getLightVibrantColor(defaultColor);
        textVibrantLight.setText("VibrantColorLight: " + String.format("#%X", VibrantColorLight));
        viewVibrantLight.setBackgroundColor(VibrantColorLight);

        int MutedColor = p.getMutedColor(defaultColor);
        textMuted.setText("MutedColor: " + String.format("#%X", MutedColor));
        viewMuted.setBackgroundColor(MutedColor);

        int MutedColorDark = p.getDarkMutedColor(defaultColor);
        textMutedDark.setText("MutedColorDark: " + String.format("#%X", MutedColorDark));
        viewMutedDark.setBackgroundColor(MutedColorDark);

        int MutedColorLight = p.getLightMutedColor(defaultColor);
        textMutedLight.setText("MutedColorLight: " + String.format("#%X", MutedColorLight));
        viewMutedLight.setBackgroundColor(MutedColorLight);
    }
}