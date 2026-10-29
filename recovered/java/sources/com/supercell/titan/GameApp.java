            package com.supercell.titan;

            import android.app.Activity;
            import android.app.AlarmManager;
            import android.app.Application;
            import android.app.Fragment;
            import android.app.FragmentManager;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.app.backup.BackupManager;
            import android.content.ActivityNotFoundException;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.PackageManager;
            import android.content.res.AssetManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.Point;
            import android.hardware.display.DisplayManager;
            import android.media.AudioManager;
            import android.net.Uri;
            import android.net.wifi.WifiManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.StatFs;
            import android.os.Vibrator;
            import android.service.notification.StatusBarNotification;
            import android.util.Base64;
            import android.util.DisplayMetrics;
            import android.view.Display;
            import android.view.DisplayCutout;
            import android.view.KeyEvent;
            import android.view.Surface;
            import android.view.View;
            import android.view.Window;
            import android.view.WindowInsets;
            import android.view.WindowManager;
            import android.view.inputmethod.InputMethodManager;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import com.supercell.titan.GameApp;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.Optional;
            import java.util.UUID;
            import java.util.Vector;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import org.fmod.FMOD;
            import org.json.JSONArray;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.RunnableC2213tc;
            import p000.ap1;
            import p000.cq0;
            import p000.d52;
            import p000.dp0;
            import p000.dq0;
            import p000.eq0;
            import p000.fm0;
            import p000.p92;
            import p000.rd0;
            import p000.v00;
            import p000.yo1;
            import p000.zo1;
            import p000.zp0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public class GameApp extends Activity {

                /* JADX INFO: renamed from: U */
                public int f5748U;

                /* JADX INFO: renamed from: V */
                public Vector f5749V;

                /* JADX INFO: renamed from: W */
                public GL2JNISurfaceView f5750W;

                /* JADX INFO: renamed from: X */
                public boolean f5751X;

                /* JADX INFO: renamed from: Y */
                public boolean f5752Y;

                /* JADX INFO: renamed from: Z */
                public AlarmManager f5753Z;

                /* JADX INFO: renamed from: a */
                public WifiManager.WifiLock f5754a;

                /* JADX INFO: renamed from: a0 */
                public String f5755a0;

                /* JADX INFO: renamed from: b */
                public Handler f5756b;

                /* JADX INFO: renamed from: b0 */
                public String f5757b0;

                /* JADX INFO: renamed from: c */
                public boolean f5758c;

                /* JADX INFO: renamed from: c0 */
                public final int f5759c0;

                /* JADX INFO: renamed from: d */
                public boolean f5760d;

                /* JADX INFO: renamed from: d0 */
                public Bundle f5761d0;

                /* JADX INFO: renamed from: e */
                public Thread f5762e;

                /* JADX INFO: renamed from: e0 */
                public final Class f5763e0;

                /* JADX INFO: renamed from: f */
                public cq0 f5764f;

                /* JADX INFO: renamed from: f0 */
                public PurchaseManagerGoogle f5765f0;

                /* JADX INFO: renamed from: g0 */
                public SecurePreferences f5766g0;

                /* JADX INFO: renamed from: h0 */
                public SecurePreferences f5767h0;

                /* JADX INFO: renamed from: i */
                public int f5768i;

                /* JADX INFO: renamed from: i0 */
                public SecurePreferences f5769i0;

                /* JADX INFO: renamed from: j0 */
                public SharedPreferences f5770j0;

                /* JADX INFO: renamed from: k0 */
                public GoogleServiceClient f5771k0;

                /* JADX INFO: renamed from: l0 */
                public boolean f5772l0;

                /* JADX INFO: renamed from: m0 */
                public final Vector f5773m0;

                /* JADX INFO: renamed from: n0 */
                public int f5774n0;

                /* JADX INFO: renamed from: o0 */
                public final QuagoActivityLifecycleCallbacks f5775o0;

                /* JADX INFO: renamed from: p0 */
                public final ArrayList f5776p0;

                /* JADX INFO: renamed from: q0 */
                public float f5777q0;

                /* JADX INFO: renamed from: r0 */
                public float f5778r0;
                public int requestedOrientation;

                /* JADX INFO: renamed from: s0 */
                public int f5779s0;

                /* JADX INFO: renamed from: t0 */
                public final ReentrantLock f5780t0;

                /* JADX INFO: renamed from: u0 */
                public final RunnableC2213tc f5781u0;

                /* JADX INFO: renamed from: v */
                public int f5782v;

                /* JADX INFO: renamed from: v0 */
                public boolean f5783v0;

                /* JADX INFO: renamed from: w */
                public int f5784w;

                /* JADX INFO: renamed from: w0 */
                public final AtomicBoolean f5785w0;
                public static final int LOG_OUT_REASON_ANTI_ADDICTION = 6;
                public static final int LOG_OUT_REASON_AUTH_EXPIRED = 2;
                public static final int LOG_OUT_REASON_CANCEL_QQ_AUTH = 7;
                public static final int LOG_OUT_REASON_CANCEL_WECHAT_AUTH = 8;
                public static final int LOG_OUT_REASON_DENY_WECHAT_AUTH = 9;
                public static final int LOG_OUT_REASON_LOGIN_TIMEOUT = 4;
                public static final int LOG_OUT_REASON_NOT_IN_WHITE_LIST = 5;
                public static final int LOG_OUT_REASON_SWITCH_USER = 3;
                public static final int LOG_OUT_REASON_UNKNOWN = 0;
                public static final int LOG_OUT_REASON_USER = 1;
                public static final int SHOW_STORE_PAGE_REQUEST_CODE = 990001;
                public static final int ScreenOrientation_LandscapeLeft = 4;
                public static final int ScreenOrientation_LandscapeRight = 8;
                public static final int ScreenOrientation_Portrait = 1;
                public static final int ScreenOrientation_PortraitUpsideDown = 2;

                /* JADX INFO: renamed from: x0 */
                public static GameApp f5745x0 = null;

                /* JADX INFO: renamed from: y0 */
                public static int f5746y0 = (int) (System.currentTimeMillis() / 1000);

                /* JADX INFO: renamed from: z0 */
                public static final Vector f5747z0 = new Vector();

                /* JADX INFO: renamed from: A0 */
                public static final Vector f5743A0 = new Vector();

                /* JADX INFO: renamed from: B0 */
                public static final ConcurrentHashMap f5744B0 = new ConcurrentHashMap();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ActivityEventListener {
                    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class NotificationData {
                    public String actionId;
                    public String channelId;
                    public String chronosEventId;
                    public int deliveryErrorCode;
                    public String message;
                    public String notificationId;
                    public int source;
                    public String title;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum NotificationSource {
                    NOT_SET(-1),
                    CHRONOS(1),
                    SERVER(2),
                    LOCAL(3),
                    SOCIAL(4);


                    /* JADX INFO: renamed from: a */
                    public final int f5787a;

                    NotificationSource(int i) {
/* 4 */                 this.f5787a = i;
                    }

                    public static NotificationSource fromCode(int i) {
/* 2 */                 if (i == -1) {
/* 31 */                    return NOT_SET;
                        }
/* 5 */                 if (i == 1) {
/* 28 */                    return CHRONOS;
                        }
/* 8 */                 if (i == 2) {
/* 25 */                    return SERVER;
                        }
/* 11 */                if (i != 3) {
                            return i != 4 ? NOT_SET : SOCIAL;
                        }
/* 22 */                return LOCAL;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnActivityResultListener {
                    void onActivityResult(int i, int i2, Intent intent);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class QuagoActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 QuagoManager.onPause();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 QuagoManager.onResume();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
/* 1 */                 activity.getClass();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ShowStorePageListener {
                    void onCompletion(boolean z);
                }

                public GameApp(int i, Class<?> cls, Class<?> cls2) {
/* 5 */             this.f5764f = null;
/* 8 */             this.f5768i = 0;
/* 10 */            this.f5782v = 0;
/* 12 */            this.f5784w = 0;
/* 14 */            this.f5748U = 0;
/* 18 */            this.f5755a0 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */            this.f5757b0 = "this game";
/* 24 */            this.f5770j0 = null;
/* 31 */            this.f5773m0 = new Vector();
/* 34 */            this.f5774n0 = -1;
/* 41 */            this.f5775o0 = new QuagoActivityLifecycleCallbacks();
/* 48 */            this.f5776p0 = new ArrayList();
/* 52 */            this.f5777q0 = Float.NaN;
/* 54 */            this.f5779s0 = 0;
/* 61 */            this.f5780t0 = new ReentrantLock();
/* 69 */            this.f5781u0 = new RunnableC2213tc(this, 1);
/* 76 */            this.f5785w0 = new AtomicBoolean(false);
/* 78 */            this.f5759c0 = i;
/* 80 */            this.f5763e0 = cls;
                }

                /* JADX INFO: renamed from: a */
                public static C0797d m2725a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2, String str9, NotificationSource notificationSource) {
/* 3 */             GameApp gameApp = f5745x0;
/* 7 */             Intent intent = new Intent(gameApp, (Class<?>) gameApp.f5763e0);
/* 12 */            intent.putExtra(NotificationCompat.CATEGORY_MESSAGE, str2);
/* 17 */            intent.putExtra("id", i);
/* 22 */            intent.putExtra("title", str3);
/* 27 */            intent.putExtra("sound", str4);
/* 32 */            intent.putExtra("userId", str);
/* 37 */            intent.putExtra("imageURL", str5);
/* 42 */            intent.putExtra("channelId", str6);
/* 47 */            intent.putExtra("channelName", str7);
/* 52 */            intent.putExtra("channelDesc", str8);
/* 57 */            intent.putExtra("color", i2);
/* 62 */            intent.putExtra("iconResourceName", str9);
/* 69 */            intent.putExtra(FirebaseAnalytics.Param.SOURCE, notificationSource.f5787a);
/* 74 */            C0797d c0797d = new C0797d();
/* 77 */            c0797d.f5996c = i;
/* 79 */            c0797d.f5997d = str2;
/* 81 */            c0797d.f5998e = str3;
/* 83 */            c0797d.f5995b = str;
/* 85 */            c0797d.f5999f = str4;
/* 87 */            c0797d.f6000g = str6;
/* 89 */            c0797d.f6001h = notificationSource;
/* 99 */            c0797d.f5994a = PendingIntent.getBroadcast(f5745x0, i, intent, 1140850688);
/* 101 */           return c0797d;
                }

                public static void addDisplayedNotificationForCancelTracking(NotificationData notificationData) {
                    String str;
/* 1 */             if (notificationData == null || (str = notificationData.notificationId) == null || str.isEmpty()) {
/* 20 */                return;
                    }
/* 17 */            f5744B0.put(notificationData.notificationId, notificationData);
                }

                public static boolean areNotificationsEnabled() {
/* 12 */            return zo1.m10416a(new ap1(getInstance()).f2052a);
                }

                /* JADX INFO: renamed from: b */
                public static void m2726b(Intent intent) {
/* 1 */             if (intent == null || intent.getExtras() == null) {
/* 182 */               return;
                    }
/* 11 */            Bundle extras = intent.getExtras();
/* 17 */            String string = extras.getString("title");
/* 23 */            String string2 = extras.getString(NotificationCompat.CATEGORY_MESSAGE);
/* 29 */            String string3 = extras.getString("chronosPushNotificationId");
/* 35 */            String string4 = extras.getString("notificationUniqueId");
/* 41 */            String string5 = extras.getString("userId");
/* 48 */            extras.getInt("id", -1);
/* 51 */            NotificationSource notificationSource = NotificationSource.NOT_SET;
/* 57 */            int i = extras.getInt(FirebaseAnalytics.Param.SOURCE, notificationSource.f5787a);
/* 63 */            if (i == notificationSource.f5787a) {
/* 81 */                i = (string3 == null || string3.isEmpty()) ? NotificationSource.SERVER.f5787a : NotificationSource.CHRONOS.f5787a;
                    }
/* 86 */            NotificationData notificationData = new NotificationData();
/* 91 */            if (string == null) {
/* 94 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 95 */            notificationData.title = string;
/* 99 */            notificationData.actionId = "tap";
/* 101 */           if (string2 == null) {
/* 104 */               string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 105 */           notificationData.message = string2;
/* 118 */           notificationData.chronosEventId = (string3 == null || string3.isEmpty()) ? HttpUrl.FRAGMENT_ENCODE_SET : string3;
/* 120 */           if (string4 != null && !string4.isEmpty()) {
/* 128 */               notificationData.notificationId = string4;
                    } else if (i != NotificationSource.LOCAL.f5787a || string5 == null || string5.isEmpty()) {
/* 156 */               notificationData.notificationId = UUID.randomUUID().toString();
                    } else {
/* 145 */               notificationData.notificationId = string5;
                    }
/* 158 */           notificationData.source = i;
/* 166 */           notificationData.channelId = extras.getString("channelId", HttpUrl.FRAGMENT_ENCODE_SET);
/* 168 */           if (string3 == null) {
/* 171 */               string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 172 */           notificationData.chronosEventId = string3;
/* 176 */           removeDisplayedNotificationFromCancelTracking(notificationData.notificationId);
/* 179 */           trackNotificationReceived(notificationData);
                }

                public static native boolean backButtonPressed();

                public static void cancelAllNotifications() {
/* 3 */             AlarmManager alarmManager = f5745x0.f5753Z;
/* 5 */             Vector vector = f5747z0;
                    synchronized (vector) {
/* 8 */                 vector.clear();
/* 13 */                f5743A0.clear();
                    }
/* 25 */            String string = f5745x0.f5770j0.getString("localNotifications", HttpUrl.FRAGMENT_ENCODE_SET);
/* 33 */            if (string.isEmpty()) {
/* 181 */               return;
                    }
/* 49 */            f5745x0.f5770j0.edit().remove("localNotifications").apply();
                    try {
/* 54 */                JSONArray jSONArray = new JSONArray(string);
/* 57 */                int i = 0;
/* 62 */                while (i < jSONArray.length()) {
/* 64 */                    JSONObject jSONObject = jSONArray.getJSONObject(i);
/* 70 */                    String string2 = jSONObject.getString("userId");
/* 76 */                    String string3 = jSONObject.getString("sound");
/* 82 */                    String strOptString = jSONObject.optString("title");
/* 88 */                    String strOptString2 = jSONObject.optString("imageURL");
/* 136 */                   int i2 = i;
/* 150 */                   C0797d c0797dM2725a = m2725a(string2, jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE), strOptString, string3, jSONObject.getInt("id"), strOptString2, jSONObject.optString("channelId"), jSONObject.optString("channelName"), jSONObject.optString("channelDesc"), jSONObject.optInt("color"), jSONObject.optString("iconResourceName"), NotificationSource.fromCode(jSONObject.optInt(FirebaseAnalytics.Param.SOURCE, NotificationSource.NOT_SET.f5787a)));
/* 154 */                   if (alarmManager != null) {
/* 158 */                       alarmManager.cancel(c0797dM2725a.f5994a);
/* 161 */                       trackNotificationCanceled(c0797dM2725a);
                            }
/* 164 */                   i = i2 + 1;
                        }
                    } catch (Exception e) {
/* 168 */               SentryTitan.m2745a(e);
/* 175 */               AbstractC1245n0.m4877e("GameApp", "GameApp.cancelAllNotifications()", e);
/* 178 */               debuggerException(e);
                    }
                }

                public static void cancelNotification(int i) {
                    SharedPreferences sharedPreferences;
                    AlarmManager alarmManager;
/* 1 */             int i2 = i;
/* 3 */             Vector vector = f5747z0;
                    synchronized (vector) {
                        try {
/* 6 */                     int size = vector.size();
                            while (true) {
/* 10 */                        size--;
/* 12 */                        if (size < 0) {
                                    break;
                                }
/* 14 */                        Vector vector2 = f5747z0;
/* 20 */                        C0797d c0797d = (C0797d) vector2.get(size);
/* 24 */                        if (c0797d.f5996c == i2) {
/* 26 */                            GameApp gameApp = f5745x0;
/* 28 */                            if (gameApp != null && (alarmManager = gameApp.f5753Z) != null) {
/* 36 */                                alarmManager.cancel(c0797d.f5994a);
                                    }
/* 43 */                            trackNotificationCanceled(c0797d);
/* 46 */                            vector2.remove(size);
/* 51 */                            f5743A0.remove(size);
                                }
                            }
                        } catch (Throwable th) {
/* 285 */                   throw th;
                        }
                    }
/* 56 */            GameApp gameApp2 = f5745x0;
/* 58 */            if (gameApp2 == null || (sharedPreferences = gameApp2.f5770j0) == null) {
/* 283 */               return;
                    }
/* 72 */            String string = sharedPreferences.getString("localNotifications", HttpUrl.FRAGMENT_ENCODE_SET);
/* 80 */            if (string.isEmpty()) {
/* 283 */               return;
                    }
/* 84 */            AlarmManager alarmManager2 = f5745x0.f5753Z;
                    try {
/* 88 */                JSONArray jSONArray = new JSONArray(string);
/* 93 */                JSONArray jSONArray2 = new JSONArray();
/* 97 */                int i3 = 0;
/* 102 */               while (i3 < jSONArray.length()) {
/* 104 */                   JSONObject jSONObject = jSONArray.getJSONObject(i3);
/* 114 */                   if (i2 == jSONObject.getInt("id")) {
/* 194 */                       C0797d c0797dM2725a = m2725a(jSONObject.getString("userId"), jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE), jSONObject.optString("title"), jSONObject.getString("sound"), i2, jSONObject.optString("imageURL"), jSONObject.optString("channelId"), jSONObject.optString("channelName"), jSONObject.optString("channelDesc"), jSONObject.optInt("color"), jSONObject.optString("iconResourceName"), NotificationSource.fromCode(jSONObject.optInt(FirebaseAnalytics.Param.SOURCE, NotificationSource.NOT_SET.f5787a)));
/* 198 */                       if (alarmManager2 != null) {
/* 202 */                           alarmManager2.cancel(c0797dM2725a.f5994a);
                                }
/* 205 */                       trackNotificationCanceled(c0797dM2725a);
                            } else {
/* 209 */                       jSONArray2.put(jSONObject);
                            }
/* 212 */                   i3++;
/* 214 */                   i2 = i;
                        }
/* 217 */               int length = jSONArray2.length();
/* 225 */               if (length != jSONArray.length()) {
/* 227 */                   if (length == 0) {
/* 243 */                       f5745x0.f5770j0.edit().remove("localNotifications").apply();
                            } else {
/* 265 */                       f5745x0.f5770j0.edit().putString("localNotifications", jSONArray2.toString()).apply();
                            }
                        }
                    } catch (Exception e) {
/* 270 */               SentryTitan.m2745a(e);
/* 277 */               AbstractC1245n0.m4877e("GameApp", "Gameapp.cancelNotification()", e);
/* 280 */               debuggerException(e);
                    }
                }

                public static native String createGameMain(AssetManager assetManager, String str, String str2, String str3, long j, int i, int i2, int i3, float f, float f2, int i4, String str4, Activity activity);

                public static int createNotification(String str, String str2, int i, long j, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
/* 19 */            String string = (str == null || str.isEmpty()) ? UUID.randomUUID().toString() : str;
/* 24 */            long jCurrentTimeMillis = 0;
/* 30 */            if (j > 0) {
/* 32 */                jCurrentTimeMillis = j * 1000;
                    } else if (i > 0) {
/* 44 */                jCurrentTimeMillis = System.currentTimeMillis() + (((long) i) * 1000);
                    }
/* 34 */            long j2 = jCurrentTimeMillis;
/* 49 */            int i3 = f5746y0 + 1;
/* 51 */            f5746y0 = i3;
/* 53 */            cancelNotification(i3);
/* 79 */            C0797d c0797dM2725a = m2725a(string, str2, str3, str8, i3, str4, str5, str6, str7, i2, str9, NotificationSource.LOCAL);
/* 83 */            long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 89 */            if (j2 > jCurrentTimeMillis2) {
/* 220 */               Vector vector = f5747z0;
                        synchronized (vector) {
/* 223 */                   vector.add(c0797dM2725a);
/* 232 */                   f5743A0.add(Long.valueOf(j2));
                        }
/* 236 */               m2728e(c0797dM2725a);
/* 239 */               return i3;
                    }
/* 103 */           if (Objects.equals(f5745x0.getPackageName(), "com.supercell.clashroyale")) {
/* 105 */               Locale locale = Locale.US;
/* 137 */               SentryTitan.m2746b("Alarm fire time is in the past fireTime=" + j2 + " timeNow=" + jCurrentTimeMillis2 + " id=" + string);
                    }
/* 140 */           String.valueOf(j2);
/* 145 */           AlarmManager alarmManager = f5745x0.f5753Z;
/* 147 */           m2728e(c0797dM2725a);
                    try {
/* 156 */               alarmManager.set(0, jCurrentTimeMillis2 + 1000, c0797dM2725a.f5994a);
                    } catch (IllegalStateException e) {
/* 212 */               SentryTitan.addEvent(null, p92.ERROR, e, new SentryTitan.EventAttachment[]{new SentryTitan.EventFileAttachment(f5745x0.getFilesDir().getParent() + "/shared_prefs/localPrefs-plain.xml")}, null);
/* 216 */               m2727d(c0797dM2725a, 3);
                    } catch (Exception e2) {
/* 166 */               SentryTitan.addEvent(null, p92.ERROR, e2, null, null);
/* 170 */               m2727d(c0797dM2725a, 4);
                    }
/* 152 */           return 0;
                }

                /* JADX INFO: renamed from: d */
                public static void m2727d(C0797d c0797d, int i) {
/* 5 */             if (isNativeLibraryLoaded()) {
/* 10 */                NotificationData notificationData = new NotificationData();
/* 13 */                String str = c0797d.f5995b;
/* 17 */                if (str == null) {
/* 20 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 21 */                notificationData.notificationId = str;
/* 23 */                NotificationSource notificationSource = c0797d.f6001h;
/* 25 */                if (notificationSource == null) {
/* 30 */                    notificationSource = NotificationSource.LOCAL;
                        }
/* 33 */                notificationData.source = notificationSource.f5787a;
/* 37 */                notificationData.message = c0797d.f5997d;
/* 41 */                notificationData.title = c0797d.f5998e;
/* 45 */                notificationData.channelId = c0797d.f6000g;
/* 47 */                notificationData.chronosEventId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 49 */                notificationData.actionId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 51 */                notificationData.deliveryErrorCode = i;
/* 53 */                notificationDelivered(notificationData);
                    }
                }

                public static void debuggerException(Exception exc) {
/* 1 */             if (exc == null || f5745x0 == null) {
/* 38 */                return;
                    }
/* 9 */             StringWriter stringWriter = new StringWriter();
/* 17 */            exc.printStackTrace(new PrintWriter(stringWriter));
/* 20 */            String string = stringWriter.toString();
/* 28 */            AbstractC1245n0.m4877e("GameApp", "debuggerException", exc);
/* 35 */            f5745x0.f5773m0.add(string);
                }

                public static void debuggerWarning(String str) {
/* 1 */             if (str != null) {
/* 7 */                 AbstractC1245n0.m4889q("GameApp", "GameApp.debuggerWarning:");
/* 10 */                AbstractC1245n0.m4889q("GameApp", str);
/* 17 */                f5745x0.f5773m0.add(str);
                    }
                }

                public static native void deinit();

                public static native void dialogDismissed(int i, int i2);

                /* JADX INFO: renamed from: e */
                public static void m2728e(C0797d c0797d) {
/* 5 */             if (isNativeLibraryLoaded()) {
/* 10 */                NotificationData notificationData = new NotificationData();
/* 13 */                String str = c0797d.f5995b;
/* 17 */                if (str == null) {
/* 20 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 21 */                notificationData.notificationId = str;
/* 23 */                NotificationSource notificationSource = c0797d.f6001h;
/* 25 */                if (notificationSource == null) {
/* 30 */                    notificationSource = NotificationSource.LOCAL;
                        }
/* 33 */                notificationData.source = notificationSource.f5787a;
/* 37 */                notificationData.message = c0797d.f5997d;
/* 41 */                notificationData.title = c0797d.f5998e;
/* 45 */                notificationData.channelId = c0797d.f6000g;
/* 47 */                notificationData.chronosEventId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 49 */                notificationData.actionId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 51 */                notificationScheduled(notificationData);
                    }
                }

                public static String getAPKPath() {
/* 5 */             if (getInstance() != null) {
/* 15 */                return getInstance().getApplicationInfo().sourceDir;
                    }
/* 18 */            return null;
                }

                public static native int getAllowedScreenRotations();

                public static Display.Mode getCurrentDisplayMode() {
/* 13 */            return getInstance().getWindowManager().getDefaultDisplay().getMode();
                }

                public static Display.Mode[] getDisplayModes() {
/* 13 */            return getInstance().getWindowManager().getDefaultDisplay().getSupportedModes();
                }

                public static int[] getHuaweiNotchSize(Context context) {
/* 2 */             int[] iArr = {0, 0};
                    try {
/* 12 */                Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
/* 27 */                return (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
                    } catch (Throwable unused) {
/* 30 */                return iArr;
                    }
                }

                public static GameApp getInstance() {
/* 1 */             return f5745x0;
                }

                public static int getNumberOfActiveNotifications() {
                    List<StatusBarNotification> listM10163a;
/* 6 */             if (areNotificationsEnabled() || (listM10163a = yo1.m10163a(new ap1(getInstance()).f2052a)) == null) {
/* 5 */                 return 0;
                    }
/* 26 */            return listM10163a.size();
                }

                public static native void handleDeeplinkURL(String str);

                public static native void handleObservation(int i);

                public static void hapticFeedback(int i) {
/* 5 */             if (getInstance() != null) {
/* 17 */                getInstance().runOnUiThread(new eq0(i, 0));
                    }
                }

                public static boolean hasHuaweiNotchInScreen(Context context) {
                    try {
/* 7 */                 Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
/* 24 */                return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
                    } catch (Throwable unused) {
/* 29 */                return false;
                    }
                }

                public static boolean isEmulator() {
                    try {
/* 7 */                 getInstance().f5762e.join();
                    } catch (Exception unused) {
                    }
/* 14 */            return getInstance().f5760d;
                }

                public static boolean isFeatureEnabled(String str) {
                    try {
/* 5 */                 BuildConfig.class.getField("EnabledFeatures");
/* 16 */                return ((ArrayList) ReflectionUtils.getStaticFieldValue("com.supercell.titan.BuildConfig", "EnabledFeatures")).contains(str);
                    } catch (Exception unused) {
/* 42 */                AbstractC1245n0.m4889q("GameApp", "BuildConfig does not have field EnabledFeatures, for checking if '" + str + "' is enabled.");
/* 45 */                return false;
                    }
                }

                public static boolean isNativeLibraryLoaded() {
/* 1 */             return TitanApplication.nativeLibrariesLoaded;
                }

                public static boolean isPlayingUserMusic() {
                    AudioManager audioManager;
/* 5 */             if (getInstance() == null || (audioManager = (AudioManager) getInstance().getSystemService("audio")) == null) {
/* 26 */                return false;
                    }
/* 21 */            return audioManager.isMusicActive();
                }

                public static native boolean isScreenResizeSupported();

                public static void killGame() {
/* 5 */             getInstance().finishAndRemoveTask();
/* 9 */             System.exit(1);
                }

                public static native void logDebuggerException(String str);

                public static native void nOnActivityResult(int i, int i2, Intent intent);

                public static native void nOnAppStart();

                public static native void nOnAppStop();

                public static native void nOnApplicationCreate();

                public static native void nOnConfigurationChanged(Configuration configuration);

                public static native void nOnCreate();

                public static native void nOnDestroy();

                public static native void nOnDisplayAdded(int i);

                public static native void nOnDisplayChanged(int i);

                public static native void nOnDisplayRemoved(int i);

                public static native void nOnKeyDownEvent(int i, int i2);

                public static native void nOnKeyRemap(long j, int[] iArr, int[] iArr2, String str);

                public static native void nOnKeyUpEvent(int i, int i2);

                public static native void nOnMouseEvent(float f, float f2);

                public static native void nOnMouseHoverEvent(float f, float f2);

                public static native void nOnPause();

                public static native void nOnRestart();

                public static native void nOnResume();

                public static native void nOnStart();

                public static native void nOnStop();

                public static native void nOnSurfaceChanged(Surface surface, int i, int i2);

                public static native void nOnSurfaceCreated(Surface surface);

                public static native void nOnSurfaceDestroyed(Surface surface);

                public static native void nOnTouchEvent(int i, int i2, int i3, int i4);

                public static native void nOnTrimMemory(int i);

                public static native void nOnWindowFocusChanged(boolean z);

                public static native void nRunFromUiThread(long j);

                private static native void notificationCanceled(NotificationData notificationData);

                private static native void notificationDelivered(NotificationData notificationData);

                private static native void notificationReceived(NotificationData notificationData);

                private static native void notificationReceivedOnly(NotificationData notificationData);

                private static native void notificationScheduled(NotificationData notificationData);

                public static void openNotificationSettings() {
/* 1 */             GameApp gameApp = getInstance();
/* 7 */             Intent intent = new Intent();
/* 16 */            if (Build.VERSION.SDK_INT >= 26) {
/* 18 */                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
/* 27 */                intent.putExtra("android.provider.extra.APP_PACKAGE", gameApp.getPackageName());
                    } else {
/* 31 */                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
/* 40 */                intent.putExtra("app_package", gameApp.getPackageName());
/* 51 */                intent.putExtra("app_uid", gameApp.getApplicationInfo().uid);
                    }
/* 54 */            gameApp.startActivity(intent);
                }

                public static void queuePushNotificationValueUpdate(int i, String str, String str2) {
/* 5 */             if (getInstance() == null || getInstance().isStopped()) {
/* 30 */                return;
                    }
/* 27 */            getInstance().runOnView(new dq0(str, i, 0, str2));
                }

                public static void reloadApp() {
/* 5 */             AbstractC1245n0.m4889q("GameApp", "reloadApp");
/* 8 */             GameApp gameApp = getInstance();
/* 12 */            gameApp.requestFinish();
/* 19 */            gameApp.startActivity(gameApp.getIntent());
                }

                public static void removeDisplayedNotificationFromCancelTracking(String str) {
/* 1 */             if (str != null) {
/* 5 */                 f5744B0.remove(str);
                    }
                }

                public static native void setDeviceVerificationResult(boolean z, boolean z2, String str);

                public static void setDisplayMode(int i) {
/* 11 */            getInstance().runOnUiThread(new eq0(i, 1));
                }

                public static native void setPushNotificationValues(int i, String str, String str2);

                public static native void setSafeMargins(int i, int i2, int i3, int i4);

                public static void testDeviceIntegrity(byte[] bArr) {
/* 5 */             if (getInstance() != null) {
/* 11 */                getInstance().getClass();
                    }
                }

                public static void trackNotificationCanceled(C0797d c0797d) {
/* 3 */             NotificationData notificationData = new NotificationData();
/* 6 */             String string = c0797d.f5995b;
/* 8 */             if (string == null) {
/* 15 */                string = UUID.randomUUID().toString();
                    }
/* 19 */            notificationData.notificationId = string;
/* 25 */            notificationData.source = c0797d.f6001h.f5787a;
/* 29 */            notificationData.message = c0797d.f5997d;
/* 33 */            notificationData.title = c0797d.f5998e;
/* 37 */            notificationData.actionId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 39 */            notificationData.chronosEventId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 43 */            notificationData.channelId = c0797d.f6000g;
/* 45 */            trackNotificationCanceled(notificationData);
                }

                public static void trackNotificationDelivered(NotificationData notificationData) {
/* 1 */             if (notificationData == null || !isNativeLibraryLoaded()) {
/* 12 */                return;
                    }
/* 9 */             notificationDelivered(notificationData);
                }

                public static void trackNotificationReceived(NotificationData notificationData) {
/* 1 */             notificationReceived(notificationData);
                }

                public static void trackNotificationReceivedOnly(NotificationData notificationData) {
/* 1 */             if (notificationData == null || !isNativeLibraryLoaded()) {
/* 12 */                return;
                    }
/* 9 */             notificationReceivedOnly(notificationData);
                }

                public static void vibrateDevice() {
                    try {
/* 9 */                 Vibrator vibrator = (Vibrator) f5745x0.getSystemService("vibrator");
/* 11 */                if (vibrator != null && vibrator.hasVibrator()) {
/* 22 */                    vibrator.vibrate(400L);
                        }
                    } catch (Exception e) {
/* 31 */                AbstractC1245n0.m4877e("GameApp", "GameApp.vibrateDevice()", e);
                    }
                }

                public void addActivityEventListener(ActivityEventListener activityEventListener) {
/* 3 */             if (this.f5749V == null) {
/* 10 */                this.f5749V = new Vector();
                    }
/* 14 */            this.f5749V.add(activityEventListener);
                }

                public void addActivityResultListener(OnActivityResultListener onActivityResultListener) {
                    synchronized (this.f5776p0) {
/* 6 */                 this.f5776p0.add(onActivityResultListener);
                    }
                }

                public void beforeLogicCallback() {
/* 1 */             PurchaseManager purchaseManager = getPurchaseManager();
/* 5 */             if (purchaseManager != null) {
/* 7 */                 purchaseManager.updateBeforeFrame();
                    }
/* 14 */            NativeHTTPClientManager.getInstance().updateBeforeFrame();
/* 21 */            if (!VirtualKeyboardHandler.visible) {
/* 70 */                if (this.f5778r0 != 0.0f) {
/* 72 */                    VirtualKeyboardHandler.keyboardSizeChanged(0.0f, 0.0f);
                        }
/* 75 */                this.f5777q0 = 0.0f;
/* 77 */                this.f5778r0 = 0.0f;
/* 79 */                this.f5779s0 = 0;
/* 81 */                return;
                    }
/* 25 */            if (this.f5779s0 == 0) {
/* 38 */                new Handler(getMainLooper()).post(this.f5781u0);
                    }
/* 43 */            int i = this.f5779s0 + 1;
/* 45 */            this.f5779s0 = i;
/* 48 */            if (i == 4) {
/* 50 */                this.f5779s0 = 0;
                    }
/* 52 */            float f = this.f5778r0;
/* 58 */            if (f != this.f5777q0) {
/* 60 */                this.f5777q0 = f;
/* 62 */                VirtualKeyboardHandler.keyboardSizeChanged(f, 0.0f);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final synchronized boolean m2729c(String str, String str2, SecurePreferences securePreferences) {
                    boolean z;
                    try {
/* 10 */                if (securePreferences.getString(str).equals(str2)) {
/* 12 */                    z = false;
                        } else {
/* 18 */                    if (str2.isEmpty()) {
/* 20 */                        securePreferences.removeValue(str);
                            } else {
/* 26 */                        securePreferences.put(str, str2);
                            }
/* 29 */                    z = true;
                        }
                    } catch (Throwable th) {
/* 33 */                throw th;
                    }
/* 31 */            return z;
                }

                public Object getBuildConfigFromGame(String str) {
                    String strConcat;
                    try {
/* 7 */                 String stringResourceByName = getStringResourceByName("sc_manifest_package_name");
/* 15 */                if (stringResourceByName.isEmpty()) {
/* 19 */                    AbstractC1245n0.m4876d("GameApp", "sc_manifest_package_name not found from project resources. Please add it for getBuildConfigFromGame() to work. ");
/* 37 */                    strConcat = getPackageName() + ".BuildConfig";
                        } else {
/* 42 */                    strConcat = stringResourceByName.concat(".BuildConfig");
                        }
/* 46 */                Class<?> cls = Class.forName(strConcat);
/* 54 */                return cls.getField(str).get(cls);
                    } catch (Exception unused) {
/* 73 */                AbstractC1245n0.m4876d("GameApp", "Cannot find value for project BuildConfig key: " + str);
/* 76 */                return null;
                    }
                }

                public Bundle getBundle() {
/* 1 */             return this.f5761d0;
                }

                public Vector<String> getDebuggerExceptions() {
/* 1 */             return this.f5773m0;
                }

                public String getGooglePlayClientID() {
/* 1 */             return this.f5755a0;
                }

                public int getIntegerResourceByName(String str) {
/* 1 */             String packageName = getPackageName();
/* 5 */             Resources resources = getResources();
/* 11 */            int identifier = resources.getIdentifier(str, "integer", packageName);
/* 15 */            if (identifier == 0) {
/* 17 */                return 0;
                    }
/* 19 */            return resources.getInteger(identifier);
                }

                public String getKLSSO() {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public synchronized String getKeyValue(String str) {
/* 4 */             String string = this.f5767h0.getString(str);
/* 12 */            if (!string.isEmpty()) {
/* 15 */                return string;
                    }
/* 18 */            String string2 = this.f5766g0.getString(str);
/* 26 */            if (!string2.isEmpty()) {
/* 30 */                this.f5767h0.put(str, string2);
/* 33 */                requestBackup();
                    }
/* 40 */            return string2;
                }

                public PurchaseManager getPurchaseManager() {
/* 1 */             return this.f5765f0;
                }

                public SecurePreferences getSecurePreferences() {
/* 1 */             return this.f5766g0;
                }

                public String getStringResourceByName(String str) {
/* 11 */            int identifier = getResources().getIdentifier(str, "string", getPackageName());
/* 15 */            if (identifier != 0) {
/* 30 */                return getString(identifier);
                    }
/* 21 */            AbstractC1245n0.m4876d("GameApp", "GameApp.getStringResourceByName unable to find String with id:");
/* 24 */            AbstractC1245n0.m4876d("GameApp", str);
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public GL2JNISurfaceView getView() {
/* 1 */             return this.f5750W;
                }

                public void handleDeepLink(String str) {
                    int iLastIndexOf;
/* 1 */             if (str != null) {
/* 3 */                 handleDeeplinkURL(str);
                    }
                    try {
/* 11 */                SharedPreferences sharedPreferences = getSharedPreferences("sentry_preferences", 0);
/* 16 */                sharedPreferences.getString("dsn", null);
/* 19 */                if (str == null || !str.contains("/crashreport.dsn/") || str.length() <= (iLastIndexOf = str.lastIndexOf("/") + 1)) {
/* 74 */                    return;
                        }
/* 43 */                String strSubstring = str.substring(iLastIndexOf);
/* 51 */                if (strSubstring.isEmpty()) {
/* 74 */                    return;
                        }
/* 61 */                String str2 = new String(Base64.decode(strSubstring, 0), StandardCharsets.UTF_8);
/* 64 */                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
/* 68 */                editorEdit.putString("dsn", str2);
/* 71 */                editorEdit.apply();
                    } catch (Exception e) {
/* 80 */                AbstractC1245n0.m4877e("GameApp", "Sentry custom dsn handling failed: ", e);
                    }
                }

                public void handleFocusGained() {
/* 3 */             if (this.f5772l0 && this.f5783v0) {
/* 10 */                this.f5783v0 = false;
/* 18 */                runOnUiThread(new RunnableC2213tc(this, 3));
                    }
                }

                public void handleResume(boolean z) {
/* 11 */            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
/* 13 */            if (wifiManager != null) {
                        try {
/* 15 */                    wifiManager.reconnect();
/* 18 */                    WifiManager.WifiLock wifiLock = this.f5754a;
/* 20 */                    if (wifiLock != null && !wifiLock.isHeld()) {
/* 30 */                        this.f5754a.acquire();
                            }
                        } catch (Exception unused) {
                        }
                    }
/* 35 */            if (!VirtualKeyboardHandler.visible) {
/* 37 */                VirtualKeyboardHandler.hideKeyboard();
                    }
/* 40 */            if (!z) {
/* 44 */                this.f5771k0.onStart();
/* 53 */                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
/* 55 */                if (notificationManager != null) {
                            try {
/* 63 */                        Iterator it = f5744B0.values().iterator();
/* 71 */                        while (it.hasNext()) {
/* 79 */                            trackNotificationReceivedOnly((NotificationData) it.next());
                                }
/* 85 */                        f5744B0.clear();
/* 88 */                        notificationManager.cancelAll();
                            } catch (Exception unused2) {
                            }
                        }
/* 93 */                AlarmManager alarmManager = f5745x0.f5753Z;
                        synchronized (f5747z0) {
/* 98 */                    int i = 0;
                            while (true) {
                                try {
/* 99 */                            Vector vector = f5747z0;
/* 105 */                           if (i >= vector.size()) {
                                        break;
                                    }
/* 111 */                           C0797d c0797d = (C0797d) vector.get(i);
/* 115 */                           alarmManager.cancel(c0797d.f5994a);
/* 118 */                           trackNotificationCanceled(c0797d);
/* 121 */                           i++;
                                } catch (Throwable th) {
/* 129 */                           throw th;
                                }
                            }
                        }
                    }
/* 130 */           PurchaseManagerGoogle purchaseManagerGoogle = this.f5765f0;
/* 132 */           if (purchaseManagerGoogle != null) {
/* 134 */               purchaseManagerGoogle.onResume();
                    }
/* 137 */           HelpshiftTitan.onResume();
/* 142 */           if (this.f5750W != null) {
/* 144 */               nOnStart();
                    }
                }

                public boolean isPortrait() {
/* 17 */            int orientation = ((WindowManager) getApplicationContext().getSystemService("window")).getDefaultDisplay().getOrientation();
                    return orientation == 0 || orientation == 2;
                }

                public boolean isStopped() {
/* 1 */             return this.f5751X;
                }

                @Override // android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
                    ArrayList arrayList;
/* 1 */             super.onActivityResult(i, i2, intent);
/* 4 */             GoogleServiceClient googleServiceClient = this.f5771k0;
/* 6 */             if (googleServiceClient != null) {
/* 8 */                 googleServiceClient.onActivityResult(i, i2, intent);
                    }
/* 11 */            PurchaseManagerGoogle purchaseManagerGoogle = this.f5765f0;
/* 13 */            if (purchaseManagerGoogle != null && i == 10000004) {
/* 20 */                purchaseManagerGoogle.onActivityResult(i, i2, intent);
                    }
                    synchronized (this.f5776p0) {
/* 30 */                arrayList = new ArrayList(this.f5776p0);
                    }
/* 34 */            Iterator it = arrayList.iterator();
/* 42 */            while (it.hasNext()) {
/* 50 */                ((OnActivityResultListener) it.next()).onActivityResult(i, i2, intent);
                    }
/* 58 */            if (isNativeLibraryLoaded()) {
/* 60 */                nOnActivityResult(i, i2, intent);
                    }
                }

                @Override // android.app.Activity
                public void onBackPressed() {
/* 5 */             if (TitanWebView.isInCustomView()) {
/* 7 */                 TitanWebView.hideCustomView();
                    } else {
/* 13 */                if (this.f5750W == null || backButtonPressed()) {
/* 24 */                    return;
                        }
/* 21 */                finish();
                    }
                }

                @Override // android.app.Activity, android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
/* 5 */             if (isNativeLibraryLoaded()) {
/* 7 */                 nOnConfigurationChanged(configuration);
                    }
/* 10 */            super.onConfigurationChanged(configuration);
                }

                /* JADX WARN: Code duplicated, block: B:50:0x0177  */
                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
                    long availableBytes;
                    long j;
                    String string;
                    long availableBytes2;
                    long availableBytes3;
                    long j2;
                    WifiManager wifiManager;
/* 9 */             getApplication().registerActivityLifecycleCallbacks(this.f5775o0);
/* 12 */            super.onCreate(bundle);
/* 15 */            f5745x0 = this;
/* 26 */            this.f5756b = new Handler(getMainLooper());
/* 30 */            new QuagoManager(this);
/* 41 */            ApplicationUtil.requestAdvertiserInfoOnNewThread();
/* 50 */            this.f5755a0 = getStringResourceByName("googleplay_clientid");
/* 52 */            int i = this.f5759c0;
/* 55 */            if (i != -1) {
/* 65 */                this.f5757b0 = getResources().getString(i);
                    } else {
/* 68 */                String str = this.f5757b0;
/* 72 */                if (str == null || str.isEmpty() || this.f5757b0.equals("this game")) {
/* 90 */                    String stringResourceByName = getStringResourceByName("app_name");
/* 94 */                    this.f5757b0 = stringResourceByName;
/* 100 */                   if (stringResourceByName.isEmpty()) {
/* 102 */                       this.f5757b0 = "this game";
                            }
                        }
                    }
/* 104 */           FragmentManager fragmentManager = getFragmentManager();
/* 108 */           if (fragmentManager != null) {
/* 112 */               Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("NativeDialog");
/* 118 */               if (fragmentFindFragmentByTag instanceof NativeDialogManager) {
/* 122 */                   ((NativeDialogManager) fragmentFindFragmentByTag).startupDismiss();
                        }
                    }
/* 127 */           this.f5761d0 = bundle;
/* 134 */           if (Build.VERSION.SDK_INT < 29 && (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) != null) {
/* 158 */               this.f5754a = wifiManager.createWifiLock(1, getPackageName());
                        try {
/* 160 */                   wifiManager.reconnect();
                        } catch (Exception unused) {
                        }
                    }
/* 171 */           this.f5753Z = (AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM);
/* 173 */           Window window = getWindow();
/* 179 */           window.setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
/* 186 */           if (Build.VERSION.SDK_INT >= 28) {
/* 2 */                 window.getAttributes().layoutInDisplayCutoutMode = 1;
                    }
/* 197 */           window.setFlags(134217728, 134217728);
/* 204 */           this.requestedOrientation = getRequestedOrientation();
/* 214 */           if ("6.0".equals(Build.VERSION.RELEASE) && this.requestedOrientation == 7) {
/* 222 */               setRequestedOrientation(6);
/* 227 */               setRequestedOrientation(this.requestedOrientation);
                    }
/* 232 */           if (rd0.f15994k == null) {
/* 243 */               rd0.f15994k = new rd0(getApplicationContext());
                    }
/* 245 */           rd0 rd0Var = rd0.f15994k;
/* 247 */           rd0Var.getClass();
/* 265 */           Thread thread = new Thread(new dp0(rd0Var, new d52(this), 8, false));
/* 268 */           thread.start();
/* 271 */           this.f5762e = thread;
/* 276 */           if (!this.f5752Y) {
/* 280 */               this.f5752Y = true;
/* 282 */               Context applicationContext = getApplicationContext();
/* 290 */               String str2 = applicationContext.getApplicationInfo().dataDir;
/* 296 */               String absolutePath = applicationContext.getCacheDir().getAbsolutePath();
/* 313 */               Optional map = Optional.ofNullable(applicationContext.getExternalFilesDir(null)).map(new zp0());
                        String string2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 324 */               String str3 = (String) map.orElse(HttpUrl.FRAGMENT_ENCODE_SET);
/* 326 */               File cacheDir = getCacheDir();
/* 332 */               if (cacheDir == null || !cacheDir.canWrite()) {
/* 360 */                   cacheDir = null;
/* 361 */                   availableBytes = 0;
                        } else {
                            try {
/* 349 */                       availableBytes = new StatFs(cacheDir.toString()).getAvailableBytes();
                            } catch (Exception unused2) {
/* 354 */                       availableBytes = 0;
                            }
/* 357 */                   if (availableBytes <= 0) {
/* 360 */                       cacheDir = null;
/* 361 */                       availableBytes = 0;
                            }
                        }
/* 362 */               if (cacheDir == null || availableBytes < 1073741824) {
                            try {
/* 387 */                       j = 0;
/* 390 */                       for (File file : v00.getExternalCacheDirs(this)) {
                                    try {
/* 394 */                               if (file != null && file.canWrite()) {
                                            try {
/* 411 */                                       availableBytes2 = new StatFs(file.toString()).getAvailableBytes();
                                            } catch (Exception unused3) {
/* 416 */                                       availableBytes2 = 0;
                                            }
/* 420 */                                   if (availableBytes2 > availableBytes) {
/* 422 */                                       cacheDir = file;
/* 423 */                                       availableBytes = availableBytes2;
                                            }
                                        }
                                    } catch (Exception unused4) {
                                    }
                                }
                            } catch (Exception unused5) {
/* 431 */                       j = 0;
                            }
/* 440 */                   string = cacheDir != null ? cacheDir.toString() : null;
                        } else {
/* 371 */                   string = cacheDir.toString();
/* 377 */                   j = 0;
                        }
/* 441 */               if (string != null) {
                            try {
/* 448 */                       availableBytes3 = new StatFs(string).getAvailableBytes();
                            } catch (Exception unused6) {
/* 453 */                       availableBytes3 = j;
                            }
/* 457 */                   j2 = availableBytes3;
/* 458 */                   if (availableBytes3 <= j) {
/* 460 */                       string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        } else {
/* 462 */                   string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 463 */                   j2 = j;
                        }
/* 465 */               String androidID = ApplicationUtilBase.getAndroidID();
/* 469 */               if (androidID == null || androidID.isEmpty()) {
/* 483 */                   androidID = getPackageName().toUpperCase(Locale.ENGLISH);
                        }
/* 494 */               this.f5766g0 = new SecurePreferences(this, "storage", androidID, true);
/* 496 */               String androidID2 = ApplicationUtilBase.getAndroidID();
/* 500 */               if (androidID2 == null || androidID2.isEmpty()) {
/* 510 */                   androidID2 = fm0.m3783i(androidID, "titan");
                        }
/* 517 */               SharedPreferences sharedPreferences = getSharedPreferences("localPrefs-plain", 0);
/* 521 */               this.f5770j0 = sharedPreferences;
/* 523 */               if (sharedPreferences != null && sharedPreferences.getString("localNotifications", HttpUrl.FRAGMENT_ENCODE_SET).isEmpty()) {
/* 541 */                   SecurePreferences securePreferences = new SecurePreferences(this, "localPrefs", androidID2, true);
/* 544 */                   this.f5769i0 = securePreferences;
/* 546 */                   String string3 = securePreferences.getString("localNotifications");
/* 554 */                   if (!string3.isEmpty()) {
/* 566 */                       this.f5770j0.edit().putString("localNotifications", string3).apply();
/* 571 */                       this.f5769i0.removeValue("localNotifications");
                            }
                        }
/* 576 */               int[] iArr = {102, 76, 120, 89, 66, 57, 77, 56, 52, 65, 98, ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 117, 115, 69, 82, 77, 89, 57, 89, 70, 122, 86, 71};
/* 581 */               String packageName = getPackageName();
/* 585 */               int length = packageName.length();
                        while (true) {
/* 589 */                   length--;
/* 591 */                   if (length < 0) {
                                break;
                            }
/* 604 */                   int iCharAt = ((packageName.charAt(length) ^ iArr[length % 24]) & 31) + 48;
/* 606 */                   StringBuilder sbM3512p = AbstractC0886en.m3512p(string2);
/* 611 */                   sbM3512p.append((char) iCharAt);
/* 614 */                   string2 = sbM3512p.toString();
                        }
/* 626 */               this.f5767h0 = new SecurePreferences(this, "storage_new", string2, true);
/* 630 */               if (!TitanApplication.nativeLibrariesLoaded) {
/* 634 */                   GL2JNISurfaceView gL2JNISurfaceView = new GL2JNISurfaceView(applicationContext);
/* 637 */                   this.f5750W = gL2JNISurfaceView;
/* 639 */                   setContentView(gL2JNISurfaceView);
/* 649 */                   this.f5750W.post(new RunnableC0796c(this));
                        }
/* 652 */               FMOD.init(this);
/* 655 */               NativeHTTPClientManager.getInstance();
/* 658 */               HelpshiftTitan.getNotificationCount();
/* 665 */               Display defaultDisplay = getWindowManager().getDefaultDisplay();
/* 671 */               DisplayMetrics displayMetrics = new DisplayMetrics();
/* 674 */               defaultDisplay.getMetrics(displayMetrics);
/* 678 */               long j3 = j2;
/* 684 */               int i2 = displayMetrics.densityDpi;
/* 688 */               Point point = new Point();
/* 691 */               defaultDisplay.getSize(point);
/* 725 */               this.f5765f0 = new PurchaseManagerGoogle(this, createGameMain(applicationContext.getAssets(), str2, absolutePath, string, j3, point.x, point.y, i2, displayMetrics.xdpi, displayMetrics.ydpi, 2, str3, this));
/* 729 */               GL2JNISurfaceView gL2JNISurfaceView2 = new GL2JNISurfaceView(applicationContext);
/* 732 */               this.f5750W = gL2JNISurfaceView2;
/* 734 */               gL2JNISurfaceView2.setFocusable(true);
/* 739 */               this.f5750W.setFocusableInTouchMode(true);
/* 744 */               setContentView(this.f5750W);
/* 747 */               setSystemUiVisibility();
/* 755 */               this.f5771k0 = new GoogleServiceClient(this);
/* 761 */               if (Build.VERSION.SDK_INT >= 28) {
/* 770 */                   this.f5750W.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: aq0
                                @Override // android.view.View.OnApplyWindowInsetsListener
                                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
/* 1 */                             GameApp gameApp = GameApp.f5745x0;
/* 1 */                             DisplayCutout displayCutout = windowInsets.getDisplayCutout();
/* 11 */                            GameApp gameApp2 = this.f2058a;
/* 16 */                            gameApp2.runOnView(new RunnableC2558zo(10, gameApp2, windowInsets, displayCutout));
/* 19 */                            return windowInsets;
                                }
                            });
                        } else if (hasHuaweiNotchInScreen(getApplicationContext())) {
/* 792 */                   int i3 = getHuaweiNotchSize(getApplicationContext())[1];
/* 802 */                   int i4 = isPortrait() ? i3 : 0;
/* 804 */                   this.f5784w = i4;
/* 806 */                   this.f5748U = i4;
/* 812 */                   if (isPortrait()) {
/* 815 */                       i3 = 0;
                            }
/* 817 */                   this.f5782v = i3;
/* 819 */                   this.f5768i = i3;
/* 821 */                   setScaledSafeMargins();
                        } else if (getApplicationContext().getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
/* 851 */                   int i5 = isPortrait() ? 100 : 0;
/* 853 */                   this.f5784w = i5;
/* 855 */                   this.f5748U = i5;
/* 861 */                   int i6 = isPortrait() ? 0 : 100;
/* 866 */                   this.f5782v = i6;
/* 868 */                   this.f5768i = i6;
/* 870 */                   setScaledSafeMargins();
                        }
/* 877 */               if (isNativeLibraryLoaded()) {
/* 879 */                   nOnCreate();
/* 882 */                   Intent intent = getIntent();
/* 886 */                   if (intent != null && intent.getExtras() != null) {
/* 895 */                       Bundle extras = intent.getExtras();
/* 905 */                       if (extras.containsKey("id") || extras.containsKey(NotificationCompat.CATEGORY_MESSAGE) || extras.containsKey("title")) {
/* 927 */                           m2726b(getIntent());
                                }
                            }
                        }
                    }
/* 934 */           if (isNativeLibraryLoaded()) {
/* 937 */               Intent intent2 = getIntent();
/* 959 */               handleDeepLink((intent2 == null || intent2.getData() == null) ? null : intent2.getData().toString());
                    }
                }

                @Override // android.app.Activity
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 10 */            getApplication().unregisterActivityLifecycleCallbacks(this.f5775o0);
/* 17 */            if (isNativeLibraryLoaded()) {
/* 19 */                nOnDestroy();
/* 25 */                this.f5756b.removeCallbacksAndMessages(null);
/* 28 */                FMOD.close();
                    }
/* 31 */            PurchaseManagerGoogle purchaseManagerGoogle = this.f5765f0;
/* 33 */            if (purchaseManagerGoogle != null) {
/* 35 */                purchaseManagerGoogle.onDestroy();
                    }
/* 38 */            GoogleUtils.onDestroy(this);
                }

                @Override // android.app.Activity, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 5 */             nOnKeyDownEvent(i, keyEvent.getUnicodeChar());
/* 8 */             return super.onKeyDown(i, keyEvent);
                }

                @Override // android.app.Activity, android.view.KeyEvent.Callback
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 3 */             if (i == 25 || i == 24 || i == 164 || i == 4) {
/* 25 */                setSystemUiVisibility();
/* 30 */                setSystemUiVisibilityDelayed(5000L);
                    } else if (i == 111) {
/* 21 */                backButtonPressed();
                    }
/* 37 */            nOnKeyUpEvent(i, keyEvent.getUnicodeChar());
/* 40 */            return super.onKeyUp(i, keyEvent);
                }

                @Override // android.app.Activity
                public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
/* 1 */             super.onMultiWindowModeChanged(z, configuration);
/* 6 */             this.f5750W.onMultiWindowModeChanged(z, configuration);
                }

                @Override // android.app.Activity
                public final void onNewIntent(Intent intent) {
/* 1 */             setIntent(intent);
/* 6 */             if (this.f5750W == null || intent == null) {
/* 32 */                return;
                    }
/* 26 */            handleDeepLink(intent.getData() != null ? intent.getData().toString() : null);
/* 29 */            m2726b(intent);
                }

                @Override // android.app.Activity
                public void onPause() {
/* 1 */             super.onPause();
/* 8 */             if (isNativeLibraryLoaded()) {
/* 11 */                isFinishing();
/* 14 */                PurchaseManagerGoogle purchaseManagerGoogle = this.f5765f0;
/* 16 */                if (purchaseManagerGoogle != null) {
/* 18 */                    purchaseManagerGoogle.onPause();
                        }
/* 21 */                nOnPause();
                    }
                }

                @Override // android.app.Activity
                public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
/* 1 */             super.onPictureInPictureModeChanged(z, configuration);
/* 6 */             this.f5750W.onPictureInPictureModeChanged(z, configuration);
                }

                @Override // android.app.Activity
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 1 */             super.onRequestPermissionsResult(i, strArr, iArr);
/* 4 */             Vector vector = this.f5749V;
/* 6 */             if (vector != null) {
/* 8 */                 Iterator it = vector.iterator();
/* 16 */                while (it.hasNext()) {
/* 24 */                    ((ActivityEventListener) it.next()).onRequestPermissionsResult(i, strArr, iArr);
                        }
                    }
                }

                @Override // android.app.Activity
                public final void onRestart() {
/* 5 */             if (isNativeLibraryLoaded()) {
/* 7 */                 nOnRestart();
                    }
/* 10 */            super.onRestart();
                }

                @Override // android.app.Activity
                public void onResume() {
/* 1 */             super.onResume();
/* 8 */             if (isNativeLibraryLoaded()) {
/* 31 */                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById(android.R.id.content).getWindowToken(), 0);
/* 34 */                nOnResume();
                    }
                }

                @Override // android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
                }

                @Override // android.app.Activity
                public final void onStart() {
/* 1 */             super.onStart();
/* 10 */            ReflectionUtils.callStaticMethod("com.supercell.titan.AppUpdater", "checkUpdate", GameApp.class, this);
/* 17 */            if (isNativeLibraryLoaded()) {
/* 20 */                if (KkGateActivity.foregroundHandoffPending) {
                            KkGateActivity.foregroundHandoffPending = false;
                            nOnAppStart();
                        }
/* 21 */                this.f5751X = false;
/* 25 */                if (this.f5772l0) {
/* 28 */                    this.f5783v0 = true;
                        } else {
/* 31 */                    this.f5783v0 = false;
/* 33 */                    this.f5772l0 = false;
/* 35 */                    handleResume(false);
                        }
/* 40 */                if (this.f5764f == null) {
/* 47 */                    this.f5764f = new cq0();
/* 68 */                    ((DisplayManager) getSystemService("display")).registerDisplayListener(this.f5764f, new Handler(Looper.getMainLooper()));
                        }
/* 71 */                nOnStart();
                    }
                }

                @Override // android.app.Activity
                public final void onStop() {
                    boolean z;
/* 7 */             if (isNativeLibraryLoaded()) {
/* 9 */                 nOnStop();
                    }
/* 13 */            this.f5751X = true;
/* 15 */            GoogleServiceClient googleServiceClient = this.f5771k0;
/* 17 */            if (googleServiceClient != null) {
/* 19 */                googleServiceClient.onStop();
                    }
/* 22 */            WifiManager.WifiLock wifiLock = this.f5754a;
/* 24 */            if (wifiLock != null && wifiLock.isHeld()) {
/* 34 */                this.f5754a.release();
                    }
/* 39 */            if (this.f5770j0 != null) {
/* 41 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 45 */                removeOutOfDateNotifications(jCurrentTimeMillis);
/* 50 */                AlarmManager alarmManager = f5745x0.f5753Z;
/* 54 */                JSONArray jSONArray = new JSONArray();
/* 57 */                Vector vector = f5747z0;
                        synchronized (vector) {
                            try {
/* 66 */                        if (vector.size() > 490) {
/* 68 */                            Locale locale = Locale.US;
/* 86 */                            SentryTitan.m2746b("Game has created ridiculous amount of notifications count=" + vector.size());
                                }
/* 94 */                        int i = 0;
/* 95 */                        z = false;
                                while (true) {
/* 96 */                            Vector vector2 = f5747z0;
/* 102 */                           if (i >= vector2.size()) {
                                        break;
                                    }
/* 112 */                           long jLongValue = ((Long) f5743A0.get(i)).longValue();
/* 118 */                           if (jCurrentTimeMillis < jLongValue) {
/* 124 */                               C0797d c0797d = (C0797d) vector2.get(i);
/* 126 */                               String str = c0797d.f5997d;
                                        try {
/* 130 */                                   alarmManager.set(0, jLongValue, c0797d.f5994a);
                                        } catch (IllegalStateException e) {
/* 172 */                                   SentryTitan.addEvent(null, p92.ERROR, e, new SentryTitan.EventAttachment[]{new SentryTitan.EventFileAttachment(getFilesDir().getParent() + "/shared_prefs/localPrefs-plain.xml")}, null);
                                        }
/* 177 */                               JSONObject jSONObject = new JSONObject();
                                        try {
/* 184 */                                   jSONObject.putOpt("title", c0797d.f5998e);
/* 191 */                                   jSONObject.putOpt("sound", c0797d.f5999f);
/* 198 */                                   jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, c0797d.f5997d);
/* 205 */                                   jSONObject.put("userId", c0797d.f5995b);
/* 212 */                                   jSONObject.put("id", c0797d.f5996c);
/* 219 */                                   jSONObject.put("imageURL", HttpUrl.FRAGMENT_ENCODE_SET);
/* 228 */                                   jSONObject.put(FirebaseAnalytics.Param.SOURCE, c0797d.f6001h.f5787a);
/* 231 */                                   jSONArray.put(jSONObject);
/* 234 */                                   z = true;
                                        } catch (Exception e2) {
/* 237 */                                   SentryTitan.m2745a(e2);
/* 244 */                                   AbstractC1245n0.m4877e("GameApp", "onStop()", e2);
/* 247 */                                   debuggerException(e2);
                                        }
                                    }
/* 250 */                           i++;
/* 294 */                           throw th;
                                }
                            } catch (Throwable th) {
/* 294 */                       throw th;
                            }
                        }
/* 255 */               if (z) {
/* 273 */                   this.f5770j0.edit().putString("localNotifications", jSONArray.toString()).apply();
                        } else {
/* 289 */                   this.f5770j0.edit().remove("localNotifications").apply();
                        }
                    }
/* 295 */           super.onStop();
                }

                @Override // android.app.Activity, android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 5 */             if (isNativeLibraryLoaded()) {
/* 7 */                 nOnTrimMemory(i);
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public void onWindowFocusChanged(boolean z) {
/* 1 */             super.onWindowFocusChanged(z);
/* 4 */             if (z) {
/* 6 */                 handleFocusGained();
/* 9 */                 setSystemUiVisibility();
                    }
/* 14 */            this.f5772l0 = !z;
/* 20 */            if (isNativeLibraryLoaded()) {
/* 22 */                nOnWindowFocusChanged(z);
                    }
                }

                public void removeActivityEventListener(ActivityEventListener activityEventListener) {
/* 1 */             Vector vector = this.f5749V;
/* 3 */             if (vector == null) {
/* 9 */                 AbstractC1245n0.m4889q("GameApp", "Cannot remove activity event listener from empty list.");
                    } else if (activityEventListener != null) {
/* 15 */                vector.remove(activityEventListener);
                    }
                }

                public void removeActivityResultListener(OnActivityResultListener onActivityResultListener) {
                    synchronized (this.f5776p0) {
/* 6 */                 this.f5776p0.remove(onActivityResultListener);
                    }
                }

                public void removeOutOfDateNotifications(long j) {
/* 1 */             Vector vector = f5747z0;
                    synchronized (vector) {
                        try {
/* 4 */                     int size = vector.size();
                            while (true) {
/* 8 */                         size--;
/* 10 */                        if (size >= 0) {
/* 12 */                            Vector vector2 = f5743A0;
/* 26 */                            if (j >= ((Long) vector2.get(size)).longValue()) {
/* 30 */                                f5747z0.remove(size);
/* 33 */                                vector2.remove(size);
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
                }

                public void requestBackup() {
                    try {
/* 6 */                 new BackupManager(this).dataChanged();
                    } catch (Exception e) {
/* 15 */                AbstractC1245n0.m4877e("GameApp", "GameApp.requestBackup", e);
                    }
                }

                public void requestFinish() {
/* 3 */             if (this.f5758c) {
/* 5 */                 return;
                    }
/* 7 */             this.f5758c = true;
/* 9 */             finish();
                }

                public void runInUiThreadFromCpp(final long j) {
/* 8 */             this.f5756b.post(new Runnable(this) { // from class: yp0
                        @Override // java.lang.Runnable
                        public final void run() {
/* 3 */                     GameApp.nRunFromUiThread(j);
                        }
                    });
                }

                public void runOnView(Runnable runnable) {
/* 1 */             if (runnable == null) {
/* 35 */                return;
                    }
/* 4 */             GL2JNISurfaceView gL2JNISurfaceView = this.f5750W;
/* 6 */             if (gL2JNISurfaceView != null) {
/* 36 */                gL2JNISurfaceView.post(runnable);
                    } else if (isNativeLibraryLoaded()) {
/* 32 */                logDebuggerException("runOnView when view = null, " + runnable.toString());
                    }
                }

                public void setFixedSize(int i, int i2) {
/* 3 */             this.f5750W.setFixedSize(i, i2);
/* 6 */             setScaledSafeMargins();
                }

                public void setScaledSafeMargins() {
/* 5 */             float scaleX = getView().getScaleX();
/* 13 */            float scaleY = getView().getScaleY();
/* 37 */            setSafeMargins((int) (this.f5748U * scaleY), (int) (this.f5784w * scaleY), (int) (this.f5768i * scaleX), (int) (this.f5782v * scaleX));
                }

                public void setSystemUiVisibility() {
/* 1 */             GL2JNISurfaceView gL2JNISurfaceView = this.f5750W;
/* 3 */             if (gL2JNISurfaceView == null) {
/* 5 */                 return;
                    }
/* 9 */             if (this.f5774n0 == -1) {
/* 13 */                this.f5774n0 = 5894;
                    }
/* 17 */            gL2JNISurfaceView.setSystemUiVisibility(this.f5774n0);
                }

                public void setSystemUiVisibilityDelayed(long j) {
/* 12 */            new Handler().postDelayed(new RunnableC2213tc(this, 2), j);
                }

                public void showStorePage(String str, String str2, ShowStorePageListener showStorePageListener) {
/* 1 */             AtomicBoolean atomicBoolean = this.f5785w0;
/* 9 */             if (!atomicBoolean.compareAndSet(false, true)) {
/* 126 */               showStorePageListener.onCompletion(false);
/* 129 */               return;
                    }
/* 11 */            PackageManager packageManager = getPackageManager();
/* 19 */            Intent intent = new Intent("android.intent.action.VIEW");
/* 24 */            intent.setPackage("com.android.vending");
/* 53 */            intent.setData(Uri.parse("https://play.google.com/d?id=" + str + "&referrer=" + str2));
/* 60 */            if (intent.resolveActivity(packageManager) != null) {
/* 64 */                intent.putExtra("overlay", true);
/* 73 */                intent.putExtra("callerId", getPackageName());
                    } else {
/* 101 */               intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str + "&referrer=" + str2));
                    }
/* 109 */           addActivityResultListener(new C0795b(this, showStorePageListener));
                    try {
/* 115 */               startActivityForResult(intent, 990001);
                    } catch (ActivityNotFoundException unused) {
/* 119 */               atomicBoolean.set(false);
/* 122 */               showStorePageListener.onCompletion(false);
                    }
                }

                public synchronized void storeKeyValue(String str, String str2) {
/* 4 */             if (this.f5766g0 == null) {
/* 7 */                 return;
                    }
/* 21 */            if (m2729c(str, str2, this.f5766g0) | m2729c(str, str2, this.f5767h0)) {
/* 23 */                requestBackup();
                    }
                }

                public void tencentLoginDone() {
                }

/* 42 */        public void removeOutOfDateNotifications() {
/* 43 */            if (f5747z0.isEmpty()) {
                        return;
                    }
/* 44 */            removeOutOfDateNotifications(System.currentTimeMillis());
                }

/* 48 */        public static void trackNotificationCanceled(NotificationData notificationData) {
/* 49 */            if (notificationData == null || !isNativeLibraryLoaded()) {
                        return;
                    }
/* 50 */            notificationCanceled(notificationData);
                }

/* 82 */        public GameApp(int i, Class<?> cls) {
/* 83 */            this(i, cls, (Class<?>) null);
                }

/* 83 */        public GameApp(Class<?> cls, Class<?> cls2) {
/* 84 */            this(-1, cls, cls2);
                }

/* 84 */        public GameApp() {
/* 85 */            this((Class<?>) TimeAlarm.class, (Class<?>) null);
                }

                @Deprecated
/* 85 */        public GameApp(String str, Class<?> cls) {
/* 86 */            this(str, cls, (Class<?>) null);
                }

                @Deprecated
/* 86 */        public GameApp(String str, Class<?> cls, Class<?> cls2) {
/* 87 */            this(-1, cls, cls2);
/* 88 */            this.f5757b0 = str;
                }
            }
