            package p000;

            import android.app.ActivityManager;
            import android.app.KeyguardManager;
            import android.app.Notification;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ClipDescription;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.database.Cursor;
            import android.graphics.Bitmap;
            import android.graphics.Color;
            import android.media.RingtoneManager;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.PersistableBundle;
            import android.os.Process;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.text.Editable;
            import android.text.Selection;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Log;
            import android.util.SparseArray;
            import android.view.Choreographer;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.widget.C0075b;
            import androidx.core.app.NotificationCompat;
            import androidx.core.graphics.drawable.IconCompat;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.startup.R$string;
            import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosure;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureType;
            import com.usercentrics.tcf.core.model.gvl.Purpose;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.zip.Adler32;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: ec */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 61 */    public final class C0875ec implements InterfaceC2299vm, fy0 {

                /* JADX INFO: renamed from: e */
                public static volatile C0875ec f7610e;

                /* JADX INFO: renamed from: f */
                public static final Object f7611f = new Object();

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7612a;

                /* JADX INFO: renamed from: b */
                public Object f7613b;

                /* JADX INFO: renamed from: c */
                public Object f7614c;

                /* JADX INFO: renamed from: d */
                public Object f7615d;

                public C0875ec(ra2 ra2Var, zb0 zb0Var, y50 y50Var, Set set) {
/* 3 */             this.f7612a = 23;
/* 8 */             this.f7613b = zb0Var;
/* 10 */            this.f7614c = ra2Var;
/* 12 */            this.f7615d = y50Var;
/* 18 */            if (set.isEmpty()) {
/* 62 */                return;
                    }
/* 21 */            Iterator it = set.iterator();
/* 29 */            while (it.hasNext()) {
/* 35 */                int[] iArr = (int[]) it.next();
/* 41 */                String str = new String(iArr, 0, iArr.length);
/* 58 */                m3371I(str, 0, str.length(), 1, true, new C0832d5(str, 5));
                    }
                }

                /* JADX INFO: renamed from: J */
                public static final C0875ec m3359J(qc3 qc3Var, C2486y5 c2486y5) throws GeneralSecurityException, IOException {
/* 2 */             byte[] bArr = new byte[0];
/* 6 */             ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) qc3Var.f15492b;
                    try {
/* 12 */                zd0 zd0VarM10335A = zd0.m10335A(byteArrayInputStream, dg0.m3057a());
/* 16 */                byteArrayInputStream.close();
/* 30 */                if (zd0VarM10335A.m10339y().size() == 0) {
/* 75 */                    ds0.m3203t("empty keyset");
/* 27 */                    return null;
                        }
                        try {
/* 48 */                    i41 i41VarM4466E = i41.m4466E(c2486y5.mo1525b(zd0VarM10335A.m10339y().m9304e(), bArr), dg0.m3057a());
/* 56 */                    if (i41VarM4466E.m4472z() > 0) {
/* 58 */                        return m3361s(i41VarM4466E);
                            }
/* 68 */                    throw new GeneralSecurityException("empty keyset");
                        } catch (pz0 unused) {
/* 71 */                    ds0.m3203t("invalid keyset, corrupted key material");
/* 27 */                    return null;
                        }
                    } catch (Throwable th) {
/* 80 */                byteArrayInputStream.close();
/* 83 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: o */
                public static boolean m3360o(Editable editable, KeyEvent keyEvent, boolean z) {
                    rs2[] rs2VarArr;
/* 10 */            if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
/* 13 */                int selectionStart = Selection.getSelectionStart(editable);
/* 17 */                int selectionEnd = Selection.getSelectionEnd(editable);
/* 22 */                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (rs2VarArr = (rs2[]) editable.getSpans(selectionStart, selectionEnd, rs2.class)) != null && rs2VarArr.length > 0) {
/* 44 */                    for (rs2 rs2Var : rs2VarArr) {
/* 48 */                        int spanStart = editable.getSpanStart(rs2Var);
/* 52 */                        int spanEnd = editable.getSpanEnd(rs2Var);
/* 56 */                        if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
/* 68 */                            editable.delete(spanStart, spanEnd);
/* 71 */                            return true;
                                }
                            }
                        }
                    }
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: s */
                public static final C0875ec m3361s(i41 i41Var) throws GeneralSecurityException {
/* 6 */             if (i41Var.m4472z() <= 0) {
/* 156 */               ds0.m3203t("empty keyset");
/* 5 */                 return null;
                    }
/* 14 */            ArrayList arrayList = new ArrayList(i41Var.m4472z());
/* 29 */            for (h41 h41Var : i41Var.m4469A()) {
/* 37 */                h41Var.getClass();
                        try {
                            try {
/* 92 */                        de3 de3VarM303a = al1.f328b.m303a(xy1.m10037g(h41Var.m4107A().m4459B(), h41Var.m4107A().m4460C(), h41Var.m4107A().m4458A(), h41Var.m4109C(), h41Var.m4109C() == wq1.RAW ? null : Integer.valueOf(h41Var.m4108B())));
/* 102 */                       int iOrdinal = h41Var.m4110D().ordinal();
/* 107 */                       if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
/* 123 */                           throw new GeneralSecurityException("Unknown key status");
                                }
/* 127 */                       arrayList.add(new j41(de3VarM303a));
                            } catch (GeneralSecurityException unused) {
/* 131 */                       arrayList.add(null);
                            }
                        } catch (GeneralSecurityException e) {
/* 143 */                   throw new C2086px("Creating a protokey serialization failed", e);
                        }
                    }
/* 150 */           return new C0875ec(i41Var, Collections.unmodifiableList(arrayList));
                }

                /* JADX INFO: renamed from: v */
                public static C0875ec m3362v(Context context) {
/* 3 */             if (f7610e == null) {
                        synchronized (f7611f) {
                            try {
/* 10 */                        if (f7610e == null) {
/* 17 */                            f7610e = new C0875ec(context);
                                }
                            } catch (Throwable th) {
/* 25 */                        throw th;
                            }
                        }
                    }
/* 26 */            return f7610e;
                }

                /* JADX INFO: renamed from: A */
                public int m3363A() {
/* 9 */             return ((RecyclerView) ((ts0) this.f7613b).f17248a).getChildCount();
                }

                /* JADX WARN: Code duplicated, block: B:101:0x024a  */
                /* JADX WARN: Code duplicated, block: B:102:0x024c  */
                /* JADX WARN: Code duplicated, block: B:107:0x0277  */
                /* JADX WARN: Code duplicated, block: B:109:0x027d  */
                /* JADX WARN: Code duplicated, block: B:112:0x028c  */
                /* JADX WARN: Code duplicated, block: B:113:0x029a  */
                /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:118:0x02b2  */
                /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
                /* JADX WARN: Code duplicated, block: B:121:0x02ba  */
                /* JADX WARN: Code duplicated, block: B:122:0x02c8  */
                /* JADX WARN: Code duplicated, block: B:124:0x02ce  */
                /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
                /* JADX WARN: Code duplicated, block: B:128:0x02db  */
                /* JADX WARN: Code duplicated, block: B:131:0x02f7  */
                /* JADX WARN: Code duplicated, block: B:137:0x0315  */
                /* JADX WARN: Code duplicated, block: B:141:0x0323  */
                /* JADX WARN: Code duplicated, block: B:145:0x033c  */
                /* JADX WARN: Code duplicated, block: B:146:0x033e  */
                /* JADX WARN: Code duplicated, block: B:148:0x036c  */
                /* JADX WARN: Code duplicated, block: B:154:0x039b  */
                /* JADX WARN: Code duplicated, block: B:159:0x03b1  */
                /* JADX WARN: Code duplicated, block: B:161:0x03b4  */
                /* JADX WARN: Code duplicated, block: B:164:0x03d5  */
                /* JADX WARN: Code duplicated, block: B:167:0x03e6  */
                /* JADX WARN: Code duplicated, block: B:168:0x03e8  */
                /* JADX WARN: Code duplicated, block: B:174:0x040e  */
                /* JADX WARN: Code duplicated, block: B:177:0x041c  */
                /* JADX WARN: Code duplicated, block: B:178:0x041e  */
                /* JADX WARN: Code duplicated, block: B:184:0x0448  */
                /* JADX WARN: Code duplicated, block: B:187:0x0456  */
                /* JADX WARN: Code duplicated, block: B:188:0x0458  */
                /* JADX WARN: Code duplicated, block: B:190:0x045e  */
                /* JADX WARN: Code duplicated, block: B:192:0x0477  */
                /* JADX WARN: Code duplicated, block: B:195:0x0483  */
                /* JADX WARN: Code duplicated, block: B:198:0x0494  */
                /* JADX WARN: Code duplicated, block: B:201:0x049e  */
                /* JADX WARN: Code duplicated, block: B:205:0x04b6  */
                /* JADX WARN: Code duplicated, block: B:209:0x04cb  */
                /* JADX WARN: Code duplicated, block: B:212:0x04d5  */
                /* JADX WARN: Code duplicated, block: B:216:0x04e8  */
                /* JADX WARN: Code duplicated, block: B:221:0x0517  */
                /* JADX WARN: Code duplicated, block: B:222:0x051a A[Catch: ExecutionException -> 0x052d, TimeoutException -> 0x052f, InterruptedException -> 0x0538, TryCatch #8 {InterruptedException -> 0x0538, ExecutionException -> 0x052d, TimeoutException -> 0x052f, blocks: (B:219:0x04fe, B:223:0x0522, B:222:0x051a), top: B:245:0x04fe }] */
                /* JADX WARN: Code duplicated, block: B:233:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:235:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:245:0x04fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
                /* JADX WARN: Code duplicated, block: B:49:0x012e  */
                /* JADX WARN: Code duplicated, block: B:52:0x0135  */
                /* JADX WARN: Code duplicated, block: B:53:0x013b  */
                /* JADX WARN: Code duplicated, block: B:56:0x0146  */
                /* JADX WARN: Code duplicated, block: B:58:0x0158  */
                /* JADX WARN: Code duplicated, block: B:59:0x0160  */
                /* JADX WARN: Code duplicated, block: B:98:0x023d  */
                /* JADX WARN: Instruction removed from duplicated block: B:190:0x045e, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:216:0x04e8, please report this as an issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v104 */
                /* JADX WARN: Type inference failed for: r0v169 */
                /* JADX WARN: Type inference failed for: r0v170 */
                /* JADX INFO: renamed from: B */
                public boolean m3364B() {
                    cw0 cw0Var;
                    Bundle bundle;
                    int identifier;
                    String string;
                    int identifier2;
                    String strM8911x;
                    Uri defaultUri;
                    String strM8911x2;
                    String strM8911x3;
                    Uri uri;
                    Intent launchIntentForPackage;
                    Bundle bundle2;
                    PendingIntent activity;
                    PendingIntent broadcast;
                    String strM8911x4;
                    Integer numValueOf;
                    String strM8911x5;
                    Integer numM8902m;
                    Integer numM8902m2;
                    Integer numM8902m3;
                    Long lM8907s;
                    long[] jArrM8912y;
                    int[] iArrM8904o;
                    boolean zM8900i;
                    ?? r0;
                    int i;
                    String strM8911x6;
                    Bitmap bitmap;
                    IconCompat iconCompat;
                    boolean z;
                    int i2;
                    int i3;
                    int i4;
/* 13 */            int i5 = 1;
/* 14 */            if (((ts0) this.f7615d).m8900i("gcm.n.noui")) {
/* 13 */                return true;
                    }
/* 19 */            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f7614c;
/* 34 */            if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
/* 37 */                int iMyPid = Process.myPid();
/* 49 */                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
/* 53 */                if (runningAppProcesses != null) {
/* 63 */                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
/* 73 */                        if (runningAppProcessInfo.pid == iMyPid) {
/* 79 */                            if (runningAppProcessInfo.importance != 100) {
                                        break;
                                    }
/* 33 */                            return false;
                                }
                            }
                        }
                    }
/* 88 */            String strM8911x7 = ((ts0) this.f7615d).m8911x("gcm.n.image");
/* 98 */            if (TextUtils.isEmpty(strM8911x7)) {
/* 100 */               cw0Var = null;
                    } else {
                        try {
/* 109 */                   cw0Var = new cw0(new URL(strM8911x7));
                        } catch (MalformedURLException unused) {
/* 127 */                   AbstractC1245n0.m4889q("FirebaseMessaging", "Not downloading image, bad URL: " + strM8911x7);
/* 100 */                   cw0Var = null;
                        }
                    }
/* 131 */           if (cw0Var != null) {
/* 135 */               ExecutorService executorService = (ExecutorService) this.f7613b;
/* 139 */               TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 153 */               cw0Var.f6922b = executorService.submit(new RunnableC1784j8(28, cw0Var, taskCompletionSource));
/* 159 */               cw0Var.f6923c = taskCompletionSource.getTask();
                    }
/* 164 */           FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f7614c;
/* 169 */           ts0 ts0Var = (ts0) this.f7615d;
/* 171 */           AtomicInteger atomicInteger = AbstractC0970gx.f8835a;
                    try {
/* 185 */               ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
/* 189 */               if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
/* 213 */                   bundle = Bundle.EMPTY;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 210 */               AbstractC1245n0.m4889q("FirebaseMessaging", "Couldn't get own application info: " + e);
                    }
/* 195 */           Bundle bundle3 = bundle;
/* 218 */           String strM8911x8 = ts0Var.m8911x("gcm.n.android_channel_id");
/* 226 */           if (Build.VERSION.SDK_INT < 26) {
/* 228 */               strM8911x8 = null;
                    } else {
                        try {
/* 245 */                   if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
/* 228 */                       strM8911x8 = null;
                            } else {
/* 254 */                       NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
/* 260 */                       if (TextUtils.isEmpty(strM8911x8)) {
/* 293 */                           strM8911x8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
/* 301 */                           if (!TextUtils.isEmpty(strM8911x8)) {
/* 318 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                    } else if (notificationManager.getNotificationChannel(strM8911x8) == null) {
/* 312 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                    }
/* 325 */                           if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
/* 339 */                               identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
/* 343 */                               if (identifier == 0) {
/* 347 */                                   AbstractC1245n0.m4876d("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
/* 350 */                                   string = "Misc";
                                        } else {
/* 353 */                                   string = firebaseMessagingService2.getString(identifier);
                                        }
/* 1 */                                 notificationManager.createNotificationChannel(AbstractC2053p0.m7264e(string));
                                    }
/* 364 */                           strM8911x8 = "fcm_fallback_notification_channel";
                                } else if (notificationManager.getNotificationChannel(strM8911x8) == null) {
/* 288 */                           AbstractC1245n0.m4889q("FirebaseMessaging", "Notification Channel requested (" + strM8911x8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
/* 293 */                           strM8911x8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
/* 301 */                           if (!TextUtils.isEmpty(strM8911x8)) {
/* 318 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                    } else if (notificationManager.getNotificationChannel(strM8911x8) == null) {
/* 312 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                    }
/* 325 */                           if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
/* 339 */                               identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
/* 343 */                               if (identifier == 0) {
/* 347 */                                   AbstractC1245n0.m4876d("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
/* 350 */                                   string = "Misc";
                                        } else {
/* 353 */                                   string = firebaseMessagingService2.getString(identifier);
                                        }
/* 1 */                                 notificationManager.createNotificationChannel(AbstractC2053p0.m7264e(string));
                                    }
/* 364 */                           strM8911x8 = "fcm_fallback_notification_channel";
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
/* 366 */           AtomicInteger atomicInteger2 = AbstractC0970gx.f8835a;
/* 368 */           String packageName = firebaseMessagingService2.getPackageName();
/* 372 */           Resources resources = firebaseMessagingService2.getResources();
/* 376 */           PackageManager packageManager = firebaseMessagingService2.getPackageManager();
/* 382 */           po1 po1Var = new po1(firebaseMessagingService2, strM8911x8);
/* 387 */           String strM8909u = ts0Var.m8909u(resources, packageName, "gcm.n.title");
/* 395 */           if (!TextUtils.isEmpty(strM8909u)) {
/* 401 */               po1Var.f15205e = po1.m7524b(strM8909u);
                    }
/* 405 */           String strM8909u2 = ts0Var.m8909u(resources, packageName, "gcm.n.body");
/* 413 */           if (!TextUtils.isEmpty(strM8909u2)) {
/* 419 */               po1Var.f15206f = po1.m7524b(strM8909u2);
/* 423 */               jo1 jo1Var = new jo1();
/* 430 */               jo1Var.f12410b = po1.m7524b(strM8909u2);
/* 432 */               po1Var.m7530g(jo1Var);
                    }
/* 437 */           String strM8911x9 = ts0Var.m8911x("gcm.n.icon");
/* 445 */           if (!TextUtils.isEmpty(strM8911x9)) {
/* 449 */               identifier2 = resources.getIdentifier(strM8911x9, "drawable", packageName);
/* 453 */               if ((identifier2 == 0 || !AbstractC0970gx.m4038a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strM8911x9, "mipmap", packageName)) == 0 || !AbstractC0970gx.m4038a(resources, identifier2))) {
/* 500 */                   AbstractC1245n0.m4889q("FirebaseMessaging", "Icon resource " + strM8911x9 + " not found. Notification will use default icon.");
                        } else {
/* 461 */                   i5 = 1;
                        }
/* 560 */               po1Var.f15220t.icon = identifier2;
/* 564 */               strM8911x = ts0Var.m8911x("gcm.n.sound2");
/* 572 */               if (TextUtils.isEmpty(strM8911x)) {
/* 576 */                   strM8911x = ts0Var.m8911x("gcm.n.sound");
                        }
/* 585 */               if (TextUtils.isEmpty(strM8911x)) {
/* 587 */                   defaultUri = null;
                        } else if (!"default".equals(strM8911x) || resources.getIdentifier(strM8911x, "raw", packageName) == 0) {
/* 632 */                   defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
/* 627 */                   defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM8911x);
                        }
/* 636 */               if (defaultUri != null) {
/* 638 */                   po1Var.m7529f(defaultUri);
                        }
/* 643 */               strM8911x2 = ts0Var.m8911x("gcm.n.click_action");
/* 651 */               if (TextUtils.isEmpty(strM8911x2)) {
/* 669 */                   strM8911x3 = ts0Var.m8911x("gcm.n.link_android");
/* 677 */                   if (TextUtils.isEmpty(strM8911x3)) {
/* 681 */                       strM8911x3 = ts0Var.m8911x("gcm.n.link");
                            }
/* 689 */                   if (TextUtils.isEmpty(strM8911x3)) {
/* 696 */                       uri = null;
                            } else {
/* 691 */                       uri = Uri.parse(strM8911x3);
                            }
/* 697 */                   if (uri != null) {
/* 703 */                       launchIntentForPackage = new Intent("android.intent.action.VIEW");
/* 706 */                       launchIntentForPackage.setPackage(packageName);
/* 709 */                       launchIntentForPackage.setData(uri);
                            } else {
/* 713 */                       launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
/* 717 */                       if (launchIntentForPackage == null) {
/* 721 */                           AbstractC1245n0.m4889q("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
/* 655 */                   launchIntentForPackage = new Intent(strM8911x2);
/* 658 */                   launchIntentForPackage.setPackage(packageName);
/* 663 */                   launchIntentForPackage.setFlags(268435456);
                        }
/* 728 */               if (launchIntentForPackage == null) {
/* 730 */                   activity = null;
                        } else {
/* 734 */                   launchIntentForPackage.addFlags(67108864);
/* 741 */                   Bundle bundle4 = (Bundle) ts0Var.f17248a;
/* 743 */                   bundle2 = new Bundle(bundle4);
/* 758 */                   for (String str : bundle4.keySet()) {
/* 772 */                       if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
/* 790 */                           bundle2.remove(str);
                                }
                            }
/* 795 */                   launchIntentForPackage.putExtras(bundle2);
/* 802 */                   if (ts0Var.m8900i("google.c.a.e")) {
/* 810 */                       launchIntentForPackage.putExtra("gcm.n.analytics_data", ts0Var.m8888B());
                            }
/* 817 */                   activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
/* 821 */               po1Var.f15207g = activity;
/* 827 */               if (ts0Var.m8900i("google.c.a.e")) {
/* 871 */                   broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(ts0Var.m8888B())), 1140850688);
                        } else {
/* 829 */                   broadcast = null;
                        }
/* 875 */               if (broadcast != null) {
/* 879 */                   po1Var.f15220t.deleteIntent = broadcast;
                        }
/* 883 */               strM8911x4 = ts0Var.m8911x("gcm.n.color");
/* 891 */               if (TextUtils.isEmpty(strM8911x4)) {
/* 926 */                   i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
/* 930 */                   if (i4 != 0) {
/* 936 */                       numValueOf = Integer.valueOf(v00.getColor(firebaseMessagingService2, i4));
                            } else {
/* 946 */                       numValueOf = null;
                            }
                        } else {
                            try {
/* 897 */                       numValueOf = Integer.valueOf(Color.parseColor(strM8911x4));
                            } catch (IllegalArgumentException unused3) {
/* 921 */                       AbstractC1245n0.m4889q("FirebaseMessaging", "Color is invalid: " + strM8911x4 + ". Notification will use default color.");
/* 926 */                       i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
/* 930 */                       if (i4 != 0) {
                                    try {
/* 936 */                               numValueOf = Integer.valueOf(v00.getColor(firebaseMessagingService2, i4));
                                    } catch (Resources.NotFoundException unused4) {
/* 943 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
/* 946 */                               numValueOf = null;
                                    }
                                } else {
/* 946 */                           numValueOf = null;
                                }
                            }
                        }
/* 947 */               if (numValueOf != null) {
/* 953 */                   po1Var.f15216p = numValueOf.intValue();
                        }
/* 963 */               po1Var.m7526c(!ts0Var.m8900i("gcm.n.sticky"));
/* 972 */               po1Var.f15214n = ts0Var.m8900i("gcm.n.local_only");
/* 976 */               strM8911x5 = ts0Var.m8911x("gcm.n.ticker");
/* 980 */               if (strM8911x5 != null) {
/* 988 */                   po1Var.f15220t.tickerText = po1.m7524b(strM8911x5);
                        }
/* 992 */               numM8902m = ts0Var.m8902m("gcm.n.notification_priority");
/* 997 */               if (numM8902m == null) {
/* 999 */                   numM8902m = null;
                        } else if (numM8902m.intValue() >= -2 || numM8902m.intValue() > 2) {
/* 1033 */                  AbstractC1245n0.m4889q("FirebaseMessaging", "notificationPriority is invalid " + numM8902m + ". Skipping setting notificationPriority.");
/* 999 */                   numM8902m = null;
                        }
/* 1037 */              if (numM8902m != null) {
/* 1043 */                  po1Var.f15210j = numM8902m.intValue();
                        }
/* 1047 */              numM8902m2 = ts0Var.m8902m("gcm.n.visibility");
/* 1051 */              if (numM8902m2 == null) {
/* 1053 */                  numM8902m2 = null;
                        } else if (numM8902m2.intValue() >= -1 || numM8902m2.intValue() > i5) {
/* 1091 */                  AbstractC1245n0.m4889q("NotificationParams", "visibility is invalid: " + numM8902m2 + ". Skipping setting visibility.");
/* 1053 */                  numM8902m2 = null;
                        }
/* 1095 */              if (numM8902m2 != null) {
/* 1101 */                  po1Var.f15217q = numM8902m2.intValue();
                        }
/* 1105 */              numM8902m3 = ts0Var.m8902m("gcm.n.notification_count");
/* 1109 */              if (numM8902m3 != null) {
/* 1111 */                  numM8902m3 = null;
                        } else if (numM8902m3.intValue() < 0) {
/* 1138 */                  AbstractC1245n0.m4889q("FirebaseMessaging", "notificationCount is invalid: " + numM8902m3 + ". Skipping setting notificationCount.");
/* 1111 */                  numM8902m3 = null;
                        }
/* 1142 */              if (numM8902m3 != null) {
/* 1148 */                  po1Var.f15209i = numM8902m3.intValue();
                        }
/* 1150 */              lM8907s = ts0Var.m8907s();
/* 1154 */              if (lM8907s != null) {
/* 1157 */                  po1Var.f15211k = true;
/* 1165 */                  po1Var.f15220t.when = lM8907s.longValue();
                        }
/* 1167 */              jArrM8912y = ts0Var.m8912y();
/* 1171 */              if (jArrM8912y != null) {
/* 1175 */                  po1Var.f15220t.vibrate = jArrM8912y;
                        }
/* 1177 */              iArrM8904o = ts0Var.m8904o();
/* 1181 */              if (iArrM8904o != null) {
/* 1183 */                  int i6 = iArrM8904o[0];
/* 1187 */                  i2 = iArrM8904o[1];
/* 1191 */                  int i7 = iArrM8904o[2];
/* 1193 */                  Notification notification = po1Var.f15220t;
/* 1195 */                  notification.ledARGB = i6;
/* 1197 */                  notification.ledOnMS = i2;
/* 1199 */                  notification.ledOffMS = i7;
/* 1201 */                  if (i2 != 0 || i7 == 0) {
/* 1207 */                      i3 = 0;
                            } else {
/* 1205 */                      i3 = 1;
                            }
/* 1212 */                  notification.flags = i3 | ((-2) & notification.flags);
                        }
/* 1216 */              zM8900i = ts0Var.m8900i("gcm.n.default_sound");
                        r0 = zM8900i;
/* 1226 */              if (ts0Var.m8900i("gcm.n.default_vibrate_timings")) {
/* 1228 */                  r0 = (zM8900i ? 1 : 0) | 2;
                        }
                        i = r0;
/* 1236 */              if (ts0Var.m8900i("gcm.n.default_light_settings")) {
/* 1238 */                  i = (r0 == true ? 1 : 0) | 4;
                        }
/* 1240 */              po1Var.m7527d(i);
/* 1245 */              strM8911x6 = ts0Var.m8911x("gcm.n.tag");
/* 1253 */              if (TextUtils.isEmpty(strM8911x6)) {
/* 1271 */                  strM8911x6 = "FCM-Notification:" + SystemClock.uptimeMillis();
                        }
/* 1255 */              String str2 = strM8911x6;
/* 1276 */              if (cw0Var != null) {
                            try {
/* 1279 */                      Task task = cw0Var.f6923c;
/* 1281 */                      kb1.m6061n(task);
/* 1292 */                      bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
/* 1294 */                      po1Var.m7528e(bitmap);
/* 1299 */                      io1 io1Var = new io1();
/* 1302 */                      if (bitmap == null) {
/* 1304 */                          iconCompat = null;
/* 1305 */                          z = true;
                                } else {
/* 1309 */                          z = true;
/* 1310 */                          iconCompat = new IconCompat(1);
/* 1313 */                          iconCompat.f1247b = bitmap;
                                }
/* 1315 */                      io1Var.f11870b = iconCompat;
/* 1318 */                      io1Var.f11871c = null;
/* 1320 */                      io1Var.f11872d = z;
/* 1322 */                      po1Var.m7530g(io1Var);
                            } catch (InterruptedException unused5) {
/* 1339 */                      AbstractC1245n0.m4889q("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
/* 1342 */                      cw0Var.close();
/* 1349 */                      Thread.currentThread().interrupt();
                            } catch (ExecutionException e2) {
/* 1371 */                      AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                            } catch (TimeoutException unused6) {
/* 1330 */                      AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to download image in time, showing notification without it");
/* 1333 */                      cw0Var.close();
                            }
                        }
/* 1390 */              ((NotificationManager) ((FirebaseMessagingService) this.f7614c).getSystemService("notification")).notify(str2, 0, po1Var.m7525a());
/* 1393 */              return true;
                    }
/* 508 */           int i8 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
/* 512 */           if (i8 == 0 || !AbstractC0970gx.m4038a(resources, i8)) {
                        try {
/* 524 */                   i8 = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e3) {
/* 540 */                   AbstractC1245n0.m4889q("FirebaseMessaging", "Couldn't get own application info: " + e3);
                        }
                    }
/* 557 */           identifier2 = (i8 == 0 || !AbstractC0970gx.m4038a(resources, i8)) ? 17301651 : i8;
/* 560 */           po1Var.f15220t.icon = identifier2;
/* 564 */           strM8911x = ts0Var.m8911x("gcm.n.sound2");
/* 572 */           if (TextUtils.isEmpty(strM8911x)) {
/* 576 */               strM8911x = ts0Var.m8911x("gcm.n.sound");
                    }
/* 585 */           if (TextUtils.isEmpty(strM8911x)) {
/* 587 */               defaultUri = null;
                    } else if ("default".equals(strM8911x)) {
/* 632 */               defaultUri = RingtoneManager.getDefaultUri(2);
                    } else {
/* 632 */               defaultUri = RingtoneManager.getDefaultUri(2);
                    }
/* 636 */           if (defaultUri != null) {
/* 638 */               po1Var.m7529f(defaultUri);
                    }
/* 643 */           strM8911x2 = ts0Var.m8911x("gcm.n.click_action");
/* 651 */           if (TextUtils.isEmpty(strM8911x2)) {
/* 655 */               launchIntentForPackage = new Intent(strM8911x2);
/* 658 */               launchIntentForPackage.setPackage(packageName);
/* 663 */               launchIntentForPackage.setFlags(268435456);
                    } else {
/* 669 */               strM8911x3 = ts0Var.m8911x("gcm.n.link_android");
/* 677 */               if (TextUtils.isEmpty(strM8911x3)) {
/* 681 */                   strM8911x3 = ts0Var.m8911x("gcm.n.link");
                        }
/* 689 */               if (TextUtils.isEmpty(strM8911x3)) {
/* 691 */                   uri = Uri.parse(strM8911x3);
                        } else {
/* 696 */                   uri = null;
                        }
/* 697 */               if (uri != null) {
/* 703 */                   launchIntentForPackage = new Intent("android.intent.action.VIEW");
/* 706 */                   launchIntentForPackage.setPackage(packageName);
/* 709 */                   launchIntentForPackage.setData(uri);
                        } else {
/* 713 */                   launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
/* 717 */                   if (launchIntentForPackage == null) {
/* 721 */                       AbstractC1245n0.m4889q("FirebaseMessaging", "No activity found to launch app");
                            }
                        }
                    }
/* 728 */           if (launchIntentForPackage == null) {
/* 730 */               activity = null;
                    } else {
/* 734 */               launchIntentForPackage.addFlags(67108864);
/* 741 */               Bundle bundle5 = (Bundle) ts0Var.f17248a;
/* 743 */               bundle2 = new Bundle(bundle5);
/* 758 */               while (r13.hasNext()) {
/* 772 */                   if (str.startsWith("google.c.")) {
/* 790 */                       bundle2.remove(str);
                            } else {
/* 790 */                       bundle2.remove(str);
                            }
                        }
/* 795 */               launchIntentForPackage.putExtras(bundle2);
/* 802 */               if (ts0Var.m8900i("google.c.a.e")) {
/* 810 */                   launchIntentForPackage.putExtra("gcm.n.analytics_data", ts0Var.m8888B());
                        }
/* 817 */               activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                    }
/* 821 */           po1Var.f15207g = activity;
/* 827 */           if (ts0Var.m8900i("google.c.a.e")) {
/* 829 */               broadcast = null;
                    } else {
/* 871 */               broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(ts0Var.m8888B())), 1140850688);
                    }
/* 875 */           if (broadcast != null) {
/* 879 */               po1Var.f15220t.deleteIntent = broadcast;
                    }
/* 883 */           strM8911x4 = ts0Var.m8911x("gcm.n.color");
/* 891 */           if (TextUtils.isEmpty(strM8911x4)) {
/* 897 */               numValueOf = Integer.valueOf(Color.parseColor(strM8911x4));
                    } else {
/* 926 */               i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
/* 930 */               if (i4 != 0) {
/* 936 */                   numValueOf = Integer.valueOf(v00.getColor(firebaseMessagingService2, i4));
                        } else {
/* 946 */                   numValueOf = null;
                        }
                    }
/* 947 */           if (numValueOf != null) {
/* 953 */               po1Var.f15216p = numValueOf.intValue();
                    }
/* 963 */           po1Var.m7526c(!ts0Var.m8900i("gcm.n.sticky"));
/* 972 */           po1Var.f15214n = ts0Var.m8900i("gcm.n.local_only");
/* 976 */           strM8911x5 = ts0Var.m8911x("gcm.n.ticker");
/* 980 */           if (strM8911x5 != null) {
/* 988 */               po1Var.f15220t.tickerText = po1.m7524b(strM8911x5);
                    }
/* 992 */           numM8902m = ts0Var.m8902m("gcm.n.notification_priority");
/* 997 */           if (numM8902m == null) {
/* 1005 */              if (numM8902m.intValue() >= -2) {
                        }
/* 1033 */              AbstractC1245n0.m4889q("FirebaseMessaging", "notificationPriority is invalid " + numM8902m + ". Skipping setting notificationPriority.");
/* 999 */               numM8902m = null;
                    } else {
/* 999 */               numM8902m = null;
                    }
/* 1037 */          if (numM8902m != null) {
/* 1043 */              po1Var.f15210j = numM8902m.intValue();
                    }
/* 1047 */          numM8902m2 = ts0Var.m8902m("gcm.n.visibility");
/* 1051 */          if (numM8902m2 == null) {
/* 1060 */              if (numM8902m2.intValue() >= -1) {
                        }
/* 1091 */              AbstractC1245n0.m4889q("NotificationParams", "visibility is invalid: " + numM8902m2 + ". Skipping setting visibility.");
/* 1053 */              numM8902m2 = null;
                    } else {
/* 1053 */              numM8902m2 = null;
                    }
/* 1095 */          if (numM8902m2 != null) {
/* 1101 */              po1Var.f15217q = numM8902m2.intValue();
                    }
/* 1105 */          numM8902m3 = ts0Var.m8902m("gcm.n.notification_count");
/* 1109 */          if (numM8902m3 != null) {
/* 1111 */              numM8902m3 = null;
                    } else if (numM8902m3.intValue() < 0) {
/* 1138 */              AbstractC1245n0.m4889q("FirebaseMessaging", "notificationCount is invalid: " + numM8902m3 + ". Skipping setting notificationCount.");
/* 1111 */              numM8902m3 = null;
                    }
/* 1142 */          if (numM8902m3 != null) {
/* 1148 */              po1Var.f15209i = numM8902m3.intValue();
                    }
/* 1150 */          lM8907s = ts0Var.m8907s();
/* 1154 */          if (lM8907s != null) {
/* 1157 */              po1Var.f15211k = true;
/* 1165 */              po1Var.f15220t.when = lM8907s.longValue();
                    }
/* 1167 */          jArrM8912y = ts0Var.m8912y();
/* 1171 */          if (jArrM8912y != null) {
/* 1175 */              po1Var.f15220t.vibrate = jArrM8912y;
                    }
/* 1177 */          iArrM8904o = ts0Var.m8904o();
/* 1181 */          if (iArrM8904o != null) {
/* 1183 */              int i9 = iArrM8904o[0];
/* 1187 */              i2 = iArrM8904o[1];
/* 1191 */              int i10 = iArrM8904o[2];
/* 1193 */              Notification notification2 = po1Var.f15220t;
/* 1195 */              notification2.ledARGB = i9;
/* 1197 */              notification2.ledOnMS = i2;
/* 1199 */              notification2.ledOffMS = i10;
/* 1201 */              if (i2 != 0) {
/* 1207 */                  i3 = 0;
                        } else {
/* 1207 */                  i3 = 0;
                        }
/* 1212 */              notification2.flags = i3 | ((-2) & notification2.flags);
                    }
/* 1216 */          zM8900i = ts0Var.m8900i("gcm.n.default_sound");
                    r0 = zM8900i;
/* 1226 */          if (ts0Var.m8900i("gcm.n.default_vibrate_timings")) {
/* 1228 */              r0 = (zM8900i ? 1 : 0) | 2;
                    }
                    i = r0;
/* 1236 */          if (ts0Var.m8900i("gcm.n.default_light_settings")) {
/* 1238 */              i = (r0 == true ? 1 : 0) | 4;
                    }
/* 1240 */          po1Var.m7527d(i);
/* 1245 */          strM8911x6 = ts0Var.m8911x("gcm.n.tag");
/* 1253 */          if (TextUtils.isEmpty(strM8911x6)) {
/* 1271 */              strM8911x6 = "FCM-Notification:" + SystemClock.uptimeMillis();
                    }
/* 1255 */          String str3 = strM8911x6;
/* 1276 */          if (cw0Var != null) {
/* 1279 */              Task task2 = cw0Var.f6923c;
/* 1281 */              kb1.m6061n(task2);
/* 1292 */              bitmap = (Bitmap) Tasks.await(task2, 5L, TimeUnit.SECONDS);
/* 1294 */              po1Var.m7528e(bitmap);
/* 1299 */              io1 io1Var2 = new io1();
/* 1302 */              if (bitmap == null) {
/* 1304 */                  iconCompat = null;
/* 1305 */                  z = true;
                        } else {
/* 1309 */                  z = true;
/* 1310 */                  iconCompat = new IconCompat(1);
/* 1313 */                  iconCompat.f1247b = bitmap;
                        }
/* 1315 */              io1Var2.f11870b = iconCompat;
/* 1318 */              io1Var2.f11871c = null;
/* 1320 */              io1Var2.f11872d = z;
/* 1322 */              po1Var.m7530g(io1Var2);
                    }
/* 1390 */          ((NotificationManager) ((FirebaseMessagingService) this.f7614c).getSystemService("notification")).notify(str3, 0, po1Var.m7525a());
/* 1393 */          return true;
                }

                /* JADX INFO: renamed from: C */
                public boolean m3365C(CharSequence charSequence, int i, int i2, qs2 qs2Var) {
/* 8 */             if ((qs2Var.f15734c & 3) == 0) {
/* 12 */                y50 y50Var = (y50) this.f7615d;
/* 14 */                mi1 mi1VarM8010b = qs2Var.m8010b();
/* 20 */                int iM8126a = mi1VarM8010b.m8126a(8);
/* 24 */                if (iM8126a != 0) {
/* 33 */                    ((ByteBuffer) mi1VarM8010b.f15965d).getShort(iM8126a + mi1VarM8010b.f15962a);
                        }
/* 36 */                y50Var.getClass();
/* 39 */                ThreadLocal threadLocal = y50.f19481b;
/* 45 */                if (threadLocal.get() == null) {
/* 52 */                    threadLocal.set(new StringBuilder());
                        }
/* 59 */                StringBuilder sb = (StringBuilder) threadLocal.get();
/* 61 */                sb.setLength(0);
/* 64 */                while (i < i2) {
/* 70 */                    sb.append(charSequence.charAt(i));
/* 73 */                    i++;
                        }
/* 76 */                TextPaint textPaint = y50Var.f19482a;
/* 78 */                String string = sb.toString();
/* 82 */                int i3 = gr1.f8790a;
/* 84 */                boolean zM3804a = fr1.m3804a(textPaint, string);
/* 90 */                int i4 = qs2Var.f15734c & 4;
/* 99 */                qs2Var.f15734c = zM3804a ? i4 | 2 : i4 | 1;
                    }
                    return (qs2Var.f15734c & 3) == 2;
                }

                /* JADX INFO: renamed from: D */
                public void m3366D(View view) {
/* 5 */             ((ArrayList) this.f7615d).add(view);
/* 10 */            ts0 ts0Var = (ts0) this.f7613b;
/* 12 */            AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 16 */            if (abstractC0137oM843J != null) {
/* 18 */                View view2 = abstractC0137oM843J.f1778a;
/* 22 */                RecyclerView recyclerView = (RecyclerView) ts0Var.f17248a;
/* 24 */                int i = abstractC0137oM843J.f1794q;
/* 27 */                if (i != -1) {
/* 29 */                    abstractC0137oM843J.f1793p = i;
                        } else {
/* 32 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 38 */                    abstractC0137oM843J.f1793p = view2.getImportantForAccessibility();
                        }
/* 45 */                if (recyclerView.m860N()) {
/* 47 */                    abstractC0137oM843J.f1794q = 4;
/* 51 */                    recyclerView.f1650e1.add(abstractC0137oM843J);
                        } else {
/* 55 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 57 */                    view2.setImportantForAccessibility(4);
                        }
                    }
                }

                /* JADX INFO: renamed from: E */
                public ArrayList m3367E() {
/* 3 */             hu1 hu1Var = (hu1) this.f7614c;
/* 9 */             List<ConsentDisclosure> list = ((ConsentDisclosureObject) this.f7613b).f6401a;
/* 19 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 30 */            for (ConsentDisclosure consentDisclosure : list) {
/* 40 */                ArrayList arrayList2 = new ArrayList();
/* 43 */                ConsentDisclosureType consentDisclosureType = consentDisclosure.f6393b;
/* 45 */                String str = consentDisclosure.f6392a;
/* 47 */                String str2 = consentDisclosure.f6398g;
/* 51 */                if (consentDisclosureType != null) {
/* 53 */                    String str3 = hu1Var.f9327y;
/* 61 */                    String lowerCase = consentDisclosureType.name().toLowerCase(Locale.ROOT);
/* 65 */                    lowerCase.getClass();
/* 86 */                    arrayList2.add(str3 + ": " + lowerCase);
                        }
/* 93 */                if (consentDisclosure.f6393b == ConsentDisclosureType.f6403b) {
/* 95 */                    Long l = consentDisclosure.f6395d;
/* 106 */                   long jLongValue = l != null ? l.longValue() : 0L;
/* 117 */                   String strM4380a = jLongValue > 0 ? hu1Var.m4380a(jLongValue) : "-";
/* 139 */                   arrayList2.add(hu1Var.f9307e + ": " + strM4380a);
/* 149 */                   String str4 = consentDisclosure.f6396e ? hu1Var.f9298B : hu1Var.f9319q;
/* 171 */                   arrayList2.add(hu1Var.f9301E + ": " + str4);
                        }
/* 180 */               String str5 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
/* 185 */               if (!StringsKt.m6228D(str5)) {
/* 193 */                   if (Intrinsics.m6216a(str2, "*")) {
/* 195 */                       str5 = hu1Var.f9303a;
                            } else if (StringsKt.m6240z(str5, "*", false)) {
/* 205 */                       str5 = hu1Var.f9318p;
                            }
/* 227 */                   arrayList2.add(hu1Var.f9306d + ": " + str5);
                        }
/* 230 */               List list2 = consentDisclosure.f6397f;
/* 234 */               ArrayList arrayList3 = new ArrayList();
/* 237 */               Iterator it = list2.iterator();
/* 245 */               while (it.hasNext()) {
/* 269 */                   Purpose purpose = (Purpose) ((Map) this.f7615d).get(String.valueOf(((Number) it.next()).intValue()));
/* 276 */                   String str6 = purpose != null ? purpose.f6821c : null;
/* 277 */                   if (str6 != null) {
/* 279 */                       arrayList3.add(str6);
                            }
                        }
/* 290 */               String strM6203x = CollectionsKt.m6203x(arrayList3, null, null, null, C0170b7.f2258c, 31);
/* 298 */               if (!StringsKt.m6228D(strM6203x)) {
/* 320 */                   arrayList2.add(hu1Var.f9302F + ": " + strM6203x);
                        }
/* 323 */               if ((str == null || StringsKt.m6228D(str)) && (str = consentDisclosure.f6394c) == null) {
/* 335 */                   str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 347 */               arrayList.add(new su1(AbstractC0886en.m3508l(hu1Var.f9311i, ": ", str), arrayList2));
                    }
/* 352 */           return arrayList;
                }

                /* JADX INFO: renamed from: F */
                public boolean m3368F(int i, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz) {
/* 3 */             C2332wi c2332wi = (C2332wi) this.f7614c;
/* 5 */             EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 7 */             int[] iArr = c2569zz.f20459t;
/* 12 */            c2332wi.f18637a = enumC2516yzArr[0];
/* 17 */            c2332wi.f18638b = enumC2516yzArr[1];
/* 23 */            c2332wi.f18639c = c2569zz.m10475r();
/* 29 */            c2332wi.f18640d = c2569zz.m10472l();
/* 31 */            c2332wi.f18645i = false;
/* 33 */            c2332wi.f18646j = i;
/* 35 */            EnumC2516yz enumC2516yz = c2332wi.f18637a;
/* 37 */            EnumC2516yz enumC2516yz2 = EnumC2516yz.f19867c;
/* 43 */            boolean z = enumC2516yz == enumC2516yz2;
/* 50 */            boolean z2 = c2332wi.f18638b == enumC2516yz2;
/* 62 */            boolean z3 = z && c2569zz.f20419Y > 0.0f;
/* 73 */            boolean z4 = z2 && c2569zz.f20419Y > 0.0f;
/* 74 */            EnumC2516yz enumC2516yz3 = EnumC2516yz.f19865a;
/* 77 */            if (z3 && iArr[0] == 4) {
/* 83 */                c2332wi.f18637a = enumC2516yz3;
                    }
/* 85 */            if (z4 && iArr[1] == 4) {
/* 91 */                c2332wi.f18638b = enumC2516yz3;
                    }
/* 95 */            ((C0075b) interfaceC2462xi).m524b(c2569zz, c2332wi);
/* 100 */           c2569zz.m10464P(c2332wi.f18641e);
/* 105 */           c2569zz.m10461M(c2332wi.f18642f);
/* 110 */           c2569zz.f20399E = c2332wi.f18644h;
/* 114 */           c2569zz.m10458J(c2332wi.f18643g);
/* 117 */           c2332wi.f18646j = 0;
/* 119 */           return c2332wi.f18645i;
                }

                /* JADX INFO: renamed from: G */
                public void m3369G(Function1 function1) {
/* 3 */             o42 o42Var = (o42) this.f7613b;
/* 5 */             if (o42Var == null) {
/* 19 */                this.f7614c = function1;
/* 21 */                return;
                    }
/* 9 */             Throwable thM7099a = o42.m7099a(o42Var.f14613a);
/* 13 */            if (thM7099a != null) {
/* 15 */                function1.invoke(thM7099a);
                    }
                }

                /* JADX INFO: renamed from: H */
                public void m3370H(Function1 function1) {
/* 3 */             o42 o42Var = (o42) this.f7613b;
/* 5 */             if (o42Var == null) {
/* 19 */                this.f7615d = function1;
/* 21 */                return;
                    }
/* 7 */             Object obj = o42Var.f14613a;
/* 11 */            if (!(obj instanceof n42)) {
/* 13 */                function1.invoke(obj);
                    }
/* 16 */            m42 m42Var = o42.f14612b;
                }

                /* JADX INFO: renamed from: I */
                public Object m3371I(CharSequence charSequence, int i, int i2, int i3, boolean z, dd0 dd0Var) {
                    int i4;
                    char c;
/* 21 */            ed0 ed0Var = new ed0((oi1) ((ra2) this.f7614c).f15957c);
/* 24 */            int iCodePointAt = Character.codePointAt(charSequence, i);
/* 31 */            int i5 = 0;
/* 32 */            boolean zMo2926c = true;
/* 33 */            int iCharCount = i;
                    loop0: while (true) {
/* 35 */                i4 = iCharCount;
                        while (true) {
/* 37 */                    if (iCharCount < i2 && i5 < i3 && zMo2926c) {
/* 45 */                        SparseArray sparseArray = ed0Var.f7631c.f14770a;
/* 55 */                        oi1 oi1Var = sparseArray == null ? null : (oi1) sparseArray.get(iCodePointAt);
/* 60 */                        if (ed0Var.f7629a == 2) {
/* 77 */                            if (oi1Var != null) {
/* 79 */                                ed0Var.f7631c = oi1Var;
/* 84 */                                ed0Var.f7634f++;
                                    } else {
/* 90 */                                if (iCodePointAt == 65038) {
/* 92 */                                    ed0Var.m3409a();
                                        } else if (iCodePointAt != 65039) {
/* 102 */                                   oi1 oi1Var2 = ed0Var.f7631c;
/* 106 */                                   if (oi1Var2.f14771b != null) {
/* 110 */                                       if (ed0Var.f7634f != 1) {
/* 131 */                                           ed0Var.f7632d = oi1Var2;
/* 133 */                                           ed0Var.m3409a();
                                                } else if (ed0Var.m3410b()) {
/* 120 */                                           ed0Var.f7632d = ed0Var.f7631c;
/* 122 */                                           ed0Var.m3409a();
                                                } else {
/* 127 */                                           ed0Var.m3409a();
                                                }
/* 125 */                                       c = 3;
                                            } else {
/* 137 */                                       ed0Var.m3409a();
                                            }
                                        }
/* 67 */                                c = 1;
                                    }
/* 75 */                            c = 2;
                                } else if (oi1Var == null) {
/* 64 */                            ed0Var.m3409a();
/* 67 */                            c = 1;
                                } else {
/* 69 */                            ed0Var.f7629a = 2;
/* 71 */                            ed0Var.f7631c = oi1Var;
/* 73 */                            ed0Var.f7634f = 1;
/* 75 */                            c = 2;
                                }
/* 141 */                       ed0Var.f7633e = iCodePointAt;
/* 143 */                       if (c == 1) {
/* 197 */                           iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
/* 198 */                           if (iCharCount >= i2) {
                                        break;
                                    }
/* 200 */                           iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                                    break;
                                }
/* 145 */                       if (c == 2) {
/* 178 */                           int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
/* 179 */                           if (iCharCount2 < i2) {
/* 181 */                               iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                                    }
/* 186 */                           iCharCount = iCharCount2;
                                } else if (c == 3) {
/* 150 */                           if (!z && m3365C(charSequence, i4, iCharCount, ed0Var.f7632d.f14771b)) {
                                        break;
                                    }
/* 166 */                           zMo2926c = dd0Var.mo2926c(charSequence, i4, iCharCount, ed0Var.f7632d.f14771b);
/* 170 */                           i5++;
                                    break;
                                }
                            } else {
                                break loop0;
                            }
                        }
                    }
/* 209 */           if (ed0Var.f7629a == 2 && ed0Var.f7631c.f14771b != null && ((ed0Var.f7634f > 1 || ed0Var.m3410b()) && i5 < i3 && zMo2926c && (z || !m3365C(charSequence, i4, iCharCount, ed0Var.f7631c.f14771b)))) {
/* 247 */               dd0Var.mo2926c(charSequence, i4, iCharCount, ed0Var.f7631c.f14771b);
                    }
/* 250 */           return dd0Var.mo2925b();
                }

                /* JADX INFO: renamed from: K */
                public void m3372K(C2497yg c2497yg, int i, boolean z) {
/* 9 */             C1830kg c1830kg = (C1830kg) this.f7614c;
/* 15 */            Context context = (Context) this.f7615d;
/* 19 */            ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
/* 28 */            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
/* 32 */            Adler32 adler32 = new Adler32();
/* 49 */            adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
/* 52 */            String str = c2497yg.f19600a;
/* 62 */            adler32.update(str.getBytes(Charset.forName("UTF-8")));
/* 66 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
/* 70 */            px1 px1Var = c2497yg.f19602c;
/* 84 */            adler32.update(byteBufferAllocate.putInt(rx1.m8316a(px1Var)).array());
/* 87 */            byte[] bArr = c2497yg.f19601b;
/* 89 */            if (bArr != null) {
/* 91 */                adler32.update(bArr);
                    }
/* 98 */            int value = (int) adler32.getValue();
/* 103 */           if (!z) {
/* 117 */               for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
/* 129 */                   int i2 = jobInfo.getExtras().getInt("attemptNumber");
/* 137 */                   if (jobInfo.getId() == value) {
/* 139 */                       if (i2 < i) {
                                    break;
                                }
/* 143 */                       py0.m7593P("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c2497yg);
/* 146 */                       return;
                            }
                        }
                    }
/* 169 */           Cursor cursorRawQuery = ((s52) this.f7613b).m8404c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(rx1.m8316a(px1Var))});
                    try {
/* 191 */               Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
/* 195 */               cursorRawQuery.close();
/* 198 */               long jLongValue = lValueOf.longValue();
/* 204 */               JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
/* 214 */               builder.setMinimumLatency(c1830kg.m6097a(px1Var, jLongValue, i));
/* 225 */               Set set = ((C1889lg) c1830kg.f12743b.get(px1Var)).f13261c;
/* 234 */               if (set.contains(g72.f8506a)) {
/* 237 */                   builder.setRequiredNetworkType(2);
                        } else {
/* 241 */                   builder.setRequiredNetworkType(1);
                        }
/* 250 */               if (set.contains(g72.f8508c)) {
/* 252 */                   builder.setRequiresCharging(true);
                        }
/* 261 */               if (set.contains(g72.f8507b)) {
/* 263 */                   builder.setRequiresDeviceIdle(true);
                        }
/* 268 */               PersistableBundle persistableBundle = new PersistableBundle();
/* 271 */               persistableBundle.putInt("attemptNumber", i);
/* 276 */               persistableBundle.putString("backendName", str);
/* 285 */               persistableBundle.putInt("priority", rx1.m8316a(px1Var));
/* 288 */               if (bArr != null) {
/* 297 */                   persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
                        }
/* 300 */               builder.setExtras(persistableBundle);
/* 319 */               Object[] objArr = {c2497yg, Integer.valueOf(value), Long.valueOf(c1830kg.m6097a(px1Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
/* 332 */               if (Log.isLoggable(py0.m7607l0("JobInfoScheduler"), 3)) {
/* 336 */                   String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
                        }
/* 343 */               jobScheduler.schedule(builder.build());
                    } catch (Throwable th) {
/* 348 */               cursorRawQuery.close();
/* 351 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: L */
                public void m3373L(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.f7613b = str;
                    } else {
/* 8 */                 C1951n4.m6868s("Null backendName");
                    }
                }

                /* JADX INFO: renamed from: M */
                public void m3374M(int i) {
/* 3 */             if (i != 16 && i != 32) {
/* 31 */                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
                    }
/* 36 */            this.f7613b = Integer.valueOf(i);
                }

                /* JADX INFO: renamed from: N */
                public void m3375N(a00 a00Var, int i, int i2, int i3) {
/* 1 */             int i4 = a00Var.f20428d0;
/* 3 */             int i5 = a00Var.f20430e0;
/* 6 */             a00Var.f20428d0 = 0;
/* 8 */             a00Var.f20430e0 = 0;
/* 10 */            a00Var.m10464P(i2);
/* 13 */            a00Var.m10461M(i3);
/* 16 */            if (i4 < 0) {
/* 18 */                a00Var.f20428d0 = 0;
                    } else {
/* 21 */                a00Var.f20428d0 = i4;
                    }
/* 23 */            if (i5 < 0) {
/* 25 */                a00Var.f20430e0 = 0;
                    } else {
/* 28 */                a00Var.f20430e0 = i5;
                    }
/* 32 */            a00 a00Var2 = (a00) this.f7615d;
/* 34 */            a00Var2.f20x0 = i;
/* 36 */            a00Var2.m9V();
                }

                /* JADX INFO: renamed from: O */
                public void m3376O(View view) {
/* 9 */             if (((ArrayList) this.f7615d).remove(view)) {
/* 13 */                ts0 ts0Var = (ts0) this.f7613b;
/* 15 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 19 */                if (abstractC0137oM843J != null) {
/* 23 */                    RecyclerView recyclerView = (RecyclerView) ts0Var.f17248a;
/* 25 */                    int i = abstractC0137oM843J.f1793p;
/* 31 */                    if (recyclerView.m860N()) {
/* 33 */                        abstractC0137oM843J.f1794q = i;
/* 37 */                        recyclerView.f1650e1.add(abstractC0137oM843J);
                            } else {
/* 41 */                        View view2 = abstractC0137oM843J.f1778a;
/* 43 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 45 */                        view2.setImportantForAccessibility(i);
                            }
/* 49 */                    abstractC0137oM843J.f1793p = 0;
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public void m3377P(a00 a00Var) {
/* 3 */             ArrayList arrayList = (ArrayList) this.f7613b;
/* 5 */             arrayList.clear();
/* 10 */            int size = a00Var.f17u0.size();
/* 17 */            for (int i = 0; i < size; i++) {
/* 25 */                C2569zz c2569zz = (C2569zz) a00Var.f17u0.get(i);
/* 27 */                EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 29 */                EnumC2516yz enumC2516yz = enumC2516yzArr[0];
/* 31 */                EnumC2516yz enumC2516yz2 = EnumC2516yz.f19867c;
/* 33 */                if (enumC2516yz == enumC2516yz2 || enumC2516yzArr[1] == enumC2516yz2) {
/* 39 */                    arrayList.add(c2569zz);
                        }
                    }
/* 47 */            a00Var.f19w0.f17386b = true;
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: a */
                public Uri mo3378a() {
/* 3 */             return (Uri) this.f7613b;
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: b */
                public void mo3379b() {
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: c */
                public Uri mo3380c() {
/* 3 */             return (Uri) this.f7615d;
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: d */
                public Object mo3381d() {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: e */
                public void m3382e(int i, View view, boolean z) {
/* 7 */             RecyclerView recyclerView = (RecyclerView) ((ts0) this.f7613b).f17248a;
/* 16 */            int childCount = i < 0 ? recyclerView.getChildCount() : m3397x(i);
/* 24 */            ((C0193bu) this.f7614c).m1437e(childCount, z);
/* 27 */            if (z) {
/* 29 */                m3366D(view);
                    }
/* 32 */            recyclerView.addView(view, childCount);
/* 35 */            RecyclerView.m843J(view);
/* 38 */            ArrayList arrayList = recyclerView.f1668p0;
/* 40 */            if (arrayList != null) {
/* 48 */                for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 60 */                    ((h43) ((p12) recyclerView.f1668p0.get(size))).getClass();
/* 67 */                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 72 */                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
/* 83 */                        f42.m3656l("Pages must fill the whole ViewPager2 (use match_parent)");
/* 86 */                        return;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m3383f(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
/* 7 */             RecyclerView recyclerView = (RecyclerView) ((ts0) this.f7613b).f17248a;
/* 16 */            int childCount = i < 0 ? recyclerView.getChildCount() : m3397x(i);
/* 24 */            ((C0193bu) this.f7614c).m1437e(childCount, z);
/* 27 */            if (z) {
/* 29 */                m3366D(view);
                    }
/* 32 */            AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 36 */            if (abstractC0137oM843J != null) {
/* 42 */                if (!abstractC0137oM843J.m1026j() && !abstractC0137oM843J.m1031o()) {
/* 77 */                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0137oM843J + recyclerView.m900z());
                        }
/* 82 */                abstractC0137oM843J.f1787j &= -257;
                    }
/* 1 */             recyclerView.attachViewToParent(view, childCount, layoutParams);
                }

                /* JADX INFO: renamed from: g */
                public C1818k4 m3384g() throws GeneralSecurityException {
                    fs0 fs0Var;
                    C2335wl c2335wlM9584a;
/* 3 */             C2168s4 c2168s4 = (C2168s4) this.f7613b;
/* 6 */             if (c2168s4 == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 171 */               ds0.m3203t("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (c2168s4.f16414r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 165 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C2131r4 c2131r4 = c2168s4.f16416t;
/* 27 */            C2131r4 c2131r5 = C2131r4.f15851f;
/* 29 */            if (c2131r4 != c2131r5 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c2131r4 == c2131r5 && ((Integer) this.f7615d) != null) {
/* 159 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c2131r4 == c2131r5) {
/* 58 */                c2335wlM9584a = C2335wl.m9584a(new byte[0]);
                    } else if (c2131r4 == C2131r4.f15850e || c2131r4 == C2131r4.f15849d) {
/* 143 */               c2335wlM9584a = C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 75 */                if (c2131r4 != C2131r4.f15848c) {
/* 115 */                   ds0.m3206w(((C2168s4) this.f7613b).f16416t, "Unknown AesCmacParametersParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 102 */               c2335wlM9584a = C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 153 */           return new C1818k4((C2168s4) this.f7613b, c2335wlM9584a);
                }

                @Override // p000.fy0
                public ClipDescription getDescription() {
/* 3 */             return (ClipDescription) this.f7614c;
                }

                /* JADX INFO: renamed from: h */
                public C2168s4 m3385h() {
/* 3 */             Integer num = (Integer) this.f7613b;
/* 6 */             if (num == null) {
/* 56 */                ds0.m3203t("key size not set");
/* 5 */                 return null;
                    }
/* 12 */            if (((Integer) this.f7614c) == null) {
/* 50 */                ds0.m3203t("tag size not set");
/* 5 */                 return null;
                    }
/* 18 */            if (((C2131r4) this.f7615d) != null) {
/* 38 */                return new C2168s4(num.intValue(), ((Integer) this.f7614c).intValue(), (C2131r4) this.f7615d);
                    }
/* 44 */            ds0.m3203t("variant not set");
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: i */
                public C2132r5 m3386i() throws GeneralSecurityException {
                    fs0 fs0Var;
/* 3 */             C2243u5 c2243u5 = (C2243u5) this.f7613b;
/* 6 */             if (c2243u5 == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 159 */               ds0.m3203t("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (c2243u5.f17355r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 153 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C2131r4 c2131r4 = c2243u5.f17358u;
/* 27 */            C2131r4 c2131r5 = C2131r4.f15854i;
/* 29 */            if (c2131r4 != c2131r5 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c2131r4 == c2131r5 && ((Integer) this.f7615d) != null) {
/* 147 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c2131r4 == c2131r5) {
/* 58 */                C2335wl.m9584a(new byte[0]);
                    } else if (c2131r4 == C2131r4.f15853h) {
/* 91 */                C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 97 */                if (c2131r4 != C2131r4.f15852g) {
/* 141 */                   ds0.m3206w(((C2243u5) this.f7613b).f17358u, "Unknown AesEaxParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 124 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 129 */           return new C2132r5();
                }

                /* JADX INFO: renamed from: j */
                public C0169b6 m3387j() throws GeneralSecurityException {
                    fs0 fs0Var;
/* 3 */             C0869e6 c0869e6 = (C0869e6) this.f7613b;
/* 6 */             if (c0869e6 == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 159 */               ds0.m3203t("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (c0869e6.f7547r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 153 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C0204c5 c0204c5 = c0869e6.f7550u;
/* 27 */            C0204c5 c0204c6 = C0204c5.f2708j;
/* 29 */            if (c0204c5 != c0204c6 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c0204c5 == c0204c6 && ((Integer) this.f7615d) != null) {
/* 147 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c0204c5 == c0204c6) {
/* 58 */                C2335wl.m9584a(new byte[0]);
                    } else if (c0204c5 == C0204c5.f2707i) {
/* 91 */                C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 97 */                if (c0204c5 != C0204c5.f2706h) {
/* 141 */                   ds0.m3206w(((C0869e6) this.f7613b).f7550u, "Unknown AesGcmParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 124 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 129 */           return new C0169b6();
                }

                /* JADX INFO: renamed from: k */
                public C1782j6 m3388k() throws GeneralSecurityException {
                    fs0 fs0Var;
/* 3 */             C1916m6 c1916m6 = (C1916m6) this.f7613b;
/* 6 */             if (c1916m6 == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 159 */               ds0.m3203t("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (c1916m6.f13571r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 153 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C0832d5 c0832d5 = c1916m6.f13572s;
/* 27 */            C0832d5 c0832d6 = C0832d5.f6992v;
/* 29 */            if (c0832d5 != c0832d6 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c0832d5 == c0832d6 && ((Integer) this.f7615d) != null) {
/* 147 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c0832d5 == c0832d6) {
/* 58 */                C2335wl.m9584a(new byte[0]);
                    } else if (c0832d5 == C0832d5.f6991i) {
/* 91 */                C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 97 */                if (c0832d5 != C0832d5.f6990f) {
/* 141 */                   ds0.m3206w(((C1916m6) this.f7613b).f13572s, "Unknown AesGcmSivParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 124 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 129 */           return new C1782j6();
                }

                /* JADX INFO: renamed from: l */
                public C2133r6 m3389l() throws GeneralSecurityException {
                    fs0 fs0Var;
/* 3 */             C2282v6 c2282v6 = (C2282v6) this.f7613b;
/* 6 */             if (c2282v6 == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 159 */               C1951n4.m6859j("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (c2282v6.f17871r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 153 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C2244u6 c2244u6 = c2282v6.f17872s;
/* 27 */            C2244u6 c2244u7 = C2244u6.f17369d;
/* 29 */            if (c2244u6 != c2244u7 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c2244u6 == c2244u7 && ((Integer) this.f7615d) != null) {
/* 147 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c2244u6 == c2244u7) {
/* 58 */                C2335wl.m9584a(new byte[0]);
                    } else if (c2244u6 == C2244u6.f17368c) {
/* 91 */                C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 97 */                if (c2244u6 != C2244u6.f17367b) {
/* 141 */                   ds0.m3206w(((C2282v6) this.f7613b).f17872s, "Unknown AesSivParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 124 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 129 */           return new C2133r6();
                }

                /* JADX INFO: renamed from: m */
                public C2497yg m3390m() {
/* 10 */            String strConcat = ((String) this.f7613b) == null ? " backendName" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            if (((px1) this.f7615d) == null) {
/* 20 */                strConcat = strConcat.concat(" priority");
                    }
/* 28 */            if (strConcat.isEmpty()) {
/* 44 */                return new C2497yg((String) this.f7613b, (byte[]) this.f7614c, (px1) this.f7615d);
                    }
/* 54 */            f42.m3656l("Missing required properties:".concat(strConcat));
/* 57 */            return null;
                }

                /* JADX INFO: renamed from: n */
                public nu0 m3391n() throws GeneralSecurityException {
                    fs0 fs0Var;
                    C2335wl c2335wlM9584a;
/* 3 */             qu0 qu0Var = (qu0) this.f7613b;
/* 6 */             if (qu0Var == null || (fs0Var = (fs0) this.f7614c) == null) {
/* 171 */               ds0.m3203t("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (qu0Var.f15751r != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 165 */               ds0.m3203t("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            C2131r4 c2131r4 = qu0Var.f15753t;
/* 27 */            C2131r4 c2131r5 = C2131r4.f15862q;
/* 29 */            if (c2131r4 != c2131r5 && ((Integer) this.f7615d) == null) {
/* 40 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (c2131r4 == c2131r5 && ((Integer) this.f7615d) != null) {
/* 159 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (c2131r4 == c2131r5) {
/* 58 */                c2335wlM9584a = C2335wl.m9584a(new byte[0]);
                    } else if (c2131r4 == C2131r4.f15861p || c2131r4 == C2131r4.f15860o) {
/* 143 */               c2335wlM9584a = C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f7615d).intValue()).array());
                    } else {
/* 75 */                if (c2131r4 != C2131r4.f15859n) {
/* 115 */                   ds0.m3206w(((qu0) this.f7613b).f15753t, "Unknown HmacParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 102 */               c2335wlM9584a = C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f7615d).intValue()).array());
                    }
/* 153 */           return new nu0((qu0) this.f7613b, c2335wlM9584a);
                }

                /* JADX INFO: renamed from: p */
                public void m3392p(int i) {
                    AbstractC0137o abstractC0137oM843J;
/* 1 */             int iM3397x = m3397x(i);
/* 9 */             ((C0193bu) this.f7614c).m1438f(iM3397x);
/* 18 */            RecyclerView recyclerView = (RecyclerView) ((ts0) this.f7613b).f17248a;
/* 20 */            View childAt = recyclerView.getChildAt(iM3397x);
/* 24 */            if (childAt != null && (abstractC0137oM843J = RecyclerView.m843J(childAt)) != null) {
/* 36 */                if (abstractC0137oM843J.m1026j() && !abstractC0137oM843J.m1031o()) {
/* 71 */                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC0137oM843J + recyclerView.m900z());
                        }
/* 74 */                abstractC0137oM843J.m1017a(NotificationCompat.FLAG_LOCAL_ONLY);
                    }
/* 1 */             recyclerView.detachViewFromParent(iM3397x);
                }

                /* JADX INFO: renamed from: q */
                public void m3393q(Bundle bundle) {
/* 3 */             HashSet hashSet = (HashSet) this.f7614c;
/* 11 */            String string = ((Context) this.f7615d).getString(R$string.androidx_startup);
/* 15 */            if (bundle != null) {
                        try {
/* 19 */                    HashSet hashSet2 = new HashSet();
/* 34 */                    for (String str : bundle.keySet()) {
/* 51 */                        if (string.equals(bundle.getString(str, null))) {
/* 53 */                            Class<?> cls = Class.forName(str);
/* 63 */                            if (wx0.class.isAssignableFrom(cls)) {
/* 65 */                                hashSet.add(cls);
                                    }
                                }
                            }
/* 69 */                    Iterator it = hashSet.iterator();
/* 77 */                    while (it.hasNext()) {
/* 85 */                        m3394r((Class) it.next(), hashSet2);
                            }
                        } catch (ClassNotFoundException e) {
/* 95 */                    throw new C2086px(e);
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public Object m3394r(Class cls, HashSet hashSet) {
                    Object objCreate;
/* 3 */             HashMap map = (HashMap) this.f7613b;
/* 11 */            if (j13.m5651m()) {
                        try {
/* 21 */                    Trace.beginSection(j13.m5636A(cls.getSimpleName()));
                        } catch (Throwable th) {
/* 144 */                   Trace.endSection();
/* 147 */                   throw th;
                        }
                    }
/* 28 */            if (hashSet.contains(cls)) {
/* 142 */               throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
                    }
/* 34 */            if (map.containsKey(cls)) {
/* 108 */               objCreate = map.get(cls);
                    } else {
/* 36 */                hashSet.add(cls);
                        try {
/* 48 */                    wx0 wx0Var = (wx0) cls.getDeclaredConstructor(null).newInstance(null);
/* 50 */                    List<Class> listDependencies = wx0Var.dependencies();
/* 58 */                    if (!listDependencies.isEmpty()) {
/* 68 */                        for (Class cls2 : listDependencies) {
/* 80 */                            if (!map.containsKey(cls2)) {
/* 82 */                                m3394r(cls2, hashSet);
                                    }
                                }
                            }
/* 90 */                    objCreate = wx0Var.create((Context) this.f7615d);
/* 94 */                    hashSet.remove(cls);
/* 97 */                    map.put(cls, objCreate);
                        } catch (Throwable th2) {
/* 107 */                   throw new C2086px(th2);
                        }
                    }
/* 112 */           Trace.endSection();
/* 115 */           return objCreate;
                }

                /* JADX INFO: renamed from: t */
                public View m3395t(int i) {
/* 13 */            return ((RecyclerView) ((ts0) this.f7613b).f17248a).getChildAt(m3397x(i));
                }

                public String toString() {
                    switch (this.f7612a) {
                        case 16:
/* 56 */                    return ((C0193bu) this.f7614c).toString() + ", hidden list:" + ((ArrayList) this.f7615d).size();
                        case io.flutter.Build.API_LEVELS.API_29 /* 29 */:
/* 19 */                    return q13.m7676a((i41) this.f7613b).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public int m3396u() {
/* 21 */            return ((RecyclerView) ((ts0) this.f7613b).f17248a).getChildCount() - ((ArrayList) this.f7615d).size();
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
/* 5 */             RunnableC2495ye runnableC2495ye = new RunnableC2495ye(this, 11);
/* 8 */             o80 o80VarM7428g = pg3.m7428g();
/* 12 */            u32 u32Var = c2260um.f17592c;
/* 14 */            if (u32Var != null) {
/* 16 */                u32Var.mo3676a(runnableC2495ye, o80VarM7428g);
                    }
/* 25 */            ((mt0) this.f7615d).f14017a.set(c2260um);
/* 46 */            return "HandlerScheduledFuture-" + ((Callable) this.f7614c).toString();
                }

                /* JADX INFO: renamed from: x */
                public int m3397x(int i) {
/* 3 */             C0193bu c0193bu = (C0193bu) this.f7614c;
/* 5 */             if (i < 0) {
/* 45 */                return -1;
                    }
/* 16 */            int childCount = ((RecyclerView) ((ts0) this.f7613b).f17248a).getChildCount();
/* 20 */            int i2 = i;
/* 21 */            while (i2 < childCount) {
/* 29 */                int iM1434b = i - (i2 - c0193bu.m1434b(i2));
/* 31 */                if (iM1434b == 0) {
/* 37 */                    while (c0193bu.m1436d(i2)) {
/* 39 */                        i2++;
                            }
/* 42 */                    return i2;
                        }
/* 43 */                i2 += iM1434b;
                    }
/* 45 */            return -1;
                }

                /* JADX INFO: renamed from: y */
                public Object m3398y(Class cls) throws GeneralSecurityException {
                    Class clsMo146a;
                    Object objM8054c;
                    Object objM8053b;
/* 5 */             AtomicReference atomicReference = r22.f15833a;
                    try {
/* 17 */                HashMap map = ((jx1) wk1.f18670b.f18671a.get()).f12534b;
/* 23 */                if (map.containsKey(cls)) {
/* 31 */                    clsMo146a = ((nx1) map.get(cls)).mo146a();
                        } else {
/* 40 */                    ds0.m3205v(cls, "No input primitive class for ", " available");
/* 43 */                    clsMo146a = null;
                        }
                    } catch (GeneralSecurityException unused) {
                    }
/* 46 */            if (clsMo146a == null) {
/* 543 */               throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
                    }
/* 50 */            List list = (List) this.f7614c;
/* 54 */            i41 i41Var = (i41) this.f7613b;
/* 56 */            int i = q13.f15366a;
/* 58 */            int iM4470B = i41Var.m4470B();
/* 66 */            Iterator it = i41Var.m4469A().iterator();
/* 72 */            int i2 = 0;
/* 73 */            boolean z = false;
/* 74 */            boolean z2 = true;
                    while (true) {
/* 75 */                boolean zHasNext = it.hasNext();
/* 79 */                u31 u31Var = u31.ENABLED;
/* 81 */                if (!zHasNext) {
/* 226 */                   if (i2 == 0) {
/* 526 */                       ds0.m3203t("keyset must contain at least one ENABLED key");
/* 224 */                       return null;
                            }
/* 228 */                   if (!z && !z2) {
/* 235 */                       ds0.m3203t("keyset doesn't contain a valid primary key");
/* 224 */                       return null;
                            }
/* 241 */                   C0168b5 c0168b5 = new C0168b5(clsMo146a);
/* 246 */                   tj1 tj1Var = (tj1) this.f7615d;
/* 252 */                   if (((ConcurrentHashMap) c0168b5.f2212c) == null) {
/* 520 */                       f42.m3656l("setAnnotations cannot be called after build");
/* 224 */                       return null;
                            }
/* 254 */                   c0168b5.f2215f = tj1Var;
/* 261 */                   for (int i3 = 0; i3 < i41Var.m4472z(); i3++) {
/* 263 */                       h41 h41VarM4471y = i41Var.m4471y(i3);
/* 275 */                       if (h41VarM4471y.m4110D().equals(u31Var)) {
                                    try {
/* 277 */                               i31 i31VarM4107A = h41VarM4471y.m4107A();
/* 281 */                               AtomicReference atomicReference2 = r22.f15833a;
/* 291 */                               objM8054c = r22.m8054c(i31VarM4107A.m4459B(), i31VarM4107A.m4460C(), clsMo146a);
                                    } catch (GeneralSecurityException e) {
/* 307 */                               if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
/* 322 */                                   throw e;
                                        }
/* 323 */                               objM8054c = null;
                                    }
/* 329 */                           if (list.get(i3) != null) {
                                        try {
/* 339 */                                   objM8053b = r22.m8053b(((j41) list.get(i3)).f12071a, clsMo146a);
                                        } catch (GeneralSecurityException unused2) {
/* 344 */                                   objM8053b = null;
                                        }
                                    } else {
/* 344 */                               objM8053b = null;
                                    }
/* 346 */                           if (objM8053b == null && objM8054c == null) {
/* 357 */                               StringBuilder sb = new StringBuilder("Unable to get primitive ");
/* 360 */                               sb.append(clsMo146a);
/* 367 */                               String strM4459B = h41VarM4471y.m4107A().m4459B();
/* 373 */                               sb.append(" for key of type ");
/* 376 */                               sb.append(strM4459B);
/* 386 */                               throw new GeneralSecurityException(sb.toString());
                                    }
/* 395 */                           if (h41VarM4471y.m4108B() == i41Var.m4470B()) {
/* 397 */                               c0168b5.m1262g(objM8053b, objM8054c, h41VarM4471y, true);
                                    } else {
/* 401 */                               c0168b5.m1262g(objM8053b, objM8054c, h41VarM4471y, false);
                                    }
                                }
                            }
/* 410 */                   ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0168b5.f2212c;
/* 412 */                   if (concurrentHashMap == null) {
/* 514 */                       f42.m3656l("build cannot be called twice");
/* 224 */                       return null;
                            }
/* 418 */                   ArrayList arrayList = (ArrayList) c0168b5.f2213d;
/* 422 */                   lx1 lx1Var = (lx1) c0168b5.f2214e;
/* 426 */                   tj1 tj1Var2 = (tj1) c0168b5.f2215f;
/* 430 */                   Class cls2 = (Class) c0168b5.f2211b;
/* 432 */                   ra2 ra2Var = new ra2();
/* 435 */                   ra2Var.f15955a = concurrentHashMap;
/* 437 */                   ra2Var.f15956b = arrayList;
/* 439 */                   ra2Var.f15957c = lx1Var;
/* 441 */                   ra2Var.f15958d = tj1Var2;
/* 445 */                   c0168b5.f2212c = null;
/* 447 */                   AtomicReference atomicReference3 = r22.f15833a;
/* 459 */                   HashMap map2 = ((jx1) wk1.f18670b.f18671a.get()).f12534b;
/* 465 */                   if (!map2.containsKey(cls)) {
/* 508 */                       ds0.m3207x(cls, "No wrapper found for ");
/* 506 */                       return null;
                            }
/* 471 */                   nx1 nx1Var = (nx1) map2.get(cls);
/* 481 */                   if (cls2.equals(nx1Var.mo146a()) && nx1Var.mo146a().equals(cls2)) {
/* 493 */                       return nx1Var.mo147b(ra2Var);
                            }
/* 500 */                   ds0.m3203t("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
/* 503 */                   return null;
                        }
/* 87 */                h41 h41Var = (h41) it.next();
/* 95 */                if (h41Var.m4110D() == u31Var) {
/* 102 */                   if (!h41Var.m4111E()) {
/* 223 */                       throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(h41Var.m4108B())));
                            }
/* 110 */                   if (h41Var.m4109C() == wq1.UNKNOWN_PREFIX) {
/* 199 */                       throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(h41Var.m4108B())));
                            }
/* 118 */                   if (h41Var.m4110D() == u31.UNKNOWN_STATUS) {
/* 175 */                       throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(h41Var.m4108B())));
                            }
/* 124 */                   if (h41Var.m4108B() == iM4470B) {
/* 126 */                       if (z) {
/* 132 */                           ds0.m3203t("keyset contains multiple primary keys");
/* 89 */                            return null;
                                }
/* 128 */                       z = true;
                            }
/* 146 */                   if (h41Var.m4107A().m4458A() != h31.ASYMMETRIC_PUBLIC) {
/* 148 */                       z2 = false;
                            }
/* 149 */                   i2++;
                        }
                    }
                }

                /* JADX INFO: renamed from: z */
                public View m3399z(int i) {
/* 9 */             return ((RecyclerView) ((ts0) this.f7613b).f17248a).getChildAt(i);
                }

/* 62 */        public /* synthetic */ C0875ec(int i, Object obj, Object obj2, Object obj3) {
/* 63 */            this.f7612a = i;
                    this.f7613b = obj;
                    this.f7614c = obj2;
                    this.f7615d = obj3;
                }

/* 63 */        public /* synthetic */ C0875ec(Object obj, Object obj2, Object obj3, int i, boolean z) {
/* 64 */            this.f7612a = i;
                    this.f7615d = obj;
                    this.f7613b = obj2;
                    this.f7614c = obj3;
                }

/* 64 */        public C0875ec(xu0 xu0Var, hb1 hb1Var, String str) {
                    this.f7612a = 8;
                    hb1Var.getClass();
                    xu0Var.getClass();
                    str.getClass();
/* 66 */            this.f7613b = hb1Var;
/* 67 */            this.f7614c = xu0Var;
/* 68 */            this.f7615d = str;
                }

/* 68 */        public C0875ec(i03 i03Var, C0006a4 c0006a4) {
                    this.f7612a = 1;
/* 70 */            this.f7613b = c0006a4;
/* 71 */            this.f7614c = C1839a.m6210b(755);
/* 72 */            this.f7615d = "Jy6PlrM3";
                }

/* 72 */        public C0875ec(ConsentDisclosureObject consentDisclosureObject, hu1 hu1Var, Map map) {
                    this.f7612a = 20;
                    consentDisclosureObject.getClass();
                    hu1Var.getClass();
                    map.getClass();
/* 74 */            this.f7613b = consentDisclosureObject;
/* 75 */            this.f7614c = hu1Var;
/* 76 */            this.f7615d = map;
                }

/* 76 */        public C0875ec(i03 i03Var, g80 g80Var, C2508yr c2508yr) {
                    this.f7612a = 12;
                    i03Var.getClass();
                    g80Var.getClass();
                    c2508yr.getClass();
/* 78 */            this.f7613b = i03Var;
/* 79 */            this.f7614c = g80Var;
/* 80 */            this.f7615d = c2508yr;
                }

/* 80 */        public C0875ec(ts0 ts0Var) {
                    this.f7612a = 16;
/* 82 */            this.f7613b = ts0Var;
/* 83 */            this.f7614c = new C0193bu();
/* 84 */            this.f7615d = new ArrayList();
                }

/* 84 */        public C0875ec(FirebaseMessagingService firebaseMessagingService, ts0 ts0Var, ExecutorService executorService) {
                    this.f7612a = 22;
/* 86 */            this.f7613b = executorService;
/* 87 */            this.f7614c = firebaseMessagingService;
/* 88 */            this.f7615d = ts0Var;
                }

/* 88 */        public C0875ec(a00 a00Var) {
                    this.f7612a = 11;
/* 90 */            this.f7613b = new ArrayList();
/* 93 */            this.f7614c = new C2332wi();
/* 94 */            this.f7615d = a00Var;
                }

/* 94 */        public C0875ec(Context context) {
                    this.f7612a = 0;
/* 96 */            this.f7615d = context.getApplicationContext();
/* 97 */            this.f7614c = new HashSet();
/* 98 */            this.f7613b = new HashMap();
                }

/* 98 */        public /* synthetic */ C0875ec(int i) {
/* 99 */            this.f7612a = i;
                }

/* 99 */        public C0875ec(qc3 qc3Var) {
                    this.f7612a = 9;
/* 101 */           this.f7613b = qc3Var;
/* 102 */           this.f7614c = Choreographer.getInstance();
/* 103 */           this.f7615d = new ChoreographerFrameCallbackC2172s8(this);
                }

/* 103 */       public C0875ec(i41 i41Var, List list) {
                    this.f7612a = 29;
/* 105 */           this.f7613b = i41Var;
/* 106 */           this.f7614c = list;
/* 107 */           this.f7615d = tj1.f17127b;
                }

/* 107 */       public C0875ec(C0210cb c0210cb) {
                    this.f7612a = 14;
                    this.f7615d = c0210cb;
/* 109 */           this.f7614c = new AtomicBoolean(false);
/* 112 */           this.f7613b = ((C2467xn) c0210cb.f2805c).f19265d.schedule(new RunnableC2224tn(this, 0), 2000L, TimeUnit.MILLISECONDS);
                }
            }
