            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wg3 extends eg3 {

                /* JADX INFO: renamed from: b */
                public boolean f18620b;

                public wg3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 12 */            ((ij3) this.f16749a).f9663l0++;
                }

                /* JADX INFO: renamed from: A */
                public final void m9576A() {
/* 3 */             if (this.f18620b) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Not initialized");
                }

                /* JADX INFO: renamed from: B */
                public final void m9577B() {
/* 3 */             if (this.f18620b) {
/* 26 */                f42.m3656l("Can't initialize twice");
                    } else {
/* 9 */                 if (mo4531C()) {
/* 23 */                    return;
                        }
/* 17 */                ((ij3) this.f16749a).f9665n0.incrementAndGet();
/* 21 */                this.f18620b = true;
                    }
                }

                /* JADX INFO: renamed from: C */
                public abstract boolean mo4531C();
            }
