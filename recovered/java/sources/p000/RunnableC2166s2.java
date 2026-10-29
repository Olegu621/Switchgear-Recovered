            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.graphics.Typeface;
            import android.hardware.camera2.CameraDevice;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Trace;
            import androidx.activity.ComponentActivity;
            import androidx.activity.ViewTreeObserverOnDrawListenerC0059b;
            import androidx.fragment.app.Fragment;
            import androidx.lifecycle.ProcessLifecycleOwner;
            import com.google.firebase.installations.FirebaseInstallations;
            import com.supercell.titan.C0803j;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.flutter.plugin.platform.PlatformViewsController;
            import java.lang.reflect.Method;
            import java.nio.MappedByteBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: s2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2166s2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16385a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16386b;

                public /* synthetic */ RunnableC2166s2(Object obj, int i) {
/* 1 */             this.f16385a = i;
/* 3 */             this.f16386b = obj;
                }

                /* JADX INFO: renamed from: a */
                private final void m8362a() {
/* 3 */             ll0 ll0Var = (ll0) this.f16386b;
                    synchronized (ll0Var.f13377d) {
                        try {
/* 12 */                    if (ll0Var.f13381h == null) {
/* 15 */                        return;
                            }
                            try {
/* 20 */                        vl0 vl0VarM6483c = ll0Var.m6483c();
/* 24 */                        int i = vl0VarM6483c.f18241e;
/* 27 */                        if (i == 2) {
                                    synchronized (ll0Var.f13377d) {
                                    }
                                }
/* 40 */                        if (i != 0) {
/* 163 */                           throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                }
                                try {
/* 44 */                            int i2 = oq2.f14866a;
/* 46 */                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
/* 49 */                            zb0 zb0Var = ll0Var.f13376c;
/* 51 */                            Context context = ll0Var.f13374a;
/* 53 */                            zb0Var.getClass();
/* 63 */                            Typeface typefaceMo4356Q = ks2.f12997a.mo4356Q(context, new vl0[]{vl0VarM6483c}, 0);
/* 71 */                            MappedByteBuffer mappedByteBufferM7611r0 = py0.m7611r0(ll0Var.f13374a, vl0VarM6483c.f18237a);
/* 75 */                            if (mappedByteBufferM7611r0 == null || typefaceMo4356Q == null) {
/* 133 */                               throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
/* 81 */                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
/* 90 */                                ra2 ra2Var = new ra2(typefaceMo4356Q, k50.m5953G(mappedByteBufferM7611r0));
/* 93 */                                Trace.endSection();
/* 96 */                                Trace.endSection();
                                        synchronized (ll0Var.f13377d) {
                                            try {
/* 102 */                                       k50 k50Var = ll0Var.f13381h;
/* 104 */                                       if (k50Var != null) {
/* 106 */                                           k50Var.mo5991D(ra2Var);
                                                }
                                            } catch (Throwable th) {
/* 118 */                                       throw th;
                                            }
                                        }
/* 113 */                               ll0Var.m6482b();
                                    } catch (Throwable th2) {
/* 120 */                               int i3 = oq2.f14866a;
/* 122 */                               Trace.endSection();
/* 125 */                               throw th2;
                                    }
                                } catch (Throwable th3) {
/* 135 */                           int i4 = oq2.f14866a;
/* 137 */                           Trace.endSection();
/* 140 */                           throw th3;
                                }
                            } catch (Throwable th4) {
                                synchronized (ll0Var.f13377d) {
                                    try {
/* 167 */                               k50 k50Var2 = ll0Var.f13381h;
/* 169 */                               if (k50Var2 != null) {
/* 171 */                                   k50Var2.mo5990C(th4);
                                        }
/* 178 */                               ll0Var.m6482b();
                                    } catch (Throwable th5) {
/* 183 */                               throw th5;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
/* 185 */                   throw th6;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v7 */
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    ?? r5;
                    Application application;
/* 7 */             Application application2 = null;
/* 9 */             boolean z = true;
                    switch (this.f16385a) {
                        case 0:
/* 578 */                   Activity activity = (Activity) this.f16386b;
/* 584 */                   if (activity.isFinishing()) {
/* 735 */                       return;
                            }
/* 586 */                   Handler handler = AbstractC0166b3.f2191g;
/* 588 */                   Method method = AbstractC0166b3.f2190f;
/* 590 */                   int i = Build.VERSION.SDK_INT;
/* 594 */                   if (i >= 28) {
/* 596 */                       activity.recreate();
/* 735 */                       return;
                            }
/* 601 */                   C0005a3 c0005a3 = 27;
/* 605 */                   if (((i != 26 && i != 27) || method != null) && (AbstractC0166b3.f2189e != null || AbstractC0166b3.f2188d != null)) {
                                try {
/* 625 */                           Object obj2 = AbstractC0166b3.f2187c.get(activity);
/* 629 */                           if (obj2 != null && (obj = AbstractC0166b3.f2186b.get(activity)) != null) {
/* 643 */                               application2 = activity.getApplication();
/* 649 */                               c0005a3 = new C0005a3(activity);
/* 652 */                               application2.registerActivityLifecycleCallbacks(c0005a3);
/* 661 */                               handler.post(new cp0(2, c0005a3, obj2));
/* 664 */                               if (i != 26 && i != 27) {
/* 669 */                                   z = false;
                                        }
                                        try {
/* 670 */                                   if (z) {
                                                try {
/* 676 */                                           i = 2;
                                                    try {
/* 677 */                                               Boolean bool = Boolean.FALSE;
/* 693 */                                               method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } catch (Throwable th) {
/* 699 */                                               th = th;
/* 700 */                                               application = application2;
/* 701 */                                               r5 = c0005a3;
/* 728 */                                               handler.post(new dp0(i, application, r5));
/* 731 */                                               throw th;
                                                    }
                                                } catch (Throwable th2) {
/* 703 */                                           th = th2;
/* 704 */                                           application = application2;
/* 705 */                                           r5 = c0005a3;
/* 706 */                                           i = 2;
                                                }
                                            } else {
/* 710 */                                       i = 2;
/* 711 */                                       activity.recreate();
                                            }
/* 719 */                                   handler.post(new dp0(i, application2, c0005a3));
/* 735 */                                   return;
                                        } catch (Throwable th3) {
/* 697 */                                   th = th3;
                                            application = application2;
                                            r5 = c0005a3;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
/* 732 */                   activity.recreate();
/* 735 */                   return;
                        case 1:
/* 563 */                   C0222cn c0222cn = (C0222cn) this.f16386b;
/* 565 */                   C2260um c2260um = c0222cn.f3010g;
/* 567 */                   if (c2260um != null) {
/* 569 */                       c2260um.m9040a(null);
/* 572 */                       c0222cn.f3010g = null;
/* 574 */                       return;
                            }
/* 574 */                   return;
                        case 2:
/* 472 */                   C2467xn c2467xn = (C2467xn) this.f16386b;
/* 474 */                   c2467xn.f19270f0 = false;
/* 476 */                   c2467xn.f19268e0 = false;
/* 490 */                   c2467xn.m10000s("OpenCameraConfigAndClose is done, state: ".concat(AbstractC0886en.m3492A(c2467xn.f19284s0)));
/* 495 */                   int iM3520y = AbstractC0886en.m3520y(c2467xn.f19284s0);
/* 499 */                   if (iM3520y == 1 || iM3520y == 4) {
/* 554 */                       de3.m3028j(null, c2467xn.f19256X.isEmpty());
/* 557 */                       c2467xn.m10001t();
/* 560 */                       return;
                            } else {
/* 503 */                       if (iM3520y != 6) {
/* 517 */                           c2467xn.m10000s("OpenCameraConfigAndClose finished while in state: ".concat(AbstractC0886en.m3492A(c2467xn.f19284s0)));
/* 560 */                           return;
                                }
/* 521 */                       int i2 = c2467xn.f19254V;
/* 523 */                       if (i2 == 0) {
/* 544 */                           c2467xn.m9989I(false);
/* 560 */                           return;
                                } else {
/* 535 */                           c2467xn.m10000s("OpenCameraConfigAndClose in error: ".concat(C2467xn.m9978u(i2)));
/* 540 */                           c2467xn.f19285v.m9587b();
/* 560 */                           return;
                                }
                            }
                        case 3:
/* 466 */                   ((CameraDevice) this.f16386b).close();
/* 469 */                   return;
                        case 4:
/* 407 */                   RunnableC2300vn runnableC2300vn = (RunnableC2300vn) this.f16386b;
/* 411 */                   if (runnableC2300vn.f18253b) {
/* 461 */                       return;
                            }
/* 435 */                   de3.m3028j(null, ((C2337wn) runnableC2300vn.f18255d).f18696f.f19284s0 == 7 || ((C2337wn) runnableC2300vn.f18255d).f18696f.f19284s0 == 6);
/* 442 */                   boolean zM9588c = ((C2337wn) runnableC2300vn.f18255d).m9588c();
/* 450 */                   C2467xn c2467xn2 = ((C2337wn) runnableC2300vn.f18255d).f18696f;
/* 452 */                   if (zM9588c) {
/* 454 */                       c2467xn2.m9988H(true);
/* 461 */                       return;
                            } else {
/* 458 */                       c2467xn2.m9989I(true);
/* 461 */                       return;
                            }
                        case 5:
/* 1 */                     ((C0189bq) this.f16386b).f2568b.onCameraAccessPrioritiesChanged();
/* 404 */                   return;
                        case 6:
/* 381 */                   C2187sn c2187sn = (C2187sn) this.f16386b;
/* 387 */                   if (c2187sn.f16713c.f19284s0 == 4) {
/* 391 */                       c2187sn.f16713c.m9989I(false);
/* 394 */                       return;
                            }
/* 394 */                   return;
                        case 7:
/* 359 */                   d52 d52Var = (d52) this.f16386b;
/* 369 */                   if (((C2467xn) d52Var.f7001a).f19284s0 == 9) {
/* 375 */                       ((C2467xn) d52Var.f7001a).m9981A();
/* 378 */                       return;
                            }
/* 378 */                   return;
                        case 8:
/* 319 */                   C2154rr c2154rr = (C2154rr) this.f16386b;
                            synchronized (c2154rr.f16232a) {
/* 330 */                       if (c2154rr.f16233b.isEmpty()) {
/* 347 */                           return;
                                }
                                try {
/* 338 */                           c2154rr.m8233f(c2154rr.f16233b);
/* 343 */                           c2154rr.f16233b.clear();
/* 347 */                           return;
                                } catch (Throwable th4) {
/* 351 */                           c2154rr.f16233b.clear();
/* 354 */                           throw th4;
                                }
                            }
                        case 9:
/* 300 */                   for (gk2 gk2Var : (LinkedHashSet) this.f16386b) {
/* 308 */                       gk2Var.getClass();
/* 311 */                       gk2Var.mo1715c(gk2Var);
                            }
/* 315 */                   return;
                        case 10:
/* 284 */                   ((ComponentActivity) this.f16386b).invalidateMenu();
/* 287 */                   return;
                        case 11:
/* 268 */                   ViewTreeObserverOnDrawListenerC0059b viewTreeObserverOnDrawListenerC0059b = (ViewTreeObserverOnDrawListenerC0059b) this.f16386b;
/* 270 */                   Runnable runnable = viewTreeObserverOnDrawListenerC0059b.f348b;
/* 272 */                   if (runnable != null) {
/* 274 */                       runnable.run();
/* 277 */                       viewTreeObserverOnDrawListenerC0059b.f348b = null;
/* 279 */                       return;
                            }
/* 279 */                   return;
                        case 12:
/* 262 */                   DialogC0860dy.m3279a((DialogC0860dy) this.f16386b);
/* 265 */                   return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 254 */                   en0.m3522a(4, (ArrayList) this.f16386b);
/* 257 */                   return;
                        case 14:
/* 246 */                   ((mj2) this.f16386b).close();
/* 249 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 234 */                   x60 x60Var = (x60) this.f16386b;
/* 236 */                   x60Var.f18971j = true;
/* 238 */                   x60Var.m9715a();
/* 241 */                   return;
                        case 16:
/* 228 */                   ((C2466xm) this.f16386b).cancel(true);
/* 231 */                   return;
                        case 17:
/* 216 */                   cb0 cb0Var = (cb0) this.f16386b;
/* 218 */                   cb0Var.f2811f = true;
/* 220 */                   cb0Var.m1603a();
/* 223 */                   return;
                        case 18:
/* 185 */                   db0 db0Var = (db0) ((C0168b5) this.f16386b).f2214e;
/* 187 */                   if (db0Var != null) {
/* 193 */                       Iterator it = db0Var.values().iterator();
/* 201 */                       while (it.hasNext()) {
/* 209 */                           ((lj2) it.next()).m6462b();
                                }
/* 213 */                       return;
                            }
/* 213 */                   return;
                        case 19:
/* 138 */                   jc0 jc0Var = (jc0) this.f16386b;
/* 140 */                   AtomicBoolean atomicBoolean = jc0Var.f12185c;
/* 146 */                   if (atomicBoolean.compareAndSet(false, true)) {
                                try {
/* 148 */                           jc0Var.m5772c();
/* 159 */                           jc0Var.m5770a((um1) jc0Var.f12204v.get());
/* 178 */                           return;
                                } catch (Throwable th5) {
/* 164 */                           atomicBoolean.set(false);
/* 175 */                           k50.m5980q(jc0Var.f12183a, "Received error during emission process: %s", th5);
/* 178 */                           return;
                                }
                            }
/* 178 */                   return;
                        case 20:
/* 1 */                     ((FirebaseInstallations) this.f16386b).lambda$getId$1();
/* 134 */                   return;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 123 */                   m8362a();
/* 126 */                   return;
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 1 */                     ((Fragment) this.f16386b).lambda$performCreateView$0();
/* 122 */                   return;
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 111 */                   ((ScheduledFuture) this.f16386b).cancel(true);
/* 114 */                   return;
                        case 24:
/* 103 */                   ((C2260um) this.f16386b).m9040a(null);
/* 106 */                   return;
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 76 */                    wv0 wv0Var = (wv0) this.f16386b;
                            synchronized (wv0Var.f18832f0) {
                                try {
/* 81 */                            wv0Var.f18834h0 = null;
/* 83 */                            mw0 mw0Var = wv0Var.f18833g0;
/* 85 */                            if (mw0Var != null) {
/* 87 */                                wv0Var.f18833g0 = null;
/* 89 */                                wv0Var.mo8262e(mw0Var);
                                    }
                                } catch (Throwable th6) {
/* 98 */                            throw th6;
                                }
                                break;
                            }
/* 96 */                    return;
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 1 */                     ((PlatformViewsController) this.f16386b).lambda$onEndFrame$3();
/* 73 */                    return;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 62 */                    ((vw1) this.f16386b).m9664n();
/* 65 */                    return;
                        case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 25 */                    ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f16386b;
/* 27 */                    i71 i71Var = processLifecycleOwner.f1541f;
/* 29 */                    ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.f1535w;
/* 33 */                    if (processLifecycleOwner.f1537b == 0) {
/* 35 */                        processLifecycleOwner.f1538c = true;
/* 39 */                        i71Var.m4487e(t61.ON_PAUSE);
                            }
/* 44 */                    if (processLifecycleOwner.f1536a == 0 && processLifecycleOwner.f1538c) {
/* 52 */                        i71Var.m4487e(t61.ON_STOP);
/* 55 */                        processLifecycleOwner.f1539d = true;
/* 57 */                        return;
                            }
/* 57 */                    return;
                        default:
/* 19 */                    ((C0803j) this.f16386b).f6009a.onClosed();
/* 22 */                    return;
                    }
                }
            }
