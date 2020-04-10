package com.zph.takephotoprivace;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.wonderkiln.camerakit.CameraKitError;
import com.wonderkiln.camerakit.CameraKitEvent;
import com.wonderkiln.camerakit.CameraKitEventListener;
import com.wonderkiln.camerakit.CameraKitImage;
import com.wonderkiln.camerakit.CameraKitVideo;
import com.wonderkiln.camerakit.CameraView;
import com.zph.takephotoprivace.util.Constants;
import com.zph.takephotoprivace.util.FileOpen;
import com.zph.takephotoprivace.util.FileUtil;
import com.zph.takephotoprivace.util.ToastUtil;
import com.zph.takephotoprivace.util.WebViewInfoUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.view.KeyEvent.KEYCODE_BACK;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_test)
    Button btnTest;
    @BindView(R.id.camera)
    CameraView cameraView;
    @BindView(R.id.webview)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        cameraView.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        cameraView.stop();
        super.onPause();
    }

    private void initView() {

        FileUtil.create(Environment.getExternalStorageDirectory().getPath() + File.separator + "zph_take_photo");
        FileUtil.create(Environment.getExternalStorageDirectory().getPath() + File.separator + Constants.APP_HOME_PATH + Constants.TAKE_MEDIA_FILE_PATH);
        WebViewInfoUtil.initWebView(webView);
        webView.loadUrl("https://news.ifeng.com/xuanzhan2020/");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        //设置回调
        cameraView.addCameraKitListener(new CameraKitEventListener() {
            @Override
            public void onEvent(CameraKitEvent cameraKitEvent) {

            }

            @Override
            public void onError(CameraKitError cameraKitError) {

            }

            @Override
            public void onImage(CameraKitImage cameraKitImage) {
                Date date = new Date();
                String name = date.getTime() + ".jpg";
                try {
                    FileUtil.saveFile(cameraKitImage.getBitmap(), name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ToastUtil.showToast(MainActivity.this, "" + date.getTime());
            }

            @Override
            public void onVideo(CameraKitVideo cameraKitVideo) {

            }
        });
    }

    @OnClick(R.id.btn_test)
    public void onViewClicked() {
        //拍照
        cameraView.captureImage();
    }

    @OnClick(R.id.tv_open_dir)
    public void onOpenDir() {
//        File dir = new File(Environment.getExternalStorageDirectory() + "/" + Constants.APP_HOME_PATH + Constants.TAKE_MEDIA_FILE_PATH);
//        if (!dir.exists()) {
//            return;
//        }
        Toast.makeText(this,"打开系统文件管理器找到：zph_take_photo文件夹，目录下面Image就是",Toast.LENGTH_LONG).show();
//        FileOpen.openFileByPath(this, dir.getPath());
//        FileUtil.openDir(dir,this);
    }

    public boolean isWebViewCanBack() {
        boolean flag = false;
        if (webView.canGoBack()) {
            webView.goBack();
            flag = true;
        }
        return flag;
    }
    @Override
    public boolean
    onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KEYCODE_BACK) {
            if(webView!=null){
                if (isWebViewCanBack()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
