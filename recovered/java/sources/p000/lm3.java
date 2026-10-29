            package p000;

            import android.os.Bundle;
            import android.os.SystemClock;
            import com.google.android.gms.internal.measurement.zzdf;
            import io.sentry.android.core.internal.tombstone.C1212b;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lm3 extends wg3 {

                /* JADX INFO: renamed from: U */
                public bm3 f13411U;

                /* JADX INFO: renamed from: V */
                public boolean f13412V;

                /* JADX INFO: renamed from: W */
                public final Object f13413W;

                /* JADX INFO: renamed from: c */
                public volatile bm3 f13414c;

                /* JADX INFO: renamed from: d */
                public volatile bm3 f13415d;

                /* JADX INFO: renamed from: e */
                public bm3 f13416e;

                /* JADX INFO: renamed from: f */
                public final ConcurrentHashMap f13417f;

                /* JADX INFO: renamed from: i */
                public zzdf f13418i;

                /* JADX INFO: renamed from: v */
                public volatile boolean f13419v;

                /* JADX INFO: renamed from: w */
                public volatile bm3 f13420w;

                public lm3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 9 */             this.f13413W = new Object();
/* 16 */            this.f13417f = new ConcurrentHashMap();
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m6501D(bm3 bm3Var, boolean z, long j) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             of3 of3Var = ij3Var.f9643Y;
/* 7 */             ij3.m4552i(of3Var);
/* 12 */            ij3Var.f9640V.getClass();
/* 19 */            of3Var.m7163C(SystemClock.elapsedRealtime());
/* 31 */            boolean z2 = bm3Var != null && bm3Var.f2541d;
/* 32 */            lo3 lo3Var = ij3Var.f9667v;
/* 34 */            ij3.m4554k(lo3Var);
/* 43 */            if (!lo3Var.f13438f.m4822b(j, z2, z) || bm3Var == null) {
/* 49 */                return;
                    }
/* 47 */            bm3Var.f2541d = false;
                }

                /* JADX INFO: renamed from: E */
                public final bm3 m6502E(zzdf zzdfVar) {
/* 1 */             kb1.m6061n(zzdfVar);
/* 6 */             Integer numValueOf = Integer.valueOf(zzdfVar.zza);
/* 10 */            ConcurrentHashMap concurrentHashMap = this.f13417f;
/* 16 */            bm3 bm3Var = (bm3) concurrentHashMap.get(numValueOf);
/* 18 */            if (bm3Var == null) {
/* 22 */                String strM6504G = m6504G(zzdfVar.zzb);
/* 32 */                up3 up3Var = ((ij3) this.f16749a).f9668w;
/* 34 */                ij3.m4553j(up3Var);
/* 42 */                bm3 bm3Var2 = new bm3(null, up3Var.m9115v0(), strM6504G);
/* 45 */                concurrentHashMap.put(numValueOf, bm3Var2);
/* 48 */                bm3Var = bm3Var2;
                    }
                    return this.f13420w != null ? this.f13420w : bm3Var;
                }

                /* JADX INFO: renamed from: F */
                public final bm3 m6503F(boolean z) {
/* 1 */             m9576A();
/* 4 */             mo1375y();
/* 7 */             bm3 bm3Var = this.f13416e;
                    return (z && bm3Var == null) ? this.f13411U : bm3Var;
                }

                /* JADX INFO: renamed from: G */
                public final String m6504G(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return "Activity";
                    }
/* 8 */             String[] strArrSplit = str.split("\\.");
/* 12 */            int length = strArrSplit.length;
/* 20 */            String str2 = length > 0 ? strArrSplit[length - 1] : HttpUrl.FRAGMENT_ENCODE_SET;
/* 24 */            ij3 ij3Var = (ij3) this.f16749a;
/* 26 */            int length2 = str2.length();
/* 32 */            ij3Var.f9651d.getClass();
/* 37 */            if (length2 <= 500) {
/* 50 */                return str2;
                    }
/* 41 */            ij3Var.f9651d.getClass();
/* 45 */            return str2.substring(0, 500);
                }

                /* JADX INFO: renamed from: H */
                public final void m6505H(zzdf zzdfVar, Bundle bundle) {
                    Bundle bundle2;
/* 11 */            if (!((ij3) this.f16749a).f9651d.m7410N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
/* 58 */                return;
                    }
/* 55 */            this.f13417f.put(Integer.valueOf(zzdfVar.zza), new bm3(bundle2.getString("name"), bundle2.getLong("id"), bundle2.getString("referrer_name")));
                }

                /* JADX INFO: renamed from: I */
                public final void m6506I(String str, bm3 bm3Var, boolean z) {
                    bm3 bm3Var2;
/* 9 */             bm3 bm3Var3 = this.f13414c == null ? this.f13415d : this.f13414c;
/* 14 */            if (bm3Var.f2539b == null) {
/* 36 */                bm3Var2 = new bm3(bm3Var.f2538a, str != null ? m6504G(str) : null, bm3Var.f2540c, bm3Var.f2542e, bm3Var.f2543f);
                    } else {
/* 41 */                bm3Var2 = bm3Var;
                    }
/* 44 */            this.f13415d = this.f13414c;
/* 46 */            this.f13414c = bm3Var2;
/* 50 */            ij3 ij3Var = (ij3) this.f16749a;
/* 54 */            ij3Var.f9640V.getClass();
/* 57 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 61 */            bj3 bj3Var = ij3Var.f9659i;
/* 63 */            ij3.m4555l(bj3Var);
/* 73 */            bj3Var.m1370I(new dm3(this, bm3Var2, bm3Var3, jElapsedRealtime, z));
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0033  */
                /* JADX INFO: renamed from: J */
                public final void m6507J(bm3 bm3Var, bm3 bm3Var2, long j, boolean z, Bundle bundle) {
                    boolean z2;
/* 11 */            boolean z3 = bm3Var.f2542e;
/* 15 */            ij3 ij3Var = (ij3) this.f16749a;
/* 17 */            mo1375y();
/* 20 */            boolean z4 = false;
/* 22 */            if (bm3Var2 != null) {
/* 30 */                if (bm3Var2.f2540c == bm3Var.f2540c && Objects.equals(bm3Var2.f2539b, bm3Var.f2539b) && Objects.equals(bm3Var2.f2538a, bm3Var.f2538a)) {
/* 54 */                    z2 = false;
                        } else {
/* 52 */                    z2 = true;
                        }
                    } else {
/* 52 */                z2 = true;
                    }
/* 55 */            if (z && this.f13416e != null) {
/* 61 */                z4 = true;
                    }
/* 62 */            if (z2) {
/* 75 */                Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 79 */                up3.m9072q0(bm3Var, bundle2, true);
/* 82 */                if (bm3Var2 != null) {
/* 84 */                    String str = bm3Var2.f2538a;
/* 86 */                    if (str != null) {
/* 90 */                        bundle2.putString("_pn", str);
                            }
/* 93 */                    String str2 = bm3Var2.f2539b;
/* 95 */                    if (str2 != null) {
/* 99 */                        bundle2.putString("_pc", str2);
                            }
/* 106 */                   bundle2.putLong("_pi", bm3Var2.f2540c);
                        }
/* 111 */               if (z4) {
/* 113 */                   lo3 lo3Var = ij3Var.f9667v;
/* 115 */                   ij3.m4554k(lo3Var);
/* 118 */                   C1212b c1212b = lo3Var.f13438f;
/* 122 */                   long j2 = j - c1212b.f10128b;
/* 124 */                   c1212b.f10128b = j;
/* 128 */                   if (j2 > 0) {
/* 130 */                       up3 up3Var = ij3Var.f9668w;
/* 132 */                       ij3.m4553j(up3Var);
/* 135 */                       up3Var.m9104g0(bundle2, j2);
                            }
                        }
/* 144 */               if (!ij3Var.f9651d.m7410N()) {
/* 150 */                   bundle2.putLong("_mst", 1L);
                        }
/* 159 */               String str3 = true != z3 ? "auto" : "app";
/* 164 */               ij3Var.f9640V.getClass();
/* 167 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 171 */               if (z3) {
/* 175 */                   long j3 = bm3Var.f2543f;
/* 179 */                   if (j3 != 0) {
/* 182 */                       jCurrentTimeMillis = j3;
                            }
                        }
/* 183 */               sl3 sl3Var = ij3Var.f9642X;
/* 185 */               ij3.m4554k(sl3Var);
/* 190 */               sl3Var.m8557H(str3, "_vs", bundle2, jCurrentTimeMillis);
                    }
/* 193 */           if (z4) {
/* 197 */               m6501D(this.f13416e, true, j);
                    }
/* 200 */           this.f13416e = bm3Var;
/* 202 */           if (z3) {
/* 204 */               this.f13411U = bm3Var;
                    }
/* 206 */           pn3 pn3VarM4567o = ij3Var.m4567o();
/* 210 */           pn3VarM4567o.mo1375y();
/* 213 */           pn3VarM4567o.m9576A();
/* 221 */           pn3VarM4567o.m7518N(new ol3(pn3VarM4567o, bm3Var));
                }
            }
