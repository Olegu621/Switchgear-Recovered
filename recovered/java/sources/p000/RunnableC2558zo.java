            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Insets;
            import android.hardware.camera2.CameraCaptureSession;
            import android.os.Build;
            import android.view.DisplayCutout;
            import android.view.Surface;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowInsets;
            import android.webkit.CookieManager;
            import android.webkit.WebView;
            import androidx.fragment.app.C0090c;
            import androidx.fragment.app.C0091c0;
            import androidx.fragment.app.C0095g;
            import androidx.fragment.app.Fragment;
            import com.appsflyer.internal.AFa1ySDK;
            import com.appsflyer.internal.AFd1wSDK;
            import com.appsflyer.internal.AFi1aSDK;
            import com.appsflyer.internal.AFj1sSDK;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.firebase.messaging.EnhancedIntentService;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.TitanWebView;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1380b4;
            import io.sentry.C1383b7;
            import io.sentry.C1430d7;
            import io.sentry.C1671t3;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.ndk.C1291b;
            import io.sentry.cache.AbstractC1396a;
            import io.sentry.cache.C1401f;
            import io.sentry.ndk.NativeScope;
            import io.sentry.protocol.C1626w;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.logging.Logger;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: zo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final /* synthetic */ class RunnableC2558zo implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20276a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f20277b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f20278c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f20279d;

                public /* synthetic */ RunnableC2558zo(x60 x60Var, mb0 mb0Var, C2260um c2260um) {
/* 2 */             this.f20276a = 4;
/* 4 */             Map map = Collections.EMPTY_MAP;
/* 9 */             this.f20277b = x60Var;
/* 11 */            this.f20278c = mb0Var;
/* 13 */            this.f20279d = c2260um;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             int i = 1;
                    switch (this.f20276a) {
                        case 0:
/* 705 */                   ((C0151ap) this.f20277b).f2048a.onSurfacePrepared((CameraCaptureSession) this.f20278c, (Surface) this.f20279d);
/* 708 */                   return;
                        case 1:
/* 597 */                   n60 n60Var = (n60) this.f20277b;
/* 601 */                   C2497yg c2497yg = (C2497yg) this.f20278c;
/* 603 */                   String str = c2497yg.f19600a;
/* 607 */                   C2142rf c2142rf = (C2142rf) this.f20279d;
/* 609 */                   n60Var.getClass();
/* 612 */                   Logger logger = n60.f14138f;
                            try {
/* 618 */                       vr2 vr2VarM3446a = n60Var.f14141c.m3446a(str);
/* 622 */                       if (vr2VarM3446a == null) {
/* 637 */                           String str2 = "Transport backend '" + str + "' is not registered";
/* 641 */                           logger.warning(str2);
/* 646 */                           new IllegalArgumentException(str2);
                                } else {
/* 665 */                           n60Var.f14143e.m8408k(new C2080pr(i, n60Var, c2497yg, ((C0154as) vr2VarM3446a).m1152a(c2142rf)));
                                }
/* 690 */                       return;
                            } catch (Exception e) {
/* 687 */                       logger.warning("Error scheduling event " + e.getMessage());
/* 690 */                       return;
                            }
                        case 2:
/* 571 */                   ViewGroup viewGroup = (ViewGroup) this.f20277b;
/* 575 */                   View view = (View) this.f20278c;
/* 579 */                   C0090c c0090c = (C0090c) this.f20279d;
/* 581 */                   viewGroup.getClass();
/* 584 */                   viewGroup.endViewTransition(view);
/* 591 */                   c0090c.f1407c.f1425a.m645c(c0090c);
/* 594 */                   return;
                        case 3:
/* 535 */                   C0091c0 c0091c0 = (C0091c0) this.f20277b;
/* 539 */                   C0091c0 c0091c1 = (C0091c0) this.f20278c;
/* 543 */                   C0095g c0095g = (C0095g) this.f20279d;
/* 545 */                   Fragment fragment = c0091c0.f1410c;
/* 547 */                   Fragment fragment2 = c0091c1.f1410c;
/* 549 */                   boolean z = c0095g.f1438o;
/* 551 */                   jn0 jn0Var = en0.f7805a;
/* 553 */                   fragment.getClass();
/* 556 */                   fragment2.getClass();
/* 559 */                   if (z) {
/* 561 */                       fragment2.getEnterTransitionCallback();
/* 568 */                       return;
                            } else {
/* 565 */                       fragment.getEnterTransitionCallback();
/* 568 */                       return;
                            }
                        case 4:
/* 507 */                   x60 x60Var = (x60) this.f20277b;
/* 511 */                   mb0 mb0Var = (mb0) this.f20278c;
/* 513 */                   Map map = Collections.EMPTY_MAP;
/* 517 */                   C2260um c2260um = (C2260um) this.f20279d;
                            try {
/* 521 */                       x60Var.f18962a.mo143e(mb0Var);
/* 524 */                       c2260um.m9040a(null);
/* 532 */                       return;
                            } catch (RuntimeException e2) {
/* 529 */                       c2260um.m9041b(e2);
/* 532 */                       return;
                            }
                        case 5:
/* 483 */                   x60 x60Var2 = (x60) this.f20277b;
/* 487 */                   Runnable runnable = (Runnable) this.f20278c;
/* 491 */                   Runnable runnable2 = (Runnable) this.f20279d;
/* 495 */                   if (x60Var2.f18971j) {
/* 497 */                       runnable.run();
/* 504 */                       return;
                            } else {
/* 501 */                       runnable2.run();
/* 504 */                       return;
                            }
                        case 6:
/* 455 */                   cb0 cb0Var = (cb0) this.f20277b;
/* 459 */                   mb0 mb0Var2 = (mb0) this.f20278c;
/* 461 */                   Map map2 = Collections.EMPTY_MAP;
/* 465 */                   C2260um c2260um2 = (C2260um) this.f20279d;
                            try {
/* 469 */                       cb0Var.f2806a.mo143e(mb0Var2);
/* 472 */                       c2260um2.m9040a(null);
/* 480 */                       return;
                            } catch (RuntimeException e3) {
/* 477 */                       c2260um2.m9041b(e3);
/* 480 */                       return;
                            }
                        case 7:
/* 431 */                   cb0 cb0Var2 = (cb0) this.f20277b;
/* 435 */                   Runnable runnable3 = (Runnable) this.f20278c;
/* 439 */                   Runnable runnable4 = (Runnable) this.f20279d;
/* 443 */                   if (cb0Var2.f2811f) {
/* 445 */                       runnable3.run();
/* 452 */                       return;
                            } else {
/* 449 */                       runnable4.run();
/* 452 */                       return;
                            }
                        case 8:
/* 366 */                   C2214td c2214td = (C2214td) this.f20277b;
/* 370 */                   k50 k50Var = (k50) this.f20278c;
/* 374 */                   ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f20279d;
                            try {
/* 378 */                       ml0 ml0VarM7424c = pg3.m7424c(c2214td.f17045a);
/* 382 */                       if (ml0VarM7424c == null) {
/* 421 */                           throw new RuntimeException("EmojiCompat font provider not available on this device.");
                                }
/* 388 */                       ll0 ll0Var = (ll0) ((rc0) ml0VarM7424c.f15061b);
                                synchronized (ll0Var.f13377d) {
/* 393 */                           ll0Var.f13379f = threadPoolExecutor;
                                    break;
                                }
/* 405 */                       ((rc0) ml0VarM7424c.f15061b).mo6481a(new uc0(k50Var, threadPoolExecutor));
/* 428 */                       return;
                            } catch (Throwable th) {
/* 422 */                       k50Var.mo5990C(th);
/* 425 */                       threadPoolExecutor.shutdown();
/* 428 */                       return;
                            }
                        case 9:
/* 340 */                   EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f20277b;
/* 344 */                   Intent intent = (Intent) this.f20278c;
/* 348 */                   TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f20279d;
/* 350 */                   int i2 = EnhancedIntentService.f5293a;
                            try {
/* 352 */                       enhancedIntentService.handleIntent(intent);
/* 358 */                       return;
                            } finally {
/* 360 */                       taskCompletionSource.setResult(null);
                            }
                        case 10:
/* 252 */                   GameApp gameApp = (GameApp) this.f20277b;
/* 256 */                   WindowInsets windowInsets = (WindowInsets) this.f20278c;
/* 260 */                   DisplayCutout displayCutout = (DisplayCutout) this.f20279d;
/* 262 */                   GameApp gameApp2 = GameApp.f5745x0;
/* 268 */                   if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                         Insets insets = windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout());
/* 287 */                       gameApp.f5748U = insets.bottom;
/* 293 */                       gameApp.f5784w = insets.top;
/* 299 */                       gameApp.f5768i = insets.left;
/* 305 */                       gameApp.f5782v = insets.right;
                            } else if (displayCutout != null) {
/* 314 */                       gameApp.f5748U = displayCutout.getSafeInsetBottom();
/* 320 */                       gameApp.f5784w = displayCutout.getSafeInsetTop();
/* 326 */                       gameApp.f5768i = displayCutout.getSafeInsetLeft();
/* 332 */                       gameApp.f5782v = displayCutout.getSafeInsetRight();
                            }
/* 334 */                   gameApp.setScaledSafeMargins();
/* 337 */                   return;
                        case 11:
/* 229 */                   zr3 zr3Var = (zr3) this.f20277b;
/* 233 */                   C0997hn c0997hn = (C0997hn) this.f20278c;
/* 237 */                   s81 s81Var = (s81) this.f20279d;
/* 239 */                   Objects.toString(c0997hn);
/* 246 */                   ((List) zr3Var.f20312c).remove(s81Var);
/* 249 */                   return;
                        case 12:
/* 223 */                   ((ac1) this.f20277b).m177f((lj2) this.f20278c, (Map.Entry) this.f20279d);
/* 226 */                   return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 167 */                   TitanWebView titanWebView = (TitanWebView) this.f20277b;
/* 171 */                   String[] strArr = (String[]) this.f20278c;
/* 175 */                   String str3 = (String) this.f20279d;
/* 177 */                   WebView webView = titanWebView.f5959o;
/* 179 */                   if (webView != null && strArr.length > 0) {
/* 185 */                       CookieManager cookieManager = CookieManager.getInstance();
/* 189 */                       cookieManager.setAcceptCookie(true);
/* 192 */                       cookieManager.setAcceptThirdPartyCookies(webView, true);
/* 197 */                       for (String str4 : strArr) {
/* 201 */                           cookieManager.setCookie(str3, str4);
                                }
/* 207 */                       cookieManager.flush();
/* 210 */                       return;
                            }
/* 210 */                   return;
                        case 14:
/* 146 */                   TitanWebView titanWebView2 = (TitanWebView) this.f20277b;
/* 150 */                   WebView webView2 = (WebView) this.f20278c;
/* 154 */                   String str5 = (String) this.f20279d;
/* 156 */                   webView2.stopLoading();
/* 161 */                   titanWebView2.onReceivedError(str5, "Connection timed out");
/* 164 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 140 */                   ((TitanWebView.TitanWebViewClient) this.f20277b).f5973a.onReceivedError((String) this.f20278c, (String) this.f20279d);
/* 143 */                   return;
                        case 16:
/* 1 */                     ((AFa1ySDK) this.f20277b).m1765e_((Context) this.f20278c, (Intent) this.f20279d);
/* 125 */                   return;
                        case 17:
/* 1 */                     AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.f20277b, (Throwable) this.f20278c, (String) this.f20279d);
/* 109 */                   return;
                        case 18:
/* 1 */                     ((AFj1sSDK) this.f20277b).getCurrencyIso4217Code((AFi1aSDK) this.f20278c, (Runnable) this.f20279d);
/* 93 */                    return;
                        case 19:
/* 59 */                    C1291b c1291b = (C1291b) this.f20277b;
/* 63 */                    byte[] bArr = (byte[]) this.f20278c;
/* 67 */                    String str6 = (String) this.f20279d;
/* 71 */                    c1291b.f10406b.getClass();
/* 74 */                    NativeScope.nativeAddAttachmentBytes(bArr, str6);
/* 77 */                    return;
                        default:
/* 14 */                    SentryAndroidOptions sentryAndroidOptions = ((C1401f) this.f20277b).f10809a;
/* 18 */                    C1383b7 c1383b7 = (C1383b7) this.f20278c;
/* 22 */                    C1380b4 c1380b4 = (C1380b4) this.f20279d;
/* 26 */                    if (c1383b7 != null) {
/* 53 */                        AbstractC1396a.m5116d(sentryAndroidOptions, c1383b7, ".scope-cache", "trace.json");
/* 56 */                        return;
                            }
/* 28 */                    C1671t3 c1671t3 = c1380b4.f10735s;
/* 42 */                    C1383b7 c1383b8 = new C1383b7((C1626w) c1671t3.f11668b, (C1430d7) c1671t3.f11669c, "default", null);
/* 47 */                    c1383b8.f10763w = "auto";
/* 49 */                    AbstractC1396a.m5116d(sentryAndroidOptions, c1383b8, ".scope-cache", "trace.json");
/* 56 */                    return;
                    }
                }

/* 15 */        public /* synthetic */ RunnableC2558zo(n60 n60Var, C2497yg c2497yg, f42 f42Var, C2142rf c2142rf) {
/* 16 */            this.f20276a = 1;
                    this.f20277b = n60Var;
                    this.f20278c = c2497yg;
                    this.f20279d = c2142rf;
                }

/* 16 */        public /* synthetic */ RunnableC2558zo(int i, Object obj, Object obj2, Object obj3) {
/* 17 */            this.f20276a = i;
                    this.f20277b = obj;
                    this.f20278c = obj2;
                    this.f20279d = obj3;
                }

/* 17 */        public /* synthetic */ RunnableC2558zo(cb0 cb0Var, mb0 mb0Var, C2260um c2260um) {
/* 18 */            this.f20276a = 6;
                    Map map = Collections.EMPTY_MAP;
                    this.f20277b = cb0Var;
                    this.f20278c = mb0Var;
                    this.f20279d = c2260um;
                }
            }
