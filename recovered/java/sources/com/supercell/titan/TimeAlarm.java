            package com.supercell.titan;

            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.app.Service;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.res.Resources;
            import android.graphics.BitmapFactory;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import p000.AbstractC0886en;
            import p000.h20;
            import p000.ho2;
            import p000.jo1;
            import p000.po1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 182 */   public class TimeAlarm extends BroadcastReceiver {
                public static final String DEFAULT_CHANNEL_ID = "default";
                public static final String NOTIFICATION_CHANNEL_DESCRIPTION = "channelDesc";
                public static final String NOTIFICATION_CHANNEL_ID = "channelId";
                public static final String NOTIFICATION_CHANNEL_NAME = "channelName";
                public static final String NOTIFICATION_CHRONOS_ID = "chronosPushNotificationId";
                public static final String NOTIFICATION_COLOR = "color";
                public static final String NOTIFICATION_ICON_RESOURCE_NAME = "iconResourceName";
                public static final String NOTIFICATION_ID = "id";
                public static final String NOTIFICATION_IMAGE_URL = "imageURL";
                public static final String NOTIFICATION_MESSAGE = NotificationCompat.CATEGORY_MESSAGE;
                public static final String NOTIFICATION_SOUND = "sound";
                public static final String NOTIFICATION_SOURCE = FirebaseAnalytics.Param.SOURCE;
                public static final String NOTIFICATION_TITLE = "title";
                public static final String NOTIFICATION_UNIQUE_ID = "notificationUniqueId";
                public static final String NOTIFICATION_USER_ID = "userId";

                /* JADX WARN: Code duplicated, block: B:112:0x0229  */
                /* JADX WARN: Code duplicated, block: B:121:0x02b9  */
                /* JADX WARN: Code duplicated, block: B:123:0x02be  */
                /* JADX WARN: Code duplicated, block: B:128:0x02ce  */
                public static void createNotification(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, Class<?> cls, Service service) throws Throwable {
                    int iHashCode;
                    String strReplaceAll;
                    Notification notificationM7525a;
                    byte[] byteArray;
                    String string;
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager == null) {
                        return;
                    }
/* 2 */             ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 3 */             String packageName = context.getPackageName();
/* 4 */             Resources resources = context.getResources();
/* 5 */             String applicationName = getApplicationName(context);
                    String str12 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
/* 8 */             int identifier = (str9 == null || str9.isEmpty()) ? 0 : resources.getIdentifier(str9, "drawable", context.getPackageName());
                    if (identifier == 0) {
                        identifier = resources.getIdentifier("ic_notification", "drawable", packageName);
                    }
                    if (identifier == 0) {
/* 10 */                identifier = applicationInfo.icon;
                    }
/* 11 */            Intent intent = new Intent(context, cls);
/* 12 */            intent.setFlags(603979776);
                    intent.putExtra("title", str12);
                    intent.putExtra(NotificationCompat.CATEGORY_MESSAGE, str);
                    intent.putExtra(FirebaseAnalytics.Param.SOURCE, i2);
/* 16 */            if (str10 != null && !str10.isEmpty()) {
                        intent.putExtra("chronosPushNotificationId", str10);
                    }
/* 18 */            if (str11 != null && !str11.isEmpty()) {
                        intent.putExtra("notificationUniqueId", str11);
                    }
                    if (str4 != null) {
/* 21 */                intent.putExtra("userId", str4);
                    }
                    if (str6 != null) {
                        intent.putExtra("channelId", str6);
                    }
                    if (str5 != null) {
                        intent.putExtra("imageURL", str5);
                    }
                    if (str9 != null) {
                        intent.putExtra("iconResourceName", str9);
                    }
/* 25 */            if (str4 == null || str4.isEmpty()) {
/* 28 */                iHashCode = !str12.isEmpty() ? str12.hashCode() : str.hashCode();
                    } else {
/* 26 */                intent.putExtra("userId", str4);
/* 27 */                iHashCode = str4.hashCode();
                    }
                    int i3 = iHashCode;
/* 29 */            String str13 = (str6 == null || str6.isEmpty()) ? "default" : str6;
/* 31 */            if (Build.VERSION.SDK_INT >= 26) {
/* 32 */                if (str7 == null || str7.isEmpty()) {
/* 33 */                    string = applicationName != null ? applicationName : context.getString(android.R.string.untitled);
                        } else {
                            string = str7;
                        }
/* 34 */                NotificationChannel notificationChannelM4253a = ho2.m4253a(str13, string);
                        if (str8 != null) {
/* 1 */                     notificationChannelM4253a.setDescription(str8);
                        }
/* 1 */                 notificationManager.createNotificationChannel(notificationChannelM4253a);
                    }
/* 37 */            PendingIntent activity = PendingIntent.getActivity(context, i3, intent, 67108864);
/* 38 */            po1 po1Var = new po1(context, str13);
/* 39 */            po1Var.f15207g = activity;
/* 40 */            Notification notification = po1Var.f15220t;
                    notification.icon = identifier;
/* 42 */            po1Var.f15213m = context.getPackageName();
                    boolean z = true;
/* 43 */            po1Var.m7526c(true);
                    try {
                        try {
/* 44 */                    if (str5 != null && !str5.isEmpty()) {
                                try {
/* 45 */                            String lowerCase = str5.toLowerCase();
                                    try {
                                        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
/* 50 */                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5).openConnection();
                                            httpURLConnection.setRequestMethod("GET");
/* 52 */                                    httpURLConnection.setConnectTimeout(5000);
/* 53 */                                    httpURLConnection.setReadTimeout(5000);
/* 54 */                                    InputStream inputStream = httpURLConnection.getInputStream();
                                            try {
/* 55 */                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 56 */                                        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                                                while (true) {
/* 57 */                                            int i4 = inputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                                                    boolean z2 = z;
                                                    if (i4 == -1) {
                                                        break;
                                                    }
                                                    try {
/* 58 */                                                byteArrayOutputStream.write(bArr, 0, i4);
                                                        z = z2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                    }
                                                    th = th;
                                                    Throwable th2 = th;
                                                    if (inputStream == null) {
                                                        throw th2;
                                                    }
                                                    try {
/* 64 */                                                inputStream.close();
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th2.addSuppressed(th3);
                                                        throw th2;
                                                    }
                                                }
/* 59 */                                        byteArrayOutputStream.flush();
/* 60 */                                        byteArray = byteArrayOutputStream.toByteArray();
/* 61 */                                        inputStream.close();
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } else {
/* 48 */                                    byteArray = lowerCase.startsWith("file://") ? readFileContent(str5) : null;
                                        }
                                        if (byteArray != null) {
/* 63 */                                    po1Var.m7528e(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
                                        }
                                    } catch (IOException e) {
                                        e = e;
/* 66 */                                StringBuilder sbM3513q = AbstractC0886en.m3513q("Could not download image from ", str5, ". Error: ");
/* 67 */                                sbM3513q.append(e.getLocalizedMessage());
                                        AbstractC1245n0.m4889q("TimeAlarm", sbM3513q.toString());
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
/* 71 */                        if (!str12.isEmpty()) {
/* 72 */                            po1Var.f15205e = po1.m7524b(str12);
                                }
/* 73 */                        if (str != null && !str.isEmpty()) {
/* 74 */                            po1Var.f15206f = po1.m7524b(str);
/* 75 */                            notification.tickerText = po1.m7524b(str);
/* 77 */                            jo1 jo1Var = new jo1();
/* 78 */                            jo1Var.f12410b = po1.m7524b(str);
/* 79 */                            po1Var.m7530g(jo1Var);
                                }
/* 80 */                        if (str3 != null || str3.isEmpty()) {
                                    strReplaceAll = str3;
                                } else {
                                    strReplaceAll = str3.replaceAll("res/", HttpUrl.FRAGMENT_ENCODE_SET).replaceAll("\\.wav", "\\.ogg").replaceAll("\\.caf", "\\.ogg");
/* 86 */                            po1Var.m7529f(Uri.parse("content://" + (context.getPackageName() + ".assetprovider") + "/" + strReplaceAll));
                                }
                                if (i != 0) {
/* 87 */                            po1Var.f15216p = i;
                                }
/* 88 */                        notificationM7525a = po1Var.m7525a();
/* 89 */                        if (strReplaceAll != null || strReplaceAll.isEmpty()) {
/* 90 */                            notificationM7525a.defaults |= 1;
                                }
/* 91 */                        notificationM7525a.defaults |= 6;
/* 92 */                        notificationM7525a.flags |= 16;
/* 93 */                        notificationManager.notify(i3, notificationM7525a);
                                return;
                            }
                            int identifier2 = resources.getIdentifier("ic_icon", "drawable", packageName);
                            if (identifier2 != 0) {
/* 70 */                        po1Var.m7528e(BitmapFactory.decodeResource(resources, identifier2));
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
/* 93 */                notificationManager.notify(i3, notificationM7525a);
                        return;
                    } catch (SecurityException unused2) {
                        return;
                    }
/* 71 */            if (!str12.isEmpty()) {
/* 72 */                po1Var.f15205e = po1.m7524b(str12);
                    }
                    if (str != null) {
/* 74 */                po1Var.f15206f = po1.m7524b(str);
/* 75 */                notification.tickerText = po1.m7524b(str);
/* 77 */                jo1 jo1Var2 = new jo1();
/* 78 */                jo1Var2.f12410b = po1.m7524b(str);
/* 79 */                po1Var.m7530g(jo1Var2);
                    }
                    if (str3 != null) {
                        strReplaceAll = str3;
                    } else {
                        strReplaceAll = str3;
                    }
                    if (i != 0) {
/* 87 */                po1Var.f15216p = i;
                    }
/* 88 */            notificationM7525a = po1Var.m7525a();
                    if (strReplaceAll != null) {
/* 90 */                notificationM7525a.defaults |= 1;
                    } else {
/* 90 */                notificationM7525a.defaults |= 1;
                    }
/* 91 */            notificationM7525a.defaults |= 6;
/* 92 */            notificationM7525a.flags |= 16;
                }

                public static String getApplicationName(Context context) {
/* 1 */             ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 17 */            int identifier = context.getResources().getIdentifier("app_name", "string", context.getPackageName());
/* 21 */            if (identifier == 0) {
/* 23 */                identifier = applicationInfo.labelRes;
                    }
                    return identifier == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(identifier);
                }

                public static void handleLocalNotification(Context context, Intent intent, Class<?> cls) {
/* 1 */             Bundle extras = intent.getExtras();
/* 5 */             if (extras != null) {
/* 21 */                String string = extras.containsKey("title") ? extras.getString("title") : null;
/* 25 */                String string2 = extras.getString(NotificationCompat.CATEGORY_MESSAGE);
/* 31 */                String string3 = extras.getString("sound");
/* 37 */                int i = extras.getInt("id");
/* 43 */                String string4 = extras.getString("userId");
/* 49 */                String string5 = extras.getString("imageURL");
/* 55 */                String string6 = extras.getString("channelId");
/* 61 */                String string7 = extras.getString("channelName");
/* 67 */                String string8 = extras.getString("channelDesc");
/* 73 */                int i2 = extras.getInt("color");
/* 79 */                String string9 = extras.getString("iconResourceName");
/* 93 */                GameApp.NotificationSource notificationSourceFromCode = GameApp.NotificationSource.fromCode(extras.getInt(FirebaseAnalytics.Param.SOURCE, GameApp.NotificationSource.NOT_SET.f5787a));
/* 99 */                GameApp.NotificationData notificationData = new GameApp.NotificationData();
/* 114 */               notificationData.notificationId = string4 != null ? string4 : UUID.randomUUID().toString();
/* 123 */               notificationData.title = string != null ? string : HttpUrl.FRAGMENT_ENCODE_SET;
/* 130 */               notificationData.message = string2 != null ? string2 : HttpUrl.FRAGMENT_ENCODE_SET;
/* 137 */               notificationData.channelId = string6 != null ? string6 : HttpUrl.FRAGMENT_ENCODE_SET;
/* 139 */               notificationData.chronosEventId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 141 */               notificationData.actionId = HttpUrl.FRAGMENT_ENCODE_SET;
/* 145 */               notificationData.source = notificationSourceFromCode.f5787a;
/* 147 */               GameApp.trackNotificationDelivered(notificationData);
/* 154 */               if (GameApp.getInstance() == null || GameApp.getInstance().isStopped()) {
/* 177 */                   createNotification(context, string2, string, string3, string4, string5, string6, string7, string8, string9, i2, notificationSourceFromCode.f5787a, null, null, cls, null);
                        }
/* 180 */               GameApp.cancelNotification(i);
                    }
                }

                public static byte[] readFileContent(String str) throws IOException {
/* 11 */            File file = new File(Uri.parse(str).getPath());
/* 19 */            FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
                    try {
/* 25 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 30 */                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                        while (true) {
/* 33 */                    int i = fileInputStreamM5164b.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
/* 38 */                    if (i == -1) {
/* 44 */                        byteArrayOutputStream.flush();
/* 47 */                        byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 51 */                        fileInputStreamM5164b.close();
/* 54 */                        return byteArray;
                            }
/* 40 */                    byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        try {
/* 56 */                    fileInputStreamM5164b.close();
                        } catch (Throwable th2) {
/* 61 */                    th.addSuppressed(th2);
                        }
/* 64 */                throw th;
                    }
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
/* 1 */             handleLocalNotification(context, intent);
                }

/* 183 */       public static void handleLocalNotification(Context context, Intent intent) {
                    try {
/* 186 */               Class<?> cls = Class.forName(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
/* 188 */               h20 h20Var = new h20();
/* 189 */               h20Var.f8868a = context;
/* 190 */               h20Var.f8869b = intent;
/* 191 */               h20Var.f8870c = cls;
/* 192 */               h20Var.execute(new String[0]);
                    } catch (Exception unused) {
                    }
                }
            }
