            package p000;

            import android.app.job.JobParameters;
            import android.content.Intent;
            import android.database.DatabaseUtils;
            import android.database.sqlite.SQLiteDatabase;
            import android.graphics.Rect;
            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.TotalCaptureResult;
            import android.os.Process;
            import android.os.StrictMode;
            import android.util.Size;
            import android.view.Surface;
            import android.view.View;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0091c0;
            import androidx.fragment.app.C0095g;
            import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.firebase.messaging.FirebaseMessaging;
            import com.supercell.p007id.FlutterSupport;
            import com.supercell.p007id.scid_plugin.BarcodeHandler;
            import io.flutter.Build;
            import io.flutter.plugin.common.EventChannel;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: j8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final /* synthetic */ class RunnableC1784j8 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12134a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12135b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f12136c;

                public /* synthetic */ RunnableC1784j8(ln0 ln0Var, View view, Rect rect) {
/* 3 */             this.f12134a = 14;
/* 8 */             this.f12135b = view;
/* 10 */            this.f12136c = rect;
                }

                /* JADX INFO: renamed from: a */
                private final void m5723a() {
                    long size;
/* 3 */             jc0 jc0Var = (jc0) this.f12135b;
/* 7 */             zq2 zq2Var = (zq2) this.f12136c;
/* 9 */             jc0Var.getClass();
/* 12 */            C0168b5 c0168b5 = jc0Var.f12195m;
/* 14 */            c0168b5.getClass();
/* 21 */            if (c0168b5.m1270p()) {
/* 36 */                c0168b5.m1276w();
/* 39 */                c0168b5.m1275v(zq2Var);
                    } else {
                        synchronized (c0168b5) {
/* 28 */                    ((ArrayList) c0168b5.f2212c).add(zq2Var);
                        }
                    }
/* 42 */            C0168b5 c0168b6 = jc0Var.f12195m;
/* 48 */            if (c0168b6.m1270p()) {
/* 50 */                c0168b6.m1276w();
/* 59 */                size = DatabaseUtils.queryNumEntries((SQLiteDatabase) c0168b6.f2213d, "events");
                    } else {
/* 68 */                size = ((ArrayList) c0168b6.f2212c).size();
                    }
/* 82 */            if (size < AbstractC0886en.m3500d(jc0Var.f12181D) || !jc0Var.f12185c.compareAndSet(false, true)) {
/* 126 */               return;
                    }
                    try {
/* 94 */                jc0Var.m5772c();
/* 105 */               jc0Var.m5770a((um1) jc0Var.f12204v.get());
                    } catch (Throwable th) {
/* 112 */               jc0Var.f12185c.set(false);
/* 123 */               k50.m5980q(jc0Var.f12183a, "Received error during emission process: %s", th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ds0 ds0Var;
                    C2292vg c2292vg;
/* 3 */             int i = 2;
/* 5 */             int i2 = 1;
                    switch (this.f12134a) {
                        case 0:
/* 933 */                   ((nw0) this.f12136c).mo6871f((C1822k8) this.f12135b);
/* 936 */                   return;
                        case 1:
/* 907 */                   ExecutorC0984ha executorC0984ha = (ExecutorC0984ha) this.f12135b;
                            try {
/* 913 */                       ((Runnable) this.f12136c).run();
/* 919 */                       return;
                            } finally {
/* 921 */                       executorC0984ha.m4136a();
                            }
                        case 2:
/* 891 */                   C2255uh c2255uh = (C2255uh) this.f12135b;
/* 895 */                   Map map = (Map) this.f12136c;
/* 897 */                   EventChannel.EventSink eventSink = c2255uh.f17526a;
/* 899 */                   if (eventSink != null) {
/* 901 */                       eventSink.success(map);
/* 904 */                       return;
                            }
/* 904 */                   return;
                        case 3:
/* 1 */                     BarcodeHandler.publishEvent$lambda$0((BarcodeHandler) this.f12135b, (Map) this.f12136c);
/* 888 */                   return;
                        case 4:
/* 807 */                   C1799jn c1799jn = (C1799jn) this.f12135b;
/* 811 */                   C2260um c2260um = (C2260um) this.f12136c;
/* 813 */                   final long jM5861p = c1799jn.m5861p();
/* 819 */                   final C2260um c2260um2 = new C2260um();
/* 827 */                   c2260um2.f17592c = new u32();
/* 831 */                   C2466xm c2466xm = new C2466xm(c2260um2);
/* 834 */                   c2260um2.f17591b = c2466xm;
/* 838 */                   c2260um2.f17590a = AbstractC0886en.class;
                            try {
/* 845 */                       c1799jn.m5855h(new InterfaceC1033in() { // from class: dn
                                    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
                                    @Override // p000.InterfaceC1033in
                                    /* JADX INFO: renamed from: a */
                                    public final boolean mo3157a(TotalCaptureResult totalCaptureResult) {
                                        boolean z;
                                        Long l;
/* 7 */                                 if (totalCaptureResult.getRequest() == null) {
/* 49 */                                    z = false;
                                        } else {
/* 14 */                                    Object tag = totalCaptureResult.getRequest().getTag();
/* 20 */                                    if (!(tag instanceof nm2) || (l = (Long) ((nm2) tag).f14383a.get("CameraControlSessionUpdateId")) == null || l.longValue() < jM5861p) {
/* 49 */                                        z = false;
                                            } else {
/* 47 */                                        z = true;
                                            }
                                        }
/* 50 */                                if (!z) {
/* 6 */                                     return false;
                                        }
/* 55 */                                c2260um2.m9040a(null);
/* 5 */                                 return true;
                                    }
                                });
/* 862 */                       c2260um2.f17590a = "waitForSessionUpdateId:" + jM5861p;
                                break;
                            } catch (Exception e) {
/* 866 */                       c2466xm.m9977b(e);
                            }
/* 873 */                   w11.m9392B(true, c2466xm, c2260um, pg3.m7428g());
/* 876 */                   return;
                        case 5:
/* 754 */                   C0997hn c0997hn = (C0997hn) this.f12135b;
/* 758 */                   TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f12136c;
/* 762 */                   HashSet hashSet = new HashSet();
/* 767 */                   HashSet<InterfaceC1033in> hashSet2 = (HashSet) c0997hn.f9152b;
/* 777 */                   for (InterfaceC1033in interfaceC1033in : hashSet2) {
/* 789 */                       if (interfaceC1033in.mo3157a(totalCaptureResult)) {
/* 791 */                           hashSet.add(interfaceC1033in);
                                }
                            }
/* 799 */                   if (hashSet.isEmpty()) {
/* 804 */                       return;
                            }
/* 801 */                   hashSet2.removeAll(hashSet);
/* 804 */                   return;
                        case 6:
/* 739 */                   Surface surface = (Surface) this.f12135b;
/* 743 */                   SurfaceTexture surfaceTexture = (SurfaceTexture) this.f12136c;
/* 745 */                   surface.release();
/* 748 */                   surfaceTexture.release();
/* 751 */                   return;
                        case 7:
/* 703 */                   C2467xn c2467xn = (C2467xn) this.f12135b;
/* 707 */                   C2260um c2260um3 = (C2260um) this.f12136c;
/* 709 */                   qi1 qi1Var = c2467xn.f19272h0;
/* 711 */                   if (qi1Var == null) {
/* 715 */                       c2260um3.m9040a(Boolean.FALSE);
/* 736 */                       return;
                            } else {
/* 733 */                       c2260um3.m9040a(Boolean.valueOf(c2467xn.f19259a.m3823t(C2467xn.m9979v(qi1Var))));
/* 736 */                       return;
                            }
                        case 8:
/* 641 */                   C2467xn c2467xn2 = (C2467xn) this.f12135b;
/* 645 */                   String str = (String) this.f12136c;
/* 666 */                   c2467xn2.m10000s("Use case " + str + " INACTIVE");
/* 673 */                   LinkedHashMap linkedHashMap = (LinkedHashMap) c2467xn2.f19259a.f8339b;
/* 679 */                   if (linkedHashMap.containsKey(str)) {
/* 686 */                       xy2 xy2Var = (xy2) linkedHashMap.get(str);
/* 688 */                       xy2Var.f19404f = false;
/* 692 */                       if (!xy2Var.f19403e) {
/* 694 */                           linkedHashMap.remove(str);
                                }
                            }
/* 697 */                   c2467xn2.m9990J();
/* 700 */                   return;
                        case 9:
/* 635 */                   ((db2) this.f12135b).mo1608a((fb2) this.f12136c);
/* 638 */                   return;
                        case 10:
/* 593 */                   mq1 mq1Var = (mq1) this.f12135b;
/* 597 */                   iz1 iz1Var = (iz1) this.f12136c;
/* 603 */                   if (mq1Var.f13944b != mq1.f13942d) {
/* 623 */                       f42.m3656l("provide() can be called only once.");
/* 626 */                       return;
                            }
                            synchronized (mq1Var) {
/* 606 */                       ds0Var = mq1Var.f13943a;
/* 609 */                       mq1Var.f13943a = null;
/* 611 */                       mq1Var.f13944b = iz1Var;
                                break;
                            }
/* 614 */                   ds0Var.getClass();
/* 626 */                   return;
                        case 11:
/* 559 */                   s51 s51Var = (s51) this.f12135b;
/* 563 */                   iz1 iz1Var2 = (iz1) this.f12136c;
                            synchronized (s51Var) {
                                try {
/* 568 */                           if (s51Var.f16429b == null) {
/* 572 */                               s51Var.f16428a.add(iz1Var2);
                                    } else {
/* 584 */                               s51Var.f16429b.add(iz1Var2.get());
                                    }
                                } catch (Throwable th) {
/* 590 */                           throw th;
                                }
                            }
/* 588 */                   return;
                        case 12:
/* 535 */                   q30 q30Var = (q30) this.f12135b;
/* 539 */                   Runnable runnable = (Runnable) this.f12136c;
/* 543 */                   Process.setThreadPriority(q30Var.f15378c);
/* 546 */                   StrictMode.ThreadPolicy threadPolicy = q30Var.f15379d;
/* 548 */                   if (threadPolicy != null) {
/* 550 */                       StrictMode.setThreadPolicy(threadPolicy);
                            }
/* 553 */                   runnable.run();
/* 556 */                   return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 514 */                   C0091c0 c0091c0 = (C0091c0) this.f12135b;
/* 518 */                   C0095g c0095g = (C0095g) this.f12136c;
/* 524 */                   if (AbstractC0111w.m674K(2)) {
/* 526 */                       Objects.toString(c0091c0);
                            }
/* 529 */                   c0091c0.m645c(c0095g);
/* 532 */                   return;
                        case 14:
/* 508 */                   ln0.m6511g((Rect) this.f12136c, (View) this.f12135b);
/* 511 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 472 */                   x60 x60Var = (x60) this.f12135b;
/* 476 */                   mj2 mj2Var = (mj2) this.f12136c;
/* 485 */                   Surface surfaceM6665f = mj2Var.m6665f(x60Var.f18964c, new C1973nq(i2, x60Var, mj2Var));
/* 491 */                   x60Var.f18962a.m5887g(surfaceM6665f);
/* 496 */                   x60Var.f18969h.put(mj2Var, surfaceM6665f);
/* 499 */                   return;
                        case 16:
/* 373 */                   final x60 x60Var2 = (x60) this.f12135b;
/* 377 */                   final rj2 rj2Var = (rj2) this.f12136c;
/* 382 */                   x60Var2.f18970i++;
/* 386 */                   jq1 jq1Var = x60Var2.f18962a;
/* 390 */                   sp0.m8593d(jq1Var.f12424a, true);
/* 395 */                   sp0.m8592c(jq1Var.f12426c);
/* 400 */                   final SurfaceTexture surfaceTexture2 = new SurfaceTexture(jq1Var.f12436m);
/* 415 */                   surfaceTexture2.setDefaultBufferSize(rj2Var.f16122b.getWidth(), rj2Var.f16122b.getHeight());
/* 420 */                   final Surface surface2 = new Surface(surfaceTexture2);
/* 423 */                   nt0 nt0Var = x60Var2.f18964c;
/* 428 */                   C2076pn c2076pn = new C2076pn(3, x60Var2, rj2Var);
                            synchronized (rj2Var.f16121a) {
/* 434 */                       rj2Var.f16132l = c2076pn;
/* 436 */                       rj2Var.f16133m = nt0Var;
/* 438 */                       c2292vg = rj2Var.f16131k;
                                break;
                            }
/* 441 */                   if (c2292vg != null) {
/* 448 */                       nt0Var.execute(new nj2(c2076pn, c2292vg, i2));
                            }
/* 458 */                   rj2Var.m8190a(surface2, x60Var2.f18964c, new c00() { // from class: w60
                                @Override // p000.c00
                                public final void accept(Object obj) {
/* 1 */                             x60 x60Var3 = x60Var2;
/* 3 */                             rj2 rj2Var2 = rj2Var;
/* 5 */                             SurfaceTexture surfaceTexture3 = surfaceTexture2;
/* 7 */                             Surface surface3 = surface2;
                                    synchronized (rj2Var2.f16121a) {
/* 15 */                                rj2Var2.f16132l = null;
/* 17 */                                rj2Var2.f16133m = null;
                                    }
/* 20 */                            surfaceTexture3.setOnFrameAvailableListener(null);
/* 23 */                            surfaceTexture3.release();
/* 26 */                            surface3.release();
/* 33 */                            x60Var3.f18970i--;
/* 35 */                            x60Var3.m9715a();
                                }
                            });
/* 463 */                   surfaceTexture2.setOnFrameAvailableListener(x60Var2, x60Var2.f18965d);
/* 466 */                   return;
                        case 17:
/* 284 */                   d70 d70Var = (d70) this.f12135b;
/* 288 */                   String str2 = (String) this.f12136c;
                            try {
/* 292 */                       d70Var.f7030e.get();
/* 297 */                       d70.f7025n.decrementAndGet();
/* 302 */                       d70.f7024m.get();
/* 305 */                       d70Var.m2955e();
/* 308 */                       return;
                            } catch (Exception e2) {
/* 334 */                       hu0.m4325T("DeferrableSurface", "Unexpected surface termination for " + d70Var + "\nStack Trace:\n" + str2);
                                synchronized (d70Var.f7026a) {
                                    try {
/* 367 */                               throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", d70Var, Boolean.valueOf(d70Var.f7028c), Integer.valueOf(d70Var.f7027b)), e2);
                                    } catch (Throwable th2) {
/* 370 */                               throw th2;
                                    }
                                }
                            }
                        case 18:
/* 259 */                   Callable callable = (Callable) this.f12135b;
/* 267 */                   o70 o70Var = (o70) ((gr0) this.f12136c).f8789a;
                            try {
/* 273 */                       o70Var.m6327j(callable.call());
/* 281 */                       return;
                            } catch (Exception e3) {
/* 278 */                       o70Var.mo6328k(e3);
/* 281 */                       return;
                            }
                        case 19:
/* 179 */                   final cb0 cb0Var = (cb0) this.f12135b;
/* 183 */                   rj2 rj2Var2 = (rj2) this.f12136c;
/* 188 */                   cb0Var.f2810e++;
/* 192 */                   ab0 ab0Var = cb0Var.f2806a;
/* 194 */                   boolean z = rj2Var2.f16124d;
/* 196 */                   Size size = rj2Var2.f16122b;
/* 200 */                   sp0.m8593d(ab0Var.f12424a, true);
/* 205 */                   sp0.m8592c(ab0Var.f12426c);
/* 215 */                   final SurfaceTexture surfaceTexture3 = new SurfaceTexture(z ? ab0Var.f156n : ab0Var.f157o);
/* 226 */                   surfaceTexture3.setDefaultBufferSize(size.getWidth(), size.getHeight());
/* 231 */                   final Surface surface3 = new Surface(surfaceTexture3);
/* 241 */                   rj2Var2.m8190a(surface3, cb0Var.f2808c, new c00() { // from class: bb0
                                @Override // p000.c00
                                public final void accept(Object obj) {
/* 4 */                             SurfaceTexture surfaceTexture4 = surfaceTexture3;
/* 6 */                             surfaceTexture4.setOnFrameAvailableListener(null);
/* 9 */                             surfaceTexture4.release();
/* 14 */                            surface3.release();
/* 17 */                            cb0 cb0Var2 = cb0Var;
/* 23 */                            cb0Var2.f2810e--;
/* 25 */                            cb0Var2.m1603a();
                                }
                            });
/* 244 */                   if (z) {
/* 246 */                       cb0Var.f2814i = surfaceTexture3;
/* 256 */                       return;
                            } else {
/* 249 */                       cb0Var.f2815j = surfaceTexture3;
/* 253 */                       surfaceTexture3.setOnFrameAvailableListener(cb0Var, cb0Var.f2809d);
/* 256 */                       return;
                            }
                        case 20:
/* 149 */                   cb0 cb0Var2 = (cb0) this.f12135b;
/* 153 */                   mj2 mj2Var2 = (mj2) this.f12136c;
/* 162 */                   Surface surfaceM6665f2 = mj2Var2.m6665f(cb0Var2.f2808c, new C1973nq(i, cb0Var2, mj2Var2));
/* 168 */                   cb0Var2.f2806a.m5887g(surfaceM6665f2);
/* 173 */                   cb0Var2.f2813h.put(mj2Var2, surfaceM6665f2);
/* 176 */                   return;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 143 */                   m5723a();
/* 146 */                   return;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 128 */                   Runnable runnable2 = (Runnable) this.f12135b;
/* 132 */                   lf0 lf0Var = (lf0) this.f12136c;
                            try {
/* 134 */                       runnable2.run();
/* 142 */                       return;
                            } catch (Throwable th3) {
/* 139 */                       lf0Var.m6431a(th3);
/* 142 */                       return;
                            }
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 122 */                   ((dh0) this.f12135b).m3078a((Intent) this.f12136c);
/* 125 */                   return;
                        case 24:
/* 95 */                    FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12135b;
/* 99 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12136c;
                            try {
/* 105 */                       taskCompletionSource.setResult(firebaseMessaging.m2528a());
/* 113 */                       return;
                            } catch (Exception e4) {
/* 110 */                       taskCompletionSource.setException(e4);
/* 113 */                       return;
                            }
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 1 */                     ((FlutterSupport) this.f12135b).lambda$setMessageHandler$5((String) this.f12136c);
/* 92 */                    return;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 63 */                    String str3 = (String) this.f12135b;
/* 67 */                    q53 q53Var = (q53) this.f12136c;
/* 77 */                    AbstractC1245n0.m4877e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str3), q53Var);
/* 80 */                    throw q53Var;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 46 */                    C1767ir c1767ir = (C1767ir) this.f12135b;
/* 50 */                    C1767ir c1767ir2 = (C1767ir) this.f12136c;
/* 52 */                    c1767ir.m5547j();
/* 55 */                    if (c1767ir2 != null) {
/* 57 */                        c1767ir2.m5547j();
/* 60 */                        return;
                            }
/* 60 */                    return;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 25 */                    cw0 cw0Var = (cw0) this.f12135b;
/* 29 */                    TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f12136c;
                            try {
/* 35 */                        taskCompletionSource2.setResult(cw0Var.m2896c());
/* 43 */                        return;
                            } catch (Exception e5) {
/* 40 */                        taskCompletionSource2.setException(e5);
/* 43 */                        return;
                            }
                        default:
/* 11 */                    JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f12135b;
/* 15 */                    JobParameters jobParameters = (JobParameters) this.f12136c;
/* 17 */                    int i3 = JobInfoSchedulerService.f3125a;
/* 19 */                    jobInfoSchedulerService.jobFinished(jobParameters, false);
/* 22 */                    return;
                    }
                }

/* 12 */        public /* synthetic */ RunnableC1784j8(int i, Object obj, Object obj2) {
/* 13 */            this.f12134a = i;
                    this.f12135b = obj;
                    this.f12136c = obj2;
                }
            }
