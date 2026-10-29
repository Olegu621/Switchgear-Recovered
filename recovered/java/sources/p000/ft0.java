            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
            import com.google.android.gms.internal.cloudmessaging.zze;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzr;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.SoftReference;
            import java.util.Objects;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class ft0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8346a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f8347b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f8348c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f8349d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f8350e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f8351f;

                public ft0(sl3 sl3Var, AtomicReference atomicReference, String str, String str2, boolean z) {
/* 7 */             this.f8348c = atomicReference;
/* 9 */             this.f8349d = str;
/* 11 */            this.f8350e = str2;
/* 13 */            this.f8347b = z;
/* 15 */            Objects.requireNonNull(sl3Var);
/* 18 */            this.f8351f = sl3Var;
                }

                /* JADX WARN: Code duplicated, block: B:60:0x0143  */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Executor executorUnconfigurableExecutorService;
                    int iM2002c;
                    Bundle bundleM9117y0;
                    oi3 oi3Var;
/* 5 */             boolean z = true;
                    switch (this.f8346a) {
                        case 0:
/* 792 */                   wc0 wc0Var = (wc0) ((qi1) this.f8351f).f15576e;
/* 800 */                   C1969nm c1969nm = (C1969nm) ((er0) this.f8350e).f7853b;
/* 802 */                   boolean z2 = this.f8347b;
                            try {
/* 812 */                       C1795jj c1795jjM2931E = ((d52) this.f8348c).m2931E((wc0) this.f8349d);
/* 816 */                       if (z2) {
/* 876 */                           return;
                                }
/* 819 */                       int i = c1795jjM2931E.f12324a;
/* 823 */                       if (i < 200 || i >= 300) {
/* 830 */                           z = false;
                                }
/* 835 */                       c1969nm.m7011n(Boolean.valueOf(z), "push_token_synced");
/* 876 */                       return;
                            } catch (gt0 e) {
/* 840 */                       if (z2) {
/* 873 */                           xe2.m9777o("pshTknManagr", "Network error for deregister push token request", e);
/* 876 */                           return;
                                }
/* 844 */                       c1969nm.m7011n(Boolean.FALSE, "push_token_synced");
/* 847 */                       ym1 ym1Var = e.f8807c;
/* 851 */                       if (ym1Var == ym1.f19697v) {
/* 855 */                           wc0Var.m9526C("invalid user auth token");
/* 876 */                           return;
                                } else {
/* 861 */                           if (ym1Var == ym1.f19696i) {
/* 865 */                               wc0Var.m9526C("missing user auth token");
/* 876 */                               return;
                                    }
/* 876 */                           return;
                                }
                            }
                        case 1:
/* 588 */                   CloudMessagingReceiver cloudMessagingReceiver = (CloudMessagingReceiver) this.f8348c;
/* 592 */                   Intent intent = (Intent) this.f8349d;
/* 597 */                   Context context = (Context) this.f8350e;
/* 599 */                   boolean z3 = this.f8347b;
/* 604 */                   BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f8351f;
                            try {
/* 608 */                       Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
/* 622 */                       Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
/* 623 */                       if (intent2 == null) {
/* 635 */                           if (intent.getExtras() == null) {
/* 637 */                               iM2002c = 500;
                                    } else {
/* 643 */                               CloudMessage cloudMessage = new CloudMessage(intent);
/* 648 */                               CountDownLatch countDownLatch = new CountDownLatch(1);
                                        synchronized (CloudMessagingReceiver.class) {
                                            try {
/* 654 */                                       SoftReference softReference = CloudMessagingReceiver.f3412b;
/* 663 */                                       executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
/* 668 */                                       if (executorUnconfigurableExecutorService == null) {
/* 670 */                                           zze.zza();
/* 695 */                                           ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hl1("pscm-ack-executor"));
/* 698 */                                           threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 701 */                                           executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 710 */                                           CloudMessagingReceiver.f3412b = new SoftReference(executorUnconfigurableExecutorService);
                                                }
                                            } catch (Throwable th) {
/* 777 */                                       throw th;
                                            }
                                            break;
                                        }
/* 721 */                               executorUnconfigurableExecutorService.execute(new js0(context, cloudMessage, countDownLatch, 9, false));
/* 724 */                               int iMo2000a = cloudMessagingReceiver.mo2000a(context, cloudMessage);
                                        try {
/* 736 */                                   if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
/* 742 */                                       AbstractC1245n0.m4889q("CloudMessagingReceiver", "Message ack timed out");
                                            }
                                        } catch (InterruptedException e2) {
/* 759 */                                   AbstractC1245n0.m4889q("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                                        }
/* 762 */                               iM2002c = iMo2000a;
                                    }
                                    break;
                                } else {
/* 625 */                           iM2002c = cloudMessagingReceiver.m2002c(context, intent2);
                                }
/* 763 */                       if (z3 && pendingResult != null) {
/* 767 */                           pendingResult.setResultCode(iM2002c);
                                }
/* 770 */                       if (pendingResult != null) {
/* 772 */                           pendingResult.finish();
/* 775 */                           return;
                                }
/* 775 */                       return;
                            } catch (Throwable th2) {
/* 778 */                       if (pendingResult != null) {
/* 780 */                           pendingResult.finish();
                                }
/* 783 */                       throw th2;
                            }
                        case 2:
/* 546 */                   pn3 pn3VarM4567o = ((AppMeasurementDynamiteService) this.f8351f).f4190a.m4567o();
/* 553 */                   zzcu zzcuVar = (zzcu) this.f8348c;
/* 558 */                   String str = (String) this.f8349d;
/* 563 */                   String str2 = (String) this.f8350e;
/* 565 */                   boolean z4 = this.f8347b;
/* 567 */                   pn3VarM4567o.mo1375y();
/* 570 */                   pn3VarM4567o.m9576A();
/* 582 */                   pn3VarM4567o.m7518N(new mm3(pn3VarM4567o, str, str2, pn3VarM4567o.m7520P(false), z4, zzcuVar));
/* 585 */                   return;
                        case 3:
/* 495 */                   String str3 = (String) this.f8349d;
/* 500 */                   String str4 = (String) this.f8350e;
/* 502 */                   boolean z5 = this.f8347b;
/* 512 */                   pn3 pn3VarM4567o2 = ((ij3) ((sl3) this.f8351f).f16749a).m4567o();
/* 519 */                   AtomicReference atomicReference = (AtomicReference) this.f8348c;
/* 521 */                   pn3VarM4567o2.mo1375y();
/* 524 */                   pn3VarM4567o2.m9576A();
/* 536 */                   pn3VarM4567o2.m7518N(new mm3(pn3VarM4567o2, atomicReference, str3, str4, pn3VarM4567o2.m7520P(false), z5));
/* 539 */                   return;
                        case 4:
/* 105 */                   dh0 dh0Var = (dh0) this.f8351f;
/* 110 */                   sl3 sl3Var = (sl3) dh0Var.f7196b;
/* 112 */                   sl3Var.mo1375y();
/* 117 */                   ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 119 */                   oi3 oi3Var2 = sl3Var.f16685c0;
/* 124 */                   String str5 = (String) this.f8350e;
/* 128 */                   Uri uri = (Uri) this.f8348c;
                            try {
/* 130 */                       up3 up3Var = ij3Var.f9668w;
                                try {
/* 134 */                           uh3 uh3Var = ij3Var.f9655f;
/* 136 */                           ij3.m4553j(up3Var);
/* 149 */                           if (TextUtils.isEmpty(str5)) {
/* 151 */                               bundleM9117y0 = null;
                                    } else if (str5.contains("gclid") || str5.contains("gbraid") || str5.contains("utm_campaign") || str5.contains("utm_source") || str5.contains("utm_medium") || str5.contains("utm_id") || str5.contains("dclid") || str5.contains("srsltid") || str5.contains("sfmc_id")) {
/* 245 */                               bundleM9117y0 = up3Var.m9117y0(Uri.parse("https://google.com/search?".concat(str5)));
/* 249 */                               if (bundleM9117y0 != null) {
/* 253 */                                   bundleM9117y0.putString("_cis", "referrer");
                                        }
                                    } else {
/* 221 */                               uh3 uh3Var2 = ((ij3) up3Var.f16749a).f9655f;
/* 223 */                               ij3.m4555l(uh3Var2);
/* 228 */                               uh3Var2.f17533X.m8510a("Activity created with data 'referrer' without required params");
/* 151 */                               bundleM9117y0 = null;
                                    }
/* 258 */                           String str6 = (String) this.f8349d;
/* 262 */                           if (this.f8347b) {
/* 264 */                               up3 up3Var2 = ij3Var.f9668w;
/* 266 */                               ij3.m4553j(up3Var2);
/* 269 */                               Bundle bundleM9117y1 = up3Var2.m9117y0(uri);
/* 273 */                               if (bundleM9117y1 != null) {
/* 277 */                                   bundleM9117y1.putString("_cis", "intent");
/* 284 */                                   if (!bundleM9117y1.containsKey("gclid") && bundleM9117y0 != null && bundleM9117y0.containsKey("gclid")) {
/* 312 */                                       bundleM9117y1.putString("_cer", "gclid=" + bundleM9117y0.getString("gclid"));
                                            }
/* 315 */                                   sl3Var.m8556G(str6, "_cmp", bundleM9117y1);
/* 318 */                                   oi3Var = oi3Var2;
/* 320 */                                   oi3Var.m7176b(str6, bundleM9117y1);
                                        } else {
/* 324 */                                   oi3Var = oi3Var2;
                                        }
                                    } else {
/* 324 */                               oi3Var = oi3Var2;
                                    }
/* 330 */                           if (TextUtils.isEmpty(str5)) {
/* 491 */                               return;
                                    }
/* 334 */                           ij3.m4555l(uh3Var);
/* 339 */                           sh3 sh3Var = uh3Var.f17533X;
/* 343 */                           sh3Var.m8511b(str5, "Activity created with referrer");
/* 357 */                           if (ij3Var.f9651d.m7406J(null, vg3.f18076G0)) {
/* 359 */                               if (bundleM9117y0 != null) {
/* 361 */                                   sl3Var.m8556G(str6, "_cmp", bundleM9117y0);
/* 364 */                                   oi3Var.m7176b(str6, bundleM9117y0);
                                        } else {
/* 368 */                                   ij3.m4555l(uh3Var);
/* 373 */                                   sh3Var.m8511b(str5, "Referrer does not contain valid parameters");
                                        }
/* 378 */                               ij3Var.f9640V.getClass();
/* 391 */                               sl3Var.m8559J("auto", "_ldl", null, true, System.currentTimeMillis());
/* 491 */                               return;
                                    }
/* 399 */                           if (!str5.contains("gclid") || (!str5.contains("utm_campaign") && !str5.contains("utm_source") && !str5.contains("utm_medium") && !str5.contains("utm_term") && !str5.contains("utm_content"))) {
/* 459 */                               ij3.m4555l(uh3Var);
/* 462 */                               sh3Var.m8510a("Activity created with data 'referrer' without required params");
/* 491 */                               return;
                                    } else {
/* 439 */                               if (TextUtils.isEmpty(str5)) {
/* 491 */                                   return;
                                        }
/* 443 */                               ij3Var.f9640V.getClass();
/* 455 */                               sl3Var.m8559J("auto", "_ldl", str5, true, System.currentTimeMillis());
/* 491 */                               return;
                                    }
                                } catch (RuntimeException e3) {
/* 232 */                           e = e3;
/* 479 */                           uh3 uh3Var3 = ((ij3) ((sl3) dh0Var.f7196b).f16749a).f9655f;
/* 481 */                           ij3.m4555l(uh3Var3);
/* 488 */                           uh3Var3.f17538f.m8511b(e, "Throwable caught in handleReferrerForOnActivityCreated");
/* 491 */                           return;
                                }
                            } catch (RuntimeException e4) {
/* 466 */                       e = e4;
                            }
                            break;
                        default:
/* 15 */                    pn3 pn3Var = (pn3) this.f8351f;
/* 17 */                    zzga zzgaVar = pn3Var.f15188d;
/* 21 */                    ij3 ij3Var2 = (ij3) pn3Var.f16749a;
/* 23 */                    if (zzgaVar == null) {
/* 25 */                        uh3 uh3Var4 = ij3Var2.f9655f;
/* 27 */                        ij3.m4555l(uh3Var4);
/* 32 */                        uh3Var4.f17538f.m8510a("Failed to send default event parameters to service");
/* 86 */                        return;
                            }
/* 40 */                    boolean zM7406J = ij3Var2.f9651d.m7406J(null, vg3.f18123c1);
/* 46 */                    zzr zzrVar = (zzr) this.f8348c;
/* 48 */                    if (zM7406J) {
/* 60 */                        pn3Var.m7522R(zzgaVar, this.f8347b ? null : (zzbe) this.f8349d, zzrVar);
/* 86 */                        return;
                            }
                            try {
/* 68 */                        zzgaVar.mo2176Q((Bundle) this.f8350e, zzrVar);
/* 71 */                        pn3Var.m7517M();
/* 86 */                        return;
                            } catch (RemoteException e5) {
/* 76 */                        uh3 uh3Var5 = ij3Var2.f9655f;
/* 78 */                        ij3.m4555l(uh3Var5);
/* 83 */                        uh3Var5.f17538f.m8511b(e5, "Failed to send default event parameters to service");
/* 86 */                        return;
                            }
                    }
                }

/* 20 */        public ft0(dh0 dh0Var, boolean z, Uri uri, String str, String str2) {
                    this.f8347b = z;
                    this.f8348c = uri;
                    this.f8349d = str;
                    this.f8350e = str2;
                    this.f8351f = dh0Var;
                }

/* 21 */        public ft0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z) {
                    this.f8348c = zzcuVar;
                    this.f8349d = str;
                    this.f8350e = str2;
                    this.f8347b = z;
                    this.f8351f = appMeasurementDynamiteService;
                }

/* 22 */        public /* synthetic */ ft0(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
                    this.f8348c = cloudMessagingReceiver;
                    this.f8349d = intent;
                    this.f8350e = context;
                    this.f8347b = z;
                    this.f8351f = pendingResult;
                }

/* 23 */        public ft0(pn3 pn3Var, zzr zzrVar, boolean z, zzbe zzbeVar, Bundle bundle) {
                    this.f8348c = zzrVar;
                    this.f8347b = z;
                    this.f8349d = zzbeVar;
                    this.f8350e = bundle;
                    Objects.requireNonNull(pn3Var);
                    this.f8351f = pn3Var;
                }

/* 24 */        public ft0(qi1 qi1Var, d52 d52Var, wc0 wc0Var, boolean z, er0 er0Var) {
                    this.f8351f = qi1Var;
                    this.f8348c = d52Var;
                    this.f8349d = wc0Var;
                    this.f8347b = z;
                    this.f8350e = er0Var;
                }
            }
