            package p000;

            import android.os.Bundle;
            import android.os.SystemClock;
            import com.google.android.gms.measurement.internal.zzpk;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uc3 extends af3 {

                /* JADX INFO: renamed from: a */
                public final ij3 f17469a;

                /* JADX INFO: renamed from: b */
                public final sl3 f17470b;

                public uc3(ij3 ij3Var) {
/* 4 */             kb1.m6061n(ij3Var);
/* 7 */             this.f17469a = ij3Var;
/* 9 */             sl3 sl3Var = ij3Var.f9642X;
/* 11 */            ij3.m4554k(sl3Var);
/* 14 */            this.f17470b = sl3Var;
                }

                @Override // p000.tl3
                public final void zza(String str, String str2, Bundle bundle) {
/* 1 */             sl3 sl3Var = this.f17470b;
/* 9 */             ((ij3) sl3Var.f16749a).f9640V.getClass();
/* 21 */            sl3Var.m8554E(str, str2, bundle, true, true, System.currentTimeMillis());
                }

                @Override // p000.tl3
                public final Map zzd(String str, String str2, boolean z) {
/* 1 */             sl3 sl3Var = this.f17470b;
/* 5 */             ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 7 */             bj3 bj3Var = ij3Var.f9659i;
/* 9 */             uh3 uh3Var = ij3Var.f9655f;
/* 11 */            ij3.m4555l(bj3Var);
/* 18 */            if (bj3Var.m1367F()) {
/* 20 */                ij3.m4555l(uh3Var);
/* 27 */                uh3Var.f17538f.m8510a("Cannot get user properties from analytics worker thread");
/* 30 */                return Collections.EMPTY_MAP;
                    }
/* 37 */            if (q62.m7734g()) {
/* 39 */                ij3.m4555l(uh3Var);
/* 46 */                uh3Var.f17538f.m8510a("Cannot get user properties from main thread");
/* 49 */                return Collections.EMPTY_MAP;
                    }
/* 54 */            AtomicReference atomicReference = new AtomicReference();
/* 57 */            bj3 bj3Var2 = ij3Var.f9659i;
/* 59 */            ij3.m4555l(bj3Var2);
/* 78 */            bj3Var2.m1371J(atomicReference, 5000L, "get user properties", new ft0(sl3Var, atomicReference, str, str2, z));
/* 85 */            List<zzpk> list = (List) atomicReference.get();
/* 87 */            if (list == null) {
/* 89 */                ij3.m4555l(uh3Var);
/* 100 */               uh3Var.f17538f.m8511b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
/* 103 */               return Collections.EMPTY_MAP;
                    }
/* 112 */           C1024id c1024id = new C1024id(list.size());
/* 123 */           for (zzpk zzpkVar : list) {
/* 131 */               Object objM2197D1 = zzpkVar.m2197D1();
/* 135 */               if (objM2197D1 != null) {
/* 139 */                   c1024id.put(zzpkVar.f4228b, objM2197D1);
                        }
                    }
/* 143 */           return c1024id;
                }

                @Override // p000.tl3
                public final String zzh() {
/* 7 */             lm3 lm3Var = ((ij3) this.f17470b.f16749a).f9641W;
/* 9 */             ij3.m4554k(lm3Var);
/* 12 */            bm3 bm3Var = lm3Var.f13414c;
/* 14 */            if (bm3Var != null) {
/* 16 */                return bm3Var.f2538a;
                    }
/* 19 */            return null;
                }

                @Override // p000.tl3
                public final String zzi() {
/* 7 */             lm3 lm3Var = ((ij3) this.f17470b.f16749a).f9641W;
/* 9 */             ij3.m4554k(lm3Var);
/* 12 */            bm3 bm3Var = lm3Var.f13414c;
/* 14 */            if (bm3Var != null) {
/* 16 */                return bm3Var.f2539b;
                    }
/* 19 */            return null;
                }

                @Override // p000.tl3
                public final String zzj() {
/* 9 */             return (String) this.f17470b.f16694i.get();
                }

                @Override // p000.tl3
                public final String zzk() {
/* 9 */             return (String) this.f17470b.f16694i.get();
                }

                @Override // p000.tl3
                public final long zzl() {
/* 3 */             up3 up3Var = this.f17469a.f9668w;
/* 5 */             ij3.m4553j(up3Var);
/* 8 */             return up3Var.m9115v0();
                }

                @Override // p000.tl3
                public final void zzm(String str) {
/* 1 */             ij3 ij3Var = this.f17469a;
/* 3 */             of3 of3Var = ij3Var.f9643Y;
/* 5 */             ij3.m4552i(of3Var);
/* 10 */            ij3Var.f9640V.getClass();
/* 17 */            of3Var.m7161A(str, SystemClock.elapsedRealtime());
                }

                @Override // p000.tl3
                public final void zzn(String str) {
/* 1 */             ij3 ij3Var = this.f17469a;
/* 3 */             of3 of3Var = ij3Var.f9643Y;
/* 5 */             ij3.m4552i(of3Var);
/* 10 */            ij3Var.f9640V.getClass();
/* 17 */            of3Var.m7162B(str, SystemClock.elapsedRealtime());
                }

                @Override // p000.tl3
                public final void zzo(Bundle bundle) {
/* 1 */             sl3 sl3Var = this.f17470b;
/* 9 */             ((ij3) sl3Var.f16749a).f9640V.getClass();
/* 16 */            sl3Var.m8562M(bundle, System.currentTimeMillis());
                }

                @Override // p000.tl3
                public final void zzp(String str, String str2, Bundle bundle) {
/* 3 */             sl3 sl3Var = this.f17469a.f9642X;
/* 5 */             ij3.m4554k(sl3Var);
/* 8 */             sl3Var.m8563N(str, str2, bundle);
                }

                @Override // p000.tl3
                public final List zzq(String str, String str2) {
/* 1 */             sl3 sl3Var = this.f17470b;
/* 5 */             ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 7 */             bj3 bj3Var = ij3Var.f9659i;
/* 9 */             uh3 uh3Var = ij3Var.f9655f;
/* 11 */            ij3.m4555l(bj3Var);
/* 19 */            if (bj3Var.m1367F()) {
/* 21 */                ij3.m4555l(uh3Var);
/* 28 */                uh3Var.f17538f.m8510a("Cannot get conditional user properties from analytics worker thread");
/* 33 */                return new ArrayList(0);
                    }
/* 41 */            if (q62.m7734g()) {
/* 43 */                ij3.m4555l(uh3Var);
/* 50 */                uh3Var.f17538f.m8510a("Cannot get conditional user properties from main thread");
/* 55 */                return new ArrayList(0);
                    }
/* 61 */            AtomicReference atomicReference = new AtomicReference();
/* 64 */            bj3 bj3Var2 = ij3Var.f9659i;
/* 66 */            ij3.m4555l(bj3Var2);
/* 78 */            bj3Var2.m1371J(atomicReference, 5000L, "get conditional user properties", new RunnableC2265ur(sl3Var, atomicReference, str, str2));
/* 85 */            List list = (List) atomicReference.get();
/* 87 */            if (list != null) {
/* 106 */               return up3.m9070o0(list);
                    }
/* 89 */            ij3.m4555l(uh3Var);
/* 97 */            uh3Var.f17538f.m8511b(null, "Timed out waiting for get conditional user properties");
/* 102 */           return new ArrayList();
                }

                @Override // p000.tl3
                public final int zzr(String str) {
/* 1 */             sl3 sl3Var = this.f17470b;
/* 3 */             sl3Var.getClass();
/* 6 */             kb1.m6058k(str);
/* 13 */            ((ij3) sl3Var.f16749a).getClass();
/* 16 */            return 25;
                }
            }
