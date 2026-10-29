            package p000;

            import android.app.Activity;
            import android.content.ActivityNotFoundException;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.graphics.Typeface;
            import android.location.Location;
            import android.location.LocationManager;
            import android.net.Uri;
            import android.os.Build;
            import android.text.TextUtils;
            import android.view.Choreographer;
            import android.view.GestureDetector;
            import android.view.View;
            import android.view.inputmethod.InputMethodManager;
            import android.webkit.ValueCallback;
            import android.webkit.WebView;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.MobileScannerHandler;
            import com.supercell.p007id.scid_plugin.mobile_scanner.objects.MobileScannerStartParameters;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import com.supercell.titan.C0803j;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.ScExternalWebView;
            import com.supercell.titan.TitanWebView;
            import com.supercell.titan.usercentrics.UsercentricsInitializer;
            import com.usercentrics.sdk.UsercentricsOptions;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1383b7;
            import io.sentry.C1443f;
            import io.sentry.C1460g4;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.ActivityLifecycleIntegration;
            import io.sentry.android.core.AlertDialogC1270s1;
            import io.sentry.android.core.AnrIntegration;
            import io.sentry.android.core.C1191g0;
            import io.sentry.android.core.FeedbackShakeIntegration;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.anr.AnrProfilingIntegration;
            import io.sentry.android.core.anr.C1170d;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.android.ndk.C1291b;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.ndk.NativeScope;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final /* synthetic */ class ji1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12314a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12315b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f12316c;

                public /* synthetic */ ji1(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC1525k1 interfaceC1525k1, InterfaceC1525k1 interfaceC1525k2) {
/* 3 */             this.f12314a = 19;
/* 8 */             this.f12315b = interfaceC1525k1;
/* 10 */            this.f12316c = interfaceC1525k2;
                }

                /* JADX INFO: renamed from: a */
                private final void m5830a() {
/* 3 */             e53 e53Var = (e53) this.f12315b;
/* 7 */             View[] viewArr = (View[]) this.f12316c;
/* 13 */            if (e53Var.f7541p != -1) {
/* 17 */                for (View view : viewArr) {
/* 31 */                    view.setTag(e53Var.f7541p, Long.valueOf(System.nanoTime()));
                        }
                    }
/* 39 */            if (e53Var.f7542q != -1) {
/* 42 */                for (View view2 : viewArr) {
/* 49 */                    view2.setTag(e53Var.f7542q, null);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                private final void m5831b() {
/* 3 */             AnrIntegration anrIntegration = (AnrIntegration) this.f12315b;
/* 7 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f12316c;
/* 9 */             C1702a c1702a = anrIntegration.f9842c;
/* 11 */            c1702a.m5443c();
                    try {
/* 16 */                if (!anrIntegration.f9841b) {
/* 18 */                    anrIntegration.m4749c(sentryAndroidOptions);
                        }
/* 24 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 28 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 33 */                    th.addSuppressed(th2);
                        }
/* 36 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                private final void m5832c() {
/* 3 */             FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f12315b;
/* 7 */             Activity activity = (Activity) this.f12316c;
/* 11 */            if (feedbackShakeIntegration.f9864e || activity.isFinishing() || activity.isDestroyed()) {
/* 93 */                return;
                    }
                    try {
/* 27 */                feedbackShakeIntegration.f9864e = true;
/* 35 */                Runnable runnable = feedbackShakeIntegration.f9862c.getFeedbackOptions().f10984h;
/* 37 */                feedbackShakeIntegration.f9865f = runnable;
/* 52 */                feedbackShakeIntegration.f9862c.getFeedbackOptions().f10984h = new ji1(23, feedbackShakeIntegration, runnable);
/* 59 */                new AlertDialogC1270s1(activity).show();
                    } catch (Throwable th) {
/* 65 */                feedbackShakeIntegration.f9864e = false;
/* 75 */                feedbackShakeIntegration.f9862c.getFeedbackOptions().f10984h = feedbackShakeIntegration.f9865f;
/* 78 */                feedbackShakeIntegration.f9865f = null;
/* 90 */                feedbackShakeIntegration.f9862c.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to show feedback dialog on shake.", th);
                    }
                }

                /* JADX INFO: renamed from: d */
                private final void m5833d() {
/* 3 */             FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f12315b;
/* 7 */             Runnable runnable = (Runnable) this.f12316c;
/* 10 */            feedbackShakeIntegration.f9864e = false;
/* 18 */            feedbackShakeIntegration.f9862c.getFeedbackOptions().f10984h = runnable;
/* 20 */            if (runnable != null) {
/* 22 */                runnable.run();
                    }
/* 26 */            feedbackShakeIntegration.f9865f = null;
                }

                /* JADX INFO: renamed from: e */
                private final void m5834e() {
/* 3 */             AlertDialogC1270s1 alertDialogC1270s1 = (AlertDialogC1270s1) this.f12315b;
/* 7 */             Activity activity = (Activity) this.f12316c;
/* 13 */            if (activity.isFinishing() || activity.isDestroyed()) {
/* 24 */                return;
                    }
/* 21 */            alertDialogC1270s1.show();
                }

                /* JADX INFO: renamed from: f */
                private final void m5835f() {
/* 3 */             AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.f12315b;
/* 7 */             C1170d c1170d = (C1170d) this.f12316c;
/* 9 */             if (c1170d == null) {
/* 11 */                return;
                    }
                    try {
/* 12 */                c1170d.close();
                    } catch (IOException unused) {
/* 25 */                anrProfilingIntegration.f9944w.mo4672k(EnumC1553m5.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: g */
                private final void m5836g() {
/* 3 */             C1231r c1231r = (C1231r) this.f12315b;
/* 7 */             ILogger iLogger = (ILogger) this.f12316c;
                    try {
/* 13 */                c1231r.f10192V = Choreographer.getInstance();
                    } catch (Throwable th) {
/* 21 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
                    }
                }

                /* JADX INFO: renamed from: h */
                private final void m5837h() {
/* 3 */             C1291b c1291b = (C1291b) this.f12315b;
/* 7 */             String str = (String) this.f12316c;
/* 11 */            c1291b.f10406b.getClass();
/* 14 */            NativeScope.nativeAddAttachment(str);
                }

                /* JADX INFO: renamed from: i */
                private final void m5838i() {
/* 4 */             C1291b c1291b = (C1291b) this.f12315b;
/* 8 */             C1443f c1443f = (C1443f) this.f12316c;
/* 10 */            C1554m6 c1554m6 = c1291b.f10405a;
/* 12 */            EnumC1553m5 enumC1553m5 = c1443f.f10934w;
/* 14 */            String strMo5066d = null;
/* 29 */            String lowerCase = enumC1553m5 != null ? enumC1553m5.name().toLowerCase(Locale.ROOT) : null;
/* 38 */            String strM5178q = AbstractC1417a.m5178q(c1443f.m5208c().getTime());
                    try {
/* 42 */                Map mapM5207b = c1443f.m5207b();
/* 50 */                if (!mapM5207b.isEmpty()) {
/* 56 */                    strMo5066d = c1554m6.getSerializer().mo5066d(mapM5207b);
                        }
                    } catch (Throwable th) {
/* 76 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
                    }
/* 63 */            String str = strMo5066d;
/* 80 */            NativeScope nativeScope = c1291b.f10406b;
/* 82 */            String str2 = c1443f.f10929d;
/* 84 */            String str3 = c1443f.f10932i;
/* 86 */            String str4 = c1443f.f10930e;
/* 88 */            nativeScope.getClass();
/* 91 */            NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strM5178q, str);
                }

                /* JADX WARN: Code duplicated, block: B:161:0x0319  */
                /* JADX WARN: Code duplicated, block: B:164:0x032d  */
                /* JADX WARN: Code duplicated, block: B:167:0x0391  */
                /* JADX WARN: Code duplicated, block: B:170:0x039a A[LOOP:4: B:165:0x038e->B:170:0x039a, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:172:0x03a5  */
                /* JADX WARN: Code duplicated, block: B:174:0x03a8  */
                /* JADX WARN: Code duplicated, block: B:177:0x03b5  */
                /* JADX WARN: Code duplicated, block: B:180:0x03c2  */
                /* JADX WARN: Code duplicated, block: B:181:0x03c5  */
                /* JADX WARN: Code duplicated, block: B:182:0x03c8  */
                /* JADX WARN: Code duplicated, block: B:183:0x03cb  */
                /* JADX WARN: Code duplicated, block: B:184:0x03ce  */
                /* JADX WARN: Code duplicated, block: B:185:0x03d1  */
                /* JADX WARN: Code duplicated, block: B:191:0x0416 A[Catch: all -> 0x0419, TryCatch #7 {all -> 0x0419, blocks: (B:189:0x0412, B:191:0x0416, B:194:0x041c, B:196:0x0432, B:197:0x0435, B:199:0x0443, B:200:0x0446, B:201:0x044a, B:203:0x0450, B:205:0x0462, B:207:0x0466, B:209:0x0470, B:210:0x0474, B:211:0x0479), top: B:392:0x0412 }] */
                /* JADX WARN: Code duplicated, block: B:196:0x0432 A[Catch: all -> 0x0419, TryCatch #7 {all -> 0x0419, blocks: (B:189:0x0412, B:191:0x0416, B:194:0x041c, B:196:0x0432, B:197:0x0435, B:199:0x0443, B:200:0x0446, B:201:0x044a, B:203:0x0450, B:205:0x0462, B:207:0x0466, B:209:0x0470, B:210:0x0474, B:211:0x0479), top: B:392:0x0412 }] */
                /* JADX WARN: Code duplicated, block: B:199:0x0443 A[Catch: all -> 0x0419, TryCatch #7 {all -> 0x0419, blocks: (B:189:0x0412, B:191:0x0416, B:194:0x041c, B:196:0x0432, B:197:0x0435, B:199:0x0443, B:200:0x0446, B:201:0x044a, B:203:0x0450, B:205:0x0462, B:207:0x0466, B:209:0x0470, B:210:0x0474, B:211:0x0479), top: B:392:0x0412 }] */
                /* JADX WARN: Code duplicated, block: B:203:0x0450 A[Catch: all -> 0x0419, TryCatch #7 {all -> 0x0419, blocks: (B:189:0x0412, B:191:0x0416, B:194:0x041c, B:196:0x0432, B:197:0x0435, B:199:0x0443, B:200:0x0446, B:201:0x044a, B:203:0x0450, B:205:0x0462, B:207:0x0466, B:209:0x0470, B:210:0x0474, B:211:0x0479), top: B:392:0x0412 }] */
                /* JADX WARN: Code duplicated, block: B:207:0x0466 A[Catch: all -> 0x0419, TryCatch #7 {all -> 0x0419, blocks: (B:189:0x0412, B:191:0x0416, B:194:0x041c, B:196:0x0432, B:197:0x0435, B:199:0x0443, B:200:0x0446, B:201:0x044a, B:203:0x0450, B:205:0x0462, B:207:0x0466, B:209:0x0470, B:210:0x0474, B:211:0x0479), top: B:392:0x0412 }] */
                /* JADX WARN: Code duplicated, block: B:216:0x0485 A[LOOP:6: B:214:0x047f->B:216:0x0485, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:219:0x049e  */
                /* JADX WARN: Code duplicated, block: B:220:0x04a6  */
                /* JADX WARN: Code duplicated, block: B:223:0x04ab  */
                /* JADX WARN: Code duplicated, block: B:227:0x04dd  */
                /* JADX WARN: Code duplicated, block: B:230:0x04f2 A[LOOP:7: B:228:0x04ec->B:230:0x04f2, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:236:0x0515 A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:241:0x052c A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:244:0x053d A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:248:0x054a A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:252:0x0560 A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:254:0x0569 A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:256:0x0576 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:257:0x0578  */
                /* JADX WARN: Code duplicated, block: B:258:0x057a  */
                /* JADX WARN: Code duplicated, block: B:260:0x0580 A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:262:0x0585 A[Catch: all -> 0x0518, TryCatch #6 {all -> 0x0518, blocks: (B:234:0x0511, B:236:0x0515, B:239:0x051b, B:241:0x052c, B:242:0x052f, B:244:0x053d, B:245:0x0540, B:246:0x0544, B:248:0x054a, B:250:0x055c, B:252:0x0560, B:253:0x0566, B:254:0x0569, B:259:0x057b, B:263:0x0589, B:260:0x0580, B:262:0x0585, B:267:0x0595, B:268:0x059a), top: B:390:0x0511 }] */
                /* JADX WARN: Code duplicated, block: B:272:0x05a0  */
                /* JADX WARN: Code duplicated, block: B:274:0x05ae  */
                /* JADX WARN: Code duplicated, block: B:276:0x05bc  */
                /* JADX WARN: Code duplicated, block: B:277:0x05bf  */
                /* JADX WARN: Code duplicated, block: B:280:0x05ce  */
                /* JADX WARN: Code duplicated, block: B:281:0x05d1  */
                /* JADX WARN: Code duplicated, block: B:282:0x05d3  */
                /* JADX WARN: Code duplicated, block: B:284:0x05dd  */
                /* JADX WARN: Code duplicated, block: B:287:0x05ed  */
                /* JADX WARN: Code duplicated, block: B:293:0x05fd  */
                /* JADX WARN: Code duplicated, block: B:295:0x0606  */
                /* JADX WARN: Code duplicated, block: B:297:0x0611  */
                /* JADX WARN: Code duplicated, block: B:298:0x0639  */
                /* JADX WARN: Code duplicated, block: B:300:0x063c  */
                /* JADX WARN: Code duplicated, block: B:390:0x0511 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:392:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:398:0x03c1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:399:0x0474 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:400:0x0595 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:401:0x05f8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:403:0x064c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:417:0x039d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:418:0x03a5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:420:0x0462 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:421:0x0470 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:423:0x044a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:424:0x044a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:428:0x059b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:429:0x055c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:430:0x0591 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:432:0x0544 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:433:0x0544 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:435:? A[LOOP:9: B:285:0x05e7->B:435:?, LOOP_END, SYNTHETIC] */
                @Override // java.lang.Runnable
                public final void run() {
                    f31 f31Var;
                    String str;
                    LinkedList<b92> linkedList;
                    LinkedList<q50> linkedList2;
                    List list;
                    List list2;
                    boolean z;
                    String str2;
                    boolean z2;
                    f31 f31Var2;
                    String str3;
                    LinkedList linkedList3;
                    List list3;
                    List list4;
                    Iterator it;
                    String str4;
                    String str5;
                    Iterator it2;
                    Object obj;
                    Object obj2;
                    Unit unit;
                    q50 q50Var;
                    String str6;
                    fs0 fs0Var;
                    ng2 ng2VarM3821r;
                    Boolean boolValueOf;
                    boolean z3;
                    LinkedList linkedList4;
                    Iterator it3;
                    String str7;
                    fs0 fs0Var2;
                    List listM7715a;
                    ur3 ur3Var;
                    String str8;
                    boolean z4;
                    Location lastKnownLocation;
                    b92 b92Var;
                    HashMap map;
                    String[] strArr;
                    int i;
                    String str9;
                    b92 b92Var2;
                    b92 b92Var3;
/* 6 */             int i2 = 0;
                    switch (this.f12314a) {
                        case 0:
/* 2259 */                  ((nw0) this.f12316c).mo6871f((li1) this.f12315b);
/* 2262 */                  return;
                        case 1:
/* 1 */                     MobileScannerHandler.start$lambda$7$lambda$6((MethodChannel.Result) this.f12315b, (MobileScannerStartParameters) this.f12316c);
/* 2250 */                  return;
                        case 2:
/* 2154 */                  MethodChannel.Result result = (MethodChannel.Result) this.f12315b;
/* 2158 */                  mj1 mj1Var = (mj1) this.f12316c;
/* 2235 */                  result.success(oc1.m7131e(new Pair("textureId", Long.valueOf(mj1Var.f13811d)), new Pair("rotation", Integer.valueOf(mj1Var.f13810c)), new Pair("size", oc1.m7131e(new Pair("width", Double.valueOf(mj1Var.f13808a)), new Pair("height", Double.valueOf(mj1Var.f13809b))))));
/* 2238 */                  return;
                        case 3:
/* 2148 */                  ((uw1) this.f12315b).mo6870d((rj2) this.f12316c);
/* 2151 */                  return;
                        case 4:
/* 2136 */                  ((de3) this.f12315b).mo1401B((Typeface) this.f12316c);
/* 2139 */                  return;
                        case 5:
/* 1970 */                  ScExternalWebView scExternalWebView = (ScExternalWebView) this.f12315b;
/* 1975 */                  String str10 = (String) this.f12316c;
                            try {
/* 1981 */                      Uri uri = Uri.parse(str10);
/* 1985 */                      e72 e72Var = scExternalWebView.f5900i;
/* 1987 */                      if (e72Var != null) {
/* 1989 */                          e72Var.f7564a = str10;
/* 1992 */                          e72Var.f7565b = false;
                                }
/* 1994 */                      scExternalWebView.m2743a();
/* 1997 */                      long j = scExternalWebView.f5898g;
/* 2003 */                      if (j > 0) {
/* 2010 */                          cp0 cp0Var = new cp0(scExternalWebView, str10, 19, false);
/* 2013 */                          scExternalWebView.f5897f = cp0Var;
/* 2017 */                          scExternalWebView.f5896e.postDelayed(cp0Var, j);
                                }
/* 2020 */                      j30 j30Var = scExternalWebView.f5893b;
/* 2022 */                      if (j30Var == null) {
/* 2085 */                          scExternalWebView.m2743a();
/* 2097 */                          GameApp.getInstance().startActivity(new Intent("android.intent.action.VIEW", uri));
/* 2101 */                          scExternalWebView.f5892a = false;
/* 2127 */                          return;
                                }
                                try {
/* 2026 */                          j30Var.f12036a.setData(uri);
/* 2040 */                          GameApp.getInstance().startActivityForResult(scExternalWebView.f5893b.f12036a, 41036);
/* 2052 */                          GameApp.getInstance().addActivityResultListener(new C0803j(scExternalWebView));
/* 2056 */                          scExternalWebView.f5892a = true;
/* 2127 */                          return;
                                } catch (ActivityNotFoundException unused) {
/* 2061 */                          scExternalWebView.m2743a();
/* 2066 */                          AbstractC1245n0.m4889q("ScExternalWebView", "Custom Tabs not available, falling back to browser");
/* 2078 */                          GameApp.getInstance().startActivity(new Intent("android.intent.action.VIEW", uri));
/* 2082 */                          scExternalWebView.f5892a = false;
/* 2127 */                          return;
                                }
                            } catch (Exception e) {
/* 2104 */                      scExternalWebView.m2743a();
/* 2121 */                      AbstractC1245n0.m4877e("ScExternalWebView", "Failed to open URL: " + str10, e);
/* 2125 */                      scExternalWebView.f5892a = false;
/* 2127 */                      return;
                            }
                        case 6:
/* 1882 */                  ScExternalWebView scExternalWebView2 = (ScExternalWebView) this.f12315b;
/* 1886 */                  GameApp gameApp = (GameApp) this.f12316c;
/* 1893 */                  scExternalWebView2.f5900i = new e72(scExternalWebView2);
/* 1900 */                  scExternalWebView2.f5895d = new c72(scExternalWebView2);
/* 1904 */                  Context applicationContext = gameApp.getApplicationContext();
/* 1908 */                  c72 c72Var = scExternalWebView2.f5895d;
/* 1914 */                  c72Var.setApplicationContext(applicationContext.getApplicationContext());
/* 1921 */                  Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
/* 1928 */                  if (!TextUtils.isEmpty("com.android.chrome")) {
/* 1930 */                      intent.setPackage("com.android.chrome");
                            }
/* 1939 */                  if (!applicationContext.bindService(intent, c72Var, 33)) {
/* 1945 */                      AbstractC1245n0.m4889q("ScExternalWebView", "Could not bind to Custom Tabs service, callbacks may not work");
                            }
/* 1950 */                  i30 i30Var = new i30();
/* 1958 */                  i30Var.f9432a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
/* 1965 */                  scExternalWebView2.f5893b = i30Var.m4451a();
/* 1967 */                  return;
                        case 7:
/* 1876 */                  ((ScExternalWebView) ((cp0) this.f12315b).f6869c).onPageFailed((String) this.f12316c);
/* 1879 */                  return;
                        case 8:
/* 1851 */                  c00 c00Var = (c00) this.f12315b;
/* 1855 */                  C1837kn c1837kn = (C1837kn) this.f12316c;
/* 1857 */                  c00Var.getClass();
/* 1860 */                  c00Var.accept(c1837kn);
/* 1863 */                  return;
                        case 9:
/* 1814 */                  LinkedList linkedList5 = (LinkedList) this.f12315b;
/* 1818 */                  yq2 yq2Var = (yq2) this.f12316c;
/* 1820 */                  yq2Var.getClass();
/* 1823 */                  Iterator it4 = linkedList5.iterator();
/* 1831 */                  while (it4.hasNext()) {
                                switch (((q50) it4.next()).f15399a) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    default:
/* 1844 */                              yq2Var.getClass();
                                        break;
                                }
                            }
/* 1848 */                  return;
                        case 10:
/* 1808 */                  ((c00) ((AtomicReference) this.f12316c).get()).accept(new C2217tg((mj2) this.f12315b));
/* 1811 */                  return;
                        case 11:
/* 1754 */                  TitanWebView titanWebView = (TitanWebView) this.f12315b;
/* 1758 */                  TitanWebView titanWebView2 = (TitanWebView) this.f12316c;
/* 1760 */                  WebView webView = titanWebView.f5959o;
/* 1762 */                  if (webView == null) {
/* 1788 */                      return;
                            }
/* 1785 */                  webView.setOnTouchListener(new d41(new GestureDetector(GameApp.getInstance(), new op2(titanWebView2)), 1));
/* 1788 */                  return;
                        case 12:
/* 1679 */                  TitanWebView titanWebView3 = (TitanWebView) this.f12315b;
/* 1683 */                  GameApp gameApp2 = (GameApp) this.f12316c;
/* 1685 */                  WebView webView2 = titanWebView3.f5959o;
/* 1687 */                  if (webView2 == null) {
/* 1751 */                      return;
                            }
/* 1691 */                  webView2.setAlpha(0.0f);
/* 1694 */                  webView2.setVisibility(4);
/* 1701 */                  titanWebView3.f5953i.setVisibility(8);
/* 1704 */                  WebView webView3 = titanWebView3.f5959o;
/* 1706 */                  if (webView3 != null) {
/* 1709 */                      GameApp gameApp3 = GameApp.getInstance();
/* 1719 */                      InputMethodManager inputMethodManager = (InputMethodManager) gameApp3.getSystemService("input_method");
/* 1721 */                      if (inputMethodManager != null) {
/* 1728 */                          inputMethodManager.hideSoftInputFromWindow(webView3.getWindowToken(), 0);
                                }
/* 1731 */                      webView3.clearFocus();
/* 1734 */                      gameApp3.setSystemUiVisibility();
/* 1739 */                      gameApp3.setSystemUiVisibilityDelayed(2000L);
                            }
/* 1748 */                  gameApp2.getWindow().setSoftInputMode(titanWebView3.f5942A);
/* 1751 */                  return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1658 */                  final TitanWebView.TitanWebViewClient titanWebViewClient = (TitanWebView.TitanWebViewClient) this.f12315b;
/* 1662 */                  final WebView webView4 = (WebView) this.f12316c;
/* 1664 */                  int i3 = TitanWebView.TitanWebViewClient.f5972c;
/* 1673 */                  webView4.evaluateJavascript("typeof window.bridge !== 'undefined' && typeof window.bridge.postMessage === 'function'", new ValueCallback() { // from class: qp2
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj3) {
/* 3 */                             int i4 = TitanWebView.TitanWebViewClient.f5972c;
/* 11 */                            if ("true".equals((String) obj3)) {
/* 27 */                                return;
                                    }
/* 17 */                            AbstractC1245n0.m4889q("TitanWebView", "Bridge not available after navigation, re-injecting");
/* 24 */                            titanWebViewClient.m2750a(webView4);
                                }
                            });
/* 1676 */                  return;
                        case 14:
/* 1625 */                  WebView webView5 = (WebView) this.f12315b;
/* 1629 */                  String str11 = (String) this.f12316c;
/* 1631 */                  int i4 = TitanWebView.TitanWebViewClient.f5972c;
/* 1652 */                  webView5.evaluateJavascript("window.__bridgePostIndex = window.__bridgePostIndex || 1;window.bridge = {" + str11 + "postMessage: function(name, body) {return new Promise((resolve, reject) => {const callbackId = Math.random().toString() + '_' + (++window.__bridgePostIndex).toString();window.__bridgeCallbacks = window.__bridgeCallbacks || {};window.__bridgeCallbacks[callbackId] = resolve;window.messageHandler.postMessage(name, body, callbackId);});}};if (window.__bridgeResolve) {window.__bridgeResolve(window.bridge);delete window.__bridgeResolve;}console.log(\"TitanWebView window.bridge ready!\");", null);
/* 1655 */                  return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                   h22 h22Var = (h22) this.f12315b;
/* 139 */                   uq2 uq2Var = (uq2) this.f12316c;
/* 153 */                   for (Pair pair : (Iterable) h22Var.f8873a) {
/* 163 */                       AbstractC1812k abstractC1812k = (AbstractC1812k) pair.f12908a;
/* 168 */                       yq2 yq2Var2 = (yq2) pair.f12909b;
/* 172 */                       zq2 zq2Var = new zq2();
/* 175 */                       String str12 = yq2Var2.f19756a;
/* 177 */                       if (str12 != null) {
/* 181 */                           str12.equals("iglu:com.snowplowanalytics.mobile/application_install/jsonschema/1-0-0");
                                }
/* 195 */                       zq2Var.m10420a("eid", yq2Var2.f19761f.toString());
/* 206 */                       zq2Var.m10420a("dtm", String.valueOf(yq2Var2.f19762g));
/* 213 */                       zq2Var.m10420a("aid", uq2Var.f17648b);
/* 220 */                       zq2Var.m10420a("tna", uq2Var.f17647a);
/* 227 */                       zq2Var.m10420a("tv", uq2Var.f17652f);
/* 230 */                       d31 d31Var = uq2Var.f17656j;
/* 232 */                       if (d31Var != null) {
/* 236 */                           boolean z5 = uq2Var.f17667u;
/* 238 */                           HashMap map2 = d31Var.f6967a;
/* 240 */                           if (z5) {
/* 244 */                               HashMap map3 = new HashMap(map2);
/* 249 */                               map3.remove("uid");
/* 254 */                               map3.remove("duid");
/* 259 */                               map3.remove("tnuid");
/* 264 */                               map3.remove("ip");
/* 267 */                               map2 = map3;
                                    }
/* 271 */                           zq2Var.m10422c(new HashMap(map2));
                                }
/* 282 */                       zq2Var.m10420a("p", AbstractC0886en.m3502f(uq2Var.f17645H));
/* 287 */                       if (yq2Var2.f19763h) {
/* 291 */                           zq2Var.m10420a("e", yq2Var2.f19757b);
                                } else {
/* 297 */                           zq2Var.m10420a("e", "ue");
                                }
/* 300 */                       f31 f31Var3 = uq2Var.f17651e;
                                synchronized (f31Var3) {
                                    try {
/* 305 */                               LinkedList<q50> linkedList6 = new LinkedList();
/* 318 */                               List list5 = (List) ((HashMap) f31Var3.f7987e).get(yq2Var2.f19756a);
/* 320 */                               if (list5 != null) {
/* 322 */                                   linkedList6.addAll(list5);
                                        }
/* 339 */                               List list6 = (List) ((HashMap) f31Var3.f7987e).get("*");
/* 341 */                               if (list6 != null) {
/* 343 */                                   linkedList6.addAll(list6);
                                        }
/* 354 */                               for (q50 q50Var2 : linkedList6) {
/* 370 */                                   String str13 = (String) ((HashMap) f31Var3.f7984b).get(q50Var2);
/* 372 */                                   if (str13 != null) {
/* 374 */                                       fs0 fs0Var3 = yq2Var2.f19759d;
/* 376 */                                       if (fs0Var3 == null) {
/* 444 */                                           Intrinsics.m6220e("state");
/* 447 */                                           throw null;
                                                }
/* 382 */                                       Map mapM7723i = q50Var2.m7723i(yq2Var2, fs0Var3.m3821r(str13));
/* 386 */                                       if (mapM7723i != null) {
/* 402 */                                           for (Map.Entry entry : ((HashMap) mapM7723i).entrySet()) {
/* 414 */                                               String str14 = (String) entry.getKey();
/* 416 */                                               Object value = entry.getValue();
/* 430 */                                               if (((HashMap) yq2Var2.m10170b()).get(str14) == null) {
/* 438 */                                                   ((HashMap) yq2Var2.m10170b()).put(str14, value);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
/* 1621 */                              throw th;
                                    }
                                }
/* 451 */                       if (uq2Var.f17638A) {
/* 453 */                           Context context = uq2Var.f17650d;
/* 455 */                           int i5 = mn0.f13881p;
/* 457 */                           context.getClass();
                                    try {
/* 468 */                               PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), i2);
/* 472 */                               String str15 = packageInfo.versionName;
/* 493 */                               String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
/* 497 */                               if (str15 != null) {
/* 501 */                                   HashMap map4 = new HashMap();
/* 506 */                                   mn0.m6688d(map4, "version", str15);
/* 511 */                                   mn0.m6688d(map4, "build", strValueOf);
/* 518 */                                   b92Var3 = new b92("iglu:com.snowplowanalytics.mobile/application/jsonschema/1-0-0", map4);
                                        } else {
/* 537 */                                   b92Var3 = null;
                                        }
                                    } catch (PackageManager.NameNotFoundException e2) {
/* 534 */                               k50.m5980q("mn0", "Failed to find application context: %s", e2.getMessage());
                                    }
/* 538 */                           if (b92Var3 != null) {
/* 546 */                               ((ArrayList) yq2Var2.m10169a()).add(b92Var3);
                                    }
                                }
/* 551 */                       if (uq2Var.f17672z) {
/* 553 */                           gs1 gs1Var = uq2Var.f17654h;
/* 555 */                           boolean z6 = uq2Var.f17667u;
                                    synchronized (gs1Var) {
                                        try {
/* 560 */                                   if (!gs1Var.f8800h) {
/* 562 */                                       gs1Var.m4008d();
                                            }
/* 569 */                                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 581 */                                   if (jCurrentTimeMillis - gs1Var.f8801i >= gs1Var.f8793a) {
/* 583 */                                       gs1Var.m4007c();
                                            }
/* 593 */                                   if (jCurrentTimeMillis - gs1Var.f8802j >= gs1Var.f8794b) {
/* 595 */                                       gs1Var.m4006b();
                                            }
                                        } catch (Throwable th2) {
/* 688 */                                   throw th2;
                                        }
                                    }
/* 599 */                           HashMap map5 = gs1Var.f8799g;
/* 609 */                           String[] strArr2 = {"osType", "osVersion", "deviceManufacturer", "deviceModel"};
/* 613 */                           int i6 = mn0.f13881p;
/* 615 */                           map5.getClass();
/* 618 */                           int i7 = 0;
                                    while (true) {
/* 619 */                               if (i7 < 4) {
/* 627 */                                   if (map5.containsKey(strArr2[i7])) {
/* 631 */                                       i7++;
                                            } else {
/* 629 */                                       b92Var2 = null;
                                            }
                                        } else if (z6 && gs1Var.f8799g.containsKey("androidIdfa")) {
/* 650 */                                   HashMap map6 = new HashMap(gs1Var.f8799g);
/* 655 */                                   map6.remove("androidIdfa");
/* 662 */                                   b92Var2 = new b92("iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3", map6);
                                        } else {
/* 672 */                                   b92Var2 = new b92("iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3", gs1Var.f8799g);
                                        }
                                    }
/* 675 */                           if (b92Var2 != null) {
/* 683 */                               ((ArrayList) yq2Var2.m10169a()).add(b92Var2);
                                    }
                                }
/* 691 */                       if (!yq2Var2.f19764i) {
/* 697 */                           if (uq2Var.f17671y) {
/* 699 */                               Context context2 = uq2Var.f17650d;
/* 701 */                               int i8 = mn0.f13881p;
/* 707 */                               context2.getClass();
/* 710 */                               String str16 = "network";
/* 716 */                               Object systemService = context2.getSystemService(FirebaseAnalytics.Param.LOCATION);
/* 727 */                               LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
                                        try {
/* 728 */                                   if (locationManager != null) {
                                                try {
/* 734 */                                           z4 = true;
/* 735 */                                           if (locationManager.isProviderEnabled("gps")) {
/* 712 */                                               str16 = "gps";
                                                    }
/* 777 */                                           str9 = str16;
/* 779 */                                           if (str9 != null || str9.length() <= 0 || locationManager == null) {
/* 794 */                                               lastKnownLocation = null;
                                                    } else {
/* 789 */                                               lastKnownLocation = locationManager.getLastKnownLocation(str9);
                                                    }
                                                } catch (SecurityException e3) {
/* 739 */                                           e = e3;
/* 808 */                                           k50.m5980q("mn0", "Exception occurred when retrieving location: %s", e.toString());
/* 794 */                                           lastKnownLocation = null;
/* 812 */                                           if (lastKnownLocation != null) {
/* 816 */                                               map = new HashMap();
/* 827 */                                               mn0.m6688d(map, "latitude", Double.valueOf(lastKnownLocation.getLatitude()));
/* 838 */                                               mn0.m6688d(map, "longitude", Double.valueOf(lastKnownLocation.getLongitude()));
/* 851 */                                               mn0.m6688d(map, "altitude", Double.valueOf(lastKnownLocation.getAltitude()));
/* 864 */                                               mn0.m6688d(map, "latitudeLongitudeAccuracy", Float.valueOf(lastKnownLocation.getAccuracy()));
/* 877 */                                               mn0.m6688d(map, "speed", Float.valueOf(lastKnownLocation.getSpeed()));
/* 890 */                                               mn0.m6688d(map, "bearing", Float.valueOf(lastKnownLocation.getBearing()));
/* 903 */                                               mn0.m6688d(map, "timestamp", Long.valueOf(System.currentTimeMillis()));
/* 906 */                                               strArr = new String[]{"latitude", "longitude"};
/* 910 */                                               i = 0;
                                                        while (true) {
/* 912 */                                                   if (i >= 2) {
/* 930 */                                                       b92Var = new b92("iglu:com.snowplowanalytics.snowplow/geolocation_context/jsonschema/1-1-0", map);
                                                            } else if (map.containsKey(strArr[i])) {
/* 923 */                                                       i++;
                                                            } else {
/* 934 */                                                       b92Var = null;
                                                            }
                                                        }
                                                    } else {
/* 934 */                                               b92Var = null;
                                                    }
/* 935 */                                           if (b92Var != null) {
/* 943 */                                               ((ArrayList) yq2Var2.m10169a()).add(b92Var);
                                                    }
/* 946 */                                           ur3Var = uq2Var.f17639B;
/* 948 */                                           if (ur3Var != null) {
/* 952 */                                               HashMap map7 = new HashMap();
                                                        switch (ur3Var.f17703a) {
                                                            case 1:
/* 978 */                                                       str8 = "CONSENT";
                                                                break;
                                                            case 2:
/* 975 */                                                       str8 = "CONTRACT";
                                                                break;
                                                            case 3:
/* 972 */                                                       str8 = "LEGAL_OBLIGATION";
                                                                break;
                                                            case 4:
/* 969 */                                                       str8 = "VITAL_INTERESTS";
                                                                break;
                                                            case 5:
/* 966 */                                                       str8 = "PUBLIC_TASK";
                                                                break;
                                                            case 6:
/* 963 */                                                       str8 = "LEGITIMATE_INTERESTS";
                                                                break;
                                                            default:
/* 962 */                                                       throw null;
                                                        }
/* 980 */                                               Locale locale = Locale.getDefault();
/* 984 */                                               locale.getClass();
/* 987 */                                               String lowerCase = str8.toLowerCase(locale);
/* 991 */                                               lowerCase.getClass();
/* 994 */                                               map7.put("basisForProcessing", lowerCase);
/* 1003 */                                              map7.put("documentId", (String) ur3Var.f17704b);
/* 1012 */                                              map7.put("documentVersion", (String) ur3Var.f17705c);
/* 1021 */                                              map7.put("documentDescription", (String) ur3Var.f17706d);
/* 1037 */                                              ((ArrayList) yq2Var2.m10169a()).add(new b92("iglu:com.snowplowanalytics.snowplow/gdpr/jsonschema/1-0-0", map7));
                                                    }
/* 1040 */                                          f31Var = uq2Var.f17651e;
                                                    synchronized (f31Var) {
                                                        try {
/* 1043 */                                                  str = yq2Var2.f19756a;
/* 1045 */                                                  if (str == null) {
/* 1047 */                                                      str = yq2Var2.f19757b;
                                                            }
/* 1055 */                                                  linkedList = new LinkedList();
/* 1060 */                                                  linkedList2 = new LinkedList();
/* 1071 */                                                  list = (List) ((HashMap) f31Var.f7986d).get(str);
/* 1073 */                                                  if (list != null) {
/* 1075 */                                                      linkedList2.addAll(list);
                                                            }
/* 1088 */                                                  list2 = (List) ((HashMap) f31Var.f7986d).get("*");
/* 1090 */                                                  if (list2 != null) {
/* 1092 */                                                      linkedList2.addAll(list2);
                                                            }
/* 1103 */                                                  for (q50 q50Var3 : linkedList2) {
/* 1119 */                                                      str7 = (String) ((HashMap) f31Var.f7984b).get(q50Var3);
/* 1121 */                                                      if (str7 == null) {
/* 1123 */                                                          fs0Var2 = yq2Var2.f19759d;
/* 1125 */                                                          if (fs0Var2 != null) {
/* 1143 */                                                              Intrinsics.m6220e("state");
/* 1146 */                                                              throw null;
                                                                    }
/* 1131 */                                                          listM7715a = q50Var3.m7715a(yq2Var2, fs0Var2.m3821r(str7));
/* 1135 */                                                          if (listM7715a != null) {
/* 1137 */                                                              linkedList.addAll(listM7715a);
                                                                    }
                                                                }
                                                            }
/* 1156 */                                                  for (b92 b92Var4 : linkedList) {
/* 1164 */                                                      b92Var4.getClass();
/* 1173 */                                                      ((ArrayList) yq2Var2.m10169a()).add(b92Var4);
                                                            }
/* 1177 */                                                  z = uq2Var.f17658l;
/* 1181 */                                                  if (yq2Var2.f19763h) {
/* 1187 */                                                      zq2Var.m10422c(yq2Var2.m10170b());
                                                            } else {
/* 1191 */                                                      str2 = yq2Var2.f19756a;
/* 1193 */                                                      if (str2 != null) {
/* 1202 */                                                          b92 b92Var5 = new b92(str2, yq2Var2.m10170b());
/* 1207 */                                                          HashMap map8 = new HashMap();
/* 1214 */                                                          map8.put("schema", "iglu:com.snowplowanalytics.snowplow/unstruct_event/jsonschema/1-0-0");
/* 1221 */                                                          map8.put(SharedDataContentProvider.BASE_PATH, b92Var5.f2330a);
/* 1228 */                                                          zq2Var.m10421b(map8, z, "ue_px", "ue_pr");
                                                                }
                                                            }
/* 1231 */                                                  z2 = uq2Var.f17658l;
/* 1243 */                                                  if (!((ArrayList) yq2Var2.m10169a()).isEmpty()) {
/* 1248 */                                                      linkedList4 = new LinkedList();
/* 1257 */                                                      it3 = ((ArrayList) yq2Var2.m10169a()).iterator();
/* 1265 */                                                      while (it3.hasNext()) {
/* 1275 */                                                          linkedList4.add(((b92) it3.next()).f2330a);
                                                                }
/* 1292 */                                                      zq2Var.m10421b(new b92("iglu:com.snowplowanalytics.snowplow/contexts/jsonschema/1-0-1", linkedList4).f2330a, z2, "cx", "co");
                                                            }
/* 1295 */                                                  f31Var2 = uq2Var.f17651e;
                                                            synchronized (f31Var2) {
                                                                try {
/* 1298 */                                                          str3 = yq2Var2.f19756a;
/* 1300 */                                                          if (str3 == null) {
/* 1302 */                                                              str3 = yq2Var2.f19757b;
                                                                    }
/* 1310 */                                                          linkedList3 = new LinkedList();
/* 1321 */                                                          list3 = (List) ((HashMap) f31Var2.f7989g).get(str3);
/* 1323 */                                                          if (list3 != null) {
/* 1325 */                                                              linkedList3.addAll(list3);
                                                                    }
/* 1338 */                                                          list4 = (List) ((HashMap) f31Var2.f7989g).get("*");
/* 1340 */                                                          if (list4 != null) {
/* 1342 */                                                              linkedList3.addAll(list4);
                                                                    }
/* 1345 */                                                          it = linkedList3.iterator();
                                                                    while (true) {
/* 1353 */                                                              if (it.hasNext()) {
/* 1359 */                                                                  q50Var = (q50) it.next();
/* 1369 */                                                                  str6 = (String) ((HashMap) f31Var2.f7984b).get(q50Var);
/* 1371 */                                                                  if (str6 == null) {
/* 1373 */                                                                      fs0Var = yq2Var2.f19759d;
/* 1375 */                                                                      if (fs0Var != null) {
/* 1432 */                                                                          Intrinsics.m6220e("state");
/* 1435 */                                                                          throw null;
                                                                                }
/* 1377 */                                                                      ng2VarM3821r = fs0Var.m3821r(str6);
                                                                                switch (q50Var.f15399a) {
                                                                                    case 0:
                                                                                    case 1:
                                                                                    case 2:
/* 1414 */                                                                              yq2Var2.getClass();
/* 1412 */                                                                              boolValueOf = null;
                                                                                        break;
                                                                                    default:
/* 1386 */                                                                              yq2Var2.getClass();
/* 1397 */                                                                              if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0")) {
/* 1399 */                                                                                  if (ng2VarM3821r != null) {
/* 1401 */                                                                                      z3 = true;
                                                                                            } else {
/* 1403 */                                                                                      z3 = false;
                                                                                            }
/* 1404 */                                                                                  boolValueOf = Boolean.valueOf(z3);
                                                                                        } else {
/* 1409 */                                                                                  boolValueOf = Boolean.FALSE;
                                                                                        }
                                                                                        break;
                                                                                }
/* 1424 */                                                                      if (Intrinsics.m6216a(boolValueOf, Boolean.FALSE)) {
/* 1427 */                                                                          zq2Var = null;
                                                                                }
                                                                            }
                                                                        } else if (!yq2Var2.f19763h) {
/* 1453 */                                                                  if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0")) {
/* 1461 */                                                                      obj = ((HashMap) yq2Var2.m10170b()).get("url");
/* 1467 */                                                                      if (obj instanceof String) {
/* 1469 */                                                                          str5 = (String) obj;
                                                                                } else {
/* 1472 */                                                                          str5 = null;
                                                                                }
/* 1479 */                                                                      obj2 = ((HashMap) yq2Var2.m10170b()).get("referrer");
/* 1485 */                                                                      if (obj2 instanceof String) {
/* 1487 */                                                                          str4 = (String) obj2;
                                                                                } else {
/* 1490 */                                                                          str4 = null;
                                                                                }
                                                                            } else {
/* 1500 */                                                                      if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0")) {
/* 1508 */                                                                          it2 = ((ArrayList) yq2Var2.m10169a()).iterator();
/* 1516 */                                                                          while (it2.hasNext()) {
/* 1526 */                                                                              if (!(((b92) it2.next()) instanceof o50)) {
/* 1529 */                                                                                  throw null;
                                                                                        }
                                                                                    }
                                                                                }
/* 1530 */                                                                      str4 = null;
/* 1531 */                                                                      str5 = null;
                                                                            }
/* 1532 */                                                                  if (str5 != null) {
/* 1538 */                                                                      zq2Var.m10420a("url", mn0.m6683G(str5));
                                                                            }
/* 1541 */                                                                  if (str4 != null) {
/* 1549 */                                                                      zq2Var.m10420a("refr", mn0.m6683G(str4));
                                                                            }
                                                                        }
                                                                    }
/* 1552 */                                                          if (zq2Var != null) {
/* 1562 */                                                              k50.m5958L("uq2", "Adding new payload to event storage: %s", zq2Var);
/* 1565 */                                                              jc0 jc0Var = uq2Var.f17655i;
/* 1567 */                                                              jc0Var.getClass();
/* 1580 */                                                              mf0.m6643a(jc0Var.f12183a, false, new RunnableC1784j8(21, jc0Var, zq2Var));
/* 1583 */                                                              abstractC1812k.getClass();
/* 1588 */                                                              uq2Var.f17651e.m3641b(yq2Var2);
/* 1591 */                                                              unit = Unit.f12910a;
                                                                    } else {
/* 1594 */                                                              unit = null;
                                                                    }
/* 1595 */                                                          if (unit == null) {
/* 1607 */                                                              k50.m5968e("uq2", "Event not tracked due to filtering: %s", yq2Var2.f19761f);
/* 1610 */                                                              abstractC1812k.getClass();
                                                                    }
/* 1613 */                                                          i2 = 0;
                                                                } catch (Throwable th3) {
/* 1617 */                                                          throw th3;
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
/* 1619 */                                                  throw th4;
                                                        }
                                                    }
                                                }
/* 812 */                                       if (lastKnownLocation != null) {
/* 816 */                                           map = new HashMap();
/* 827 */                                           mn0.m6688d(map, "latitude", Double.valueOf(lastKnownLocation.getLatitude()));
/* 838 */                                           mn0.m6688d(map, "longitude", Double.valueOf(lastKnownLocation.getLongitude()));
/* 851 */                                           mn0.m6688d(map, "altitude", Double.valueOf(lastKnownLocation.getAltitude()));
/* 864 */                                           mn0.m6688d(map, "latitudeLongitudeAccuracy", Float.valueOf(lastKnownLocation.getAccuracy()));
/* 877 */                                           mn0.m6688d(map, "speed", Float.valueOf(lastKnownLocation.getSpeed()));
/* 890 */                                           mn0.m6688d(map, "bearing", Float.valueOf(lastKnownLocation.getBearing()));
/* 903 */                                           mn0.m6688d(map, "timestamp", Long.valueOf(System.currentTimeMillis()));
/* 906 */                                           strArr = new String[]{"latitude", "longitude"};
/* 910 */                                           i = 0;
                                                    while (true) {
/* 912 */                                               if (i >= 2) {
/* 930 */                                                   b92Var = new b92("iglu:com.snowplowanalytics.snowplow/geolocation_context/jsonschema/1-1-0", map);
                                                        } else if (map.containsKey(strArr[i])) {
/* 934 */                                                   b92Var = null;
                                                        } else {
/* 923 */                                                   i++;
                                                        }
                                                    }
                                                } else {
/* 934 */                                           b92Var = null;
                                                }
/* 935 */                                       if (b92Var != null) {
/* 943 */                                           ((ArrayList) yq2Var2.m10169a()).add(b92Var);
                                                }
                                            } else {
/* 742 */                                       z4 = true;
                                            }
/* 777 */                                   str9 = str16;
/* 779 */                                   if (str9 != null) {
/* 794 */                                       lastKnownLocation = null;
                                            } else {
/* 794 */                                       lastKnownLocation = null;
                                            }
                                        } catch (SecurityException e4) {
/* 752 */                                   e = e4;
/* 808 */                                   k50.m5980q("mn0", "Exception occurred when retrieving location: %s", e.toString());
                                        }
/* 743 */                               if (locationManager == null || locationManager.isProviderEnabled("network") != z4) {
/* 761 */                                   List<String> providers = locationManager != null ? locationManager.getProviders(z4) : null;
/* 776 */                                   str16 = (providers == null || providers.size() <= 0) ? null : providers.get(0);
                                        }
/* 812 */                               if (lastKnownLocation != null) {
/* 816 */                                   map = new HashMap();
/* 827 */                                   mn0.m6688d(map, "latitude", Double.valueOf(lastKnownLocation.getLatitude()));
/* 838 */                                   mn0.m6688d(map, "longitude", Double.valueOf(lastKnownLocation.getLongitude()));
/* 851 */                                   mn0.m6688d(map, "altitude", Double.valueOf(lastKnownLocation.getAltitude()));
/* 864 */                                   mn0.m6688d(map, "latitudeLongitudeAccuracy", Float.valueOf(lastKnownLocation.getAccuracy()));
/* 877 */                                   mn0.m6688d(map, "speed", Float.valueOf(lastKnownLocation.getSpeed()));
/* 890 */                                   mn0.m6688d(map, "bearing", Float.valueOf(lastKnownLocation.getBearing()));
/* 903 */                                   mn0.m6688d(map, "timestamp", Long.valueOf(System.currentTimeMillis()));
/* 906 */                                   strArr = new String[]{"latitude", "longitude"};
/* 910 */                                   i = 0;
                                            while (true) {
/* 912 */                                       if (i >= 2) {
/* 930 */                                           b92Var = new b92("iglu:com.snowplowanalytics.snowplow/geolocation_context/jsonschema/1-1-0", map);
                                                } else if (map.containsKey(strArr[i])) {
/* 934 */                                           b92Var = null;
                                                } else {
/* 923 */                                           i++;
                                                }
                                            }
                                        } else {
/* 934 */                                   b92Var = null;
                                        }
/* 935 */                               if (b92Var != null) {
/* 943 */                                   ((ArrayList) yq2Var2.m10169a()).add(b92Var);
                                        }
                                    }
/* 946 */                           ur3Var = uq2Var.f17639B;
/* 948 */                           if (ur3Var != null) {
/* 952 */                               HashMap map9 = new HashMap();
                                        switch (ur3Var.f17703a) {
                                            case 1:
/* 978 */                                       str8 = "CONSENT";
                                                break;
                                            case 2:
/* 975 */                                       str8 = "CONTRACT";
                                                break;
                                            case 3:
/* 972 */                                       str8 = "LEGAL_OBLIGATION";
                                                break;
                                            case 4:
/* 969 */                                       str8 = "VITAL_INTERESTS";
                                                break;
                                            case 5:
/* 966 */                                       str8 = "PUBLIC_TASK";
                                                break;
                                            case 6:
/* 963 */                                       str8 = "LEGITIMATE_INTERESTS";
                                                break;
                                            default:
/* 962 */                                       throw null;
                                        }
/* 980 */                               Locale locale2 = Locale.getDefault();
/* 984 */                               locale2.getClass();
/* 987 */                               String lowerCase2 = str8.toLowerCase(locale2);
/* 991 */                               lowerCase2.getClass();
/* 994 */                               map9.put("basisForProcessing", lowerCase2);
/* 1003 */                              map9.put("documentId", (String) ur3Var.f17704b);
/* 1012 */                              map9.put("documentVersion", (String) ur3Var.f17705c);
/* 1021 */                              map9.put("documentDescription", (String) ur3Var.f17706d);
/* 1037 */                              ((ArrayList) yq2Var2.m10169a()).add(new b92("iglu:com.snowplowanalytics.snowplow/gdpr/jsonschema/1-0-0", map9));
                                    }
                                }
/* 1040 */                      f31Var = uq2Var.f17651e;
                                synchronized (f31Var) {
/* 1043 */                          str = yq2Var2.f19756a;
/* 1045 */                          if (str == null) {
/* 1047 */                              str = yq2Var2.f19757b;
                                    }
/* 1055 */                          linkedList = new LinkedList();
/* 1060 */                          linkedList2 = new LinkedList();
/* 1071 */                          list = (List) ((HashMap) f31Var.f7986d).get(str);
/* 1073 */                          if (list != null) {
/* 1075 */                              linkedList2.addAll(list);
                                    }
/* 1088 */                          list2 = (List) ((HashMap) f31Var.f7986d).get("*");
/* 1090 */                          if (list2 != null) {
/* 1092 */                              linkedList2.addAll(list2);
                                    }
/* 1103 */                          while (r0.hasNext()) {
/* 1119 */                              str7 = (String) ((HashMap) f31Var.f7984b).get(q50Var3);
/* 1121 */                              if (str7 == null) {
/* 1123 */                                  fs0Var2 = yq2Var2.f19759d;
/* 1125 */                                  if (fs0Var2 != null) {
/* 1143 */                                      Intrinsics.m6220e("state");
/* 1146 */                                      throw null;
                                            }
/* 1131 */                                  listM7715a = q50Var3.m7715a(yq2Var2, fs0Var2.m3821r(str7));
/* 1135 */                                  if (listM7715a != null) {
/* 1137 */                                      linkedList.addAll(listM7715a);
                                            }
                                        }
                                    }
                                }
/* 1156 */                      while (r0.hasNext()) {
/* 1164 */                          b92Var4.getClass();
/* 1173 */                          ((ArrayList) yq2Var2.m10169a()).add(b92Var4);
                                }
/* 1177 */                      z = uq2Var.f17658l;
/* 1181 */                      if (yq2Var2.f19763h) {
/* 1187 */                          zq2Var.m10422c(yq2Var2.m10170b());
                                } else {
/* 1191 */                          str2 = yq2Var2.f19756a;
/* 1193 */                          if (str2 != null) {
/* 1202 */                              b92 b92Var6 = new b92(str2, yq2Var2.m10170b());
/* 1207 */                              HashMap map10 = new HashMap();
/* 1214 */                              map10.put("schema", "iglu:com.snowplowanalytics.snowplow/unstruct_event/jsonschema/1-0-0");
/* 1221 */                              map10.put(SharedDataContentProvider.BASE_PATH, b92Var6.f2330a);
/* 1228 */                              zq2Var.m10421b(map10, z, "ue_px", "ue_pr");
                                    }
                                }
/* 1231 */                      z2 = uq2Var.f17658l;
/* 1243 */                      if (!((ArrayList) yq2Var2.m10169a()).isEmpty()) {
/* 1248 */                          linkedList4 = new LinkedList();
/* 1257 */                          it3 = ((ArrayList) yq2Var2.m10169a()).iterator();
/* 1265 */                          while (it3.hasNext()) {
/* 1275 */                              linkedList4.add(((b92) it3.next()).f2330a);
                                    }
/* 1292 */                          zq2Var.m10421b(new b92("iglu:com.snowplowanalytics.snowplow/contexts/jsonschema/1-0-1", linkedList4).f2330a, z2, "cx", "co");
                                }
/* 1295 */                      f31Var2 = uq2Var.f17651e;
                                synchronized (f31Var2) {
/* 1298 */                          str3 = yq2Var2.f19756a;
/* 1300 */                          if (str3 == null) {
/* 1302 */                              str3 = yq2Var2.f19757b;
                                    }
/* 1310 */                          linkedList3 = new LinkedList();
/* 1321 */                          list3 = (List) ((HashMap) f31Var2.f7989g).get(str3);
/* 1323 */                          if (list3 != null) {
/* 1325 */                              linkedList3.addAll(list3);
                                    }
/* 1338 */                          list4 = (List) ((HashMap) f31Var2.f7989g).get("*");
/* 1340 */                          if (list4 != null) {
/* 1342 */                              linkedList3.addAll(list4);
                                    }
/* 1345 */                          it = linkedList3.iterator();
                                    while (true) {
/* 1353 */                              if (it.hasNext()) {
/* 1359 */                                  q50Var = (q50) it.next();
/* 1369 */                                  str6 = (String) ((HashMap) f31Var2.f7984b).get(q50Var);
/* 1371 */                                  if (str6 == null) {
/* 1373 */                                      fs0Var = yq2Var2.f19759d;
/* 1375 */                                      if (fs0Var != null) {
/* 1432 */                                          Intrinsics.m6220e("state");
/* 1435 */                                          throw null;
                                                }
/* 1377 */                                      ng2VarM3821r = fs0Var.m3821r(str6);
                                                switch (q50Var.f15399a) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
/* 1414 */                                              yq2Var2.getClass();
/* 1412 */                                              boolValueOf = null;
                                                        break;
                                                    default:
/* 1386 */                                              yq2Var2.getClass();
/* 1397 */                                              if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0")) {
/* 1399 */                                                  if (ng2VarM3821r != null) {
/* 1401 */                                                      z3 = true;
                                                            } else {
/* 1403 */                                                      z3 = false;
                                                            }
/* 1404 */                                                  boolValueOf = Boolean.valueOf(z3);
                                                        } else {
/* 1409 */                                                  boolValueOf = Boolean.FALSE;
                                                        }
                                                        break;
                                                }
/* 1424 */                                      if (Intrinsics.m6216a(boolValueOf, Boolean.FALSE)) {
/* 1427 */                                          zq2Var = null;
                                                }
                                            }
                                        } else if (!yq2Var2.f19763h) {
/* 1453 */                                  if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0")) {
/* 1461 */                                      obj = ((HashMap) yq2Var2.m10170b()).get("url");
/* 1467 */                                      if (obj instanceof String) {
/* 1469 */                                          str5 = (String) obj;
                                                } else {
/* 1472 */                                          str5 = null;
                                                }
/* 1479 */                                      obj2 = ((HashMap) yq2Var2.m10170b()).get("referrer");
/* 1485 */                                      if (obj2 instanceof String) {
/* 1487 */                                          str4 = (String) obj2;
                                                } else {
/* 1490 */                                          str4 = null;
                                                }
                                            } else {
/* 1500 */                                      if (Intrinsics.m6216a(yq2Var2.f19756a, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0")) {
/* 1508 */                                          it2 = ((ArrayList) yq2Var2.m10169a()).iterator();
/* 1516 */                                          while (it2.hasNext()) {
/* 1526 */                                              if (!(((b92) it2.next()) instanceof o50)) {
/* 1529 */                                                  throw null;
                                                        }
                                                    }
                                                }
/* 1530 */                                      str4 = null;
/* 1531 */                                      str5 = null;
                                            }
/* 1532 */                                  if (str5 != null) {
/* 1538 */                                      zq2Var.m10420a("url", mn0.m6683G(str5));
                                            }
/* 1541 */                                  if (str4 != null) {
/* 1549 */                                      zq2Var.m10420a("refr", mn0.m6683G(str4));
                                            }
                                        }
                                    }
                                }
/* 1552 */                      if (zq2Var != null) {
/* 1562 */                          k50.m5958L("uq2", "Adding new payload to event storage: %s", zq2Var);
/* 1565 */                          jc0 jc0Var2 = uq2Var.f17655i;
/* 1567 */                          jc0Var2.getClass();
/* 1580 */                          mf0.m6643a(jc0Var2.f12183a, false, new RunnableC1784j8(21, jc0Var2, zq2Var));
/* 1583 */                          abstractC1812k.getClass();
/* 1588 */                          uq2Var.f17651e.m3641b(yq2Var2);
/* 1591 */                          unit = Unit.f12910a;
                                } else {
/* 1594 */                          unit = null;
                                }
/* 1595 */                      if (unit == null) {
/* 1607 */                          k50.m5968e("uq2", "Event not tracked due to filtering: %s", yq2Var2.f19761f);
/* 1610 */                          abstractC1812k.getClass();
                                }
/* 1613 */                      i2 = 0;
                            }
/* 1622 */                  return;
                        case 16:
/* 1 */                     UsercentricsInitializer.create$lambda$1((Context) this.f12315b, (UsercentricsOptions) this.f12316c);
/* 131 */                   return;
                        case 17:
/* 116 */                   m5830a();
/* 119 */                   return;
                        case 18:
/* 112 */                   ((InterfaceC1457g1) this.f12316c).mo4713a(((C1460g4) this.f12315b).mo5092l().getShutdownTimeoutMillis());
/* 115 */                   return;
                        case 19:
/* 92 */                    ActivityLifecycleIntegration.m4743f((InterfaceC1525k1) this.f12315b, (InterfaceC1525k1) this.f12316c);
/* 95 */                    return;
                        case 20:
/* 80 */                    m5831b();
/* 83 */                    return;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 76 */                    ((C1191g0) this.f12315b).m4789f((ILogger) this.f12316c);
/* 79 */                    return;
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 64 */                    m5832c();
/* 67 */                    return;
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 60 */                    m5833d();
/* 63 */                    return;
                        case 24:
/* 56 */                    m5834e();
/* 59 */                    return;
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 52 */                    m5835f();
/* 55 */                    return;
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 48 */                    m5836g();
/* 51 */                    return;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 44 */                    m5837h();
/* 47 */                    return;
                        case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 40 */                    m5838i();
/* 43 */                    return;
                        default:
/* 13 */                    C1291b c1291b = (C1291b) this.f12315b;
/* 17 */                    C1383b7 c1383b7 = (C1383b7) this.f12316c;
/* 19 */                    NativeScope nativeScope = c1291b.f10406b;
/* 23 */                    String strM5380a = c1383b7.f10755a.m5380a();
/* 29 */                    String strM5198a = c1383b7.f10756b.m5198a();
/* 33 */                    nativeScope.getClass();
/* 36 */                    NativeScope.nativeSetTrace(strM5380a, strM5198a);
/* 39 */                    return;
                    }
                }

/* 12 */        public /* synthetic */ ji1(int i, Object obj, Object obj2) {
/* 13 */            this.f12314a = i;
                    this.f12315b = obj;
                    this.f12316c = obj2;
                }
            }
