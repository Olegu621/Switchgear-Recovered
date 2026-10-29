            package p000;

            import android.os.SystemClock;
            import android.text.TextUtils;
            import com.google.android.gms.measurement.internal.zzr;
            import io.sentry.android.core.internal.tombstone.C1212b;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zk3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20230a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f20231b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ sl3 f20232c;

                public zk3(sl3 sl3Var, long j, int i) {
/* 1 */             this.f20230a = i;
                    switch (i) {
                        case 1:
/* 20 */                    this.f20231b = j;
/* 22 */                    Objects.requireNonNull(sl3Var);
/* 25 */                    this.f20232c = sl3Var;
                            break;
                        default:
/* 9 */                     this.f20231b = j;
/* 11 */                    Objects.requireNonNull(sl3Var);
/* 14 */                    this.f20232c = sl3Var;
                            break;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f20230a;
/* 3 */             long j = this.f20231b;
/* 5 */             sl3 sl3Var = this.f20232c;
                    switch (i) {
                        case 0:
/* 220 */                   ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 222 */                   ki3 ki3Var = ij3Var.f9653e;
/* 224 */                   ij3.m4553j(ki3Var);
/* 229 */                   ki3Var.f12796V.m4933b(j);
/* 232 */                   uh3 uh3Var = ij3Var.f9655f;
/* 234 */                   ij3.m4555l(uh3Var);
/* 245 */                   uh3Var.f17533X.m8511b(Long.valueOf(j), "Session timeout duration set");
                            break;
                        default:
/* 10 */                    sl3Var.mo1375y();
/* 13 */                    sl3Var.m9576A();
/* 18 */                    ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 20 */                    uh3 uh3Var2 = ij3Var2.f9655f;
/* 22 */                    ij3.m4555l(uh3Var2);
/* 29 */                    uh3Var2.f17533X.m8510a("Resetting analytics data (FE)");
/* 32 */                    lo3 lo3Var = ij3Var2.f9667v;
/* 34 */                    ij3.m4554k(lo3Var);
/* 37 */                    lo3Var.mo1375y();
/* 40 */                    C1212b c1212b = lo3Var.f13438f;
/* 46 */                    ((do3) c1212b.f10129c).m1349c();
/* 59 */                    ((ij3) ((lo3) c1212b.f10130d).f16749a).f9640V.getClass();
/* 62 */                    long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 66 */                    c1212b.f10127a = jElapsedRealtime;
/* 68 */                    c1212b.f10128b = jElapsedRealtime;
/* 74 */                    ij3Var2.m4569q().m4533E();
/* 81 */                    boolean z = !ij3Var2.m4560d();
/* 83 */                    ki3 ki3Var2 = ij3Var2.f9653e;
/* 85 */                    ij3.m4553j(ki3Var2);
/* 90 */                    ki3Var2.f12809f.m4933b(j);
/* 95 */                    ij3 ij3Var3 = (ij3) ki3Var2.f16749a;
/* 97 */                    ki3 ki3Var3 = ij3Var3.f9653e;
/* 99 */                    ij3.m4553j(ki3Var3);
/* 113 */                   if (!TextUtils.isEmpty(ki3Var3.f12811g0.m8805m())) {
/* 117 */                       ki3Var2.f12811g0.m8806n(null);
                            }
/* 124 */                   ki3Var2.f12801a0.m4933b(0L);
/* 129 */                   ki3Var2.f12802b0.m4933b(0L);
/* 138 */                   if (!ij3Var3.f9651d.m7409M()) {
/* 140 */                       ki3Var2.m6118I(z);
                            }
/* 145 */                   ki3Var2.f12812h0.m8806n(null);
/* 150 */                   ki3Var2.f12814i0.m4933b(0L);
/* 155 */                   ki3Var2.f12815j0.m8120y(null);
/* 158 */                   pn3 pn3VarM4567o = ij3Var2.m4567o();
/* 162 */                   pn3VarM4567o.mo1375y();
/* 165 */                   pn3VarM4567o.m9576A();
/* 169 */                   zzr zzrVarM7520P = pn3VarM4567o.m7520P(false);
/* 173 */                   pn3VarM4567o.m7516L();
/* 184 */                   ((ij3) pn3VarM4567o.f16749a).m4566n().m6449D();
/* 192 */                   pn3VarM4567o.m7518N(new sm3(pn3VarM4567o, zzrVarM7520P, 0));
/* 195 */                   ij3.m4554k(lo3Var);
/* 200 */                   lo3Var.f13437e.m7455a();
/* 203 */                   sl3Var.f16687d0 = z;
/* 214 */                   ij3Var2.m4567o().m7508D(new AtomicReference());
                            break;
                    }
                }
            }
