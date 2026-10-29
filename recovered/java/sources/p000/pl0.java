            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.graphics.Typeface;
            import java.util.concurrent.LinkedBlockingDeque;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class pl0 {

                /* JADX INFO: renamed from: a */
                public static final ua1 f15167a = new ua1(16);

                /* JADX INFO: renamed from: b */
                public static final ThreadPoolExecutor f15168b;

                /* JADX INFO: renamed from: c */
                public static final Object f15169c;

                /* JADX INFO: renamed from: d */
                public static final le2 f15170d;

                static {
/* 29 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new qs0(2));
/* 33 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 36 */            f15168b = threadPoolExecutor;
/* 43 */            f15169c = new Object();
/* 50 */            f15170d = new le2();
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
                /* JADX INFO: renamed from: a */
                public static ol0 m7477a(String str, Context context, C0168b5 c0168b5, int i) {
/* 1 */             ua1 ua1Var = f15167a;
/* 7 */             Typeface typeface = (Typeface) ua1Var.get(str);
/* 9 */             if (typeface != null) {
/* 13 */                return new ol0(typeface);
                    }
                    try {
/* 17 */                C1954n7 c1954n7M7911v = qj3.m7911v(c0168b5, context);
/* 23 */                vl0[] vl0VarArr = (vl0[]) c1954n7M7911v.f14152c;
/* 25 */                int i2 = c1954n7M7911v.f14151b;
/* 28 */                int i3 = 1;
/* 29 */                if (i2 != 0) {
/* 31 */                    if (i2 != 1) {
/* 33 */                        i3 = -3;
                                break;
                            }
/* 35 */                    i3 = -2;
                        } else if (vl0VarArr != null && vl0VarArr.length != 0) {
/* 44 */                    i3 = 0;
/* 46 */                    for (vl0 vl0Var : vl0VarArr) {
/* 50 */                        int i4 = vl0Var.f18241e;
/* 52 */                        if (i4 != 0) {
/* 54 */                            if (i4 >= 0) {
/* 57 */                                i3 = i4;
                                        break;
                                    }
/* 33 */                            i3 = -3;
                                    break;
                                }
                            }
                        }
/* 62 */                if (i3 != 0) {
/* 66 */                    return new ol0(i3);
                        }
/* 72 */                Typeface typefaceMo4356Q = ks2.f12997a.mo4356Q(context, vl0VarArr, i);
/* 76 */                if (typefaceMo4356Q == null) {
/* 89 */                    return new ol0(-3);
                        }
/* 78 */                ua1Var.put(str, typefaceMo4356Q);
/* 83 */                return new ol0(typefaceMo4356Q);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 96 */                return new ol0(-1);
                    }
                }
            }
