            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vc3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17997a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f17998b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f17999c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ of3 f18000d;

                public /* synthetic */ vc3(of3 of3Var, String str, long j, int i) {
/* 1 */             this.f17997a = i;
/* 3 */             this.f17998b = str;
/* 5 */             this.f17999c = j;
/* 7 */             this.f18000d = of3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17997a;
/* 4 */             long j = this.f17999c;
/* 6 */             String str = this.f17998b;
/* 8 */             of3 of3Var = this.f18000d;
                    switch (i) {
                        case 0:
/* 142 */                   of3Var.mo1375y();
/* 145 */                   kb1.m6058k(str);
/* 148 */                   C1024id c1024id = of3Var.f14739c;
/* 154 */                   if (c1024id.isEmpty()) {
/* 156 */                       of3Var.f14740d = j;
                            }
/* 162 */                   Integer num = (Integer) c1024id.getOrDefault(str, null);
/* 165 */                   if (num != null) {
/* 176 */                       c1024id.put(str, Integer.valueOf(num.intValue() + 1));
                            } else if (c1024id.f13213c < 100) {
/* 207 */                       c1024id.put(str, 1);
/* 216 */                       of3Var.f14738b.put(str, Long.valueOf(j));
                            } else {
/* 190 */                       uh3 uh3Var = ((ij3) of3Var.f16749a).f9655f;
/* 192 */                       ij3.m4555l(uh3Var);
/* 199 */                       uh3Var.f17541w.m8510a("Too many ads visible");
                            }
                            break;
                        default:
/* 13 */                    of3Var.mo1375y();
/* 16 */                    kb1.m6058k(str);
/* 19 */                    C1024id c1024id2 = of3Var.f14739c;
/* 25 */                    Integer num2 = (Integer) c1024id2.getOrDefault(str, null);
/* 29 */                    ij3 ij3Var = (ij3) of3Var.f16749a;
/* 31 */                    if (num2 == null) {
/* 129 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 131 */                       ij3.m4555l(uh3Var2);
/* 138 */                       uh3Var2.f17538f.m8511b(str, "Call to endAdUnitExposure for unknown ad unit id");
                            } else {
/* 33 */                        lm3 lm3Var = ij3Var.f9641W;
/* 35 */                        uh3 uh3Var3 = ij3Var.f9655f;
/* 37 */                        ij3.m4554k(lm3Var);
/* 41 */                        bm3 bm3VarM6503F = lm3Var.m6503F(false);
/* 49 */                        int iIntValue = num2.intValue() - 1;
/* 51 */                        if (iIntValue != 0) {
/* 125 */                           c1024id2.put(str, Integer.valueOf(iIntValue));
                                } else {
/* 53 */                            c1024id2.remove(str);
/* 56 */                            C1024id c1024id3 = of3Var.f14738b;
/* 62 */                            Long l = (Long) c1024id3.getOrDefault(str, null);
/* 64 */                            if (l == null) {
/* 66 */                                ij3.m4555l(uh3Var3);
/* 73 */                                uh3Var3.f17538f.m8510a("First ad unit exposure time was never set");
                                    } else {
/* 81 */                                long jLongValue = j - l.longValue();
/* 83 */                                c1024id3.remove(str);
/* 86 */                                of3Var.m7165E(str, jLongValue, bm3VarM6503F);
                                    }
/* 93 */                            if (c1024id2.isEmpty()) {
/* 95 */                                long j2 = of3Var.f14740d;
/* 101 */                               if (j2 != 0) {
/* 115 */                                   of3Var.m7164D(j - j2, bm3VarM6503F);
/* 118 */                                   of3Var.f14740d = 0L;
                                        } else {
/* 103 */                                   ij3.m4555l(uh3Var3);
/* 110 */                                   uh3Var3.f17538f.m8510a("First ad exposure time was never set");
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            }
