            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gz1 implements t13 {

                /* JADX INFO: renamed from: a */
                public boolean f8854a = false;

                /* JADX INFO: renamed from: b */
                public boolean f8855b = false;

                /* JADX INFO: renamed from: c */
                public eh0 f8856c;

                /* JADX INFO: renamed from: d */
                public final fz1 f8857d;

                public gz1(fz1 fz1Var) {
/* 9 */             this.f8857d = fz1Var;
                }

                @Override // p000.t13
                /* JADX INFO: renamed from: b */
                public final t13 mo4052b(String str) {
/* 3 */             if (this.f8854a) {
/* 25 */                throw new wd0("Cannot encode a second value in the ValueEncoderContext");
                    }
/* 6 */             this.f8854a = true;
/* 14 */            this.f8857d.m3863f(this.f8856c, str, this.f8855b);
/* 17 */            return this;
                }

                @Override // p000.t13
                /* JADX INFO: renamed from: c */
                public final t13 mo4053c(boolean z) {
/* 3 */             if (this.f8854a) {
/* 25 */                throw new wd0("Cannot encode a second value in the ValueEncoderContext");
                    }
/* 6 */             this.f8854a = true;
/* 14 */            this.f8857d.m3861b(this.f8856c, z ? 1 : 0, this.f8855b);
/* 17 */            return this;
                }
            }
