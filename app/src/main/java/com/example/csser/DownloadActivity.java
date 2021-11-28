package com.example.csser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.Toast;

public class DownloadActivity extends AppCompatActivity {

    private Button cssBtn, sassBtn,bootstrapBtn,BulmaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        cssBtn = (Button) findViewById(R.id.css_btn);
        sassBtn = (Button) findViewById(R.id.sass_btn);
        bootstrapBtn = (Button) findViewById(R.id.bootstrap_btn);
        BulmaBtn = (Button) findViewById(R.id.bulma_btn);


        cssBtn.setOnClickListener(view -> {
            String url = "https://github.com/Elmhaf/cheatsheets/raw/main/CSS.pdf";
            String title = URLUtil.guessFileName(url,null,null);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setDescription("Downloading your requested file. Please wait...");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            downloadManager.enqueue(request);
            Toast.makeText(DownloadActivity.this, "CSS Downloading Started", Toast.LENGTH_SHORT).show();
        });

        bootstrapBtn.setOnClickListener(view -> {
            String url = "https://github.com/Elmhaf/cheatsheets/raw/main/Bootstrap.pdf";
            String title = URLUtil.guessFileName(url,null,null);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setDescription("Downloading your requested file. Please wait...");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            downloadManager.enqueue(request);
            Toast.makeText(DownloadActivity.this, "Bootstrap Downloading Started", Toast.LENGTH_SHORT).show();
        });
        BulmaBtn.setOnClickListener(view -> {
            String url = "https://github.com/Elmhaf/cheatsheets/raw/main/Bulma.pdf";
            String title = URLUtil.guessFileName(url,null,null);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setDescription("Downloading your requested file. Please wait...");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            downloadManager.enqueue(request);
            Toast.makeText(DownloadActivity.this, "Bulma Downloading Started", Toast.LENGTH_SHORT).show();
        });

        sassBtn.setOnClickListener(view -> {
            String url = "https://github.com/Elmhaf/cheatsheets/raw/main/Sass.pdf";
            String title = URLUtil.guessFileName(url,null,null);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setDescription("Downloading your requested file. Please wait...");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            downloadManager.enqueue(request);
            Toast.makeText(DownloadActivity.this, "Sass Downloading Started", Toast.LENGTH_SHORT).show();
        });



    }



}