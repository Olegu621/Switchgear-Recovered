            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Pair;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.C1268s;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class uk3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17579a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sl3 f17580b;

                public /* synthetic */ uk3(sl3 sl3Var, int i) {
/* 1 */             this.f17579a = i;
/* 3 */             this.f17580b = sl3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             int i = this.f17579a;
/* 9 */             sl3 sl3Var = this.f17580b;
                    switch (i) {
                        case 0:
/* 315 */                   sl3Var.m8571V();
                            break;
                        case 1:
/* 100 */                   oi3 oi3Var = sl3Var.f16685c0;
/* 102 */                   ij3 ij3Var = oi3Var.f14773b;
/* 104 */                   bj3 bj3Var = ij3Var.f9659i;
/* 106 */                   sl3 sl3Var2 = ij3Var.f9642X;
/* 108 */                   ki3 ki3Var = ij3Var.f9653e;
/* 110 */                   ij3.m4555l(bj3Var);
/* 113 */                   bj3Var.mo1375y();
/* 120 */                   if (oi3Var.m7178d()) {
/* 131 */                       if (oi3Var.m7177c()) {
/* 133 */                           ij3.m4553j(ki3Var);
/* 138 */                           ki3Var.f12812h0.m8806n(null);
/* 143 */                           Bundle bundle = new Bundle();
/* 150 */                           bundle.putString(FirebaseAnalytics.Param.SOURCE, "(not set)");
/* 155 */                           bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
/* 162 */                           bundle.putString("_cis", "intent");
/* 165 */                           bundle.putLong("_cc", 1L);
/* 168 */                           ij3.m4554k(sl3Var2);
/* 175 */                           sl3Var2.m8556G("auto", "_cmpx", bundle);
                                } else {
/* 180 */                           ij3.m4553j(ki3Var);
/* 183 */                           C2220tj c2220tj = ki3Var.f12812h0;
/* 185 */                           String strM8805m = c2220tj.m8805m();
/* 193 */                           if (TextUtils.isEmpty(strM8805m)) {
/* 195 */                               uh3 uh3Var = ij3Var.f9655f;
/* 197 */                               ij3.m4555l(uh3Var);
/* 204 */                               uh3Var.f17539i.m8510a("Cache still valid but referrer not found");
                                    } else {
/* 214 */                               long j = 3600000;
/* 217 */                               long jM4932a = ki3Var.f12814i0.m4932a() / 3600000;
/* 218 */                               Uri uri = Uri.parse(strM8805m);
/* 224 */                               Bundle bundle2 = new Bundle();
/* 233 */                               Pair pair = new Pair(uri.getPath(), bundle2);
/* 248 */                               for (String str : uri.getQueryParameterNames()) {
/* 262 */                                   bundle2.putString(str, uri.getQueryParameter(str));
/* 265 */                                   j = j;
                                        }
/* 279 */                               ((Bundle) pair.second).putLong("_cc", (jM4932a - 1) * j);
/* 282 */                               Object obj = pair.first;
/* 289 */                               String str2 = obj == null ? "app" : (String) obj;
/* 291 */                               ij3.m4554k(sl3Var2);
/* 300 */                               sl3Var2.m8556G(str2, "_cmp", (Bundle) pair.second);
                                    }
/* 303 */                           c2220tj.m8806n(null);
                                }
/* 306 */                       ij3.m4553j(ki3Var);
/* 311 */                       ki3Var.f12814i0.m4933b(0L);
                                break;
                            }
                            break;
                        case 2:
/* 18 */                    sl3Var.mo1375y();
/* 23 */                    ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 25 */                    ki3 ki3Var2 = ij3Var2.f9653e;
/* 27 */                    uh3 uh3Var2 = ij3Var2.f9655f;
/* 29 */                    ij3.m4553j(ki3Var2);
/* 32 */                    hi3 hi3Var = ki3Var2.f12808e0;
/* 38 */                    if (hi3Var.m4238a()) {
/* 89 */                        ij3.m4555l(uh3Var2);
/* 96 */                        uh3Var2.f17533X.m8510a("Deferred Deep Link already retrieved. Not fetching again.");
                            } else {
/* 40 */                        C1268s c1268s = ki3Var2.f12810f0;
/* 42 */                        long jM4932a2 = c1268s.m4932a();
/* 47 */                        c1268s.m4933b(1 + jM4932a2);
/* 54 */                        if (jM4932a2 >= 5) {
/* 56 */                            ij3.m4555l(uh3Var2);
/* 63 */                            uh3Var2.f17541w.m8510a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
/* 67 */                            hi3Var.m4239b(true);
                                } else {
/* 73 */                            if (sl3Var.f16689e0 == null) {
/* 81 */                                sl3Var.f16689e0 = new wk3(sl3Var, ij3Var2, 3);
                                    }
/* 85 */                            sl3Var.f16689e0.m1348b(0L);
                                }
                            }
                            break;
                        default:
/* 14 */                    sl3Var.m8571V();
                            break;
                    }
                }
            }
