            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wo3 extends qo3 {

                /* JADX INFO: renamed from: c */
                public boolean f18714c;

                public wo3(mp3 mp3Var) {
/* 1 */             super(mp3Var);
/* 10 */            this.f15676b.f13914c0++;
                }

                /* JADX INFO: renamed from: A */
                public final void m9593A() {
/* 3 */             if (this.f18714c) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Not initialized");
                }

                /* JADX INFO: renamed from: B */
                public final void m9594B() {
/* 3 */             if (this.f18714c) {
/* 21 */                f42.m3656l("Can't initialize twice");
/* 24 */                return;
                    }
/* 5 */             mo216C();
/* 14 */            this.f15676b.f13916d0++;
/* 16 */            this.f18714c = true;
                }

                /* JADX INFO: renamed from: C */
                public abstract void mo216C();
            }
