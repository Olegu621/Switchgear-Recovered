            package p000;

            import io.sentry.android.core.internal.tombstone.C1212b;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ao3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2045a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f2046b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ lo3 f2047c;

                public ao3(lo3 lo3Var, long j, int i) {
/* 1 */             this.f2045a = i;
                    switch (i) {
                        case 1:
/* 20 */                    this.f2046b = j;
/* 22 */                    Objects.requireNonNull(lo3Var);
/* 25 */                    this.f2047c = lo3Var;
                            break;
                        default:
/* 9 */                     this.f2046b = j;
/* 11 */                    Objects.requireNonNull(lo3Var);
/* 14 */                    this.f2047c = lo3Var;
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:19:0x00af  */
                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f2045a;
/* 3 */             lo3 lo3Var = this.f2047c;
                    switch (i) {
                        case 0:
/* 87 */                    C1212b c1212b = lo3Var.f13438f;
/* 89 */                    lo3Var.mo1375y();
/* 92 */                    lo3Var.m6515D();
/* 97 */                    ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 99 */                    uh3 uh3Var = ij3Var.f9655f;
/* 101 */                   ij3.m4555l(uh3Var);
/* 104 */                   sh3 sh3Var = uh3Var.f17534Y;
/* 108 */                   long j = this.f2046b;
/* 114 */                   sh3Var.m8511b(Long.valueOf(j), "Activity resumed, time");
/* 117 */                   pd3 pd3Var = ij3Var.f9651d;
/* 126 */                   if (pd3Var.m7406J(null, vg3.f18104U0)) {
/* 132 */                       if (pd3Var.m7410N() || lo3Var.f13436d) {
/* 142 */                           ((lo3) c1212b.f10130d).mo1375y();
/* 149 */                           ((do3) c1212b.f10129c).m1349c();
/* 152 */                           c1212b.f10127a = j;
/* 154 */                           c1212b.f10128b = j;
                                }
                            } else if (pd3Var.m7410N()) {
/* 180 */                       ((lo3) c1212b.f10130d).mo1375y();
/* 187 */                       ((do3) c1212b.f10129c).m1349c();
/* 190 */                       c1212b.f10127a = j;
/* 192 */                       c1212b.f10128b = j;
                            } else {
/* 163 */                       ki3 ki3Var = ij3Var.f9653e;
/* 165 */                       ij3.m4553j(ki3Var);
/* 174 */                       if (ki3Var.f12806d0.m4238a()) {
/* 180 */                           ((lo3) c1212b.f10130d).mo1375y();
/* 187 */                           ((do3) c1212b.f10129c).m1349c();
/* 190 */                           c1212b.f10127a = j;
/* 192 */                           c1212b.f10128b = j;
                                }
                            }
/* 194 */                   we2 we2Var = lo3Var.f13439i;
/* 198 */                   lo3 lo3Var2 = (lo3) we2Var.f18595b;
/* 200 */                   lo3Var2.mo1375y();
/* 205 */                   ij3 ij3Var2 = (ij3) lo3Var2.f16749a;
/* 209 */                   co3 co3Var = (co3) we2Var.f18596c;
/* 211 */                   if (co3Var != null) {
/* 215 */                       lo3Var2.f13435c.removeCallbacks(co3Var);
                            }
/* 218 */                   ki3 ki3Var2 = ij3Var2.f9653e;
/* 220 */                   sl3 sl3Var = ij3Var2.f9642X;
/* 222 */                   ij3.m4553j(ki3Var2);
/* 228 */                   ki3Var2.f12806d0.m4239b(false);
/* 231 */                   lo3Var2.mo1375y();
/* 234 */                   lo3Var2.f13436d = false;
/* 244 */                   if (ij3Var2.f9651d.m7406J(null, vg3.f18102T0)) {
/* 246 */                       ij3.m4554k(sl3Var);
/* 251 */                       if (sl3Var.f16680Y) {
/* 253 */                           uh3 uh3Var2 = ij3Var2.f9655f;
/* 255 */                           ij3.m4555l(uh3Var2);
/* 262 */                           uh3Var2.f17534Y.m8510a("Retrying trigger URI registration in foreground");
/* 265 */                           ij3.m4554k(sl3Var);
/* 268 */                           sl3Var.m8573X();
                                }
                            }
/* 271 */                   pi3 pi3Var = lo3Var.f13437e;
/* 275 */                   lo3 lo3Var3 = (lo3) pi3Var.f15137a;
/* 277 */                   lo3Var3.mo1375y();
/* 282 */                   ij3 ij3Var3 = (ij3) lo3Var3.f16749a;
/* 288 */                   if (ij3Var3.m4560d()) {
/* 293 */                       ij3Var3.f9640V.getClass();
/* 300 */                       pi3Var.m7456c(System.currentTimeMillis());
                                break;
                            }
                            break;
                        default:
/* 8 */                     lo3Var.mo1375y();
/* 11 */                    lo3Var.m6515D();
/* 16 */                    ij3 ij3Var4 = (ij3) lo3Var.f16749a;
/* 18 */                    uh3 uh3Var3 = ij3Var4.f9655f;
/* 20 */                    ij3.m4555l(uh3Var3);
/* 23 */                    sh3 sh3Var2 = uh3Var3.f17534Y;
/* 27 */                    long j2 = this.f2046b;
/* 33 */                    sh3Var2.m8511b(Long.valueOf(j2), "Activity paused, time");
/* 36 */                    we2 we2Var2 = lo3Var.f13439i;
/* 42 */                    lo3 lo3Var4 = (lo3) we2Var2.f18595b;
/* 50 */                    ((ij3) lo3Var4.f16749a).f9640V.getClass();
/* 57 */                    co3 co3Var2 = new co3(we2Var2, System.currentTimeMillis(), j2);
/* 60 */                    we2Var2.f18596c = co3Var2;
/* 66 */                    lo3Var4.f13435c.postDelayed(co3Var2, 2000L);
/* 75 */                    if (ij3Var4.f9651d.m7410N()) {
/* 83 */                        ((do3) lo3Var.f13438f.f10129c).m1349c();
                            }
                            break;
                    }
                }
            }
