            package com.pichillilorenzo.flutter_inappwebview_android;

            import android.content.Context;
            import android.graphics.BitmapFactory;
            import android.graphics.Insets;
            import android.graphics.Rect;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.net.http.SslCertificate;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.TextUtils;
            import android.util.DisplayMetrics;
            import android.view.WindowInsets;
            import android.view.WindowManager;
            import android.view.WindowMetrics;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.net.HttpURLConnection;
            import java.net.InetAddress;
            import java.net.URL;
            import java.net.UnknownHostException;
            import java.security.Key;
            import java.security.KeyStore;
            import java.security.PrivateKey;
            import java.security.cert.CertificateException;
            import java.security.cert.CertificateFactory;
            import java.security.cert.X509Certificate;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Util {
                public static final String ANDROID_ASSET_URL = "file:///android_asset/";
                static final String LOG_TAG = "Util";

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PrivateKeyAndCertificates {
                    public X509Certificate[] certificates;
                    public PrivateKey privateKey;

                    public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
/* 4 */                 this.privateKey = privateKey;
/* 6 */                 this.certificates = x509CertificateArr;
                    }
                }

                private Util() {
                }

                public static String JSONStringify(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
/* 8 */             if (obj instanceof Map) {
/* 17 */                return new JSONObject((Map) obj).toString();
                    }
/* 24 */            if (obj instanceof List) {
/* 33 */                return new JSONArray((Collection) obj).toString();
                    }
                    return obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
                }

                public static Drawable drawableFromBytes(Context context, byte[] bArr) {
/* 13 */            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }

                public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
/* 17 */            return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str));
                }

                public static Size2D getFullscreenSize(Context context) {
/* 5 */             Size2D size2D = new Size2D(-1.0d, -1.0d);
/* 14 */            WindowManager windowManager = (WindowManager) context.getSystemService("window");
/* 16 */            if (windowManager != null) {
/* 22 */                if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                     WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
/* 1 */                     Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
/* 53 */                    int i = insetsIgnoringVisibility.left + insetsIgnoringVisibility.right;
/* 62 */                    int i2 = insetsIgnoringVisibility.bottom + insetsIgnoringVisibility.top;
/* 1 */                     Rect bounds = currentWindowMetrics.getBounds();
/* 73 */                    size2D.setWidth(bounds.width() - i);
/* 82 */                    size2D.setHeight(bounds.height() - i2);
/* 85 */                    return size2D;
                        }
/* 88 */                DisplayMetrics displayMetrics = new DisplayMetrics();
/* 95 */                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
/* 101 */               size2D.setWidth(displayMetrics.widthPixels);
/* 107 */               size2D.setHeight(displayMetrics.heightPixels);
                    }
/* 110 */           return size2D;
                }

                public static <T> T getOrDefault(Map<String, Object> map, String str, T t) {
                    return map.containsKey(str) ? (T) map.get(str) : t;
                }

                public static float getPixelDensity(Context context) {
/* 9 */             return context.getResources().getDisplayMetrics().density;
                }

                public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
/* 3 */             String assetFilePathByName = inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str);
                    try {
/* 7 */                 InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
/* 11 */                if (fileAsset != null) {
/* 13 */                    fileAsset.close();
                        }
/* 19 */                e = null;
                    } catch (IOException e) {
/* 17 */                e = e;
                    }
/* 23 */            if (e == null) {
/* 27 */                return AbstractC0886en.m3507k(ANDROID_ASSET_URL, assetFilePathByName);
                    }
/* 32 */            throw e;
                }

                public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
/* 7 */             byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
/* 12 */            if (byteArray == null) {
/* 11 */                return null;
                    }
                    try {
/* 30 */                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
                    } catch (CertificateException unused) {
/* 11 */                return null;
                    }
                }

                public static <T> T invokeMethodAndWaitResult(final MethodChannel methodChannel, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
/* 15 */            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.Util.1
                        @Override // java.lang.Runnable
                        public void run() {
/* 9 */                     methodChannel.invokeMethod(str, obj, syncBaseCallbackResultImpl);
                        }
                    });
/* 20 */            syncBaseCallbackResultImpl.latch.await();
/* 23 */            return syncBaseCallbackResultImpl.result;
                }

                public static <O> Object invokeMethodIfExists(O o, String str, Object... objArr) {
/* 12 */            for (Method method : o.getClass().getMethods()) {
/* 24 */                if (method.getName().equals(str)) {
                            try {
/* 26 */                        return method.invoke(o, objArr);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
/* 11 */                        return null;
                            }
                        }
                    }
/* 11 */            return null;
                }

                public static boolean isClass(String str) {
                    try {
/* 1 */                 Class.forName(str);
/* 4 */                 return true;
                    } catch (ClassNotFoundException unused) {
/* 6 */                 return false;
                    }
                }

                public static boolean isIPv6(String str) {
                    try {
/* 1 */                 InetAddress.getByName(str);
/* 4 */                 return true;
                    } catch (UnknownHostException unused) {
/* 6 */                 return false;
                    }
                }

                public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
                    InputStream fileInputStream;
/* 1 */             PrivateKeyAndCertificates privateKeyAndCertificates = null;
                    try {
/* 2 */                 fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
                    } catch (IOException unused) {
/* 7 */                 fileInputStream = null;
                    }
                    try {
/* 8 */                 if (fileInputStream == null) {
                            try {
/* 12 */                        fileInputStream = new FileInputStream(str);
                            } catch (Exception unused2) {
/* 94 */                        if (fileInputStream != null) {
/* 96 */                            fileInputStream.close();
                                }
                            } catch (Throwable th) {
/* 88 */                        if (fileInputStream != null) {
                                    try {
/* 90 */                                fileInputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
/* 93 */                        throw th;
                            }
                        }
/* 19 */                KeyStore keyStore = KeyStore.getInstance(str3);
/* 34 */                keyStore.load(fileInputStream, (str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET).toCharArray());
/* 41 */                String strNextElement = keyStore.aliases().nextElement();
/* 47 */                if (str2 == null) {
/* 50 */                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 55 */                Key key = keyStore.getKey(strNextElement, str2.toCharArray());
/* 77 */                privateKeyAndCertificates = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(strNextElement)}) : null;
/* 81 */                fileInputStream.close();
/* 84 */                fileInputStream.close();
                    } catch (IOException unused4) {
                    }
/* 99 */            return privateKeyAndCertificates;
                }

                public static void log(String str, String str2) {
                    int iMin;
/* 1 */             int length = str2.length();
/* 5 */             int i = 0;
/* 6 */             while (i < length) {
/* 10 */                int iIndexOf = str2.indexOf(10, i);
/* 15 */                if (iIndexOf == -1) {
/* 18 */                    iIndexOf = length;
                        }
                        while (true) {
/* 21 */                    iMin = Math.min(iIndexOf, i + 4000);
/* 25 */                    str2.substring(i, iMin);
/* 28 */                    if (iMin >= iIndexOf) {
                                break;
                            } else {
/* 33 */                        i = iMin;
                            }
                        }
/* 30 */                i = iMin + 1;
                    }
                }

                public static HttpURLConnection makeHttpRequest(String str, String str2, Map<String, String> map) {
                    HttpURLConnection httpURLConnection;
                    try {
/* 11 */                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        try {
/* 13 */                    httpURLConnection.setRequestMethod(str2);
/* 16 */                    if (map != null) {
/* 30 */                        for (Map.Entry<String, String> entry : map.entrySet()) {
/* 50 */                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                                }
                            }
/* 56 */                    httpURLConnection.setConnectTimeout(15000);
/* 59 */                    httpURLConnection.setReadTimeout(15000);
/* 63 */                    httpURLConnection.setDoInput(true);
/* 66 */                    httpURLConnection.setInstanceFollowRedirects(true);
/* 75 */                    if ("GET".equalsIgnoreCase(str2)) {
/* 78 */                        httpURLConnection.setDoOutput(false);
                            }
/* 81 */                    httpURLConnection.connect();
/* 84 */                    return httpURLConnection;
                        } catch (Exception unused) {
/* 86 */                    if (httpURLConnection != null) {
/* 88 */                        httpURLConnection.disconnect();
                            }
/* 1 */                     return null;
                        }
                    } catch (Exception unused2) {
/* 85 */                httpURLConnection = null;
                    }
                }

                public static String normalizeIPv6(String str) throws Exception {
/* 5 */             if (isIPv6(str)) {
/* 11 */                return InetAddress.getByName(str).getCanonicalHostName();
                    }
/* 27 */            throw new Exception(AbstractC0886en.m3507k("Invalid address: ", str));
                }

                public static boolean objEquals(Object obj, Object obj2) {
/* 1 */             return Objects.equals(obj, obj2);
                }

                public static byte[] readAllBytes(InputStream inputStream) {
/* 1 */             byte[] byteArray = null;
/* 2 */             if (inputStream == null) {
/* 1 */                 return null;
                    }
/* 7 */             byte[] bArr = new byte[4096];
/* 11 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
/* 15 */                    int i = inputStream.read(bArr, 0, 4096);
/* 20 */                    if (i == -1) {
                                break;
                            }
/* 22 */                    byteArrayOutputStream.write(bArr, 0, i);
                        } catch (IOException e) {
                            try {
/* 48 */                        inputStream.close();
                            } catch (IOException e2) {
/* 53 */                        e.addSuppressed(e2);
                            }
                            try {
/* 56 */                        byteArrayOutputStream.close();
                            } catch (IOException e3) {
/* 61 */                        e.addSuppressed(e3);
                            }
                        } catch (Throwable th) {
                            try {
/* 41 */                        inputStream.close();
                            } catch (IOException unused) {
                            }
                            try {
/* 44 */                        byteArrayOutputStream.close();
/* 47 */                        throw th;
                            } catch (IOException unused2) {
/* 47 */                        throw th;
                            }
                        }
                    }
/* 30 */            byteArray = byteArrayOutputStream.toByteArray();
                    try {
/* 34 */                inputStream.close();
                    } catch (IOException unused3) {
                    }
                    try {
/* 37 */                byteArrayOutputStream.close();
                    } catch (IOException unused4) {
                    }
/* 64 */            return byteArray;
                }

                public static String replaceAll(String str, String str2, String str3) {
/* 9 */             return TextUtils.join(str3, str.split(Pattern.quote(str2)));
                }
            }
