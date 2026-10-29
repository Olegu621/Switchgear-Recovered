            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dd2 {

                /* JADX INFO: renamed from: a */
                public float f7126a;

                /* JADX INFO: renamed from: b */
                public float f7127b;

                /* JADX INFO: renamed from: c */
                public float f7128c;

                /* JADX INFO: renamed from: d */
                public float f7129d;

                /* JADX INFO: renamed from: e */
                public float f7130e;

                /* JADX INFO: renamed from: f */
                public float f7131f;

                /* JADX INFO: renamed from: g */
                public final ArrayList f7132g = new ArrayList();

                /* JADX INFO: renamed from: h */
                public final ArrayList f7133h = new ArrayList();

                public dd2() {
/* 21 */            m3009e(0.0f, 0.0f, 270.0f, 0.0f);
                }

                /* JADX INFO: renamed from: a */
                public final void m3005a(float f, float f2, float f3, float f4, float f5, float f6) {
/* 3 */             zc2 zc2Var = new zc2(f, f2, f3, f4);
/* 6 */             zc2Var.f20096f = f5;
/* 8 */             zc2Var.f20097g = f6;
/* 12 */            this.f7132g.add(zc2Var);
/* 17 */            xc2 xc2Var = new xc2(zc2Var);
/* 20 */            float f7 = f5 + f6;
/* 29 */            boolean z = f6 < 0.0f;
/* 34 */            if (z) {
/* 37 */                f5 = (f5 + 180.0f) % 360.0f;
                    }
/* 43 */            float f8 = z ? (180.0f + f7) % 360.0f : f7;
/* 44 */            m3006b(f5);
/* 49 */            this.f7133h.add(xc2Var);
/* 52 */            this.f7130e = f8;
                    double d = f7;
/* 75 */            this.f7128c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
/* 93 */            this.f7129d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
                }

                /* JADX INFO: renamed from: b */
                public final void m3006b(float f) {
/* 1 */             float f2 = this.f7130e;
/* 5 */             if (f2 == f) {
/* 20 */                return;
                    }
/* 13 */            float f3 = ((f - f2) + 360.0f) % 360.0f;
/* 18 */            if (f3 > 180.0f) {
/* 20 */                return;
                    }
/* 23 */            float f4 = this.f7128c;
/* 25 */            float f5 = this.f7129d;
/* 27 */            zc2 zc2Var = new zc2(f4, f5, f4, f5);
/* 32 */            zc2Var.f20096f = this.f7130e;
/* 34 */            zc2Var.f20097g = f3;
/* 43 */            this.f7133h.add(new xc2(zc2Var));
/* 46 */            this.f7130e = f;
                }

                /* JADX INFO: renamed from: c */
                public final void m3007c(Matrix matrix, Path path) {
/* 1 */             ArrayList arrayList = this.f7132g;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 16 */                ((bd2) arrayList.get(i)).mo204a(matrix, path);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m3008d(float f, float f2) {
/* 3 */             ad2 ad2Var = new ad2();
/* 6 */             ad2Var.f188b = f;
/* 8 */             ad2Var.f189c = f2;
/* 12 */            this.f7132g.add(ad2Var);
/* 21 */            yc2 yc2Var = new yc2(ad2Var, this.f7128c, this.f7129d);
/* 30 */            float fM10144b = yc2Var.m10144b() + 270.0f;
/* 35 */            float fM10144b2 = yc2Var.m10144b() + 270.0f;
/* 36 */            m3006b(fM10144b);
/* 41 */            this.f7133h.add(yc2Var);
/* 44 */            this.f7130e = fM10144b2;
/* 46 */            this.f7128c = f;
/* 48 */            this.f7129d = f2;
                }

                /* JADX INFO: renamed from: e */
                public final void m3009e(float f, float f2, float f3, float f4) {
/* 1 */             this.f7126a = f;
/* 3 */             this.f7127b = f2;
/* 5 */             this.f7128c = f;
/* 7 */             this.f7129d = f2;
/* 9 */             this.f7130e = f3;
/* 15 */            this.f7131f = (f3 + f4) % 360.0f;
/* 19 */            this.f7132g.clear();
/* 24 */            this.f7133h.clear();
                }
            }
