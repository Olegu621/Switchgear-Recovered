            package p000;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.TextUtils;
            import com.android.billingclient.api.ProxyBillingActivity;
            import com.google.android.gms.internal.play_billing.zzan;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zzcx;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzev;
            import com.google.android.gms.internal.play_billing.zzfm;
            import com.google.android.gms.internal.play_billing.zzfn;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzkb;
            import com.google.android.gms.internal.play_billing.zzkd;
            import com.google.android.gms.internal.play_billing.zzkg;
            import com.google.android.gms.internal.play_billing.zzks;
            import com.google.android.gms.internal.play_billing.zzku;
            import com.google.android.gms.internal.play_billing.zzlv;
            import com.google.android.gms.internal.play_billing.zzlx;
            import com.supercell.titan.C0800g;
            import com.supercell.titan.C0801h;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Random;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.Future;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.function.Function;
            import java.util.function.Predicate;
            import org.json.JSONObject;
            import p000.C0993hj;
            
            /* JADX INFO: renamed from: ej */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 117 */   public class C0882ej extends AbstractC0846dj {

                /* JADX INFO: renamed from: A */
                public final Long f7704A;

                /* JADX INFO: renamed from: a */
                public final Object f7705a;

                /* JADX INFO: renamed from: b */
                public volatile int f7706b;

                /* JADX INFO: renamed from: c */
                public final String f7707c;

                /* JADX INFO: renamed from: d */
                public final Handler f7708d;

                /* JADX INFO: renamed from: e */
                public volatile u93 f7709e;

                /* JADX INFO: renamed from: f */
                public final Context f7710f;

                /* JADX INFO: renamed from: g */
                public final we2 f7711g;

                /* JADX INFO: renamed from: h */
                public volatile zzan f7712h;

                /* JADX INFO: renamed from: i */
                public volatile ne3 f7713i;

                /* JADX INFO: renamed from: j */
                public boolean f7714j;

                /* JADX INFO: renamed from: k */
                public int f7715k;

                /* JADX INFO: renamed from: l */
                public boolean f7716l;

                /* JADX INFO: renamed from: m */
                public boolean f7717m;

                /* JADX INFO: renamed from: n */
                public boolean f7718n;

                /* JADX INFO: renamed from: o */
                public boolean f7719o;

                /* JADX INFO: renamed from: p */
                public boolean f7720p;

                /* JADX INFO: renamed from: q */
                public boolean f7721q;

                /* JADX INFO: renamed from: r */
                public boolean f7722r;

                /* JADX INFO: renamed from: s */
                public boolean f7723s;

                /* JADX INFO: renamed from: t */
                public boolean f7724t;

                /* JADX INFO: renamed from: u */
                public boolean f7725u;

                /* JADX INFO: renamed from: v */
                public boolean f7726v;

                /* JADX INFO: renamed from: w */
                public final ec0 f7727w;

                /* JADX INFO: renamed from: x */
                public final boolean f7728x;

                /* JADX INFO: renamed from: y */
                public ExecutorService f7729y;

                /* JADX INFO: renamed from: z */
                public volatile zzev f7730z;

                public C0882ej(ec0 ec0Var, Context context) {
/* 9 */             this.f7705a = new Object();
/* 12 */            this.f7706b = 0;
/* 23 */            this.f7708d = new Handler(Looper.getMainLooper());
/* 25 */            this.f7715k = 0;
/* 32 */            long jNextLong = new Random().nextLong();
/* 40 */            this.f7704A = Long.valueOf(jNextLong);
/* 46 */            this.f7707c = m3448k();
/* 52 */            this.f7710f = context.getApplicationContext();
/* 54 */            zzks zzksVarZzc = zzku.zzc();
/* 62 */            zzksVarZzc.zzo(m3448k());
/* 71 */            zzksVarZzc.zzn(this.f7710f.getPackageName());
/* 74 */            zzksVarZzc.zzm(jNextLong);
/* 90 */            this.f7711g = new we2(this.f7710f, (zzku) zzksVarZzc.zzf());
/* 96 */            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
/* 109 */           this.f7709e = new u93(this.f7710f, (tz1) null, this.f7711g);
/* 111 */           this.f7727w = ec0Var;
/* 115 */           this.f7710f.getPackageName();
                }

                /* JADX INFO: renamed from: h */
                public static Future m3447h(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
                    try {
/* 1 */                 Future futureSubmit = executorService.submit(callable);
/* 20 */                handler.postDelayed(new cp0(23, futureSubmit, runnable), (long) (j * 0.95d));
/* 23 */                return futureSubmit;
                    } catch (Exception e) {
/* 29 */                zze.zzm("BillingClient", "Async task throws exception!", e);
/* 32 */                return null;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static String m3448k() {
                    try {
/* 18 */                return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
                    } catch (Exception unused) {
/* 21 */                return C0848dl.f7293a;
                    }
                }

                /* JADX INFO: renamed from: A */
                public final void m3449A(C1833kj c1833kj) {
/* 5 */             if (Thread.interrupted()) {
/* 7 */                 return;
                    }
/* 16 */            this.f7708d.post(new pl3(4, this, c1833kj));
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0042 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #5 {, blocks: (B:16:0x003e, B:18:0x0042), top: B:46:0x003e, outer: #4 }] */
                /* JADX WARN: Code duplicated, block: B:46:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // p000.AbstractC0846dj
                /* JADX INFO: renamed from: a */
                public void mo3135a() {
                    ExecutorService executorService;
/* 3 */             m3472z(12);
                    synchronized (this.f7705a) {
                        try {
/* 11 */                    if (this.f7709e != null) {
/* 13 */                        u93 u93Var = this.f7709e;
/* 17 */                        gi3 gi3Var = (gi3) u93Var.f17432e;
/* 21 */                        Context context = (Context) u93Var.f17429b;
/* 23 */                        gi3Var.m3950c(context);
/* 30 */                        ((gi3) u93Var.f17433f).m3950c(context);
                                try {
/* 46 */                            zze.zzk("BillingClient", "Unbinding from service.");
/* 49 */                            m3462p();
                                } catch (Throwable th) {
/* 58 */                            zze.zzm("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                                }
                                try {
                                    synchronized (this) {
/* 63 */                                executorService = this.f7729y;
/* 65 */                                if (executorService != null) {
/* 67 */                                    executorService.shutdownNow();
/* 71 */                                    this.f7729y = null;
/* 73 */                                    this.f7730z = null;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
/* 92 */                                zze.zzm("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                                    } catch (Throwable th3) {
/* 99 */                                m3461o(3);
/* 102 */                               throw th3;
                                    }
                                }
/* 79 */                        m3461o(3);
                            } else {
/* 46 */                        zze.zzk("BillingClient", "Unbinding from service.");
/* 49 */                        m3462p();
                                synchronized (this) {
/* 63 */                            executorService = this.f7729y;
/* 65 */                            if (executorService != null) {
/* 67 */                                executorService.shutdownNow();
/* 71 */                                this.f7729y = null;
/* 73 */                                this.f7730z = null;
                                    }
/* 79 */                            m3461o(3);
                                }
                            }
                        } catch (Throwable th4) {
/* 39 */                    zze.zzm("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
                        }
/* 104 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public void mo3450b(C0832d5 c0832d5, ds0 ds0Var) {
/* 6 */             if (!m3451c()) {
/* 8 */                 C1833kj c1833kj = kf3.f12732j;
/* 11 */                m3470x(2, 4, c1833kj);
/* 14 */                int i = c1833kj.f12818a;
                    } else if (m3447h(new kd3(this, c0832d5, ds0Var, 0), 30000L, new bb3(this, ds0Var, c0832d5), m3467u(), m3458l()) == null) {
/* 44 */                C1833kj c1833kjM3456i = m3456i();
/* 50 */                m3470x(25, 4, c1833kjM3456i);
/* 53 */                int i2 = c1833kjM3456i.f12818a;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m3451c() {
                    boolean z;
                    synchronized (this.f7705a) {
                        try {
/* 7 */                     z = false;
/* 8 */                     if (this.f7706b == 2 && this.f7712h != null && this.f7713i != null) {
/* 18 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
/* 23 */            return z;
                }

                /* JADX WARN: Code duplicated, block: B:210:0x05bb  */
                /* JADX WARN: Code duplicated, block: B:213:0x05c6  */
                /* JADX WARN: Code duplicated, block: B:214:0x05ce  */
                /* JADX WARN: Code duplicated, block: B:216:0x05dc  */
                /* JADX WARN: Code duplicated, block: B:225:0x0603  */
                /* JADX WARN: Code duplicated, block: B:229:0x060d  */
                /* JADX WARN: Code duplicated, block: B:231:0x0611 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:233:0x0616  */
                /* JADX WARN: Code duplicated, block: B:235:0x061a  */
                /* JADX WARN: Code duplicated, block: B:236:0x061d  */
                /* JADX WARN: Code duplicated, block: B:282:0x0757  */
                /* JADX WARN: Code duplicated, block: B:28:0x009d  */
                /* JADX INFO: renamed from: d */
                public C1833kj mo3452d(Activity activity, final C1029ij c1029ij) {
                    String strM9260b;
                    String strM9259a;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    C1833kj c1833kjM6096a;
                    String string;
                    String str6;
                    int i;
                    Future futureM3447h;
                    int iZza;
                    int i2;
                    String str7;
                    boolean z;
                    ve2 ve2Var;
                    C0993hj c0993hj;
                    String str8;
                    zzco zzcoVar;
                    String str9;
                    String str10;
                    boolean z2;
                    Intent intent;
                    String str11;
                    int i3;
                    final int i4;
/* 1 */             final C0882ej c0882ej = this;
/* 5 */             String str12 = "BUY_INTENT";
/* 12 */            if (c0882ej.f7709e == null || ((tz1) c0882ej.f7709e.f17430c) == null) {
/* 1899 */              C1833kj c1833kj = kf3.f12740r;
/* 1903 */              c0882ej.m3470x(12, 2, c1833kj);
/* 1906 */              return c1833kj;
                    }
/* 26 */            if (!c0882ej.m3451c()) {
/* 28 */                C1833kj c1833kj2 = kf3.f12732j;
/* 30 */                c0882ej.m3470x(2, 2, c1833kj2);
/* 33 */                c0882ej.m3449A(c1833kj2);
/* 36 */                return c1833kj2;
                    }
/* 39 */            ArrayList<ve2> arrayList = new ArrayList();
/* 46 */            arrayList.addAll((ArrayList) c1029ij.f9629b);
/* 51 */            zzco zzcoVar2 = (zzco) c1029ij.f9632e;
/* 58 */            ve2 ve2Var2 = (ve2) zzcx.zza(arrayList, null);
/* 64 */            C0993hj c0993hj2 = (C0993hj) zzcx.zza(zzcoVar2, null);
/* 66 */            if (ve2Var2 != null) {
/* 68 */                strM9259a = ve2Var2.m9259a();
/* 72 */                strM9260b = ve2Var2.m9260b();
                    } else {
/* 77 */                zx1 zx1Var = c0993hj2.f9095a;
/* 79 */                String str13 = zx1Var.f20367c;
/* 81 */                strM9260b = zx1Var.f20368d;
/* 86 */                strM9259a = str13;
                    }
/* 100 */           if (strM9260b.equals("subs") && !c0882ej.f7714j) {
/* 109 */               zze.zzl("BillingClient", "Current client doesn't support subscriptions.");
/* 112 */               C1833kj c1833kj3 = kf3.f12734l;
/* 114 */               c0882ej.m3470x(9, 2, c1833kj3);
/* 117 */               c0882ej.m3449A(c1833kj3);
/* 120 */               return c1833kj3;
                    }
/* 125 */           if (((String) c1029ij.f9630c) == null) {
/* 131 */               ((xt0) c1029ij.f9631d).getClass();
/* 151 */               if (((zzco) c1029ij.f9632e).stream().anyMatch(new hf3()) || c1029ij.f9628a) {
/* 160 */                   if (!c0882ej.f7716l) {
/* 1884 */                      zze.zzl("BillingClient", "Current client doesn't support extra params for buy intent.");
/* 1887 */                      C1833kj c1833kj4 = kf3.f12729g;
/* 1891 */                      c0882ej.m3470x(18, 2, c1833kj4);
/* 1894 */                      c0882ej.m3449A(c1833kj4);
/* 1897 */                      return c1833kj4;
                            }
                        }
                    } else if (!c0882ej.f7716l) {
/* 1884 */              zze.zzl("BillingClient", "Current client doesn't support extra params for buy intent.");
/* 1887 */              C1833kj c1833kj5 = kf3.f12729g;
/* 1891 */              c0882ej.m3470x(18, 2, c1833kj5);
/* 1894 */              c0882ej.m3449A(c1833kj5);
/* 1897 */              return c1833kj5;
                    }
/* 167 */           if (arrayList.size() > 1 && !c0882ej.f7721q) {
/* 176 */               zze.zzl("BillingClient", "Current client doesn't support multi-item purchases.");
/* 179 */               C1833kj c1833kj6 = kf3.f12735m;
/* 183 */               c0882ej.m3470x(19, 2, c1833kj6);
/* 186 */               c0882ej.m3449A(c1833kj6);
/* 189 */               return c1833kj6;
                    }
/* 194 */           if (!zzcoVar2.isEmpty() && !c0882ej.f7722r) {
/* 203 */               zze.zzl("BillingClient", "Current client doesn't support purchases with ProductDetails.");
/* 206 */               C1833kj c1833kj7 = kf3.f12737o;
/* 210 */               c0882ej.m3470x(20, 2, c1833kj7);
/* 213 */               c0882ej.m3449A(c1833kj7);
/* 216 */               return c1833kj7;
                    }
/* 225 */           String str14 = "packageName";
/* 228 */           if (!((zzco) c1029ij.f9632e).isEmpty()) {
/* 252 */               C0993hj c0993hj3 = (C0993hj) ((zzco) c1029ij.f9632e).get(0);
/* 254 */               str = strM9259a;
/* 256 */               int i5 = 1;
                        while (true) {
/* 265 */                   str2 = strM9260b;
/* 269 */                   if (i5 >= ((zzco) c1029ij.f9632e).size()) {
/* 330 */                       str3 = str12;
/* 332 */                       zx1 zx1Var2 = c0993hj3.f9095a;
/* 336 */                       String strOptString = zx1Var2.f20366b.optString("packageName");
/* 342 */                       HashSet hashSet = new HashSet();
/* 347 */                       HashSet hashSet2 = new HashSet();
/* 354 */                       zzco zzcoVar3 = (zzco) c1029ij.f9632e;
/* 356 */                       int size = zzcoVar3.size();
/* 7 */                         str4 = "proxyPackageVersion";
/* 98 */                        str5 = "BillingClient";
/* 364 */                       int i6 = 0;
                                while (true) {
/* 367 */                           if (i6 < size) {
/* 373 */                               int i7 = i6;
/* 379 */                               zx1 zx1Var3 = ((C0993hj) zzcoVar3.get(i6)).f9095a;
/* 381 */                               int i8 = size;
/* 383 */                               String str15 = zx1Var3.f20367c;
/* 385 */                               zzco zzcoVar4 = zzcoVar3;
/* 389 */                               zx1Var3.f20368d.equals("subs");
/* 396 */                               if (hashSet.contains(str15)) {
/* 416 */                                   c1833kjM6096a = kf3.m6096a(5, "ProductId can not be duplicated. Invalid product id: " + str15 + ".");
                                            break;
                                        }
/* 422 */                               hashSet.add(str15);
/* 431 */                               if (!zx1Var2.f20368d.equals("play_pass_subs") && !zx1Var3.f20368d.equals("play_pass_subs") && !strOptString.equals(zx1Var3.f20366b.optString("packageName"))) {
/* 457 */                                   c1833kjM6096a = kf3.m6096a(5, "All products must have the same package name.");
                                            break;
                                        }
/* 462 */                               i6 = i7 + 1;
/* 464 */                               size = i8;
/* 466 */                               zzcoVar3 = zzcoVar4;
                                    } else {
/* 469 */                               Iterator it = hashSet2.iterator();
                                        while (true) {
/* 477 */                                   if (!it.hasNext()) {
/* 515 */                                       yx1 yx1VarM10449a = zx1Var2.m10449a();
/* 519 */                                       if (yx1VarM10449a != null && yx1VarM10449a.f19848e != null) {
/* 527 */                                           c1833kjM6096a = kf3.m6096a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                    break;
                                                }
/* 532 */                                       c1833kjM6096a = kf3.f12731i;
                                                break;
                                            }
/* 483 */                                   String str16 = (String) it.next();
/* 489 */                                   if (hashSet.contains(str16)) {
/* 509 */                                       c1833kjM6096a = kf3.m6096a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str16 + ".");
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 279 */                       C0993hj c0993hj4 = (C0993hj) ((zzco) c1029ij.f9632e).get(i5);
/* 281 */                       int i9 = i5;
/* 287 */                       str3 = str12;
/* 297 */                       if (!c0993hj4.f9095a.f20368d.equals(c0993hj3.f9095a.f20368d) && !c0993hj4.f9095a.f20368d.equals("play_pass_subs")) {
/* 313 */                           c1833kjM6096a = kf3.m6096a(5, "All products should have same ProductType.");
/* 7 */                             str4 = "proxyPackageVersion";
/* 98 */                            str5 = "BillingClient";
                                    break;
                                }
/* 323 */                       i5 = i9 + 1;
/* 325 */                       strM9260b = str2;
/* 327 */                       str12 = str3;
                            }
                        }
                    } else {
/* 230 */               c1833kjM6096a = kf3.f12731i;
/* 7 */                 str4 = "proxyPackageVersion";
/* 5 */                 str3 = "BUY_INTENT";
/* 98 */                str5 = "BillingClient";
/* 238 */               str = strM9259a;
/* 240 */               str2 = strM9260b;
                    }
/* 536 */           if (c1833kjM6096a != kf3.f12731i) {
/* 541 */               c0882ej.m3470x(120, 2, c1833kjM6096a);
/* 544 */               c0882ej.m3449A(c1833kjM6096a);
/* 547 */               return c1833kjM6096a;
                    }
/* 550 */           if (c0882ej.f7716l) {
/* 552 */               boolean z3 = c0882ej.f7717m;
/* 556 */               c0882ej.f7727w.getClass();
/* 561 */               c0882ej.f7727w.getClass();
/* 564 */               boolean z4 = c0882ej.f7728x;
/* 566 */               String str17 = c0882ej.f7707c;
/* 570 */               long jLongValue = c0882ej.f7704A.longValue();
/* 576 */               final String packageName = c0882ej.f7710f.getPackageName();
/* 582 */               final Bundle bundle = new Bundle();
/* 585 */               zze.zzc(bundle, str17, jLongValue);
/* 592 */               ((xt0) c1029ij.f9631d).getClass();
/* 603 */               if (!TextUtils.isEmpty((String) c1029ij.f9630c)) {
/* 611 */                   bundle.putString("accountId", (String) c1029ij.f9630c);
                        }
/* 618 */               if (TextUtils.isEmpty(null)) {
/* 628 */                   str7 = null;
                        } else {
/* 622 */                   str7 = null;
/* 624 */                   bundle.putString("obfuscatedProfileId", null);
                        }
/* 634 */               if (!TextUtils.isEmpty(str7)) {
/* 651 */                   bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str7)));
                        }
/* 658 */               ((xt0) c1029ij.f9631d).getClass();
/* 665 */               if (!TextUtils.isEmpty(str7)) {
/* 671 */                   ((xt0) c1029ij.f9631d).getClass();
/* 676 */                   bundle.putString("oldSkuPurchaseToken", str7);
                        }
/* 683 */               if (!TextUtils.isEmpty(str7)) {
/* 687 */                   bundle.putString("oldSkuPurchaseId", str7);
                        }
/* 694 */               ((xt0) c1029ij.f9631d).getClass();
/* 701 */               if (!TextUtils.isEmpty(str7)) {
/* 707 */                   ((xt0) c1029ij.f9631d).getClass();
/* 712 */                   bundle.putString("originalExternalTransactionId", str7);
                        }
/* 719 */               if (!TextUtils.isEmpty(str7)) {
/* 723 */                   bundle.putString("paymentsPurchaseParams", str7);
                        }
/* 726 */               if (z3) {
/* 730 */                   z = true;
/* 731 */                   bundle.putBoolean("enablePendingPurchases", true);
                        } else {
/* 735 */                   z = true;
                        }
/* 736 */               if (z4) {
/* 740 */                   bundle.putBoolean("enableAlternativeBilling", z);
                        }
/* 760 */               if (((zzco) c1029ij.f9632e).stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zza
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
/* 3 */                         int i10 = zze.zza;
/* 5 */                         return false;
                            }
                        })) {
/* 762 */                   zzfm zzfmVarZza = zzfn.zza();
/* 802 */                   zzfmVarZza.zza((Iterable) ((zzco) c1029ij.f9632e).stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zzb
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
/* 3 */                             int i10 = zze.zza;
/* 5 */                             return false;
                                }
                            }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.zzc
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
/* 3 */                             int i10 = zze.zza;
/* 7 */                             String str18 = ((C0993hj) obj).f9095a.f20367c;
/* 9 */                             zzfk zzfkVarZza = zzfl.zza();
/* 13 */                            zzfp zzfpVarZza = zzfq.zza();
/* 41 */                            zzfpVarZza.zza("subs:" + packageName + ":" + str18);
/* 44 */                            zzfkVarZza.zza(zzfpVarZza);
/* 47 */                            zzfq.zza();
/* 51 */                            throw null;
                                }
                            }).collect(zzco.zzo()));
/* 817 */                   bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzfn) zzfmVarZza.zzf()).zzh());
                        }
/* 824 */               String str18 = "additionalSkuTypes";
/* 834 */               if (arrayList.isEmpty()) {
/* 1144 */                  zzco zzcoVar5 = zzcoVar2;
/* 1146 */                  ve2Var = ve2Var2;
/* 1148 */                  c0993hj = c0993hj2;
/* 824 */                   String str19 = "additionalSkuTypes";
/* 225 */                   str8 = "packageName";
/* 1161 */                  ArrayList<String> arrayList2 = new ArrayList<>(zzcoVar5.size() - 1);
/* 1172 */                  ArrayList<String> arrayList3 = new ArrayList<>(zzcoVar5.size() - 1);
/* 1177 */                  ArrayList<String> arrayList4 = new ArrayList<>();
/* 1182 */                  ArrayList<String> arrayList5 = new ArrayList<>();
/* 1187 */                  ArrayList<String> arrayList6 = new ArrayList<>();
/* 1192 */                  ArrayList<Integer> arrayList7 = new ArrayList<>();
/* 1195 */                  int i10 = 0;
/* 1200 */                  while (i10 < zzcoVar5.size()) {
/* 1202 */                      zzco zzcoVar6 = zzcoVar5;
/* 1208 */                      C0993hj c0993hj5 = (C0993hj) zzcoVar6.get(i10);
/* 1210 */                      zx1 zx1Var4 = c0993hj5.f9095a;
/* 1212 */                      String str20 = str19;
/* 1220 */                      if (!zx1Var4.f20372h.isEmpty()) {
/* 1224 */                          arrayList4.add(zx1Var4.f20372h);
                                }
/* 1229 */                      arrayList5.add(c0993hj5.f9096b);
/* 1232 */                      String str21 = zx1Var4.f20373i;
/* 1234 */                      ArrayList arrayList8 = zx1Var4.f20375k;
/* 1236 */                      if (arrayList8 == null || arrayList8.isEmpty()) {
/* 1280 */                          str9 = str21;
                                    break;
                                }
/* 1246 */                      Iterator it2 = zx1Var4.f20375k.iterator();
                                while (true) {
/* 1254 */                          if (!it2.hasNext()) {
/* 1280 */                              str9 = str21;
                                        break;
                                    }
/* 1260 */                          yx1 yx1Var = (yx1) it2.next();
/* 1262 */                          String str22 = str21;
/* 1270 */                          if (!TextUtils.isEmpty(yx1Var.f19847d)) {
/* 1272 */                              str9 = yx1Var.f19847d;
                                        break;
                                    }
/* 1275 */                          str21 = str22;
                                }
/* 1286 */                      if (!TextUtils.isEmpty(str9)) {
/* 1288 */                          arrayList6.add(str9);
                                }
/* 1291 */                      if (i10 > 0) {
/* 1303 */                          arrayList2.add(((C0993hj) zzcoVar6.get(i10)).f9095a.f20367c);
/* 1316 */                          arrayList3.add(((C0993hj) zzcoVar6.get(i10)).f9095a.f20368d);
                                }
/* 1319 */                      i10++;
/* 1321 */                      zzcoVar5 = zzcoVar6;
/* 1323 */                      str19 = str20;
                            }
/* 1327 */                  String str23 = str19;
/* 1329 */                  zzcoVar = zzcoVar5;
/* 1331 */                  bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
/* 1336 */                  bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
/* 1343 */                  if (!arrayList4.isEmpty()) {
/* 1345 */                      bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                            }
/* 1352 */                  if (!arrayList6.isEmpty()) {
/* 1354 */                      bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                            }
/* 1361 */                  if (!arrayList2.isEmpty()) {
/* 1363 */                      bundle.putStringArrayList("additionalSkus", arrayList2);
/* 1368 */                      bundle.putStringArrayList(str23, arrayList3);
                            }
                        } else {
/* 838 */                   ArrayList<String> arrayList9 = new ArrayList<>();
/* 843 */                   ArrayList<String> arrayList10 = new ArrayList<>();
/* 848 */                   ArrayList<String> arrayList11 = new ArrayList<>();
/* 853 */                   ArrayList<Integer> arrayList12 = new ArrayList<>();
/* 856 */                   c0993hj = c0993hj2;
/* 860 */                   ArrayList<String> arrayList13 = new ArrayList<>();
/* 867 */                   boolean z5 = false;
/* 869 */                   boolean z6 = false;
/* 871 */                   boolean z7 = false;
/* 873 */                   boolean z8 = false;
/* 879 */                   for (ve2 ve2Var3 : arrayList) {
/* 885 */                       String str24 = str14;
/* 891 */                       ve2 ve2Var4 = ve2Var2;
/* 905 */                       if (!ve2Var3.f18024b.optString("skuDetailsToken").isEmpty()) {
/* 913 */                           arrayList9.add(ve2Var3.f18024b.optString("skuDetailsToken"));
                                }
/* 916 */                       JSONObject jSONObject = ve2Var3.f18024b;
/* 920 */                       String strOptString2 = jSONObject.optString("offerIdToken");
/* 928 */                       if (strOptString2.isEmpty()) {
/* 932 */                           strOptString2 = jSONObject.optString("offer_id_token");
                                }
/* 938 */                       zzco zzcoVar7 = zzcoVar2;
/* 942 */                       String strOptString3 = ve2Var3.f18024b.optString("offer_id");
/* 948 */                       String str25 = str18;
/* 952 */                       int iOptInt = ve2Var3.f18024b.optInt("offer_type");
/* 960 */                       String strOptString4 = ve2Var3.f18024b.optString("serializedDocid");
/* 964 */                       arrayList10.add(strOptString2);
/* 975 */                       z5 |= !TextUtils.isEmpty(strOptString2);
/* 977 */                       arrayList11.add(strOptString3);
/* 986 */                       z6 |= !TextUtils.isEmpty(strOptString3);
/* 992 */                       arrayList12.add(Integer.valueOf(iOptInt));
/* 1001 */                      z7 |= iOptInt != 0;
/* 1009 */                      z8 |= !TextUtils.isEmpty(strOptString4);
/* 1011 */                      arrayList13.add(strOptString4);
/* 1016 */                      ve2Var2 = ve2Var4;
/* 1018 */                      str14 = str24;
/* 1020 */                      zzcoVar2 = zzcoVar7;
/* 1022 */                      str18 = str25;
                            }
/* 1026 */                  zzco zzcoVar8 = zzcoVar2;
/* 1028 */                  ve2Var = ve2Var2;
/* 1030 */                  String str26 = str18;
/* 1032 */                  str8 = str14;
/* 1038 */                  if (!arrayList9.isEmpty()) {
/* 1040 */                      bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                            }
/* 1043 */                  if (z5) {
/* 1045 */                      bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                            }
/* 1048 */                  if (z6) {
/* 1052 */                      bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                            }
/* 1055 */                  if (z7) {
/* 1059 */                      bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                            }
/* 1062 */                  if (z8) {
/* 1064 */                      bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                            }
/* 1072 */                  if (arrayList.size() > 1) {
/* 1082 */                      ArrayList<String> arrayList14 = new ArrayList<>(arrayList.size() - 1);
/* 1093 */                      ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
/* 1101 */                      for (int i11 = 1; i11 < arrayList.size(); i11++) {
/* 1113 */                          arrayList14.add(((ve2) arrayList.get(i11)).m9259a());
/* 1126 */                          arrayList15.add(((ve2) arrayList.get(i11)).m9260b());
                                }
/* 1132 */                      bundle.putStringArrayList("additionalSkus", arrayList14);
/* 1137 */                      bundle.putStringArrayList(str26, arrayList15);
                            }
/* 1140 */                  zzcoVar = zzcoVar8;
                        }
/* 1375 */              c0882ej = this;
/* 1377 */              if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c0882ej.f7719o) {
/* 1384 */                  C1833kj c1833kj8 = kf3.f12736n;
/* 1389 */                  c0882ej.m3470x(21, 2, c1833kj8);
/* 1392 */                  c0882ej.m3449A(c1833kj8);
/* 1395 */                  return c1833kj8;
                        }
/* 1398 */              if (ve2Var != null) {
/* 1400 */                  ve2 ve2Var5 = ve2Var;
/* 1404 */                  str10 = str8;
/* 1414 */                  if (!TextUtils.isEmpty(ve2Var5.f18024b.optString(str10))) {
/* 1422 */                      bundle.putString("skuPackageName", ve2Var5.f18024b.optString(str10));
                            }
/* 1425 */                  z2 = true;
/* 1426 */                  string = null;
/* 1466 */                  if (!TextUtils.isEmpty(null)) {
/* 1470 */                      bundle.putString("accountName", null);
                            }
/* 1473 */                  intent = activity.getIntent();
/* 1477 */                  if (intent == null) {
/* 1481 */                      str6 = str5;
/* 1483 */                      zze.zzl(str6, "Activity's intent is null.");
                            } else {
/* 1487 */                      str6 = str5;
/* 1499 */                      if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
/* 1501 */                          String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
/* 1507 */                          bundle.putString("proxyPackage", stringExtra);
                                    try {
/* 1523 */                              str11 = str4;
                                        try {
/* 1525 */                                  bundle.putString(str11, c0882ej.f7710f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                        } catch (PackageManager.NameNotFoundException unused) {
/* 1533 */                                  bundle.putString(str11, "package not found");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused2) {
/* 1529 */                              str11 = str4;
                                    }
                                }
                            }
/* 1538 */                  if (!c0882ej.f7722r && !zzcoVar.isEmpty()) {
/* 1546 */                      i3 = 17;
                            } else if (c0882ej.f7720p || !z2) {
/* 1561 */                      if (c0882ej.f7717m) {
/* 1563 */                          i4 = 9;
                                } else {
/* 1566 */                          i3 = 6;
                                }
/* 1573 */                      final String str27 = str;
/* 1575 */                      final String str28 = str2;
/* 1594 */                      futureM3447h = m3447h(new Callable(i4, str27, str28, c1029ij, bundle) { // from class: vd3

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ int f18013b;

                                    /* JADX INFO: renamed from: c */
                                    public final /* synthetic */ String f18014c;

                                    /* JADX INFO: renamed from: d */
                                    public final /* synthetic */ String f18015d;

                                    /* JADX INFO: renamed from: e */
                                    public final /* synthetic */ Bundle f18016e;

                                    {
/* 12 */                                this.f18016e = bundle;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        zzan zzanVar;
/* 1 */                                 C0882ej c0882ej2 = this.f18012a;
/* 3 */                                 int i12 = this.f18013b;
/* 5 */                                 String str29 = this.f18014c;
/* 7 */                                 String str30 = this.f18015d;
/* 9 */                                 Bundle bundle2 = this.f18016e;
                                        try {
                                            synchronized (c0882ej2.f7705a) {
/* 16 */                                        zzanVar = c0882ej2.f7712h;
                                            }
                                            return zzanVar == null ? zze.zzn(kf3.f12732j, 119) : zzanVar.zzg(i12, c0882ej2.f7710f.getPackageName(), str29, str30, null, bundle2);
                                        } catch (DeadObjectException e) {
/* 66 */                                    return zze.zzo(kf3.f12732j, 5, if3.m4523a(e));
                                        } catch (Exception e2) {
/* 55 */                                    return zze.zzo(kf3.f12730h, 5, if3.m4523a(e2));
                                        }
                                    }
                                }, 5000L, null, c0882ej.f7708d, c0882ej.m3458l());
/* 1598 */                      i = 2;
                            } else {
/* 1556 */                      i3 = 15;
                            }
/* 1548 */                  i4 = i3;
/* 1573 */                  final String str29 = str;
/* 1575 */                  final String str210 = str2;
/* 1594 */                  futureM3447h = m3447h(new Callable(i4, str29, str210, c1029ij, bundle) { // from class: vd3

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ int f18013b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ String f18014c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ String f18015d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ Bundle f18016e;

                                {
/* 12 */                            this.f18016e = bundle;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    zzan zzanVar;
/* 1 */                             C0882ej c0882ej2 = this.f18012a;
/* 3 */                             int i12 = this.f18013b;
/* 5 */                             String str211 = this.f18014c;
/* 7 */                             String str30 = this.f18015d;
/* 9 */                             Bundle bundle2 = this.f18016e;
                                    try {
                                        synchronized (c0882ej2.f7705a) {
/* 16 */                                    zzanVar = c0882ej2.f7712h;
                                        }
                                        return zzanVar == null ? zze.zzn(kf3.f12732j, 119) : zzanVar.zzg(i12, c0882ej2.f7710f.getPackageName(), str211, str30, null, bundle2);
                                    } catch (DeadObjectException e) {
/* 66 */                                return zze.zzo(kf3.f12732j, 5, if3.m4523a(e));
                                    } catch (Exception e2) {
/* 55 */                                return zze.zzo(kf3.f12730h, 5, if3.m4523a(e2));
                                    }
                                }
                            }, 5000L, null, c0882ej.f7708d, c0882ej.m3458l());
/* 1598 */                  i = 2;
                        } else {
/* 1428 */                  str10 = str8;
                        }
/* 1430 */              if (c0993hj != null) {
/* 1432 */                  C0993hj c0993hj6 = c0993hj;
/* 1446 */                  if (!TextUtils.isEmpty(c0993hj6.f9095a.f20366b.optString(str10))) {
/* 1456 */                      bundle.putString("skuPackageName", c0993hj6.f9095a.f20366b.optString(str10));
/* 1425 */                      z2 = true;
                            }
/* 1426 */                  string = null;
/* 1466 */                  if (!TextUtils.isEmpty(null)) {
/* 1470 */                      bundle.putString("accountName", null);
                            }
/* 1473 */                  intent = activity.getIntent();
/* 1477 */                  if (intent == null) {
/* 1481 */                      str6 = str5;
/* 1483 */                      zze.zzl(str6, "Activity's intent is null.");
                            } else {
/* 1487 */                      str6 = str5;
/* 1499 */                      if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
/* 1501 */                          String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
/* 1507 */                          bundle.putString("proxyPackage", stringExtra2);
/* 1523 */                          str11 = str4;
/* 1525 */                          bundle.putString(str11, c0882ej.f7710f.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                                }
                            }
/* 1538 */                  if (!c0882ej.f7722r) {
/* 1552 */                      if (c0882ej.f7720p) {
/* 1561 */                          if (c0882ej.f7717m) {
/* 1563 */                              i4 = 9;
                                    } else {
/* 1566 */                              i3 = 6;
/* 1548 */                              i4 = i3;
                                    }
                                } else if (c0882ej.f7717m) {
/* 1563 */                          i4 = 9;
                                } else {
/* 1566 */                          i3 = 6;
/* 1548 */                          i4 = i3;
                                }
                            } else if (c0882ej.f7720p) {
/* 1561 */                      if (c0882ej.f7717m) {
/* 1563 */                          i4 = 9;
                                } else {
/* 1566 */                          i3 = 6;
/* 1548 */                          i4 = i3;
                                }
                            } else if (c0882ej.f7717m) {
/* 1563 */                      i4 = 9;
                            } else {
/* 1566 */                      i3 = 6;
/* 1548 */                      i4 = i3;
                            }
/* 1573 */                  final String str211 = str;
/* 1575 */                  final String str212 = str2;
/* 1594 */                  futureM3447h = m3447h(new Callable(i4, str211, str212, c1029ij, bundle) { // from class: vd3

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ int f18013b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ String f18014c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ String f18015d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ Bundle f18016e;

                                {
/* 12 */                            this.f18016e = bundle;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    zzan zzanVar;
/* 1 */                             C0882ej c0882ej2 = this.f18012a;
/* 3 */                             int i12 = this.f18013b;
/* 5 */                             String str213 = this.f18014c;
/* 7 */                             String str30 = this.f18015d;
/* 9 */                             Bundle bundle2 = this.f18016e;
                                    try {
                                        synchronized (c0882ej2.f7705a) {
/* 16 */                                    zzanVar = c0882ej2.f7712h;
                                        }
                                        return zzanVar == null ? zze.zzn(kf3.f12732j, 119) : zzanVar.zzg(i12, c0882ej2.f7710f.getPackageName(), str213, str30, null, bundle2);
                                    } catch (DeadObjectException e) {
/* 66 */                                return zze.zzo(kf3.f12732j, 5, if3.m4523a(e));
                                    } catch (Exception e2) {
/* 55 */                                return zze.zzo(kf3.f12730h, 5, if3.m4523a(e2));
                                    }
                                }
                            }, 5000L, null, c0882ej.f7708d, c0882ej.m3458l());
/* 1598 */                  i = 2;
                        }
/* 1460 */              z2 = false;
/* 1426 */              string = null;
/* 1466 */              if (!TextUtils.isEmpty(null)) {
/* 1470 */                  bundle.putString("accountName", null);
                        }
/* 1473 */              intent = activity.getIntent();
/* 1477 */              if (intent == null) {
/* 1481 */                  str6 = str5;
/* 1483 */                  zze.zzl(str6, "Activity's intent is null.");
                        } else {
/* 1487 */                  str6 = str5;
/* 1499 */                  if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
/* 1501 */                      String stringExtra3 = intent.getStringExtra("PROXY_PACKAGE");
/* 1507 */                      bundle.putString("proxyPackage", stringExtra3);
/* 1523 */                      str11 = str4;
/* 1525 */                      bundle.putString(str11, c0882ej.f7710f.getPackageManager().getPackageInfo(stringExtra3, 0).versionName);
                            }
                        }
/* 1538 */              if (!c0882ej.f7722r) {
/* 1552 */                  if (c0882ej.f7720p) {
/* 1561 */                      if (c0882ej.f7717m) {
/* 1563 */                          i4 = 9;
                                } else {
/* 1566 */                          i3 = 6;
/* 1548 */                          i4 = i3;
                                }
                            } else if (c0882ej.f7717m) {
/* 1563 */                      i4 = 9;
                            } else {
/* 1566 */                      i3 = 6;
/* 1548 */                      i4 = i3;
                            }
                        } else if (c0882ej.f7720p) {
/* 1561 */                  if (c0882ej.f7717m) {
/* 1563 */                      i4 = 9;
                            } else {
/* 1566 */                      i3 = 6;
/* 1548 */                      i4 = i3;
                            }
                        } else if (c0882ej.f7717m) {
/* 1563 */                  i4 = 9;
                        } else {
/* 1566 */                  i3 = 6;
/* 1548 */                  i4 = i3;
                        }
/* 1573 */              final String str213 = str;
/* 1575 */              final String str214 = str2;
/* 1594 */              futureM3447h = m3447h(new Callable(i4, str213, str214, c1029ij, bundle) { // from class: vd3

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ int f18013b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ String f18014c;

                            /* JADX INFO: renamed from: d */
                            public final /* synthetic */ String f18015d;

                            /* JADX INFO: renamed from: e */
                            public final /* synthetic */ Bundle f18016e;

                            {
/* 12 */                        this.f18016e = bundle;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzan zzanVar;
/* 1 */                         C0882ej c0882ej2 = this.f18012a;
/* 3 */                         int i12 = this.f18013b;
/* 5 */                         String str215 = this.f18014c;
/* 7 */                         String str30 = this.f18015d;
/* 9 */                         Bundle bundle2 = this.f18016e;
                                try {
                                    synchronized (c0882ej2.f7705a) {
/* 16 */                                zzanVar = c0882ej2.f7712h;
                                    }
                                    return zzanVar == null ? zze.zzn(kf3.f12732j, 119) : zzanVar.zzg(i12, c0882ej2.f7710f.getPackageName(), str215, str30, null, bundle2);
                                } catch (DeadObjectException e) {
/* 66 */                            return zze.zzo(kf3.f12732j, 5, if3.m4523a(e));
                                } catch (Exception e2) {
/* 55 */                            return zze.zzo(kf3.f12730h, 5, if3.m4523a(e2));
                                }
                            }
                        }, 5000L, null, c0882ej.f7708d, c0882ej.m3458l());
/* 1598 */              i = 2;
                    } else {
/* 1600 */              string = null;
/* 1606 */              str6 = str5;
/* 1610 */              i = 2;
/* 1623 */              futureM3447h = m3447h(new kd3(c0882ej, str, str2, i), 5000L, null, c0882ej.f7708d, c0882ej.m3458l());
                    }
                    try {
/* 1627 */              if (futureM3447h == null) {
/* 1629 */                  C1833kj c1833kj9 = kf3.f12725c;
/* 1633 */                  c0882ej.m3470x(25, i, c1833kj9);
/* 1636 */                  c0882ej.m3449A(c1833kj9);
/* 1639 */                  return c1833kj9;
                        }
/* 1658 */              Bundle bundle2 = (Bundle) futureM3447h.get(5000L, TimeUnit.MILLISECONDS);
/* 1660 */              int iZzb = zze.zzb(bundle2, str6);
/* 1664 */              String strZzh = zze.zzh(bundle2, str6);
/* 1668 */              if (iZzb == 0) {
/* 1820 */                  Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
/* 1823 */                  String str30 = str3;
/* 1831 */                  intent2.putExtra(str30, (PendingIntent) bundle2.getParcelable(str30));
/* 1834 */                  activity.startActivity(intent2);
/* 1837 */                  return kf3.f12731i;
                        }
/* 1687 */              zze.zzl(str6, "Unable to buy item, Error response code: " + iZzb);
/* 1690 */              C1833kj c1833kjM6096a2 = kf3.m6096a(iZzb, strZzh);
/* 1694 */              if (bundle2 == null) {
/* 1696 */                  i2 = 1;
/* 1697 */                  iZza = 1;
                        } else {
                            try {
/* 1701 */                      Object obj = bundle2.get("LOG_REASON");
/* 1705 */                      if (obj != null) {
/* 1710 */                          if (obj instanceof Integer) {
/* 1718 */                              iZza = zzkg.zza(((Integer) obj).intValue());
/* 1722 */                              i2 = 1;
                                    } else {
/* 1751 */                              zze.zzl(str6, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                    }
                                }
                            } catch (Throwable th) {
/* 1769 */                      zze.zzl(str6, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                            }
/* 1696 */                  i2 = 1;
/* 1697 */                  iZza = 1;
                        }
/* 1773 */              if (iZza == i2) {
/* 1775 */                  iZza = 23;
                        }
/* 1777 */              if (bundle2 != null) {
                            try {
/* 1783 */                      string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
/* 1803 */                      zze.zzl(str6, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                        }
/* 1807 */              c0882ej.m3471y(iZza, 2, c1833kjM6096a2, string);
/* 1810 */              c0882ej.m3449A(c1833kjM6096a2);
/* 1813 */              return c1833kjM6096a2;
                    } catch (CancellationException e) {
/* 1643 */              e = e;
/* 1862 */              zze.zzm(str6, "Time out while launching billing flow. Try to reconnect", e);
/* 1865 */              C1833kj c1833kj10 = kf3.f12733k;
/* 1873 */              c0882ej.m3471y(4, 2, c1833kj10, if3.m4523a(e));
/* 1876 */              c0882ej.m3449A(c1833kj10);
/* 1879 */              return c1833kj10;
                    } catch (TimeoutException e2) {
/* 1646 */              e = e2;
/* 1862 */              zze.zzm(str6, "Time out while launching billing flow. Try to reconnect", e);
/* 1865 */              C1833kj c1833kj11 = kf3.f12733k;
/* 1873 */              c0882ej.m3471y(4, 2, c1833kj11, if3.m4523a(e));
/* 1876 */              c0882ej.m3449A(c1833kj11);
/* 1879 */              return c1833kj11;
                    } catch (Exception e3) {
/* 1842 */              zze.zzm(str6, "Exception while launching billing flow. Try to reconnect", e3);
/* 1845 */              C1833kj c1833kj12 = kf3.f12732j;
/* 1853 */              c0882ej.m3471y(5, 2, c1833kj12, if3.m4523a(e3));
/* 1856 */              c0882ej.m3449A(c1833kj12);
/* 1859 */              return c1833kj12;
                    }
                }

                /* JADX INFO: renamed from: e */
                public void mo3453e(fs0 fs0Var, C0800g c0800g) {
/* 6 */             if (!m3451c()) {
/* 8 */                 C1833kj c1833kj = kf3.f12732j;
/* 11 */                m3470x(2, 7, c1833kj);
/* 19 */                c0800g.m2753a(c1833kj, new ArrayList());
                    } else {
/* 25 */                if (!this.f7722r) {
/* 31 */                    zze.zzl("BillingClient", "Querying product details is not supported.");
/* 34 */                    C1833kj c1833kj2 = kf3.f12737o;
/* 38 */                    m3470x(20, 7, c1833kj2);
/* 46 */                    c0800g.m2753a(c1833kj2, new ArrayList());
/* 49 */                    return;
                        }
/* 77 */                if (m3447h(new kd3(this, fs0Var, c0800g, 1), 30000L, new dp0(24, this, c0800g), m3467u(), m3458l()) == null) {
/* 79 */                    C1833kj c1833kjM3456i = m3456i();
/* 85 */                    m3470x(25, 7, c1833kjM3456i);
/* 93 */                    c0800g.m2753a(c1833kjM3456i, new ArrayList());
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public void mo3454f(we2 we2Var, C0801h c0801h) {
/* 8 */             if (!m3451c()) {
/* 10 */                C1833kj c1833kj = kf3.f12732j;
/* 13 */                m3470x(2, 8, c1833kj);
/* 16 */                c0801h.m2754a(c1833kj, null);
/* 19 */                return;
                    }
/* 22 */            String str = (String) we2Var.f18596c;
/* 26 */            ArrayList arrayList = (ArrayList) we2Var.f18595b;
/* 32 */            if (TextUtils.isEmpty(str)) {
/* 38 */                zze.zzl("BillingClient", "Please fix the input params. SKU type can't be empty.");
/* 41 */                C1833kj c1833kj2 = kf3.f12727e;
/* 45 */                m3470x(49, 8, c1833kj2);
/* 48 */                c0801h.m2754a(c1833kj2, null);
/* 51 */                return;
                    }
/* 78 */            if (m3447h(new pj3(this, str, arrayList, c0801h), 30000L, new cp0(22, this, c0801h), m3467u(), m3458l()) == null) {
/* 80 */                C1833kj c1833kjM3456i = m3456i();
/* 86 */                m3470x(25, 8, c1833kjM3456i);
/* 89 */                c0801h.m2754a(c1833kjM3456i, null);
                    }
                }

                /* JADX INFO: renamed from: g */
                public void mo3455g(InterfaceC0919fj interfaceC0919fj) {
                    C1833kj c1833kjM3468v;
                    C1833kj c1833kj;
                    synchronized (this.f7705a) {
                        try {
/* 8 */                     if (m3451c()) {
/* 10 */                        c1833kjM3468v = m3468v();
                            } else {
/* 24 */                        if (this.f7706b == 1) {
/* 30 */                            zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
/* 33 */                            c1833kj = kf3.f12726d;
/* 37 */                            m3470x(37, 6, c1833kj);
                                } else if (this.f7706b == 3) {
/* 53 */                            zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
/* 56 */                            c1833kj = kf3.f12732j;
/* 60 */                            m3470x(38, 6, c1833kj);
                                } else {
/* 65 */                            m3461o(1);
/* 68 */                            m3462p();
/* 75 */                            zze.zzk("BillingClient", "Starting in-app billing setup.");
/* 83 */                            this.f7713i = new ne3(this, interfaceC0919fj);
/* 90 */                            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
/* 95 */                            intent.setPackage("com.android.vending");
/* 105 */                           List<ResolveInfo> listQueryIntentServices = this.f7710f.getPackageManager().queryIntentServices(intent, 0);
/* 109 */                           int i = 41;
/* 111 */                           if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 249 */                               m3461o(0);
/* 256 */                               zze.zzk("BillingClient", "Billing service unavailable on device.");
/* 259 */                               C1833kj c1833kj2 = kf3.f12724b;
/* 261 */                               m3470x(i, 6, c1833kj2);
/* 264 */                               c1833kjM3468v = c1833kj2;
                                    } else {
/* 125 */                               ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 127 */                               i = 40;
/* 129 */                               if (serviceInfo != null) {
/* 131 */                                   String str = serviceInfo.packageName;
/* 133 */                                   String str2 = serviceInfo.name;
/* 141 */                                   if (!Objects.equals(str, "com.android.vending") || str2 == null) {
/* 238 */                                       zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                                            } else {
/* 147 */                                       ComponentName componentName = new ComponentName(str, str2);
/* 152 */                                       Intent intent2 = new Intent(intent);
/* 155 */                                       intent2.setComponent(componentName);
/* 162 */                                       intent2.putExtra("playBillingLibraryVersion", this.f7707c);
                                                synchronized (this.f7705a) {
                                                    try {
/* 171 */                                               if (this.f7706b == 2) {
/* 173 */                                                   c1833kjM3468v = m3468v();
                                                        } else if (this.f7706b != 1) {
/* 189 */                                                   zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
/* 192 */                                                   c1833kj = kf3.f12732j;
/* 196 */                                                   m3470x(117, 6, c1833kj);
                                                        } else {
/* 202 */                                                   ne3 ne3Var = this.f7713i;
/* 211 */                                                   if (this.f7710f.bindService(intent2, ne3Var, 1)) {
/* 217 */                                                       zze.zzk("BillingClient", "Service was bonded successfully.");
/* 220 */                                                       c1833kjM3468v = null;
                                                            } else {
/* 226 */                                                       zze.zzl("BillingClient", "Connection to Billing service is blocked.");
/* 229 */                                                       i = 39;
                                                            }
                                                        }
                                                    } catch (Throwable th) {
/* 233 */                                               throw th;
                                                    }
                                                }
                                            }
                                        } else {
/* 246 */                                   zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                                        }
/* 249 */                               m3461o(0);
/* 256 */                               zze.zzk("BillingClient", "Billing service unavailable on device.");
/* 259 */                               C1833kj c1833kj3 = kf3.f12724b;
/* 261 */                               m3470x(i, 6, c1833kj3);
/* 264 */                               c1833kjM3468v = c1833kj3;
                                    }
                                }
/* 41 */                        c1833kjM3468v = c1833kj;
                            }
                        } catch (Throwable th2) {
/* 272 */                   throw th2;
                        }
                    }
/* 265 */           if (c1833kjM3468v != null) {
/* 267 */               interfaceC0919fj.onBillingSetupFinished(c1833kjM3468v);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final C1833kj m3456i() {
/* 3 */             int[] iArr = {0, 3};
                    synchronized (this.f7705a) {
/* 11 */                for (int i = 0; i < 2; i++) {
/* 17 */                    if (this.f7706b == iArr[i]) {
/* 20 */                        return kf3.f12732j;
                            }
                        }
/* 29 */                return kf3.f12730h;
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m3457j() {
/* 6 */             if (TextUtils.isEmpty(null)) {
/* 11 */                this.f7710f.getPackageName();
                    }
                }

                /* JADX INFO: renamed from: l */
                public final synchronized ExecutorService m3458l() {
                    try {
/* 4 */                 if (this.f7729y == null) {
/* 17 */                    this.f7729y = Executors.newFixedThreadPool(zze.zza, new hl1());
                        }
                    } catch (Throwable th) {
/* 27 */                throw th;
                    }
/* 22 */            return this.f7729y;
                }

                /* JADX INFO: renamed from: m */
                public final void m3459m(zzjz zzjzVar) {
                    try {
/* 5 */                 this.f7711g.m9570u(zzjzVar, this.f7715k);
                    } catch (Throwable th) {
/* 14 */                zze.zzm("BillingClient", "Unable to log.", th);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m3460n(zzkd zzkdVar) {
                    try {
/* 3 */                 we2 we2Var = this.f7711g;
/* 5 */                 int i = this.f7715k;
/* 7 */                 we2Var.getClass();
                        try {
/* 18 */                    zzks zzksVar = (zzks) ((zzku) we2Var.f18596c).zzn();
/* 20 */                    zzksVar.zza(i);
/* 29 */                    we2Var.f18596c = (zzku) zzksVar.zzf();
/* 31 */                    we2Var.m9571v(zzkdVar);
                        } catch (Throwable th) {
/* 38 */                    zze.zzm("BillingLogger", "Unable to log.", th);
                        }
                    } catch (Throwable th2) {
/* 45 */                zze.zzm("BillingClient", "Unable to log.", th2);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m3461o(int i) {
                    String str;
                    String str2;
                    synchronized (this.f7705a) {
                        try {
/* 9 */                     if (this.f7706b == 3) {
/* 12 */                        return;
                            }
/* 17 */                    int i2 = this.f7706b;
/* 21 */                    if (i2 == 0) {
/* 36 */                        str = "DISCONNECTED";
                            } else if (i2 != 1) {
/* 30 */                        str = i2 != 2 ? "CLOSED" : "CONNECTED";
                            } else {
/* 33 */                        str = "CONNECTING";
                            }
/* 38 */                    if (i == 0) {
/* 53 */                        str2 = "DISCONNECTED";
                            } else if (i != 1) {
/* 47 */                        str2 = i != 2 ? "CLOSED" : "CONNECTED";
                            } else {
/* 50 */                        str2 = "CONNECTING";
                            }
/* 75 */                    zze.zzk("BillingClient", "Setting clientState from " + str + " to " + str2);
/* 78 */                    this.f7706b = i;
                        } catch (Throwable th) {
/* 83 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: p */
                public final void m3462p() {
                    synchronized (this.f7705a) {
/* 6 */                 if (this.f7713i != null) {
                            try {
/* 13 */                        this.f7710f.unbindService(this.f7713i);
/* 16 */                        this.f7712h = null;
/* 18 */                        this.f7713i = null;
                            } catch (Throwable th) {
                                try {
/* 28 */                            zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
/* 31 */                            this.f7712h = null;
/* 33 */                            this.f7713i = null;
                                } catch (Throwable th2) {
/* 37 */                            this.f7712h = null;
/* 39 */                            this.f7713i = null;
/* 41 */                            throw th2;
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: q */
                public final bx0 m3463q(C1833kj c1833kj, int i, String str, Exception exc) {
/* 3 */             zze.zzm("BillingClient", str, exc);
/* 11 */            m3471y(i, 7, c1833kj, if3.m4523a(exc));
/* 26 */            return new bx0(c1833kj.f12818a, c1833kj.f12819b, new ArrayList(), 6);
                }

                /* JADX INFO: renamed from: r */
                public final we2 m3464r(C1833kj c1833kj, int i, String str, Exception exc) {
/* 7 */             m3471y(i, 9, c1833kj, if3.m4523a(exc));
/* 12 */            zze.zzm("BillingClient", str, exc);
/* 20 */            return new we2(19, c1833kj, null);
                }

                /* JADX INFO: renamed from: s */
                public final bx0 m3465s(C1833kj c1833kj, int i, String str, Exception exc) {
/* 3 */             zze.zzm("BillingClient", str, exc);
/* 12 */            m3471y(i, 8, c1833kj, if3.m4523a(exc));
/* 22 */            return new bx0(c1833kj.f12818a, c1833kj.f12819b, null, 8);
                }

                /* JADX INFO: renamed from: t */
                public final void m3466t(ds0 ds0Var, C1833kj c1833kj, int i, String str, Exception exc) {
/* 3 */             zze.zzm("BillingClient", str, exc);
/* 11 */            m3471y(i, 4, c1833kj, if3.m4523a(exc));
/* 14 */            int i2 = c1833kj.f12818a;
                }

                /* JADX INFO: renamed from: u */
                public final Handler m3467u() {
                    return Looper.myLooper() == null ? this.f7708d : new Handler(Looper.myLooper());
                }

                /* JADX INFO: renamed from: v */
                public final C1833kj m3468v() {
/* 5 */             zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
/* 8 */             zzkb zzkbVarZzc = zzkd.zzc();
/* 13 */            zzkbVarZzc.zzn(6);
/* 16 */            zzlv zzlvVarZzc = zzlx.zzc();
/* 21 */            zzlvVarZzc.zza(true);
/* 24 */            zzkbVarZzc.zzm(zzlvVarZzc);
/* 33 */            m3460n((zzkd) zzkbVarZzc.zzf());
/* 36 */            return kf3.f12731i;
                }

                /* JADX INFO: renamed from: w */
                public final void m3469w(C2076pn c2076pn, C1833kj c1833kj, int i, Exception exc) {
/* 5 */             zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
/* 14 */            m3471y(i, 13, c1833kj, if3.m4523a(exc));
/* 18 */            c2076pn.m7497g(c1833kj, null);
                }

                /* JADX INFO: renamed from: x */
                public final void m3470x(int i, int i2, C1833kj c1833kj) {
                    try {
/* 5 */                 m3459m(if3.m4524b(i, i2, c1833kj));
                    } catch (Throwable th) {
/* 14 */                zze.zzm("BillingClient", "Unable to log.", th);
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m3471y(int i, int i2, C1833kj c1833kj, String str) {
                    try {
/* 5 */                 m3459m(if3.m4525c(i, i2, c1833kj, str));
                    } catch (Throwable th) {
/* 14 */                zze.zzm("BillingClient", "Unable to log.", th);
                    }
                }

                /* JADX INFO: renamed from: z */
                public final void m3472z(int i) {
                    try {
/* 5 */                 m3460n(if3.m4526d(i));
                    } catch (Throwable th) {
/* 14 */                zze.zzm("BillingClient", "Unable to log.", th);
                    }
                }

/* 118 */       public C0882ej(ec0 ec0Var, Context context, tz1 tz1Var) {
/* 119 */           String strM3448k = m3448k();
/* 121 */           this.f7705a = new Object();
                    this.f7706b = 0;
/* 122 */           this.f7708d = new Handler(Looper.getMainLooper());
                    this.f7715k = 0;
/* 123 */           long jNextLong = new Random().nextLong();
                    this.f7704A = Long.valueOf(jNextLong);
                    this.f7707c = strM3448k;
/* 124 */           this.f7710f = context.getApplicationContext();
/* 125 */           zzks zzksVarZzc = zzku.zzc();
/* 126 */           zzksVarZzc.zzo(strM3448k);
/* 127 */           zzksVarZzc.zzn(this.f7710f.getPackageName());
/* 128 */           zzksVarZzc.zzm(jNextLong);
/* 131 */           this.f7711g = new we2(this.f7710f, (zzku) zzksVarZzc.zzf());
                    if (tz1Var == null) {
/* 133 */               zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
                    }
/* 134 */           this.f7709e = new u93(this.f7710f, tz1Var, this.f7711g);
                    this.f7727w = ec0Var;
                    this.f7728x = false;
/* 135 */           this.f7710f.getPackageName();
                }
            }
