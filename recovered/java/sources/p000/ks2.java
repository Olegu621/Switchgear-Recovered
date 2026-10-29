            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ks2 {

                /* JADX INFO: renamed from: a */
                public static final hu0 f12997a;

                /* JADX INFO: renamed from: b */
                public static final ua1 f12998b;

                static {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 29) {
/* 12 */                f12997a = new ps2();
                    } else if (i >= 28) {
/* 24 */                f12997a = new os2();
                    } else if (i >= 26) {
/* 36 */                f12997a = new ns2();
                    } else {
/* 39 */                Method method = ms2.f14013g;
/* 41 */                if (method == null) {
/* 47 */                    AbstractC1245n0.m4889q("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                        }
/* 50 */                if (method != null) {
/* 57 */                    f12997a = new ms2();
                        } else {
/* 65 */                    f12997a = new ls2();
                        }
                    }
/* 74 */            f12998b = new ua1(16);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x002d  */
                /* JADX INFO: renamed from: a */
                public static Typeface m6279a(Context context, rl0 rl0Var, Resources resources, int i, String str, int i2, int i3, de3 de3Var, boolean z) {
                    Typeface typefaceMo4355P;
                    Typeface typefaceCreate;
/* 7 */             int i4 = 4;
/* 8 */             int i5 = -3;
/* 9 */             if (rl0Var instanceof ul0) {
/* 12 */                ul0 ul0Var = (ul0) rl0Var;
/* 14 */                String str2 = ul0Var.f17588d;
/* 16 */                Typeface typeface = null;
/* 17 */                int i6 = 0;
/* 18 */                if (str2 == null || str2.isEmpty()) {
/* 46 */                    typefaceCreate = null;
                        } else {
/* 27 */                    typefaceCreate = Typeface.create(str2, 0);
/* 33 */                    Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
/* 37 */                    if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
/* 46 */                        typefaceCreate = null;
                            }
                        }
/* 47 */                if (typefaceCreate != null) {
/* 49 */                    if (de3Var != null) {
/* 65 */                        new Handler(Looper.getMainLooper()).post(new ji1(i4, de3Var, typefaceCreate));
                            }
/* 68 */                    return typefaceCreate;
                        }
/* 69 */                int i7 = 1;
/* 78 */                boolean z2 = !z ? de3Var != null : ul0Var.f17587c != 0;
/* 89 */                int i8 = z ? ul0Var.f17586b : -1;
/* 96 */                Handler handler = new Handler(Looper.getMainLooper());
/* 101 */               ts0 ts0Var = new ts0();
/* 104 */               ts0Var.f17248a = de3Var;
/* 106 */               C0168b5 c0168b5 = ul0Var.f17585a;
/* 112 */               C0210cb c0210cb = new C0210cb(12, ts0Var, handler);
/* 115 */               if (z2) {
/* 117 */                   ua1 ua1Var = pl0.f15167a;
/* 139 */                   String str3 = ((String) c0168b5.f2215f) + "-" + i3;
/* 149 */                   Typeface typeface2 = (Typeface) pl0.f15167a.get(str3);
/* 151 */                   if (typeface2 != null) {
/* 158 */                       handler.post(new cp0(i4, ts0Var, typeface2));
/* 161 */                       typeface = typeface2;
                            } else if (i8 == -1) {
/* 166 */                       ol0 ol0VarM7477a = pl0.m7477a(str3, context, c0168b5, i3);
/* 170 */                       c0210cb.m1570D(ol0VarM7477a);
/* 173 */                       typeface = ol0VarM7477a.f14798a;
                            } else {
                                try {
                                    try {
                                        try {
                                            try {
/* 198 */                                       ol0 ol0Var = (ol0) pl0.f15168b.submit(new nl0(str3, context, c0168b5, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
/* 200 */                                       c0210cb.m1570D(ol0Var);
/* 203 */                                       typeface = ol0Var.f14798a;
                                            } catch (TimeoutException unused) {
/* 220 */                                       throw new InterruptedException("timeout");
                                            }
                                        } catch (InterruptedException e) {
/* 221 */                                   throw e;
                                        }
                                    } catch (ExecutionException e2) {
/* 227 */                               throw new RuntimeException(e2);
                                    }
                                } catch (InterruptedException unused2) {
/* 241 */                           ((Handler) c0210cb.f2805c).post(new RunnableC2503ym((ts0) c0210cb.f2804b, i5, i6));
                                }
                            }
                        } else {
/* 246 */                   ua1 ua1Var2 = pl0.f15167a;
/* 268 */                   String str4 = ((String) c0168b5.f2215f) + "-" + i3;
/* 278 */                   Typeface typeface3 = (Typeface) pl0.f15167a.get(str4);
/* 280 */                   if (typeface3 != null) {
/* 287 */                       handler.post(new cp0(i4, ts0Var, typeface3));
/* 290 */                       typeface = typeface3;
                            } else {
/* 294 */                       ac0 ac0Var = new ac0(c0210cb, i7);
                                synchronized (pl0.f15169c) {
                                    try {
/* 300 */                               le2 le2Var = pl0.f15170d;
/* 306 */                               ArrayList arrayList = (ArrayList) le2Var.getOrDefault(str4, null);
/* 308 */                               if (arrayList != null) {
/* 310 */                                   arrayList.add(ac0Var);
                                        } else {
/* 320 */                                   ArrayList arrayList2 = new ArrayList();
/* 323 */                                   arrayList2.add(ac0Var);
/* 326 */                                   le2Var.put(str4, arrayList2);
/* 335 */                                   nl0 nl0Var = new nl0(str4, context, c0168b5, i3, 1);
/* 338 */                                   ThreadPoolExecutor threadPoolExecutor = pl0.f15168b;
/* 343 */                                   ac0 ac0Var2 = new ac0(str4, 2);
/* 364 */                                   Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
/* 369 */                                   js0 js0Var = new js0();
/* 372 */                                   js0Var.f12468b = nl0Var;
/* 374 */                                   js0Var.f12469c = ac0Var2;
/* 376 */                                   js0Var.f12470d = handler2;
/* 378 */                                   threadPoolExecutor.execute(js0Var);
                                        }
                                    } catch (Throwable th) {
/* 386 */                               throw th;
                                    }
                                }
                            }
                        }
/* 381 */               typefaceMo4355P = typeface;
                    } else {
/* 394 */               typefaceMo4355P = f12997a.mo4355P(context, (sl0) rl0Var, resources, i3);
/* 398 */               if (de3Var != null) {
/* 400 */                   if (typefaceMo4355P != null) {
/* 416 */                       new Handler(Looper.getMainLooper()).post(new ji1(i4, de3Var, typefaceMo4355P));
                            } else {
/* 420 */                       de3Var.m3046d(-3);
                            }
                        }
                    }
/* 423 */           if (typefaceMo4355P != null) {
/* 431 */               f12998b.put(m6280b(resources, i, str, i2, i3), typefaceMo4355P);
                    }
/* 434 */           return typefaceMo4355P;
                }

                /* JADX INFO: renamed from: b */
                public static String m6280b(Resources resources, int i, String str, int i2, int i3) {
/* 39 */            return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
                }
            }
