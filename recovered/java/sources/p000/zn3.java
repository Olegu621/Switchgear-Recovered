            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zn3 implements Cloneable {

                /* JADX INFO: renamed from: a */
                public final eo3 f20274a;

                /* JADX INFO: renamed from: b */
                public eo3 f20275b;

                public zn3(eo3 eo3Var) {
/* 4 */             this.f20274a = eo3Var;
/* 11 */            if (eo3Var.m3545m()) {
/* 25 */                C1951n4.m6859j("Default instance must be immutable.");
/* 28 */                throw null;
                    }
/* 20 */            this.f20275b = (eo3) eo3Var.mo317l(4, null);
                }

                /* JADX INFO: renamed from: a */
                public void mo3152a() {
/* 9 */             eo3 eo3Var = (eo3) this.f20274a.mo317l(4, null);
/* 23 */            yp3.f19747c.m10168a(eo3Var.getClass()).zzd(eo3Var, this.f20275b);
/* 26 */            this.f20275b = eo3Var;
                }

                /* JADX INFO: renamed from: b */
                public eo3 mo3153b() {
/* 3 */             boolean zM3545m = this.f20275b.m3545m();
/* 7 */             eo3 eo3Var = this.f20275b;
/* 9 */             if (!zM3545m) {
/* 11 */                return eo3Var;
                    }
/* 12 */            eo3Var.getClass();
/* 25 */            yp3.f19747c.m10168a(eo3Var.getClass()).zzj(eo3Var);
/* 28 */            eo3Var.m3546n();
/* 31 */            return this.f20275b;
                }

                /* JADX INFO: renamed from: c */
                public /* bridge */ tm3 mo3154c() {
/* 1 */             return mo3153b();
                }

                public final Object clone() {
/* 9 */             zn3 zn3Var = (zn3) this.f20274a.mo317l(5, null);
/* 15 */            zn3Var.f20275b = mo3153b();
/* 17 */            return zn3Var;
                }
            }
