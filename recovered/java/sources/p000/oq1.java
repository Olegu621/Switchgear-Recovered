            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import android.os.Build;
            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 83 */    public final class oq1 {

                /* JADX INFO: renamed from: a */
                public final qq1 f14865a;

                public oq1(int i, Surface surface) {
/* 4 */             int i2 = Build.VERSION.SDK_INT;
/* 8 */             if (i2 >= 33) {
/* 20 */                this.f14865a = new vq1(new OutputConfiguration(i, surface));
/* 22 */                return;
                    }
/* 25 */            if (i2 >= 28) {
/* 42 */                this.f14865a = new uq1(new tq1(new OutputConfiguration(i, surface)));
                    } else if (i2 >= 26) {
/* 64 */                this.f14865a = new sq1(new rq1(new OutputConfiguration(i, surface)));
                    } else {
/* 82 */                this.f14865a = new qq1(new pq1(new OutputConfiguration(i, surface)));
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof oq1)) {
/* 5 */                 return false;
                    }
/* 13 */            return this.f14865a.equals(((oq1) obj).f14865a);
                }

                public final int hashCode() {
/* 3 */             return this.f14865a.hashCode();
                }

/* 84 */        public oq1(qq1 qq1Var) {
/* 86 */            this.f14865a = qq1Var;
                }
            }
