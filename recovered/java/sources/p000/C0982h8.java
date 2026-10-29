            package p000;

            import android.graphics.Matrix;
            import android.media.Image;
            
            /* JADX INFO: renamed from: h8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0982h8 implements mw0 {

                /* JADX INFO: renamed from: a */
                public final Image f8949a;

                /* JADX INFO: renamed from: b */
                public final gr0[] f8950b;

                /* JADX INFO: renamed from: c */
                public final C2366xf f8951c;

                public C0982h8(Image image) {
/* 4 */             this.f8949a = image;
/* 6 */             Image.Plane[] planes = image.getPlanes();
/* 11 */            if (planes != null) {
/* 16 */                this.f8950b = new gr0[planes.length];
/* 19 */                for (int i = 0; i < planes.length; i++) {
/* 30 */                    this.f8950b[i] = new gr0(planes[i]);
                        }
                    } else {
/* 37 */                this.f8950b = new gr0[0];
                    }
/* 56 */            this.f8951c = new C2366xf(nm2.f14382b, image.getTimestamp(), 0, new Matrix());
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: P0 */
                public final Image mo1724P0() {
/* 1 */             return this.f8949a;
                }

                @Override // java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f8949a.close();
                }

                @Override // p000.mw0
                public final int getFormat() {
/* 3 */             return this.f8949a.getFormat();
                }

                @Override // p000.mw0
                public final int getHeight() {
/* 3 */             return this.f8949a.getHeight();
                }

                @Override // p000.mw0
                public final int getWidth() {
/* 3 */             return this.f8949a.getWidth();
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: j */
                public final lw0[] mo1726j() {
/* 1 */             return this.f8950b;
                }

                @Override // p000.mw0
                /* JADX INFO: renamed from: x0 */
                public final gw0 mo1727x0() {
/* 1 */             return this.f8951c;
                }
            }
