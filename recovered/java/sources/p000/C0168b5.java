            package p000;

            import android.app.Activity;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ResolveInfo;
            import android.content.res.Resources;
            import android.database.sqlite.SQLiteDatabase;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.media.AudioAttributes;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Range;
            import android.util.Size;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.core.content.FileProvider;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
            import com.usercentrics.sdk.p009v2.settings.data.FirstLayer;
            import com.usercentrics.sdk.p009v2.settings.data.SecondLayer;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCustomization;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsLabels;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
            import io.flutter.plugin.common.MethodChannel;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.ObjectOutputStream;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import javax.inject.Provider;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: b5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 60 */    public final class C0168b5 implements sg0, InterfaceC0824cy {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2210a;

                /* JADX INFO: renamed from: b */
                public Object f2211b;

                /* JADX INFO: renamed from: c */
                public Object f2212c;

                /* JADX INFO: renamed from: d */
                public Object f2213d;

                /* JADX INFO: renamed from: e */
                public Object f2214e;

                /* JADX INFO: renamed from: f */
                public Object f2215f;

                public C0168b5(C2197sx c2197sx, InterfaceC0824cy interfaceC0824cy) {
/* 3 */             this.f2210a = 12;
/* 10 */            HashSet hashSet = new HashSet();
/* 15 */            HashSet hashSet2 = new HashSet();
/* 20 */            HashSet hashSet3 = new HashSet();
/* 25 */            HashSet hashSet4 = new HashSet();
/* 30 */            HashSet hashSet5 = new HashSet();
/* 33 */            Set<r70> set = c2197sx.f16833c;
/* 35 */            Set set2 = c2197sx.f16837g;
/* 45 */            for (r70 r70Var : set) {
/* 53 */                int i = r70Var.f15897c;
/* 55 */                int i2 = r70Var.f15896b;
/* 61 */                boolean z = i == 0;
/* 62 */                f02 f02Var = r70Var.f15895a;
/* 65 */                if (z) {
/* 67 */                    if (i2 == 2) {
/* 69 */                        hashSet4.add(f02Var);
                            } else {
/* 73 */                        hashSet.add(f02Var);
                            }
                        } else if (i == 2) {
/* 79 */                    hashSet3.add(f02Var);
                        } else if (i2 == 2) {
/* 85 */                    hashSet5.add(f02Var);
                        } else {
/* 89 */                    hashSet2.add(f02Var);
                        }
                    }
/* 97 */            if (!set2.isEmpty()) {
/* 105 */               hashSet.add(f02.m3619a(pz1.class));
                    }
/* 112 */           this.f2211b = Collections.unmodifiableSet(hashSet);
/* 118 */           this.f2212c = Collections.unmodifiableSet(hashSet2);
/* 120 */           Collections.unmodifiableSet(hashSet3);
/* 127 */           this.f2213d = Collections.unmodifiableSet(hashSet4);
/* 133 */           this.f2214e = Collections.unmodifiableSet(hashSet5);
/* 135 */           this.f2215f = interfaceC0824cy;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0052  */
                /* JADX WARN: Code duplicated, block: B:18:0x0068  */
                /* JADX INFO: renamed from: f */
                public static void m1243f(C0168b5 c0168b5, String str, Class cls) {
                    Bitmap bitmapDecodeResource;
                    int i;
/* 3 */             Context context = (Context) c0168b5.f2211b;
/* 7 */             C0210cb c0210cb = (C0210cb) c0168b5.f2212c;
/* 11 */            er0 er0Var = (er0) c0168b5.f2213d;
/* 15 */            int iM3586o = er0Var.m3586o("notificationIcon");
/* 21 */            int iM3586o2 = er0Var.m3586o("notificationLargeIcon");
/* 27 */            int iM3586o3 = er0Var.m3586o("notificationSoundId");
/* 31 */            String strM1592o = c0210cb.m1592o();
/* 39 */            if (!b40.m1234r(str)) {
/* 42 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 53 */            xe2.m9775m("SDKXNotif", "Creating Support notification :\n Title : ".concat(strM1592o), null);
/* 60 */            int i2 = context.getApplicationInfo().logo;
/* 62 */            if (i2 == 0) {
/* 68 */                i2 = context.getApplicationInfo().icon;
                    }
/* 70 */            if (iM3586o != 0) {
                        try {
/* 80 */                    if (context.getResources().getResourceName(iM3586o) == null) {
/* 83 */                        iM3586o = i2;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                    } else {
/* 83 */                iM3586o = i2;
                    }
/* 84 */            if (iM3586o2 != 0) {
                        try {
/* 94 */                    if (context.getResources().getResourceName(iM3586o2) != null) {
/* 100 */                       bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iM3586o2);
                            } else {
/* 105 */                       bitmapDecodeResource = null;
                            }
                        } catch (Resources.NotFoundException unused2) {
                        }
                    } else {
/* 105 */               bitmapDecodeResource = null;
                    }
/* 108 */           Intent intent = new Intent(context, (Class<?>) cls);
/* 115 */           intent.putExtra("SERVICE_MODE", "WEBCHAT_SERVICE_FLAG");
/* 122 */           intent.putExtra(FirebaseAnalytics.Param.SOURCE, "notification");
/* 127 */           intent.setFlags(268435456);
/* 134 */           PendingIntent activity = PendingIntent.getActivity(context, 50, intent, 67108864);
/* 140 */           po1 po1Var = new po1(context, null);
/* 145 */           po1Var.f15220t.icon = iM3586o;
/* 151 */           po1Var.f15205e = po1.m7524b(strM1592o);
/* 157 */           po1Var.f15206f = po1.m7524b(str);
/* 159 */           po1Var.f15207g = activity;
/* 162 */           po1Var.m7526c(true);
/* 165 */           if (bitmapDecodeResource != null) {
/* 167 */               po1Var.m7528e(bitmapDecodeResource);
                    }
/* 170 */           Uri uriM3041w = de3.m3041w(context, iM3586o3);
/* 174 */           if (uriM3041w != null) {
/* 192 */               po1Var.m7529f(uriM3041w);
/* 199 */               if (b40.m1235s(context)) {
/* 202 */                   po1Var.m7527d(6);
                        } else {
/* 207 */                   po1Var.m7527d(4);
                        }
                    } else if (b40.m1235s(context)) {
/* 183 */               po1Var.m7527d(-1);
                    } else {
/* 188 */               po1Var.m7527d(5);
                    }
/* 210 */           Notification notificationM7525a = po1Var.m7525a();
/* 220 */           if (Build.VERSION.SDK_INT >= 26) {
                        try {
/* 226 */                   i = context.getApplicationInfo().targetSdkVersion;
                        } catch (Exception e) {
/* 232 */                   xe2.m9775m("AppUtil", "Target SDK version not found", e);
/* 235 */                   i = 0;
                        }
/* 236 */               if (i >= 26) {
/* 238 */                   Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationM7525a);
/* 248 */                   String strM3589r = ((er0) er0Var.f7853b).m3589r("notificationChannelId");
/* 256 */                   if (b40.m1232p(strM3589r)) {
/* 258 */                       NotificationManager notificationManagerM1230n = b40.m1230n(context);
/* 262 */                       if (notificationManagerM1230n != null && notificationManagerM1230n.getNotificationChannel("In-app Support") == null) {
/* 270 */                           NotificationChannel notificationChannelM7295a = p30.m7295a();
/* 3 */                             notificationChannelM7295a.setDescription(HttpUrl.FRAGMENT_ENCODE_SET);
/* 281 */                           Uri uriM3041w2 = de3.m3041w(context, er0Var.m3586o("notificationSoundId"));
/* 285 */                           if (uriM3041w2 != null) {
/* 1 */                                 notificationChannelM7295a.setSound(uriM3041w2, new AudioAttributes.Builder().build());
                                    }
/* 1 */                             notificationManagerM1230n.createNotificationChannel(notificationChannelM7295a);
                                }
/* 302 */                       strM3589r = "In-app Support";
                            } else {
/* 305 */                       NotificationManager notificationManagerM1230n2 = b40.m1230n(context);
/* 309 */                       if (notificationManagerM1230n2 != null && notificationManagerM1230n2.getNotificationChannel("In-app Support") != null) {
/* 3 */                             notificationManagerM1230n2.deleteNotificationChannel("In-app Support");
                                }
                            }
/* 1 */                     builderRecoverBuilder.setChannelId(strM3589r);
/* 323 */                   notificationM7525a = builderRecoverBuilder.build();
                        }
                    }
/* 331 */           xe2.m9775m("notifMngr", "Notification built, trying to post now.", null);
/* 340 */           if (notificationM7525a == null) {
/* 344 */               xe2.m9775m("AppUtil", "notification is null, not showing.", null);
/* 415 */               return;
                    }
/* 348 */           NotificationManager notificationManagerM1230n3 = b40.m1230n(context);
/* 352 */           if (notificationManagerM1230n3 == null) {
/* 356 */               xe2.m9775m("AppUtil", "NotificationManager is null, not showing.", null);
/* 415 */               return;
                    }
                    try {
/* 367 */               boolean zM10416a = zo1.m10416a(new ap1(context).f2052a);
/* 383 */               xe2.m9775m("AppUtil", "areNotificationAllowed : " + zM10416a, null);
/* 386 */               if (zM10416a) {
/* 392 */                   String strConcat = "hsft_notification_tag_".concat(cls.getName());
/* 400 */                   xe2.m9775m("AppUtil", "Showing notification : Tag : ".concat(strConcat), null);
/* 405 */                   notificationManagerM1230n3.notify(strConcat, 121, notificationM7525a);
                        }
                    } catch (Exception e2) {
/* 412 */               xe2.m9777o("AppUtil", "Error showing notification", e2);
                    }
                }

                /* JADX INFO: renamed from: m */
                public static C0168b5 m1244m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
/* 3 */             C0168b5 c0168b5 = new C0168b5(sharedPreferences, scheduledThreadPoolExecutor);
                    synchronized (((ArrayDeque) c0168b5.f2214e)) {
                        try {
/* 15 */                    ((ArrayDeque) c0168b5.f2214e).clear();
/* 28 */                    String string = ((SharedPreferences) c0168b5.f2211b).getString((String) c0168b5.f2212c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 36 */                    if (!TextUtils.isEmpty(string) && string.contains((String) c0168b5.f2213d)) {
/* 54 */                        String[] strArrSplit = string.split((String) c0168b5.f2213d, -1);
/* 59 */                        if (strArrSplit.length == 0) {
/* 65 */                            AbstractC1245n0.m4876d("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                                }
/* 73 */                        for (String str : strArrSplit) {
/* 81 */                            if (!TextUtils.isEmpty(str)) {
/* 87 */                                ((ArrayDeque) c0168b5.f2214e).add(str);
                                    }
                                }
/* 94 */                        return c0168b5;
                            }
/* 96 */                    return c0168b5;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public static String m1245r(String str) {
                    return (str == null || !StringsKt.m6240z(str, "/", false)) ? "*" : str.substring(0, StringsKt.m6227C(str, "/", 0, false, 6));
                }

                /* JADX INFO: renamed from: A */
                public void m1246A(C2105qf c2105qf) {
/* 5 */             f42 f42Var = new f42(13);
/* 10 */            yr2 yr2Var = (yr2) this.f2215f;
/* 14 */            C2497yg c2497yg = (C2497yg) this.f2211b;
/* 18 */            String str = (String) this.f2212c;
/* 22 */            er2 er2Var = (er2) this.f2214e;
/* 26 */            vd0 vd0Var = (vd0) this.f2213d;
/* 28 */            n60 n60Var = yr2Var.f19783c;
/* 30 */            C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 36 */            c0875ecM10147a.m3373L(c2497yg.f19600a);
/* 41 */            c0875ecM10147a.f7615d = px1.f15322a;
/* 45 */            c0875ecM10147a.f7614c = c2497yg.f19601b;
/* 47 */            C2497yg c2497ygM3390m = c0875ecM10147a.m3390m();
/* 53 */            xy1 xy1Var = new xy1();
/* 61 */            xy1Var.f19398f = new HashMap();
/* 73 */            xy1Var.f19396d = Long.valueOf(yr2Var.f19781a.mo7340a());
/* 85 */            xy1Var.f19397e = Long.valueOf(yr2Var.f19782b.mo7340a());
/* 87 */            xy1Var.f19393a = str;
/* 102 */           xy1Var.f19395c = new sd0(vd0Var, (byte[]) er2Var.apply(c2105qf.f15509a));
/* 105 */           xy1Var.f19394b = null;
/* 118 */           n60Var.f14140b.execute(new RunnableC2558zo(n60Var, c2497ygM3390m, f42Var, xy1Var.m10041d()));
                }

                /* JADX INFO: renamed from: B */
                public void m1247B(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 8 */                     if (m1274u(g71Var)) {
/* 22 */                        if (((ArrayDeque) this.f2214e).isEmpty()) {
/* 28 */                            ((ArrayDeque) this.f2214e).push(g71Var);
                                } else {
/* 34 */                            C1837kn c1837kn = (C1837kn) this.f2215f;
/* 36 */                            if (c1837kn == null || c1837kn.f12882b != 2) {
/* 51 */                                g71 g71Var2 = (g71) ((ArrayDeque) this.f2214e).peek();
/* 57 */                                if (!g71Var.equals(g71Var2)) {
/* 59 */                                    m1254I(g71Var2);
/* 66 */                                    ((ArrayDeque) this.f2214e).remove(g71Var);
/* 73 */                                    ((ArrayDeque) this.f2214e).push(g71Var);
                                        }
                                    }
                                }
/* 76 */                        m1256K(g71Var);
                            }
                        } catch (Throwable th) {
/* 82 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: C */
                public void m1248C(Drawable drawable) {
/* 1 */             this.f2215f = drawable;
/* 7 */             ((ViewGroup) this.f2212c).invalidate();
                }

                /* JADX INFO: renamed from: D */
                public void m1249D(int i) {
/* 5 */             ((Paint) this.f2213d).setColor(i);
/* 12 */            ((ViewGroup) this.f2212c).invalidate();
                }

                /* JADX INFO: renamed from: E */
                public void m1250E(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 8 */                     ((ArrayDeque) this.f2214e).remove(g71Var);
/* 11 */                    m1254I(g71Var);
/* 22 */                    if (!((ArrayDeque) this.f2214e).isEmpty()) {
/* 34 */                        m1256K((g71) ((ArrayDeque) this.f2214e).peek());
                            }
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: F */
                public void m1251F(C2564zu c2564zu) {
/* 3 */             ViewGroup viewGroup = (ViewGroup) this.f2212c;
/* 5 */             if (c2564zu == null) {
/* 8 */                 this.f2214e = null;
                    } else {
/* 13 */                C2564zu c2564zu2 = (C2564zu) this.f2214e;
/* 15 */                if (c2564zu2 == null) {
/* 22 */                    this.f2214e = new C2564zu(c2564zu);
                        } else {
/* 25 */                    float f = c2564zu.f20327a;
/* 27 */                    float f2 = c2564zu.f20328b;
/* 29 */                    float f3 = c2564zu.f20329c;
/* 31 */                    c2564zu2.f20327a = f;
/* 33 */                    c2564zu2.f20328b = f2;
/* 35 */                    c2564zu2.f20329c = f3;
                        }
/* 63 */                if (c2564zu.f20329c + 1.0E-4f >= pg3.m7429h(c2564zu.f20327a, c2564zu.f20328b, viewGroup.getWidth(), viewGroup.getHeight())) {
/* 72 */                    ((C2564zu) this.f2214e).f20329c = Float.MAX_VALUE;
                        }
                    }
/* 74 */            viewGroup.invalidate();
                }

                /* JADX INFO: renamed from: G */
                public void m1252G(Map map) throws IOException {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList<? extends Parcelable> arrayList3;
                    String strConcat;
                    MethodChannel.Result result;
                    boolean zM6263m;
/* 7 */             Context context = (Context) this.f2211b;
/* 9 */             File fileM1273t = m1273t();
/* 13 */            File[] fileArrListFiles = fileM1273t.listFiles();
/* 22 */            if (fileM1273t.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
/* 32 */                for (File file : fileArrListFiles) {
/* 36 */                    file.delete();
                        }
/* 42 */                fileM1273t.delete();
                    }
/* 51 */            String str = (String) map.get("text");
/* 59 */            String str2 = (String) map.get("uri");
/* 67 */            String str3 = (String) map.get("subject");
/* 75 */            String str4 = (String) map.get("title");
/* 83 */            List list = (List) map.get("paths");
/* 85 */            if (list != null) {
/* 89 */                arrayList = new ArrayList();
/* 100 */               for (Object obj : list) {
/* 108 */                   if (obj instanceof String) {
/* 110 */                       arrayList.add(obj);
                            }
                        }
                    } else {
/* 114 */               arrayList = null;
                    }
/* 121 */           List list2 = (List) map.get("mimeTypes");
/* 123 */           if (list2 != null) {
/* 127 */               arrayList2 = new ArrayList();
/* 138 */               for (Object obj2 : list2) {
/* 146 */                   if (obj2 instanceof String) {
/* 148 */                       arrayList2.add(obj2);
                            }
                        }
                    } else {
/* 152 */               arrayList2 = null;
                    }
/* 153 */           if (arrayList != null) {
/* 161 */               arrayList3 = new ArrayList<>(arrayList.size());
/* 164 */               Iterator it = arrayList.iterator();
/* 172 */               while (it.hasNext()) {
/* 182 */                   File file2 = new File((String) it.next());
                            try {
/* 185 */                       String canonicalPath = file2.getCanonicalPath();
/* 189 */                       canonicalPath.getClass();
/* 196 */                       String canonicalPath2 = m1273t().getCanonicalPath();
/* 200 */                       canonicalPath2.getClass();
/* 203 */                       zM6263m = C1852e.m6263m(canonicalPath, canonicalPath2, false);
                            } catch (IOException unused) {
/* 208 */                       zM6263m = false;
                            }
/* 209 */                   if (zM6263m) {
/* 278 */                       ds0.m3195l(fm0.m3784j("Shared file can not be located in '", m1273t().getCanonicalPath(), "'"));
/* 281 */                       return;
                            }
/* 211 */                   File fileM1273t2 = m1273t();
/* 219 */                   if (!fileM1273t2.exists()) {
/* 221 */                       fileM1273t2.mkdirs();
                            }
/* 230 */                   File file3 = new File(fileM1273t2, file2.getName());
/* 233 */                   ji0.m5826e(file2, file3);
/* 238 */                   Context context2 = (Activity) this.f2212c;
/* 240 */                   if (context2 == null) {
/* 243 */                       context2 = context;
                            }
/* 258 */                   arrayList3.add(FileProvider.getUriForFile(context2, (String) ((hk2) this.f2214e).getValue(), file3));
                        }
                    } else {
/* 282 */               arrayList3 = null;
                    }
/* 285 */           Intent intent = new Intent();
/* 297 */           if (arrayList3 == null) {
/* 299 */               intent.setAction("android.intent.action.SEND");
/* 304 */               intent.setType("text/plain");
/* 307 */               if (str2 != null) {
/* 310 */                   str = str2;
                        }
/* 311 */               intent.putExtra("android.intent.extra.TEXT", str);
/* 314 */               if (str3 != null && !StringsKt.m6228D(str3)) {
/* 323 */                   intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str3);
                        }
/* 326 */               if (str4 != null && !StringsKt.m6228D(str4)) {
/* 336 */                   intent.putExtra("android.intent.extra.TITLE", str4);
                        }
                    } else {
/* 345 */               if (arrayList3.isEmpty()) {
/* 694 */                   ds0.m3195l("Error sharing files: No files found");
/* 697 */                   return;
                        }
/* 353 */               String str5 = "*/*";
/* 355 */               if (arrayList3.size() == 1) {
/* 357 */                   if (arrayList2 != null && !arrayList2.isEmpty()) {
/* 372 */                       str5 = (String) CollectionsKt.m6200u(arrayList2);
                            }
/* 376 */                   intent.setAction("android.intent.action.SEND");
/* 379 */                   intent.setType(str5);
/* 388 */                   intent.putExtra("android.intent.extra.STREAM", (Parcelable) CollectionsKt.m6200u(arrayList3));
                        } else {
/* 394 */                   intent.setAction("android.intent.action.SEND_MULTIPLE");
/* 397 */                   if (arrayList2 != null && !arrayList2.isEmpty()) {
/* 409 */                       if (arrayList2.size() != 1) {
/* 426 */                           strConcat = (String) CollectionsKt.m6200u(arrayList2);
/* 432 */                           int size = arrayList2.size() - 1;
/* 433 */                           if (1 <= size) {
/* 435 */                               int i = 1;
                                        while (true) {
/* 444 */                                   if (!Intrinsics.m6216a(strConcat, arrayList2.get(i))) {
/* 464 */                                       if (m1245r(strConcat).equals(m1245r((String) arrayList2.get(i)))) {
/* 478 */                                           strConcat = m1245r((String) arrayList2.get(i)).concat("/*");
                                                }
                                            }
/* 482 */                                   if (i == size) {
                                                break;
                                            } else {
/* 484 */                                       i++;
                                            }
                                        }
                                    }
                                } else {
/* 417 */                           str5 = (String) CollectionsKt.m6200u(arrayList2);
                                }
/* 419 */                       strConcat = str5;
                                break;
                            }
/* 419 */                   strConcat = str5;
                            break;
/* 487 */                   intent.setType(strConcat);
/* 490 */                   intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                        }
/* 493 */               if (str != null && !StringsKt.m6228D(str)) {
/* 502 */                   intent.putExtra("android.intent.extra.TEXT", str);
                        }
/* 505 */               if (str3 != null && !StringsKt.m6228D(str3)) {
/* 514 */                   intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str3);
                        }
/* 517 */               if (str4 != null && !StringsKt.m6228D(str4)) {
/* 526 */                   intent.putExtra("android.intent.extra.TITLE", str4);
                        }
/* 530 */               intent.addFlags(1);
                    }
/* 566 */           Intent intentCreateChooser = Intent.createChooser(intent, str4, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((hk2) this.f2215f).getValue()).intValue() | 134217728).getIntentSender());
/* 570 */           if (arrayList3 != null) {
/* 574 */               Context context3 = (Activity) this.f2212c;
/* 576 */               if (context3 == null) {
/* 579 */                   context3 = context;
                        }
/* 586 */               List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
/* 590 */               listQueryIntentActivities.getClass();
/* 593 */               Iterator<T> it2 = listQueryIntentActivities.iterator();
/* 601 */               while (it2.hasNext()) {
/* 611 */                   String str6 = ((ResolveInfo) it2.next()).activityInfo.packageName;
/* 613 */                   Iterator<T> it3 = arrayList3.iterator();
/* 621 */                   while (it3.hasNext()) {
/* 627 */                       Uri uri = (Uri) it3.next();
/* 631 */                       Context context4 = (Activity) this.f2212c;
/* 633 */                       if (context4 == null) {
/* 636 */                           context4 = context;
                                }
/* 638 */                       context4.grantUriPermission(str6, uri, 3);
                            }
                        }
                    }
/* 642 */           intentCreateChooser.getClass();
/* 647 */           Activity activity = (Activity) this.f2212c;
/* 649 */           if (activity != null) {
/* 653 */               activity.startActivityForResult(intentCreateChooser, 22643);
/* 691 */               return;
                    }
/* 659 */           intentCreateChooser.addFlags(268435456);
/* 664 */           id2 id2Var = (id2) this.f2213d;
/* 674 */           if (id2Var.f9555b.compareAndSet(false, true) && (result = id2Var.f9554a) != null) {
/* 682 */               result.success("dev.fluttercommunity.plus/share/unavailable");
/* 686 */               id2Var.f9554a = null;
                    }
/* 688 */           context.startActivity(intentCreateChooser);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: H */
                public void m1253H(String str, boolean z) {
/* 3 */             ra2 ra2Var = (ra2) this.f2215f;
/* 5 */             rs0 rs0Var = rs0.f16254y;
/* 9 */             int i = 0;
/* 9 */             Object[] objArr = 0;
/* 10 */            if (rs0Var.f16257b) {
/* 17 */                ra2Var.m8115t(new dt0(this, i));
                    } else {
/* 23 */                if (rs0Var.f16256a) {
/* 57 */                    return;
                        }
/* 25 */                if (z || ((SharedPreferences) ((er0) ((er0) this.f2213d).f7853b).f7853b).getBoolean("enable_inapp_notificaiton", false)) {
/* 54 */                    ra2Var.m8115t(new cp0(this, str, 10, objArr == true ? 1 : 0));
                        }
                    }
                }

                /* JADX INFO: renamed from: I */
                public void m1254I(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 4 */                     z61 z61VarM1271q = m1271q(g71Var);
/* 8 */                     if (z61VarM1271q == null) {
/* 11 */                        return;
                            }
/* 24 */                    Iterator it = ((Set) ((HashMap) this.f2213d).get(z61VarM1271q)).iterator();
/* 32 */                    while (it.hasNext()) {
/* 48 */                        y61 y61Var = (y61) ((HashMap) this.f2212c).get((C0018ag) it.next());
/* 50 */                        y61Var.getClass();
/* 53 */                        y61Var.m10111d();
                            }
                        } catch (Throwable th) {
/* 60 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: J */
                public void m1255J() {
                    g71 g71Var;
                    synchronized (this.f2211b) {
/* 12 */                Iterator it = ((HashMap) this.f2212c).keySet().iterator();
/* 20 */                while (it.hasNext()) {
/* 36 */                    y61 y61Var = (y61) ((HashMap) this.f2212c).get((C0018ag) it.next());
                            synchronized (y61Var.f19504a) {
/* 41 */                        C2116qq c2116qq = y61Var.f19506c;
/* 49 */                        c2116qq.m7985y((ArrayList) c2116qq.m7983v());
                            }
                            synchronized (y61Var.f19504a) {
/* 56 */                        g71Var = y61Var.f19505b;
                            }
/* 59 */                    m1250E(g71Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: K */
                public void m1256K(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 18 */                    Iterator it = ((Set) ((HashMap) this.f2213d).get(m1271q(g71Var))).iterator();
/* 26 */                    while (it.hasNext()) {
/* 42 */                        y61 y61Var = (y61) ((HashMap) this.f2212c).get((C0018ag) it.next());
/* 44 */                        y61Var.getClass();
/* 55 */                        if (!y61Var.m10110b().isEmpty()) {
/* 57 */                            y61Var.m10112g();
                                }
                            }
                        } catch (Throwable th) {
/* 66 */                    throw th;
                        }
                    }
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: a */
                public Set mo1257a(f02 f02Var) {
/* 9 */             if (((Set) this.f2213d).contains(f02Var)) {
/* 15 */                return ((InterfaceC0824cy) this.f2215f).mo1257a(f02Var);
                    }
/* 24 */            f42.m3655k(f02Var, "Attempting to request an undeclared dependency Set<", ">.");
/* 27 */            return null;
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: b */
                public iz1 mo1258b(Class cls) {
/* 5 */             return mo1260d(f02.m3619a(cls));
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: c */
                public iz1 mo1259c(f02 f02Var) {
/* 9 */             if (((Set) this.f2214e).contains(f02Var)) {
/* 15 */                return ((InterfaceC0824cy) this.f2215f).mo1259c(f02Var);
                    }
/* 24 */            f42.m3655k(f02Var, "Attempting to request an undeclared dependency Provider<Set<", ">>.");
/* 27 */            return null;
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: d */
                public iz1 mo1260d(f02 f02Var) {
/* 9 */             if (((Set) this.f2212c).contains(f02Var)) {
/* 15 */                return ((InterfaceC0824cy) this.f2215f).mo1260d(f02Var);
                    }
/* 24 */            f42.m3655k(f02Var, "Attempting to request an undeclared dependency Provider<", ">.");
/* 27 */            return null;
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: e */
                public Object mo1261e(f02 f02Var) {
/* 9 */             if (((Set) this.f2211b).contains(f02Var)) {
/* 15 */                return ((InterfaceC0824cy) this.f2215f).mo1261e(f02Var);
                    }
/* 24 */            f42.m3655k(f02Var, "Attempting to request an undeclared dependency ", ".");
/* 27 */            return null;
                }

                /* JADX INFO: renamed from: g */
                public void m1262g(Object obj, Object obj2, h41 h41Var, boolean z) throws GeneralSecurityException {
                    byte[] bArrArray;
/* 5 */             if (((ConcurrentHashMap) this.f2212c) == null) {
/* 273 */               f42.m3656l("addPrimitive cannot be called after build");
/* 276 */               return;
                    }
/* 7 */             if (obj == null && obj2 == null) {
/* 14 */                ds0.m3203t("at least one of the `fullPrimitive` or `primitive` must be set");
/* 17 */                return;
                    }
/* 24 */            if (h41Var.m4110D() != u31.ENABLED) {
/* 267 */               ds0.m3203t("only ENABLED key is allowed");
/* 270 */               return;
                    }
/* 30 */            Integer numValueOf = Integer.valueOf(h41Var.m4108B());
/* 41 */            if (h41Var.m4109C() == wq1.RAW) {
/* 43 */                numValueOf = null;
                    }
/* 78 */            de3 de3VarM303a = al1.f328b.m303a(xy1.m10037g(h41Var.m4107A().m4459B(), h41Var.m4107A().m4460C(), h41Var.m4107A().m4458A(), h41Var.m4109C(), numValueOf));
/* 88 */            int iOrdinal = h41Var.m4109C().ordinal();
/* 94 */            if (iOrdinal == 1) {
/* 154 */               bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(h41Var.m4108B()).array();
                    } else if (iOrdinal == 2) {
/* 133 */               bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(h41Var.m4108B()).array();
                    } else if (iOrdinal != 3) {
/* 103 */               if (iOrdinal != 4) {
/* 108 */                   ds0.m3203t("unknown output prefix type");
/* 111 */                   return;
                        }
/* 133 */               bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(h41Var.m4108B()).array();
                    } else {
/* 112 */               bArrArray = jb1.f12170b;
                    }
/* 181 */           lx1 lx1Var = new lx1(obj, obj2, bArrArray, h41Var.m4110D(), h41Var.m4109C(), h41Var.m4108B(), h41Var.m4107A().m4459B(), de3VarM303a);
/* 186 */           ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f2212c;
/* 190 */           ArrayList arrayList = (ArrayList) this.f2213d;
/* 194 */           ArrayList arrayList2 = new ArrayList();
/* 197 */           arrayList2.add(lx1Var);
/* 202 */           byte[] bArr = lx1Var.f13520c;
/* 212 */           mx1 mx1Var = new mx1(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
/* 223 */           List list = (List) concurrentHashMap.put(mx1Var, Collections.unmodifiableList(arrayList2));
/* 225 */           if (list != null) {
/* 229 */               ArrayList arrayList3 = new ArrayList();
/* 232 */               arrayList3.addAll(list);
/* 235 */               arrayList3.add(lx1Var);
/* 242 */               concurrentHashMap.put(mx1Var, Collections.unmodifiableList(arrayList3));
                    }
/* 245 */           arrayList.add(lx1Var);
/* 248 */           if (z) {
/* 254 */               if (((lx1) this.f2214e) == null) {
/* 256 */                   this.f2214e = lx1Var;
                        } else {
/* 261 */                   f42.m3656l("you cannot set two primary primitives");
                        }
                    }
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 58 */            return new n60((Executor) ((Provider) this.f2211b).get(), (ei1) ((Provider) this.f2212c).get(), (C0875ec) ((ac1) this.f2213d).get(), (s52) ((Provider) this.f2214e).get(), (s52) ((Provider) this.f2215f).get());
                }

                /* JADX INFO: renamed from: h */
                public void m1263h(y61 y61Var, List list, List list2, C1837kn c1837kn) {
                    g71 g71Var;
                    synchronized (this.f2211b) {
                        try {
/* 8 */                     boolean z = true;
/* 10 */                    de3.m3024f(!list2.isEmpty());
/* 13 */                    this.f2215f = c1837kn;
                            synchronized (y61Var.f19504a) {
/* 18 */                        g71Var = y61Var.f19505b;
                            }
/* 21 */                    z61 z61VarM1271q = m1271q(g71Var);
/* 25 */                    if (z61VarM1271q == null) {
/* 28 */                        return;
                            }
/* 40 */                    Set set = (Set) ((HashMap) this.f2213d).get(z61VarM1271q);
/* 44 */                    C1837kn c1837kn2 = (C1837kn) this.f2215f;
/* 46 */                    if (c1837kn2 == null || c1837kn2.f12882b != 2) {
/* 53 */                        Iterator it = set.iterator();
/* 61 */                        while (it.hasNext()) {
/* 77 */                            y61 y61Var2 = (y61) ((HashMap) this.f2212c).get((C0018ag) it.next());
/* 79 */                            y61Var2.getClass();
/* 86 */                            if (!y61Var2.equals(y61Var) && !y61Var2.m10110b().isEmpty()) {
/* 106 */                               throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                                    }
                                }
                            }
                            try {
                                synchronized (y61Var.f19506c.f15689V) {
                                }
/* 113 */                       C2116qq c2116qq = y61Var.f19506c;
                                synchronized (c2116qq.f15689V) {
/* 118 */                           c2116qq.f15706w = list;
                                }
                                synchronized (y61Var.f19504a) {
/* 126 */                           y61Var.f19506c.m7976b(list2);
                                }
/* 144 */                       if (((i71) g71Var.getLifecycle()).f9483c.compareTo(u61.f17377d) < 0) {
/* 147 */                           z = false;
                                }
/* 148 */                       if (z) {
/* 150 */                           m1247B(g71Var);
                                }
                            } catch (C2042oq e) {
/* 171 */                       throw new IllegalArgumentException(e);
                            }
                        } catch (Throwable th) {
/* 176 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public C0868e5 m1264i() {
/* 6 */             if (((Integer) this.f2211b) == null) {
/* 236 */               ds0.m3203t("AES key size is not set");
/* 5 */                 return null;
                    }
/* 12 */            if (((Integer) this.f2212c) == null) {
/* 230 */               ds0.m3203t("HMAC key size is not set");
/* 5 */                 return null;
                    }
/* 16 */            Integer num = (Integer) this.f2213d;
/* 18 */            if (num == null) {
/* 224 */               ds0.m3203t("tag size is not set");
/* 5 */                 return null;
                    }
/* 24 */            if (((C0204c5) this.f2214e) == null) {
/* 218 */               ds0.m3203t("hash type is not set");
/* 5 */                 return null;
                    }
/* 30 */            if (((C0832d5) this.f2215f) == null) {
/* 212 */               ds0.m3203t("variant is not set");
/* 5 */                 return null;
                    }
/* 32 */            int iIntValue = num.intValue();
/* 38 */            C0204c5 c0204c5 = (C0204c5) this.f2214e;
/* 42 */            if (c0204c5 == C0204c5.f2701c) {
/* 46 */                if (iIntValue > 20) {
/* 64 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                        }
                    } else if (c0204c5 == C0204c5.f2702d) {
/* 71 */                if (iIntValue > 28) {
/* 89 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                        }
                    } else if (c0204c5 == C0204c5.f2703e) {
/* 96 */                if (iIntValue > 32) {
/* 114 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                        }
                    } else if (c0204c5 == C0204c5.f2704f) {
/* 121 */               if (iIntValue > 48) {
/* 139 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                        }
                    } else {
/* 142 */               if (c0204c5 != C0204c5.f2705g) {
/* 206 */                   ds0.m3203t("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
/* 5 */                     return null;
                        }
/* 146 */               if (iIntValue > 64) {
/* 203 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                        }
                    }
/* 184 */           return new C0868e5(((Integer) this.f2211b).intValue(), ((Integer) this.f2212c).intValue(), ((Integer) this.f2213d).intValue(), (C0832d5) this.f2215f, (C0204c5) this.f2214e);
                }

                /* JADX INFO: renamed from: j */
                public C1926mg m1265j() {
/* 10 */            String strConcat = ((d70) this.f2213d) == null ? " surface" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            if (((List) this.f2214e) == null) {
/* 20 */                strConcat = strConcat.concat(" sharedSurfaces");
                    }
/* 28 */            if (((Integer) this.f2211b) == null) {
/* 32 */                strConcat = strConcat.concat(" mirrorMode");
                    }
/* 40 */            if (((Integer) this.f2212c) == null) {
/* 44 */                strConcat = strConcat.concat(" surfaceGroupId");
                    }
/* 52 */            if (((mb0) this.f2215f) == null) {
/* 56 */                strConcat = strConcat.concat(" dynamicRange");
                    }
/* 64 */            if (strConcat.isEmpty()) {
/* 99 */                return new C1926mg((d70) this.f2213d, (List) this.f2214e, ((Integer) this.f2211b).intValue(), ((Integer) this.f2212c).intValue(), (mb0) this.f2215f);
                    }
/* 109 */           f42.m3656l("Missing required properties:".concat(strConcat));
/* 112 */           return null;
                }

                /* JADX INFO: renamed from: k */
                public C2069pg m1266k() {
/* 10 */            String strConcat = ((Size) this.f2211b) == null ? " resolution" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            if (((mb0) this.f2212c) == null) {
/* 20 */                strConcat = strConcat.concat(" dynamicRange");
                    }
/* 28 */            if (((Range) this.f2213d) == null) {
/* 32 */                strConcat = strConcat.concat(" expectedFrameRateRange");
                    }
/* 40 */            if (((Boolean) this.f2215f) == null) {
/* 44 */                strConcat = strConcat.concat(" zslDisabled");
                    }
/* 52 */            if (strConcat.isEmpty()) {
/* 84 */                return new C2069pg((Size) this.f2211b, (mb0) this.f2212c, (Range) this.f2213d, (InterfaceC2235ty) this.f2214e, ((Boolean) this.f2215f).booleanValue());
                    }
/* 94 */            f42.m3656l("Missing required properties:".concat(strConcat));
/* 97 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: l */
                public void m1267l(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, lj2 lj2Var, lj2 lj2Var2, Map.Entry entry) {
/* 6 */             lj2 lj2Var3 = (lj2) entry.getValue();
/* 52 */            C2180sg c2180sg = new C2180sg(lj2Var.f13324g.f15102a, ((C1999of) entry.getKey()).f14733a.f8195d, lj2Var.f13320c ? interfaceC2559zp : null, ((C1999of) entry.getKey()).f14733a.f8197f, ((C1999of) entry.getKey()).f14733a.f8198g);
/* 98 */            C2180sg c2180sg2 = new C2180sg(lj2Var2.f13324g.f15102a, ((C1999of) entry.getKey()).f14734b.f8195d, lj2Var2.f13320c ? interfaceC2559zp2 : null, ((C1999of) entry.getKey()).f14734b.f8197f, ((C1999of) entry.getKey()).f14734b.f8198g);
/* 109 */           int i = ((C1999of) entry.getKey()).f14733a.f8194c;
/* 111 */           lj2Var3.getClass();
/* 114 */           pg3.m7423a();
/* 117 */           lj2Var3.m6461a();
/* 126 */           de3.m3028j("Consumer can only be linked once.", !lj2Var3.f13327j);
/* 129 */           lj2Var3.f13327j = true;
/* 132 */           kj2 kj2Var = lj2Var3.f13329l;
/* 149 */           RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(kj2Var.m2953c(), new jj2(lj2Var3, kj2Var, i, c2180sg, c2180sg2), pg3.m7436o());
/* 170 */           runnableC1901lsM9399I.mo3676a(new dp0(0 == true ? 1 : 0, runnableC1901lsM9399I, new C0210cb(this, lj2Var3, 29, false)), pg3.m7436o());
                }

                /* JADX INFO: renamed from: n */
                public y61 m1268n(g71 g71Var, C2116qq c2116qq) {
                    synchronized (this.f2211b) {
                        try {
/* 26 */                    de3.m3023e("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.f2212c).get(new C0018ag(g71Var, c2116qq.f15702e)) == null);
/* 31 */                    y61 y61Var = new y61(g71Var, c2116qq);
/* 44 */                    if (((ArrayList) c2116qq.m7983v()).isEmpty()) {
/* 46 */                        y61Var.m10111d();
                            }
/* 62 */                    if (((i71) g71Var.getLifecycle()).f9483c == u61.f17374a) {
/* 65 */                        return y61Var;
                            }
/* 66 */                    m1279z(y61Var);
/* 70 */                    return y61Var;
                        } catch (Throwable th) {
/* 72 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public void m1269o(Canvas canvas) {
                    Canvas canvas2;
/* 4 */             Paint paint = (Paint) this.f2213d;
/* 8 */             ViewGroup viewGroup = (ViewGroup) this.f2212c;
/* 12 */            C2564zu c2564zu = (C2564zu) this.f2214e;
/* 28 */            boolean z = c2564zu == null || c2564zu.f20329c == Float.MAX_VALUE;
/* 31 */            InterfaceC0157av interfaceC0157av = (InterfaceC0157av) this.f2211b;
/* 33 */            if (z) {
/* 67 */                canvas2 = canvas;
/* 68 */                interfaceC0157av.mo1172c(canvas2);
/* 79 */                if (Color.alpha(paint.getColor()) != 0) {
/* 93 */                    canvas2.drawRect(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight(), paint);
                        }
                    } else {
/* 35 */                interfaceC0157av.mo1172c(canvas);
/* 46 */                if (Color.alpha(paint.getColor()) != 0) {
/* 60 */                    canvas2 = canvas;
/* 61 */                    canvas2.drawRect(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight(), paint);
                        } else {
/* 65 */                    canvas2 = canvas;
                        }
                    }
/* 98 */            Drawable drawable = (Drawable) this.f2215f;
/* 100 */           if (drawable == null || ((C2564zu) this.f2214e) == null) {
/* 155 */               return;
                    }
/* 108 */           Rect bounds = drawable.getBounds();
/* 126 */           float fWidth = ((C2564zu) this.f2214e).f20327a - (bounds.width() / 2.0f);
/* 139 */           float fHeight = ((C2564zu) this.f2214e).f20328b - (bounds.height() / 2.0f);
/* 140 */           canvas2.translate(fWidth, fHeight);
/* 147 */           ((Drawable) this.f2215f).draw(canvas2);
/* 152 */           canvas2.translate(-fWidth, -fHeight);
                }

                /* JADX INFO: renamed from: p */
                public boolean m1270p() {
/* 3 */             SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f2213d;
/* 6 */             if (sQLiteDatabase != null) {
/* 16 */                if (sQLiteDatabase != null ? sQLiteDatabase.isOpen() : false) {
/* 18 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: q */
                public z61 m1271q(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 20 */                    for (z61 z61Var : ((HashMap) this.f2213d).keySet()) {
/* 34 */                        if (g71Var.equals(z61Var.f19955b)) {
/* 37 */                            return z61Var;
                                }
                            }
/* 40 */                    return null;
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public C2564zu m1272s() {
/* 3 */             C2564zu c2564zu = (C2564zu) this.f2214e;
/* 5 */             if (c2564zu == null) {
/* 7 */                 return null;
                    }
/* 11 */            C2564zu c2564zu2 = new C2564zu(c2564zu);
/* 21 */            if (c2564zu2.f20329c == Float.MAX_VALUE) {
/* 23 */                float f = c2564zu2.f20327a;
/* 25 */                float f2 = c2564zu2.f20328b;
/* 29 */                ViewGroup viewGroup = (ViewGroup) this.f2212c;
/* 45 */                c2564zu2.f20329c = pg3.m7429h(f, f2, viewGroup.getWidth(), viewGroup.getHeight());
                    }
/* 47 */            return c2564zu2;
                }

                /* JADX INFO: renamed from: t */
                public File m1273t() {
/* 5 */             Context context = (Activity) this.f2212c;
/* 7 */             if (context == null) {
/* 13 */                context = (Context) this.f2211b;
                    }
/* 21 */            return new File(context.getCacheDir(), "share_plus");
                }

                public String toString() {
                    switch (this.f2210a) {
                        case 6:
/* 13 */                    List list = (List) this.f2214e;
/* 17 */                    StringBuilder sb = new StringBuilder();
/* 67 */                    sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2211b) + ", mProviderPackage: " + ((String) this.f2212c) + ", mQuery: " + ((String) this.f2213d) + ", mCertificates:");
/* 76 */                    for (int i = 0; i < list.size(); i++) {
/* 80 */                        sb.append(" [");
/* 87 */                        List list2 = (List) list.get(i);
/* 94 */                        for (int i2 = 0; i2 < list2.size(); i2++) {
/* 98 */                            sb.append(" \"");
/* 111 */                           sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
/* 116 */                           sb.append("\"");
                                }
/* 124 */                       sb.append(" ]");
                            }
/* 132 */                   sb.append("}mCertificatesArray: 0");
/* 135 */                   return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public boolean m1274u(g71 g71Var) {
                    synchronized (this.f2211b) {
                        try {
/* 4 */                     z61 z61VarM1271q = m1271q(g71Var);
/* 9 */                     if (z61VarM1271q == null) {
/* 8 */                         return false;
                            }
/* 25 */                    Iterator it = ((Set) ((HashMap) this.f2213d).get(z61VarM1271q)).iterator();
/* 33 */                    while (it.hasNext()) {
/* 49 */                        y61 y61Var = (y61) ((HashMap) this.f2212c).get((C0018ag) it.next());
/* 51 */                        y61Var.getClass();
/* 62 */                        if (!y61Var.m10110b().isEmpty()) {
/* 64 */                            return true;
                                }
                            }
/* 8 */                     return false;
                        } catch (Throwable th) {
/* 70 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: v */
                public void m1275v(zq2 zq2Var) {
                    SQLiteDatabase sQLiteDatabase;
                    byte[] byteArray;
/* 1 */             zq2Var.getClass();
/* 8 */             if (!m1270p() || (sQLiteDatabase = (SQLiteDatabase) this.f2213d) == null) {
/* 129 */               return;
                    }
/* 17 */            HashMap map = zq2Var.f20294b;
/* 19 */            int i = mn0.f13881p;
/* 21 */            map.getClass();
/* 26 */            HashMap map2 = new HashMap();
/* 41 */            for (Map.Entry entry : map.entrySet()) {
/* 63 */                map2.put((String) entry.getKey(), entry.getValue().toString());
                    }
                    try {
/* 70 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 75 */                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
/* 78 */                objectOutputStream.writeObject(map2);
/* 81 */                objectOutputStream.close();
/* 84 */                byteArrayOutputStream.close();
/* 87 */                byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
/* 93 */                e.printStackTrace();
/* 96 */                byteArray = null;
                    }
/* 100 */           ContentValues contentValues = new ContentValues(2);
/* 105 */           contentValues.put("eventData", byteArray);
/* 126 */           k50.m5968e("b5", "Added event to database: %s", Long.valueOf(sQLiteDatabase.insert("events", null, contentValues)));
                }

                /* JADX INFO: renamed from: w */
                public void m1276w() {
/* 5 */             if (!m1270p() || ((ArrayList) this.f2212c).size() <= 0) {
/* 55 */                return;
                    }
                    synchronized (this) {
                        try {
/* 22 */                    Iterator it = ((ArrayList) this.f2212c).iterator();
/* 30 */                    while (it.hasNext()) {
/* 38 */                        m1275v((zq2) it.next());
                            }
/* 48 */                    ((ArrayList) this.f2212c).clear();
                        } catch (Throwable th) {
/* 54 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: x */
                public boolean m1277x() {
/* 10 */            if (((InterfaceC0157av) this.f2211b).mo1173d()) {
/* 14 */                C2564zu c2564zu = (C2564zu) this.f2214e;
/* 32 */                if (c2564zu == null || c2564zu.f20329c == Float.MAX_VALUE) {
/* 16 */                    return true;
                        }
                    }
/* 9 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:89:0x0227  */
                /* JADX INFO: renamed from: y */
                public dw1 m1278y() {
                    fj0 fj0Var;
                    String str;
                    String str2;
                    ej0 ej0Var;
                    ev1 ev1Var;
                    String str3;
                    Boolean boolValueOf;
                    cv1 cv1Var;
                    List list;
                    uu1 uu1Var;
                    List listM7566e;
                    dj0 dj0Var;
/* 7 */             ur3 ur3Var = (ur3) this.f2212c;
/* 13 */            C0875ec c0875ec = (C0875ec) this.f2213d;
/* 17 */            eq2 eq2Var = (eq2) c0875ec.f7613b;
/* 52 */            ra2 ra2Var = new ra2(eq2Var, (nv1) c0875ec.f7614c, new ec0((String) eq2Var.f7836e, (String) eq2Var.f7837f, (String) eq2Var.f7835d, ((UsercentricsSettings) this.f2211b).f6701a.f6596c), (au1) c0875ec.f7615d);
/* 57 */            fp0 fp0Var = (fp0) this.f2214e;
/* 59 */            fp0Var.getClass();
/* 64 */            UsercentricsSettings usercentricsSettings = fp0Var.f8306a;
/* 66 */            FirstLayer firstLayer = usercentricsSettings.f6722v;
/* 68 */            UsercentricsLabels usercentricsLabels = usercentricsSettings.f6701a;
/* 70 */            if (firstLayer == null || (fj0Var = firstLayer.f6434e) == null) {
/* 78 */                jw2.Companion.getClass();
/* 81 */                fj0Var = jw2.f12527e;
                    }
/* 91 */            String str4 = usercentricsSettings.f6711k ? usercentricsSettings.f6709i : null;
/* 113 */           String str5 = (firstLayer != null ? firstLayer.f6433d : null) == dj0.f7268a ? (String) ((eq2) fp0Var.f8308c.f7613b).f7838i : null;
/* 114 */           String str6 = usercentricsSettings.f6708h;
/* 118 */           if (str6 == null) {
/* 120 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 121 */               str = str2;
                    } else {
/* 123 */               str = str6;
/* 124 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 125 */           String str7 = usercentricsLabels.f6598d;
/* 127 */           String str8 = usercentricsLabels.f6611j0;
/* 129 */           String str9 = str5;
/* 131 */           if (firstLayer == null || (ej0Var = firstLayer.f6431b) == null) {
/* 141 */               ej0Var = fp0.f8305d;
                    }
/* 138 */           ej0 ej0Var2 = ej0Var;
/* 144 */           UsercentricsCustomization usercentricsCustomization = usercentricsSettings.f6721u;
/* 153 */           String str10 = usercentricsCustomization != null ? usercentricsCustomization.f6538a : null;
/* 155 */           dv1 dv1Var = ev1.Companion;
/* 159 */           String str11 = usercentricsLabels.f6552D;
/* 161 */           String str12 = str2;
/* 163 */           String str13 = usercentricsSettings.f6706f;
/* 167 */           ez2 ez2Var = ez2.PRIVACY_POLICY_LINK;
/* 169 */           dv1Var.getClass();
/* 172 */           ev1 ev1VarM3243a = dv1.m3243a(str11, str13, ez2Var);
/* 180 */           String str14 = str4;
/* 184 */           ev1 ev1VarM3243a2 = dv1.m3243a(usercentricsLabels.f6550C, usercentricsSettings.f6705e, ez2.IMPRINT_LINK);
/* 196 */           if ((firstLayer != null ? firstLayer.f6432c : null) == n82.f14162a) {
/* 198 */               str8.getClass();
/* 212 */               ev1Var = new ev1(str8, null, fv1.MANAGE_SETTINGS, ez2.MORE_INFORMATION_LINK);
                    } else {
/* 220 */               ev1Var = null;
                    }
/* 225 */           ArrayList arrayListM7773h = C2103qd.m7773h(new ev1[]{ev1VarM3243a, ev1VarM3243a2, ev1Var});
/* 231 */           ArrayList arrayList = new ArrayList();
/* 242 */           for (Object obj : arrayListM7773h) {
/* 255 */               if (!((ev1) obj).m3602a()) {
/* 257 */                   arrayList.add(obj);
                        }
                    }
/* 261 */           String strM4327V = hu0.m4327V(str9);
/* 265 */           if (firstLayer == null || (dj0Var = firstLayer.f6433d) == null) {
/* 288 */               str3 = str12;
/* 290 */               boolValueOf = null;
                    } else {
/* 277 */               boolValueOf = Boolean.valueOf(dj0Var.equals(dj0.f7269b));
/* 285 */               str3 = str12;
                    }
/* 294 */           String str15 = str3;
/* 312 */           f31 f31Var = new f31(str7, str14, str, arrayList, ej0Var2, str10, strM4327V, boolValueOf, usercentricsLabels.f6607h0);
/* 315 */           String str16 = usercentricsLabels.f6592a;
/* 317 */           ur3 ur3Var2 = fp0Var.f8307b;
/* 321 */           ju1 ju1Var = (ju1) ur3Var2.f17704b;
/* 404 */           xy1 xy1Var = new xy1(new uu1(str16, bu1.f2607a, ju1Var.f12487b), firstLayer != null ? Intrinsics.m6216a(firstLayer.f6430a, Boolean.FALSE) : false ? new uu1(usercentricsLabels.f6594b, bu1.f2608b, ju1Var.f12488c) : null, null, null, (firstLayer != null ? firstLayer.f6432c : null) == n82.f14163b ? new uu1(str8, bu1.f2611e, ju1Var.f12491f) : null, (EnumC0958gl) ur3Var2.f17706d, 12);
/* 435 */           jw2 jw2Var = new jw2(fj0Var, f31Var, new C1029ij(usercentricsSettings.f6712l ? new C2131r4("Powered by Usercentrics Consent Management") : null, xy1Var.m10044h(), xy1Var.m10045i()), nd0.f14189a);
/* 440 */           ip0 ip0Var = (ip0) this.f2215f;
/* 442 */           boolean z = ip0Var.f11881w;
/* 446 */           UsercentricsSettings usercentricsSettings2 = ip0Var.f11874b;
/* 448 */           UsercentricsLabels usercentricsLabels2 = usercentricsSettings2.f6701a;
/* 450 */           SecondLayer secondLayer = usercentricsSettings2.f6702b;
/* 454 */           String strM4327V2 = hu0.m4327V(usercentricsLabels2.f6623p0);
/* 458 */           if (strM4327V2 == null) {
/* 460 */               strM4327V2 = usercentricsLabels2.f6621o0;
                    }
/* 462 */           String str17 = strM4327V2;
/* 464 */           String str18 = usercentricsLabels2.f6625q0;
/* 471 */           String str19 = str18 == null ? str15 : str18;
/* 473 */           ej0 ej0Var3 = ip0.f11873U;
/* 475 */           List list2 = usercentricsSettings2.f6717q;
/* 485 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 488 */           Iterator it = list2.iterator();
/* 496 */           while (it.hasNext()) {
/* 509 */               arrayList2.add(new bv1((String) it.next()));
                    }
/* 519 */           List listM6186E = CollectionsKt.m6186E(new wa3(5), arrayList2);
/* 523 */           Boolean bool = secondLayer.f6443f;
/* 525 */           String str20 = secondLayer.f6444g;
/* 527 */           Boolean bool2 = secondLayer.f6442e;
/* 536 */           if (!Intrinsics.m6216a(bool, Boolean.TRUE)) {
/* 538 */               listM6186E.getClass();
/* 572 */               cv1Var = !(listM6186E.size() > 1) ? null : new cv1(listM6186E, new bv1(usercentricsSettings2.f6704d));
                    }
/* 574 */           UsercentricsCustomization usercentricsCustomization2 = usercentricsSettings2.f6721u;
/* 583 */           String str21 = usercentricsCustomization2 != null ? usercentricsCustomization2.f6538a : null;
/* 585 */           if (z) {
/* 587 */               list = nd0.f14189a;
                    } else {
/* 592 */               dv1 dv1Var2 = ev1.Companion;
/* 594 */               String str22 = usercentricsLabels2.f6552D;
/* 596 */               String str23 = usercentricsSettings2.f6706f;
/* 598 */               ez2 ez2Var2 = ez2.PRIVACY_POLICY_LINK;
/* 600 */               dv1Var2.getClass();
/* 621 */               List listM7566e2 = C2085pw.m7566e(dv1.m3243a(str22, str23, ez2Var2), dv1.m3243a(usercentricsLabels2.f6550C, usercentricsSettings2.f6705e, ez2.IMPRINT_LINK));
/* 627 */               ArrayList arrayList3 = new ArrayList();
/* 638 */               for (Object obj2 : listM7566e2) {
/* 653 */                   if (((ev1) obj2).f7892a.length() > 0) {
/* 655 */                       arrayList3.add(obj2);
                            }
                        }
/* 659 */               list = arrayList3;
                    }
/* 663 */           qi1 qi1Var = new qi1(str19, str17, list, ej0Var3, str21, cv1Var);
/* 668 */           ur3 ur3Var3 = ip0Var.f11876d;
/* 670 */           UsercentricsLabels usercentricsLabels3 = usercentricsSettings2.f6701a;
/* 672 */           Boolean bool3 = Boolean.TRUE;
/* 678 */           if (Intrinsics.m6216a(bool2, bool3)) {
/* 682 */               uu1Var = null;
                    } else {
/* 685 */               String str24 = secondLayer.f6445h;
/* 691 */               if (Intrinsics.m6216a(bool2, bool3)) {
/* 693 */                   str24 = str15;
                        } else if (str24 == null || !(!StringsKt.m6228D(str24))) {
/* 708 */                   str24 = usercentricsLabels3.f6594b;
                        }
/* 722 */               uu1Var = new uu1(str24, bu1.f2608b, ((ju1) ur3Var3.f17704b).f12488c);
                    }
/* 727 */           if (str20 == null || !(!StringsKt.m6228D(str20))) {
/* 738 */               str20 = usercentricsLabels3.f6592a;
                    }
/* 786 */           xy1 xy1Var2 = new xy1(new uu1(str20, bu1.f2607a, ((ju1) ur3Var3.f17704b).f12487b), uu1Var, new uu1(usercentricsLabels3.f6596c, bu1.f2610d, ((ju1) ur3Var3.f17704b).f12489d), null, null, (EnumC0958gl) ur3Var3.f17706d, 24);
/* 810 */           C1029ij c1029ij = new C1029ij(usercentricsSettings2.f6712l ? new C2131r4("Powered by Usercentrics Consent Management") : null, xy1Var2.m10044h(), xy1Var2.m10045i());
/* 813 */           if (z) {
/* 833 */               listM7566e = C1839a.m6210b(new xv1(str15, new eu1(C1839a.m6210b(ip0Var.m5532A()))));
                    } else {
/* 856 */               xv1 xv1Var = new xv1(secondLayer.f6438a, new eu1(C1839a.m6210b(ip0Var.m5532A())));
/* 861 */               String str25 = secondLayer.f6439b;
/* 865 */               List list3 = ip0Var.f11879i;
/* 869 */               ArrayList arrayList4 = new ArrayList();
/* 880 */               for (Object obj3 : list3) {
/* 891 */                   if (!((m61) obj3).f13599y) {
/* 893 */                       arrayList4.add(obj3);
                            }
                        }
/* 905 */               ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(arrayList4, 10));
/* 908 */               Iterator it2 = arrayList4.iterator();
/* 916 */               while (it2.hasNext()) {
/* 922 */                   m61 m61Var = (m61) it2.next();
/* 974 */                   arrayList5.add(new cu1(m61Var, ip0Var.f11880v ? null : new vv1(m61Var), new sv1(new mv1(m61Var, null, false, usercentricsSettings2.f6694B, ip0Var.m8626l(m61Var.f13590p), 6))));
/* 977 */                   it2 = it2;
/* 979 */                   usercentricsSettings2 = usercentricsSettings2;
                        }
/* 1015 */              listM7566e = C2085pw.m7566e(xv1Var, new xv1(str25, new pv1(C1839a.m6210b(new du1(null, arrayList5, new fu1(ip0Var.f11875c.f6757a.f6792f, ip0Var.f11877e))))));
                    }
/* 1026 */          return new dw1(ur3Var, ra2Var, jw2Var, new ac1(qi1Var, c1029ij, listM7566e));
                }

                /* JADX INFO: renamed from: z */
                public void m1279z(y61 y61Var) {
                    g71 g71Var;
                    synchronized (this.f2211b) {
                        try {
                            synchronized (y61Var.f19504a) {
/* 7 */                         g71Var = y61Var.f19505b;
                            }
/* 10 */                    C2116qq c2116qq = y61Var.f19506c;
/* 22 */                    C0018ag c0018ag = new C0018ag(g71Var, C2116qq.m7970s(c2116qq.f15695a0, c2116qq.f15697b0));
/* 25 */                    z61 z61VarM1271q = m1271q(g71Var);
/* 46 */                    Set hashSet = z61VarM1271q != null ? (Set) ((HashMap) this.f2213d).get(z61VarM1271q) : new HashSet();
/* 49 */                    hashSet.add(c0018ag);
/* 56 */                    ((HashMap) this.f2212c).put(c0018ag, y61Var);
/* 59 */                    if (z61VarM1271q == null) {
/* 63 */                        z61 z61Var = new z61(g71Var, this);
/* 70 */                        ((HashMap) this.f2213d).put(z61Var, hashSet);
/* 77 */                        g71Var.getLifecycle().mo4483a(z61Var);
                            }
                        } catch (Throwable th) {
/* 86 */                    throw th;
                        }
                    }
                }

                @Override // p000.InterfaceC0824cy
/* 61 */        public Object get(Class cls) {
/* 62 */            if (((Set) this.f2211b).contains(f02.m3619a(cls))) {
/* 63 */                Object obj = ((InterfaceC0824cy) this.f2215f).get(cls);
/* 64 */                if (!cls.equals(pz1.class)) {
                            return obj;
                        }
/* 66 */                return new h42();
                    }
/* 69 */            f42.m3655k(cls, "Attempting to request an undeclared dependency ", ".");
                    return null;
                }

/* 137 */       public /* synthetic */ C0168b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
/* 138 */           this.f2210a = i;
                    this.f2211b = obj;
                    this.f2212c = obj2;
                    this.f2213d = obj3;
                    this.f2214e = obj4;
                    this.f2215f = obj5;
                }

/* 138 */       public C0168b5(UsercentricsSettings usercentricsSettings, ur3 ur3Var, C0875ec c0875ec, LegalBasisLocalization legalBasisLocalization, String str, List list, List list2) {
                    this.f2210a = 7;
                    usercentricsSettings.getClass();
                    legalBasisLocalization.getClass();
                    str.getClass();
                    list.getClass();
                    list2.getClass();
/* 140 */           this.f2211b = usercentricsSettings;
/* 141 */           this.f2212c = ur3Var;
/* 142 */           this.f2213d = c0875ec;
/* 143 */           this.f2214e = new fp0(usercentricsSettings, ur3Var, c0875ec);
/* 145 */           this.f2215f = new ip0(usercentricsSettings, legalBasisLocalization, ur3Var, str, list, list2, (nv1) c0875ec.f7614c);
                }

/* 145 */       public C0168b5(Context context, id2 id2Var) {
                    this.f2210a = 15;
                    context.getClass();
                    id2Var.getClass();
/* 147 */           this.f2211b = context;
/* 148 */           this.f2212c = null;
/* 149 */           this.f2213d = id2Var;
/* 150 */           this.f2214e = r51.m8065b(new C1997od(this, 10));
/* 151 */           this.f2215f = r51.m8065b(new gd2(0));
                }

/* 151 */       public C0168b5(a13 a13Var, g13 g13Var, String str, i03 i03Var, pc2 pc2Var, sr2 sr2Var, C2508yr c2508yr, ac2 ac2Var, il2 il2Var, C2484y3 c2484y3, x80 x80Var) {
                    this.f2210a = 18;
                    g13Var.getClass();
                    str.getClass();
                    i03Var.getClass();
                    pc2Var.getClass();
                    sr2Var.getClass();
                    c2508yr.getClass();
                    ac2Var.getClass();
                    il2Var.getClass();
                    c2484y3.getClass();
                    x80Var.getClass();
/* 153 */           this.f2211b = a13Var;
/* 154 */           this.f2212c = g13Var;
/* 155 */           this.f2213d = str;
/* 156 */           this.f2214e = i03Var;
/* 157 */           this.f2215f = new C2218th(pc2Var, ac2Var, sr2Var, il2Var, c2508yr, c2484y3, g13Var, x80Var);
                }

/* 157 */       public C0168b5(od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4, od0 od0Var5) {
                    this.f2210a = 14;
                    od0Var.getClass();
                    od0Var2.getClass();
                    od0Var3.getClass();
                    od0Var4.getClass();
                    od0Var5.getClass();
/* 159 */           this.f2211b = od0Var;
/* 160 */           this.f2212c = od0Var2;
/* 161 */           this.f2213d = od0Var3;
/* 162 */           this.f2214e = od0Var4;
/* 163 */           this.f2215f = od0Var5;
                }

/* 163 */       public /* synthetic */ C0168b5(int i) {
/* 164 */           this.f2210a = i;
                }

/* 164 */       public C0168b5(Context context, String str) {
                    this.f2210a = 13;
                    context.getClass();
                    this.f2211b = str;
/* 166 */           this.f2212c = new ArrayList();
/* 169 */           this.f2215f = new String[]{"id", "eventData", "dateCreated"};
/* 170 */           mf0.m6644b(new bh0(this, context));
                }

/* 170 */       public C0168b5(MotionLayout motionLayout) {
                    this.f2210a = 19;
/* 172 */           this.f2212c = new ArrayList();
/* 173 */           this.f2215f = new ArrayList();
/* 174 */           this.f2211b = motionLayout;
                }

/* 174 */       public C0168b5(String str, String str2, String str3, List list) {
                    this.f2210a = 6;
/* 176 */           str.getClass();
/* 177 */           this.f2211b = str;
/* 178 */           str2.getClass();
/* 179 */           this.f2212c = str2;
/* 180 */           this.f2213d = str3;
/* 181 */           list.getClass();
/* 182 */           this.f2214e = list;
/* 184 */           this.f2215f = str + "-" + str2 + "-" + str3;
                }

/* 184 */       public C0168b5(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
                    this.f2210a = 16;
/* 186 */           this.f2214e = new ArrayDeque();
/* 187 */           this.f2211b = sharedPreferences;
/* 188 */           this.f2212c = "topic_operation_queue";
/* 189 */           this.f2213d = ",";
/* 190 */           this.f2215f = scheduledThreadPoolExecutor;
                }

/* 190 */       public C0168b5() {
                    this.f2210a = 9;
/* 192 */           this.f2211b = new Object();
/* 193 */           this.f2212c = new HashMap();
/* 194 */           this.f2213d = new HashMap();
/* 195 */           this.f2214e = new ArrayDeque();
                }

/* 195 */       public C0168b5(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, cb0 cb0Var) {
                    this.f2210a = 5;
/* 197 */           this.f2212c = interfaceC2559zp;
/* 198 */           this.f2213d = interfaceC2559zp2;
/* 199 */           this.f2211b = cb0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 199 */       public C0168b5(InterfaceC0157av interfaceC0157av) {
                    this.f2210a = 3;
/* 201 */           this.f2211b = interfaceC0157av;
/* 202 */           View view = (View) interfaceC0157av;
                    this.f2212c = (ViewGroup) view;
/* 203 */           view.setWillNotDraw(false);
/* 204 */           new Path();
/* 205 */           new Paint(7);
/* 206 */           Paint paint = new Paint(1);
                    this.f2213d = paint;
/* 207 */           paint.setColor(0);
                }

/* 207 */       public C0168b5(Class cls) {
                    this.f2210a = 10;
/* 209 */           this.f2212c = new ConcurrentHashMap();
/* 210 */           this.f2213d = new ArrayList();
/* 211 */           this.f2211b = cls;
/* 212 */           this.f2215f = tj1.f17127b;
                }
            }
