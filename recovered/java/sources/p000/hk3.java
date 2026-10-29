            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hk3 extends sq3 {

                /* JADX INFO: renamed from: b */
                public boolean f9127b;

                public hk3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 12 */            ((ij3) this.f16749a).f9663l0++;
                }

                /* JADX INFO: renamed from: A */
                public abstract boolean mo1364A();

                /* JADX INFO: renamed from: B */
                public final void m4240B() {
/* 3 */             if (this.f9127b) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Not initialized");
                }

                /* JADX INFO: renamed from: C */
                public final void m4241C() {
/* 3 */             if (this.f9127b) {
/* 26 */                f42.m3656l("Can't initialize twice");
                    } else {
/* 9 */                 if (mo1364A()) {
/* 23 */                    return;
                        }
/* 17 */                ((ij3) this.f16749a).f9665n0.incrementAndGet();
/* 21 */                this.f9127b = true;
                    }
                }
            }
