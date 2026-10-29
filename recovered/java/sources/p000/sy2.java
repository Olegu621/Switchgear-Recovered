            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class sy2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ f31 f16869a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2497yg f16870b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f16871c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Runnable f16872d;

                public /* synthetic */ sy2(f31 f31Var, C2497yg c2497yg, int i, Runnable runnable) {
/* 4 */             this.f16869a = f31Var;
/* 6 */             this.f16870b = c2497yg;
/* 8 */             this.f16871c = i;
/* 10 */            this.f16872d = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             C2497yg c2497yg = this.f16870b;
/* 3 */             int i = this.f16871c;
/* 5 */             Runnable runnable = this.f16872d;
/* 7 */             f31 f31Var = this.f16869a;
/* 11 */            s52 s52Var = (s52) f31Var.f7988f;
/* 13 */            int i2 = 1;
                    try {
/* 16 */                s52 s52Var2 = (s52) f31Var.f7985c;
/* 18 */                Objects.requireNonNull(s52Var2);
/* 26 */                s52Var.m8408k(new ty2(s52Var2, i2));
/* 41 */                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) f31Var.f7983a).getSystemService("connectivity")).getActiveNetworkInfo();
/* 45 */                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
/* 64 */                    s52Var.m8408k(new C2487y6(f31Var, c2497yg, i));
                        } else {
/* 53 */                    f31Var.m3642c(c2497yg, i);
                        }
                    } catch (ak2 unused) {
/* 77 */                ((C0875ec) f31Var.f7986d).m3372K(c2497yg, i + 1, false);
                    } finally {
/* 84 */                runnable.run();
                    }
                }
            }
