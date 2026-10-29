            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.R;
            import android.app.Activity;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.res.AssetFileDescriptor;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Environment;
            import android.os.Message;
            import android.os.Parcelable;
            import android.view.View;
            import android.view.ViewGroup;
            import android.webkit.ConsoleMessage;
            import android.webkit.GeolocationPermissions;
            import android.webkit.JsPromptResult;
            import android.webkit.JsResult;
            import android.webkit.MimeTypeMap;
            import android.webkit.PermissionRequest;
            import android.webkit.ValueCallback;
            import android.webkit.WebChromeClient;
            import android.webkit.WebView;
            import android.widget.EditText;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$style;
            import androidx.core.app.NotificationCompat;
            import androidx.core.content.FileProvider;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
            import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.PluginRegistry;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.C1783j7;
            import p000.C1917m7;
            import p000.C1954n7;
            import p000.DialogInterfaceC1991o7;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class InAppWebViewChromeClient extends WebChromeClient implements PluginRegistry.ActivityResultListener, ActivityResultListener {
                protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
                protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
                protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
                protected static final String LOG_TAG = "IABWebChromeClient";
                private static final int PICKER = 1;
                private static final int PICKER_LEGACY = 3;
                final String DEFAULT_MIME_TYPES = "*/*";
                final Map<DialogInterface, JsResult> dialogs = new HashMap();
                private ValueCallback<Uri[]> filePathCallback;
                private ValueCallback<Uri> filePathCallbackLegacy;
                private Uri imageOutputFileUri;
                private InAppBrowserDelegate inAppBrowserDelegate;
                public InAppWebView inAppWebView;
                private View mCustomView;
                private WebChromeClient.CustomViewCallback mCustomViewCallback;
                private int mOriginalOrientation;
                private int mOriginalSystemUiVisibility;
                public InAppWebViewFlutterPlugin plugin;
                private Uri videoOutputFileUri;

                public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, InAppWebView inAppWebView, InAppBrowserDelegate inAppBrowserDelegate) {
/* 15 */            this.plugin = inAppWebViewFlutterPlugin;
/* 17 */            this.inAppWebView = inAppWebView;
/* 19 */            this.inAppBrowserDelegate = inAppBrowserDelegate;
/* 21 */            if (inAppBrowserDelegate != null) {
/* 27 */                inAppBrowserDelegate.getActivityResultListeners().add(this);
                    }
/* 30 */            ActivityPluginBinding activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding;
/* 32 */            if (activityPluginBinding != null) {
/* 34 */                activityPluginBinding.addActivityResultListener(this);
                    }
                }

                private Boolean acceptsAny(String[] strArr) {
/* 9 */             if (isArrayEmpty(strArr).booleanValue()) {
/* 11 */                return Boolean.TRUE;
                    }
/* 16 */            for (String str : strArr) {
/* 26 */                if (str.equals("*/*")) {
/* 28 */                    return Boolean.TRUE;
                        }
                    }
/* 34 */            return Boolean.FALSE;
                }

                private Boolean acceptsImages(String str) {
/* 7 */             if (str.matches("\\.\\w+")) {
/* 17 */                str = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
                    }
/* 43 */            return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
                }

                private Boolean acceptsVideo(String str) {
/* 7 */             if (str.matches("\\.\\w+")) {
/* 17 */                str = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
                    }
/* 43 */            return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
                }

                private Boolean arrayContainsString(String[] strArr, String str) {
/* 3 */             for (String str2 : strArr) {
/* 7 */                 if (str2 != null && str2.contains(str)) {
/* 15 */                    return Boolean.TRUE;
                        }
                    }
/* 21 */            return Boolean.FALSE;
                }

                private String[] getAcceptedMimeType(String[] strArr) {
/* 9 */             if (isArrayEmpty(strArr).booleanValue()) {
/* 13 */                return new String[]{"*/*"};
                    }
/* 19 */            String[] strArr2 = new String[strArr.length];
/* 23 */            for (int i = 0; i < strArr.length; i++) {
/* 25 */                String str = strArr[i];
/* 33 */                if (str.matches("\\.\\w+")) {
/* 47 */                    strArr2[i] = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
                        } else {
/* 50 */                    strArr2[i] = str;
                        }
                    }
/* 55 */            return strArr2;
                }

                private Activity getActivity() {
/* 1 */             InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 3 */             if (inAppBrowserDelegate != null) {
/* 5 */                 return inAppBrowserDelegate.getActivity();
                    }
/* 10 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 12 */            if (inAppWebViewFlutterPlugin != null) {
/* 14 */                return inAppWebViewFlutterPlugin.activity;
                    }
/* 17 */            return null;
                }

                private File getCapturedFile(String str) {
                    String str2;
                    String str3;
/* 7 */             if (str.equals("android.media.action.IMAGE_CAPTURE")) {
/* 9 */                 String str4 = Environment.DIRECTORY_PICTURES;
/* 11 */                str2 = "image";
/* 13 */                str3 = ".jpg";
                    } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
/* 24 */                String str5 = Environment.DIRECTORY_MOVIES;
/* 26 */                str2 = "video";
/* 28 */                str3 = ".mp4";
                    } else {
/* 31 */                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 33 */                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 34 */            Activity activity = getActivity();
/* 39 */            if (activity == null) {
/* 38 */                return null;
                    }
/* 50 */            return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir(null));
                }

                private Uri getCapturedMediaFile() {
/* 1 */             Uri uri = this.imageOutputFileUri;
/* 3 */             if (uri != null && isFileNotEmpty(uri)) {
/* 11 */                return this.imageOutputFileUri;
                    }
/* 14 */            Uri uri2 = this.videoOutputFileUri;
/* 16 */            if (uri2 == null || !isFileNotEmpty(uri2)) {
/* 27 */                return null;
                    }
/* 24 */            return this.videoOutputFileUri;
                }

                private Intent getFileChooserIntent(String str) {
/* 10 */            String mimeTypeFromExtension = str.isEmpty() ? "*/*" : str;
/* 17 */            if (str.matches("\\.\\w+")) {
/* 27 */                mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
                    }
/* 35 */            Intent intent = new Intent("android.intent.action.GET_CONTENT");
/* 40 */            intent.addCategory("android.intent.category.OPENABLE");
/* 43 */            intent.setType(mimeTypeFromExtension);
/* 46 */            return intent;
                }

                private String getMimeTypeFromExtension(String str) {
/* 1 */             if (str != null) {
/* 7 */                 return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
                    }
/* 12 */            return null;
                }

                private Uri getOutputUri(String str) {
                    File capturedFile;
                    Activity activity;
                    try {
/* 2 */                 capturedFile = getCapturedFile(str);
                    } catch (IOException unused) {
/* 7 */                 capturedFile = null;
                    }
/* 8 */             if (capturedFile == null || (activity = getActivity()) == null) {
/* 1 */                 return null;
                    }
                    try {
/* 47 */                return FileProvider.getUriForFile(activity.getApplicationContext(), activity.getApplicationContext().getPackageName() + ".flutter_inappwebview_android.fileprovider", capturedFile);
                    } catch (Exception unused2) {
/* 1 */                 return null;
                    }
                }

                private Intent getPhotoIntent() {
/* 5 */             Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
/* 8 */             Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
/* 12 */            this.imageOutputFileUri = outputUri;
/* 16 */            intent.putExtra("output", outputUri);
/* 19 */            return intent;
                }

                private Uri[] getSelectedFiles(Intent intent, int i) {
/* 2 */             if (intent != null && intent.getData() != null) {
/* 11 */                if (i == -1) {
/* 13 */                    return WebChromeClient.FileChooserParams.parseResult(i, intent);
                        }
/* 1 */                 return null;
                    }
/* 19 */            if (intent == null || intent.getClipData() == null) {
/* 58 */                Uri capturedMediaFile = getCapturedMediaFile();
/* 62 */                if (capturedMediaFile != null) {
/* 64 */                    return new Uri[]{capturedMediaFile};
                        }
/* 1 */                 return null;
                    }
/* 31 */            int itemCount = intent.getClipData().getItemCount();
/* 35 */            Uri[] uriArr = new Uri[itemCount];
/* 38 */            for (int i2 = 0; i2 < itemCount; i2++) {
/* 52 */                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
                    }
/* 57 */            return uriArr;
                }

                private Intent getVideoIntent() {
/* 5 */             Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
/* 8 */             Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
/* 12 */            this.videoOutputFileUri = outputUri;
/* 16 */            intent.putExtra("output", outputUri);
/* 19 */            return intent;
                }

                private Boolean isArrayEmpty(String[] strArr) {
/* 2 */             boolean z = true;
/* 3 */             if (strArr.length != 0 && (strArr.length != 1 || strArr[0].length() != 0)) {
/* 18 */                z = false;
                    }
/* 19 */            return Boolean.valueOf(z);
                }

                private boolean isFileNotEmpty(Uri uri) {
/* 1 */             Activity activity = getActivity();
/* 6 */             if (activity == null) {
/* 5 */                 return false;
                    }
                    try {
/* 15 */                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, "r");
/* 19 */                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
/* 23 */                assetFileDescriptorOpenAssetFileDescriptor.close();
                        return length > 0;
                    } catch (IOException unused) {
                    }
                }

                public void createAlertDialog(String str, final JsResult jsResult, String str2, String str3) {
/* 1 */             if (str2 != null && !str2.isEmpty()) {
/* 9 */                 str = str2;
                    }
/* 12 */            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsResult.confirm();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 15 */            Activity activity = getActivity();
/* 19 */            if (activity == null) {
/* 21 */                return;
                    }
/* 26 */            C1954n7 c1954n7 = new C1954n7(activity, R$style.Theme_AppCompat_Dialog_Alert);
/* 31 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 33 */            c1783j7.f12110f = str;
/* 35 */            if (str3 == null || str3.isEmpty()) {
/* 57 */                c1783j7.f12111g = c1783j7.f12105a.getText(R.string.ok);
/* 59 */                c1783j7.f12112h = onClickListener;
                    } else {
/* 43 */                c1783j7.f12111g = str3;
/* 45 */                c1783j7.f12112h = onClickListener;
                    }
/* 66 */            c1783j7.f12116l = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.3
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
/* 3 */                     jsResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 68 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 74 */            this.dialogs.put(dialogInterfaceC1991o7M6897b, jsResult);
/* 77 */            dialogInterfaceC1991o7M6897b.show();
                }

                public void createBeforeUnloadDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
/* 1 */             if (str2 != null && !str2.isEmpty()) {
/* 9 */                 str = str2;
                    }
/* 12 */            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.13
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsResult.confirm();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 17 */            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.14
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 20 */            Activity activity = getActivity();
/* 24 */            if (activity == null) {
/* 26 */                return;
                    }
/* 31 */            C1954n7 c1954n7 = new C1954n7(activity, R$style.Theme_AppCompat_Dialog_Alert);
/* 36 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 38 */            c1783j7.f12110f = str;
/* 40 */            if (str3 == null || str3.isEmpty()) {
/* 62 */                c1783j7.f12111g = c1783j7.f12105a.getText(R.string.ok);
/* 64 */                c1783j7.f12112h = onClickListener;
                    } else {
/* 48 */                c1783j7.f12111g = str3;
/* 50 */                c1783j7.f12112h = onClickListener;
                    }
/* 66 */            if (str4 == null || str4.isEmpty()) {
/* 87 */                c1783j7.f12113i = c1783j7.f12105a.getText(R.string.cancel);
/* 89 */                c1783j7.f12114j = onClickListener2;
                    } else {
/* 74 */                c1783j7.f12113i = str4;
/* 76 */                c1783j7.f12114j = onClickListener2;
                    }
/* 96 */            c1783j7.f12116l = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.15
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
/* 3 */                     jsResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 98 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 104 */           this.dialogs.put(dialogInterfaceC1991o7M6897b, jsResult);
/* 107 */           dialogInterfaceC1991o7M6897b.show();
                }

                public void createConfirmDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
/* 1 */             if (str2 != null && !str2.isEmpty()) {
/* 9 */                 str = str2;
                    }
/* 12 */            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.5
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsResult.confirm();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 17 */            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.6
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 20 */            Activity activity = getActivity();
/* 24 */            if (activity == null) {
/* 26 */                return;
                    }
/* 31 */            C1954n7 c1954n7 = new C1954n7(activity, R$style.Theme_AppCompat_Dialog_Alert);
/* 36 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 38 */            c1783j7.f12110f = str;
/* 40 */            if (str3 == null || str3.isEmpty()) {
/* 62 */                c1783j7.f12111g = c1783j7.f12105a.getText(R.string.ok);
/* 64 */                c1783j7.f12112h = onClickListener;
                    } else {
/* 48 */                c1783j7.f12111g = str3;
/* 50 */                c1783j7.f12112h = onClickListener;
                    }
/* 66 */            if (str4 == null || str4.isEmpty()) {
/* 87 */                c1783j7.f12113i = c1783j7.f12105a.getText(R.string.cancel);
/* 89 */                c1783j7.f12114j = onClickListener2;
                    } else {
/* 74 */                c1783j7.f12113i = str4;
/* 76 */                c1783j7.f12114j = onClickListener2;
                    }
/* 96 */            c1783j7.f12116l = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.7
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
/* 3 */                     jsResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 98 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 104 */           this.dialogs.put(dialogInterfaceC1991o7M6897b, jsResult);
/* 107 */           dialogInterfaceC1991o7M6897b.show();
                }

                public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
/* 7 */             FrameLayout frameLayout = new FrameLayout(webView.getContext());
/* 16 */            final EditText editText = new EditText(webView.getContext());
/* 20 */            editText.setMaxLines(1);
/* 23 */            if (str4 != null && !str4.isEmpty()) {
/* 31 */                str2 = str4;
                    }
/* 32 */            editText.setText(str2);
/* 41 */            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
/* 49 */            frameLayout.setPaddingRelative(45, 15, 45, 0);
/* 52 */            frameLayout.addView(editText);
/* 55 */            if (str3 != null && !str3.isEmpty()) {
/* 63 */                str = str3;
                    }
/* 66 */            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.9
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 7 */                     String string = editText.getText().toString();
/* 11 */                    JsPromptResult jsPromptResult2 = jsPromptResult;
/* 13 */                    String str8 = str5;
/* 15 */                    if (str8 != null) {
/* 17 */                        string = str8;
                            }
/* 18 */                    jsPromptResult2.confirm(string);
/* 21 */                    dialogInterface.dismiss();
/* 28 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 71 */            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.10
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
/* 3 */                     jsPromptResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 74 */            Activity activity = getActivity();
/* 78 */            if (activity == null) {
/* 80 */                return;
                    }
/* 85 */            C1954n7 c1954n7 = new C1954n7(activity, R$style.Theme_AppCompat_Dialog_Alert);
/* 90 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 92 */            c1783j7.f12110f = str;
/* 94 */            if (str7 == null || str7.isEmpty()) {
/* 116 */               c1783j7.f12111g = c1783j7.f12105a.getText(R.string.ok);
/* 118 */               c1783j7.f12112h = onClickListener;
                    } else {
/* 102 */               c1783j7.f12111g = str7;
/* 104 */               c1783j7.f12112h = onClickListener;
                    }
/* 120 */           if (str6 == null || str6.isEmpty()) {
/* 141 */               c1783j7.f12113i = c1783j7.f12105a.getText(R.string.cancel);
/* 143 */               c1783j7.f12114j = onClickListener2;
                    } else {
/* 128 */               c1783j7.f12113i = str6;
/* 130 */               c1783j7.f12114j = onClickListener2;
                    }
/* 150 */           c1783j7.f12116l = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.11
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
/* 3 */                     jsPromptResult.cancel();
/* 6 */                     dialogInterface.dismiss();
/* 13 */                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                        }
                    };
/* 152 */           DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 156 */           C1917m7 c1917m7 = dialogInterfaceC1991o7M6897b.f14655f;
/* 158 */           c1917m7.f13619g = frameLayout;
/* 160 */           c1917m7.f13620h = false;
/* 164 */           this.dialogs.put(dialogInterfaceC1991o7M6897b, jsPromptResult);
/* 167 */           dialogInterfaceC1991o7M6897b.show();
                }

                public void dispose() {
                    ActivityPluginBinding activityPluginBinding;
/* 15 */            for (Map.Entry<DialogInterface, JsResult> entry : this.dialogs.entrySet()) {
/* 29 */                entry.getValue().cancel();
/* 38 */                entry.getKey().dismiss();
                    }
/* 44 */            this.dialogs.clear();
/* 47 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 49 */            if (inAppWebViewFlutterPlugin != null && (activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding) != null) {
/* 55 */                activityPluginBinding.removeActivityResultListener(this);
                    }
/* 58 */            InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 61 */            if (inAppBrowserDelegate != null) {
/* 67 */                inAppBrowserDelegate.getActivityResultListeners().clear();
/* 70 */                this.inAppBrowserDelegate = null;
                    }
/* 72 */            this.filePathCallbackLegacy = null;
/* 74 */            this.filePathCallback = null;
/* 76 */            this.videoOutputFileUri = null;
/* 78 */            this.imageOutputFileUri = null;
/* 80 */            this.inAppWebView = null;
/* 82 */            this.plugin = null;
                }

                @Override // android.webkit.WebChromeClient
                public Bitmap getDefaultVideoPoster() {
                    byte[] bArr;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (bArr = inAppWebView.customSettings.defaultVideoPoster) == null) {
/* 30 */                return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    }
/* 13 */            BitmapFactory.Options options = new BitmapFactory.Options();
/* 17 */            options.inMutable = true;
/* 21 */            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                }

                public ViewGroup getRootView() {
/* 1 */             Activity activity = getActivity();
/* 5 */             if (activity == null) {
/* 7 */                 return null;
                    }
/* 16 */            return (ViewGroup) activity.findViewById(R.id.content);
                }

                public boolean needsCameraPermission() {
/* 3 */             Activity activity = getActivity();
/* 8 */             if (activity == null) {
/* 7 */                 return true;
                    }
                    try {
                        return Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") && v00.checkSelfPermission(activity, "android.permission.CAMERA") != 0;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 7 */                 return true;
                    }
                }

                @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
                public boolean onActivityResult(int i, int i2, Intent intent) {
                    Uri data;
/* 4 */             if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
/* 3 */                 return true;
                    }
/* 13 */            if (i == 1) {
/* 49 */                Uri[] selectedFiles = i2 == -1 ? getSelectedFiles(intent, i2) : null;
/* 50 */                ValueCallback<Uri[]> valueCallback = this.filePathCallback;
/* 52 */                if (valueCallback != null) {
/* 54 */                    valueCallback.onReceiveValue(selectedFiles);
                        }
                    } else if (i == 3) {
/* 19 */                if (i2 == -1) {
/* 28 */                    data = intent != null ? intent.getData() : getCapturedMediaFile();
                        } else {
/* 33 */                    data = null;
                        }
/* 34 */                ValueCallback<Uri> valueCallback2 = this.filePathCallbackLegacy;
/* 36 */                if (valueCallback2 != null) {
/* 38 */                    valueCallback2.onReceiveValue(data);
                        }
                    }
/* 57 */            this.filePathCallback = null;
/* 59 */            this.filePathCallbackLegacy = null;
/* 61 */            this.imageOutputFileUri = null;
/* 63 */            this.videoOutputFileUri = null;
/* 3 */             return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onCloseWindow(WebView webView) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView != null && (webViewChannelDelegate = inAppWebView.channelDelegate) != null) {
/* 9 */                 webViewChannelDelegate.onCloseWindow();
                    }
/* 12 */            super.onCloseWindow(webView);
                }

                @Override // android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView != null && (webViewChannelDelegate = inAppWebView.channelDelegate) != null) {
/* 21 */                webViewChannelDelegate.onConsoleMessage(consoleMessage.message(), consoleMessage.messageLevel().ordinal());
                    }
/* 24 */            return super.onConsoleMessage(consoleMessage);
                }

                @Override // android.webkit.WebChromeClient
                public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                    final int i;
                    WebViewChannelDelegate webViewChannelDelegate;
                    InAppWebViewManager inAppWebViewManager;
                    String string;
                    InAppWebViewManager inAppWebViewManager2;
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 5 */             if (inAppWebViewFlutterPlugin == null || (inAppWebViewManager2 = inAppWebViewFlutterPlugin.inAppWebViewManager) == null) {
/* 18 */                i = 0;
                    } else {
/* 13 */                int i2 = inAppWebViewManager2.windowAutoincrementId + 1;
/* 14 */                inAppWebViewManager2.windowAutoincrementId = i2;
/* 16 */                i = i2;
                    }
/* 19 */            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
/* 23 */            String extra = hitTestResult.getExtra();
/* 33 */            if (hitTestResult.getType() == 8) {
/* 39 */                Message messageObtainMessage = webView.getHandler().obtainMessage();
/* 43 */                webView.requestFocusNodeHref(messageObtainMessage);
/* 46 */                Bundle data = messageObtainMessage.getData();
/* 50 */                if (data != null && (string = data.getString("url")) != null && !string.isEmpty()) {
/* 66 */                    extra = string;
                        }
                    }
/* 81 */            CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", null, null), true, z2, false, i, z);
/* 84 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
/* 86 */            if (inAppWebViewFlutterPlugin2 != null && (inAppWebViewManager = inAppWebViewFlutterPlugin2.inAppWebViewManager) != null) {
/* 98 */                inAppWebViewManager.windowWebViewMessages.put(Integer.valueOf(i), message);
                    }
/* 101 */           InAppWebView inAppWebView = this.inAppWebView;
/* 103 */           if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 4 */                 return false;
                    }
/* 114 */           webViewChannelDelegate.onCreateWindow(createWindowAction, new WebViewChannelDelegate.CreateWindowCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.16
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(Boolean bool) {
                            InAppWebViewManager inAppWebViewManager3;
/* 3 */                     InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = InAppWebViewChromeClient.this.plugin;
/* 5 */                     if (inAppWebViewFlutterPlugin3 == null || (inAppWebViewManager3 = inAppWebViewFlutterPlugin3.inAppWebViewManager) == null) {
/* 22 */                        return;
                            }
/* 19 */                    inAppWebViewManager3.windowWebViewMessages.remove(Integer.valueOf(i));
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((Boolean) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
/* 7 */                 public boolean nonNullSuccess(Boolean bool) {
/* 8 */                     return !bool.booleanValue();
                        }
                    });
/* 3 */             return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onGeolocationPermissionsHidePrompt() {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 12 */                return;
                    }
/* 9 */             webViewChannelDelegate.onGeolocationPermissionsHidePrompt();
                }

                @Override // android.webkit.WebChromeClient
                public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 3 */             WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.17
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
/* 6 */                     callback.invoke(str, false, false);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str2, String str3, Object obj) {
/* 2 */                     defaultBehaviour((GeolocationPermissionShowPromptResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
/* 15 */                    callback.invoke(geolocationPermissionShowPromptResponse.getOrigin(), geolocationPermissionShowPromptResponse.isAllow(), geolocationPermissionShowPromptResponse.isRetain());
/* 18 */                    return false;
                        }
                    };
/* 6 */             InAppWebView inAppWebView = this.inAppWebView;
/* 8 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 19 */                geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
                    } else {
/* 14 */                webViewChannelDelegate.onGeolocationPermissionsShowPrompt(str, geolocationPermissionsShowPromptCallback);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onHideCustomView() {
                    ViewGroup rootView;
/* 1 */             Activity activity = getActivity();
/* 5 */             if (activity == null || (rootView = getRootView()) == null) {
/* 73 */                return;
                    }
/* 15 */            View view = this.mCustomView;
/* 17 */            if (view != null) {
/* 22 */                ((FrameLayout) rootView).removeView(view);
                    }
/* 26 */            this.mCustomView = null;
/* 30 */            rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
/* 35 */            activity.setRequestedOrientation(this.mOriginalOrientation);
/* 38 */            WebChromeClient.CustomViewCallback customViewCallback = this.mCustomViewCallback;
/* 40 */            if (customViewCallback != null) {
/* 42 */                customViewCallback.onCustomViewHidden();
                    }
/* 45 */            this.mCustomViewCallback = null;
/* 53 */            activity.getWindow().clearFlags(NotificationCompat.FLAG_GROUP_SUMMARY);
/* 56 */            InAppWebView inAppWebView = this.inAppWebView;
/* 58 */            if (inAppWebView != null) {
/* 60 */                WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 62 */                if (webViewChannelDelegate != null) {
/* 64 */                    webViewChannelDelegate.onExitFullscreen();
                        }
/* 70 */                this.inAppWebView.setInFullscreen(false);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsAlert(WebView webView, String str, final String str2, final JsResult jsResult) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 20 */                return false;
                    }
/* 15 */            webViewChannelDelegate.onJsAlert(str, str2, null, new WebViewChannelDelegate.JsAlertCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(JsAlertResponse jsAlertResponse) {
                            String message;
                            String confirmButtonTitle;
/* 1 */                     if (jsAlertResponse != null) {
/* 3 */                         message = jsAlertResponse.getMessage();
/* 7 */                         confirmButtonTitle = jsAlertResponse.getConfirmButtonTitle();
                            } else {
/* 12 */                        message = null;
/* 13 */                        confirmButtonTitle = null;
                            }
/* 20 */                    InAppWebViewChromeClient.this.createAlertDialog(str2, jsResult, message, confirmButtonTitle);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str3, String str4, Object obj) {
/* 3 */                     jsResult.cancel();
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(JsAlertResponse jsAlertResponse) {
/* 6 */                     if (!jsAlertResponse.isHandledByClient()) {
/* 5 */                         return true;
                            }
/* 8 */                     Integer action = jsAlertResponse.getAction();
/* 14 */                    int iIntValue = action != null ? action.intValue() : 1;
/* 18 */                    JsResult jsResult2 = jsResult;
/* 20 */                    if (iIntValue != 0) {
/* 22 */                        jsResult2.cancel();
/* 29 */                        return false;
                            }
/* 26 */                    jsResult2.confirm();
/* 29 */                    return false;
                        }
                    });
/* 18 */            return true;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsBeforeUnload(WebView webView, String str, final String str2, final JsResult jsResult) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 19 */                return false;
                    }
/* 14 */            webViewChannelDelegate.onJsBeforeUnload(str, str2, new WebViewChannelDelegate.JsBeforeUnloadCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.12
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                            String str3;
                            String str4;
                            String cancelButtonTitle;
/* 1 */                     if (jsBeforeUnloadResponse != null) {
/* 3 */                         String message = jsBeforeUnloadResponse.getMessage();
/* 7 */                         String confirmButtonTitle = jsBeforeUnloadResponse.getConfirmButtonTitle();
/* 11 */                        cancelButtonTitle = jsBeforeUnloadResponse.getCancelButtonTitle();
/* 16 */                        str3 = message;
/* 17 */                        str4 = confirmButtonTitle;
                            } else {
/* 20 */                        str3 = null;
/* 21 */                        str4 = null;
/* 22 */                        cancelButtonTitle = null;
                            }
/* 29 */                    InAppWebViewChromeClient.this.createBeforeUnloadDialog(str2, jsResult, str3, str4, cancelButtonTitle);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str3, String str4, Object obj) {
/* 3 */                     jsResult.cancel();
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
/* 6 */                     if (!jsBeforeUnloadResponse.isHandledByClient()) {
/* 5 */                         return true;
                            }
/* 8 */                     Integer action = jsBeforeUnloadResponse.getAction();
/* 14 */                    int iIntValue = action != null ? action.intValue() : 1;
/* 18 */                    JsResult jsResult2 = jsResult;
/* 20 */                    if (iIntValue != 0) {
/* 22 */                        jsResult2.cancel();
/* 29 */                        return false;
                            }
/* 26 */                    jsResult2.confirm();
/* 29 */                    return false;
                        }
                    });
/* 17 */            return true;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsConfirm(WebView webView, String str, final String str2, final JsResult jsResult) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 20 */                return false;
                    }
/* 15 */            webViewChannelDelegate.onJsConfirm(str, str2, null, new WebViewChannelDelegate.JsConfirmCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.4
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(JsConfirmResponse jsConfirmResponse) {
                            String str3;
                            String str4;
                            String cancelButtonTitle;
/* 1 */                     if (jsConfirmResponse != null) {
/* 3 */                         String message = jsConfirmResponse.getMessage();
/* 7 */                         String confirmButtonTitle = jsConfirmResponse.getConfirmButtonTitle();
/* 11 */                        cancelButtonTitle = jsConfirmResponse.getCancelButtonTitle();
/* 16 */                        str3 = message;
/* 17 */                        str4 = confirmButtonTitle;
                            } else {
/* 20 */                        str3 = null;
/* 21 */                        str4 = null;
/* 22 */                        cancelButtonTitle = null;
                            }
/* 29 */                    InAppWebViewChromeClient.this.createConfirmDialog(str2, jsResult, str3, str4, cancelButtonTitle);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str3, String str4, Object obj) {
/* 3 */                     jsResult.cancel();
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(JsConfirmResponse jsConfirmResponse) {
/* 6 */                     if (!jsConfirmResponse.isHandledByClient()) {
/* 5 */                         return true;
                            }
/* 8 */                     Integer action = jsConfirmResponse.getAction();
/* 14 */                    int iIntValue = action != null ? action.intValue() : 1;
/* 18 */                    JsResult jsResult2 = jsResult;
/* 20 */                    if (iIntValue != 0) {
/* 22 */                        jsResult2.cancel();
/* 29 */                        return false;
                            }
/* 26 */                    jsResult2.confirm();
/* 29 */                    return false;
                        }
                    });
/* 18 */            return true;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsPrompt(final WebView webView, String str, final String str2, final String str3, final JsPromptResult jsPromptResult) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 30 */                return false;
                    }
/* 25 */            webViewChannelDelegate.onJsPrompt(str, str2, str3, null, new WebViewChannelDelegate.JsPromptCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.8
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(JsPromptResponse jsPromptResponse) {
                            String str4;
                            String str5;
                            String str6;
                            String cancelButtonTitle;
                            String str7;
/* 1 */                     if (jsPromptResponse != null) {
/* 3 */                         String message = jsPromptResponse.getMessage();
/* 7 */                         String defaultValue = jsPromptResponse.getDefaultValue();
/* 11 */                        String value = jsPromptResponse.getValue();
/* 15 */                        String confirmButtonTitle = jsPromptResponse.getConfirmButtonTitle();
/* 19 */                        cancelButtonTitle = jsPromptResponse.getCancelButtonTitle();
/* 24 */                        str4 = message;
/* 25 */                        str5 = defaultValue;
/* 26 */                        str6 = value;
/* 27 */                        str7 = confirmButtonTitle;
                            } else {
/* 30 */                        str4 = null;
/* 31 */                        str5 = null;
/* 32 */                        str6 = null;
/* 33 */                        cancelButtonTitle = null;
/* 34 */                        str7 = null;
                            }
/* 45 */                    InAppWebViewChromeClient.this.createPromptDialog(webView, str2, str3, jsPromptResult, str4, str5, str6, cancelButtonTitle, str7);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str4, String str5, Object obj) {
/* 3 */                     jsPromptResult.cancel();
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(JsPromptResponse jsPromptResponse) {
/* 6 */                     if (!jsPromptResponse.isHandledByClient()) {
/* 5 */                         return true;
                            }
/* 8 */                     Integer action = jsPromptResponse.getAction();
/* 14 */                    int iIntValue = action != null ? action.intValue() : 1;
/* 18 */                    JsPromptResult jsPromptResult2 = jsPromptResult;
/* 20 */                    if (iIntValue != 0) {
/* 22 */                        jsPromptResult2.cancel();
/* 33 */                        return false;
                            }
/* 30 */                    jsPromptResult2.confirm(jsPromptResponse.getValue());
/* 33 */                    return false;
                        }
                    });
/* 28 */            return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onPermissionRequest(final PermissionRequest permissionRequest) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 3 */             WebViewChannelDelegate.PermissionRequestCallback permissionRequestCallback = new WebViewChannelDelegate.PermissionRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.18
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((PermissionResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(PermissionResponse permissionResponse) {
/* 1 */                     Integer action = permissionResponse.getAction();
/* 6 */                     if (action == null) {
/* 5 */                         return true;
                            }
/* 12 */                    if (action.intValue() != 1) {
/* 16 */                        permissionRequest.deny();
/* 45 */                        return false;
                            }
/* 42 */                    permissionRequest.grant((String[]) permissionResponse.getResources().toArray(new String[permissionResponse.getResources().size()]));
/* 45 */                    return false;
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
/* 6 */                 public void defaultBehaviour(PermissionResponse permissionResponse) {
/* 7 */                     permissionRequest.deny();
                        }
                    };
/* 6 */             InAppWebView inAppWebView = this.inAppWebView;
/* 9 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 35 */                permissionRequestCallback.defaultBehaviour(null);
                    } else {
/* 31 */                webViewChannelDelegate.onPermissionRequest(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()), null, permissionRequestCallback);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 28 */                return;
                    }
/* 25 */            webViewChannelDelegate.onPermissionRequestCanceled(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()));
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
/* 1 */             super.onProgressChanged(webView, i);
/* 4 */             InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 6 */             if (inAppBrowserDelegate != null) {
/* 8 */                 inAppBrowserDelegate.didChangeProgress(i);
                    }
/* 12 */            InAppWebView inAppWebView = (InAppWebView) webView;
/* 14 */            InAppWebViewClientCompat inAppWebViewClientCompat = inAppWebView.inAppWebViewClientCompat;
/* 16 */            if (inAppWebViewClientCompat != null) {
/* 18 */                inAppWebViewClientCompat.loadCustomJavaScriptOnPageStarted(webView);
                    } else {
/* 22 */                InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
/* 24 */                if (inAppWebViewClient != null) {
/* 26 */                    inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
                        }
                    }
/* 29 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 31 */            if (webViewChannelDelegate != null) {
/* 33 */                webViewChannelDelegate.onProgressChanged(i);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedIcon(WebView webView, Bitmap bitmap) {
/* 1 */             super.onReceivedIcon(webView, bitmap);
/* 6 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 13 */            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    try {
/* 16 */                byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
/* 19 */            bitmap.recycle();
/* 24 */            WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 26 */            if (webViewChannelDelegate != null) {
/* 32 */                webViewChannelDelegate.onReceivedIcon(byteArrayOutputStream.toByteArray());
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
/* 1 */             super.onReceivedTitle(webView, str);
/* 4 */             InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 6 */             if (inAppBrowserDelegate != null) {
/* 8 */                 inAppBrowserDelegate.didChangeTitle(str);
                    }
/* 13 */            WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 15 */            if (webViewChannelDelegate != null) {
/* 17 */                webViewChannelDelegate.onTitleChanged(str);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
/* 1 */             super.onReceivedTouchIconUrl(webView, str, z);
/* 6 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 8 */             if (webViewChannelDelegate != null) {
/* 10 */                webViewChannelDelegate.onReceivedTouchIconUrl(str, z);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onRequestFocus(WebView webView) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             InAppWebView inAppWebView = this.inAppWebView;
/* 3 */             if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
/* 12 */                return;
                    }
/* 9 */             webViewChannelDelegate.onRequestFocus();
                }

                @Override // android.webkit.WebChromeClient
                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    ViewGroup rootView;
/* 3 */             if (this.mCustomView != null) {
/* 5 */                 onHideCustomView();
/* 8 */                 return;
                    }
/* 9 */             Activity activity = getActivity();
/* 13 */            if (activity == null || (rootView = getRootView()) == null) {
/* 88 */                return;
                    }
/* 23 */            this.mCustomView = view;
/* 29 */            this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
/* 35 */            this.mOriginalOrientation = activity.getRequestedOrientation();
/* 37 */            this.mCustomViewCallback = customViewCallback;
/* 39 */            View view2 = this.mCustomView;
/* 41 */            if (view2 != null) {
/* 45 */                view2.setBackgroundColor(-16777216);
                    }
/* 50 */            rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT);
/* 59 */            activity.getWindow().setFlags(NotificationCompat.FLAG_GROUP_SUMMARY, NotificationCompat.FLAG_GROUP_SUMMARY);
/* 68 */            ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
/* 71 */            InAppWebView inAppWebView = this.inAppWebView;
/* 73 */            if (inAppWebView != null) {
/* 75 */                WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 77 */                if (webViewChannelDelegate != null) {
/* 79 */                    webViewChannelDelegate.onEnterFullscreen();
                        }
/* 85 */                this.inAppWebView.setInFullscreen(true);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
/* 18 */            return startPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
                }

                public void openFileChooser(ValueCallback<Uri> valueCallback) {
/* 4 */             startPickerIntent(valueCallback, HttpUrl.FRAGMENT_ENCODE_SET, null);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                public boolean startPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z, boolean z2) {
                    Intent videoIntent;
/* 1 */             this.filePathCallback = valueCallback;
/* 7 */             boolean zBooleanValue = acceptsImages(strArr).booleanValue();
/* 15 */            boolean zBooleanValue2 = acceptsVideo(strArr).booleanValue();
/* 19 */            if (!z2 || needsCameraPermission()) {
/* 41 */                videoIntent = null;
                    } else if (zBooleanValue) {
/* 29 */                videoIntent = getPhotoIntent();
                    } else if (zBooleanValue2) {
/* 36 */                videoIntent = getVideoIntent();
                    } else {
/* 41 */                videoIntent = null;
                    }
/* 42 */            if (videoIntent == null) {
/* 46 */                ArrayList arrayList = new ArrayList();
/* 53 */                if (!needsCameraPermission()) {
/* 55 */                    if (zBooleanValue) {
/* 61 */                        arrayList.add(getPhotoIntent());
                            }
/* 64 */                    if (zBooleanValue2) {
/* 70 */                        arrayList.add(getVideoIntent());
                            }
                        }
/* 73 */                Intent fileChooserIntent = getFileChooserIntent(strArr, z);
/* 81 */                Intent intent = new Intent("android.intent.action.CHOOSER");
/* 86 */                intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
/* 100 */               intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
/* 103 */               videoIntent = intent;
                    }
/* 104 */           Activity activity = getActivity();
/* 109 */           if (activity != null && videoIntent.resolveActivity(activity.getPackageManager()) != null) {
/* 121 */               activity.startActivityForResult(videoIntent, 1);
                    }
/* 108 */           return true;
                }

/* 7 */         public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
/* 8 */             startPickerIntent(valueCallback, str, null);
                }

/* 8 */         public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
/* 9 */             startPickerIntent(valueCallback, str, str2);
                }

/* 46 */        private Intent getFileChooserIntent(String[] strArr, boolean z) {
/* 47 */            Intent intent = new Intent("android.intent.action.GET_CONTENT");
/* 48 */            intent.addCategory("android.intent.category.OPENABLE");
/* 49 */            intent.setType("*/*");
/* 50 */            intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
/* 51 */            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
                    return intent;
                }

/* 47 */        private Boolean acceptsImages(String[] strArr) {
                    return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
                }

/* 47 */        private Boolean acceptsVideo(String[] strArr) {
                    return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "video").booleanValue());
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
/* 124 */       public void startPickerIntent(ValueCallback<Uri> valueCallback, String str, String str2) {
                    Intent intentCreateChooser;
/* 125 */           this.filePathCallbackLegacy = valueCallback;
/* 126 */           boolean zBooleanValue = acceptsImages(str).booleanValue();
/* 127 */           boolean zBooleanValue2 = acceptsVideo(str).booleanValue();
/* 128 */           if (str2 == null || needsCameraPermission()) {
                        intentCreateChooser = null;
                    } else if (zBooleanValue) {
/* 129 */               intentCreateChooser = getPhotoIntent();
                    } else if (zBooleanValue2) {
/* 130 */               intentCreateChooser = getVideoIntent();
                    } else {
                        intentCreateChooser = null;
                    }
                    if (intentCreateChooser == null) {
/* 132 */               intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), HttpUrl.FRAGMENT_ENCODE_SET);
/* 133 */               ArrayList arrayList = new ArrayList();
/* 134 */               if (!needsCameraPermission()) {
                            if (zBooleanValue) {
/* 135 */                       arrayList.add(getPhotoIntent());
                            }
                            if (zBooleanValue2) {
/* 136 */                       arrayList.add(getVideoIntent());
                            }
                        }
/* 137 */               intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                    }
/* 138 */           Activity activity = getActivity();
/* 139 */           if (activity == null || intentCreateChooser.resolveActivity(activity.getPackageManager()) == null) {
                        return;
                    }
/* 140 */           activity.startActivityForResult(intentCreateChooser, 3);
                }
            }
