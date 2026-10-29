            package p000;

            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yj3 extends sq3 {

                /* JADX INFO: renamed from: f */
                public static final Set f19661f;

                /* JADX INFO: renamed from: i */
                public static final ti3 f19662i;

                /* JADX INFO: renamed from: b */
                public final String f19663b;

                /* JADX INFO: renamed from: c */
                public final Level f19664c;

                /* JADX INFO: renamed from: d */
                public final Set f19665d;

                /* JADX INFO: renamed from: e */
                public final ti3 f19666e;

                static {
/* 18 */            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(dh3.f7210a, bi3.f2440a)));
/* 22 */            f19661f = setUnmodifiableSet;
/* 33 */            f19662i = new ti3(w11.m9418a0(setUnmodifiableSet));
/* 35 */            Level level = Level.ALL;
                }

                public /* synthetic */ yj3(String str, Level level, Set set, ti3 ti3Var) {
/* 1 */             super(str);
/* 8 */             this.f19663b = de3.m3020H(str);
/* 10 */            this.f19664c = level;
/* 12 */            this.f19665d = set;
/* 14 */            this.f19666e = ti3Var;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x005d  */
                /* JADX WARN: Code duplicated, block: B:23:0x007b  */
                /* JADX INFO: renamed from: A */
                public static void m10154A(sg3 sg3Var, String str, Level level, Set set, ti3 ti3Var) {
                    hj3 cj3Var;
                    StringBuilder sb;
                    ii3 ii3Var;
                    String string;
/* 5 */             ((rj3) jj3.f12333a).getClass();
/* 10 */            kb1 kb1VarMo302c = vj3.f18227b.mo302c();
/* 14 */            kb1 kb1VarM8505c = sg3Var.m8505c();
/* 18 */            Level level2 = sg3Var.f16610a;
/* 20 */            int iMo3438X = kb1VarM8505c.mo3438X();
/* 24 */            if (iMo3438X == 0) {
/* 26 */                cj3Var = hj3.f9102a;
                    } else {
/* 42 */                cj3Var = iMo3438X <= 28 ? new cj3(kb1VarMo302c, kb1VarM8505c) : new gj3(kb1VarMo302c, kb1VarM8505c);
                    }
/* 60 */            if (level2.intValue() < level.intValue()) {
/* 96 */                sb = new StringBuilder();
/* 107 */               sb.append(li3.m6459a(sg3Var.f16615f[0]));
/* 110 */               int i = oj3.f14783a;
/* 114 */               ii3Var = new ii3(sb);
/* 117 */               cj3Var.mo1709a(ti3Var, ii3Var);
/* 122 */               if (ii3Var.f9627b) {
/* 126 */                   sb.append(" ]");
                        }
/* 129 */               string = sb.toString();
                    } else {
/* 62 */                int i2 = oj3.f14783a;
/* 72 */                if (cj3Var.mo1710b() > set.size() || !set.containsAll(cj3Var.mo1711c())) {
/* 96 */                    sb = new StringBuilder();
/* 107 */                   sb.append(li3.m6459a(sg3Var.f16615f[0]));
/* 110 */                   int i3 = oj3.f14783a;
/* 114 */                   ii3Var = new ii3(sb);
/* 117 */                   cj3Var.mo1709a(ti3Var, ii3Var);
/* 122 */                   if (ii3Var.f9627b) {
/* 126 */                       sb.append(" ]");
                            }
/* 129 */                   string = sb.toString();
                        } else {
/* 89 */                    string = li3.m6459a(sg3Var.f16615f[0]);
                        }
                    }
/* 143 */           Throwable th = (Throwable) sg3Var.m8505c().mo3441a0(dh3.f7210a);
/* 145 */           int iM3021I = de3.m3021I(level2);
/* 150 */           if (iM3021I == 2 || iM3021I == 3 || iM3021I == 4) {
/* 168 */               return;
                    }
/* 159 */           if (iM3021I != 5) {
/* 161 */               AbstractC1245n0.m4877e(str, string, th);
                    } else {
/* 165 */               AbstractC1245n0.m4891s(str, string, th);
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: r */
                public final boolean mo8628r(Level level) {
/* 1 */             int iM3021I = de3.m3021I(level);
                    return Log.isLoggable(this.f19663b, iM3021I) || Log.isLoggable("all", iM3021I);
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: t */
                public final void mo8629t(sg3 sg3Var) {
/* 9 */             m10154A(sg3Var, this.f19663b, this.f19664c, this.f19665d, this.f19666e);
                }
            }
