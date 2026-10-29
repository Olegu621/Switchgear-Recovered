            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            
            /* JADX INFO: renamed from: vs */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2305vs {

                /* JADX INFO: renamed from: a */
                public final Matrix f18332a = new Matrix();

                /* JADX INFO: renamed from: b */
                public final View f18333b;

                /* JADX INFO: renamed from: c */
                public final float[] f18334c;

                /* JADX INFO: renamed from: d */
                public float f18335d;

                /* JADX INFO: renamed from: e */
                public float f18336e;

                public C2305vs(View view, float[] fArr) {
/* 11 */            this.f18333b = view;
/* 17 */            float[] fArr2 = (float[]) fArr.clone();
/* 19 */            this.f18334c = fArr2;
/* 24 */            this.f18335d = fArr2[2];
/* 29 */            this.f18336e = fArr2[5];
/* 31 */            m9340a();
                }

                /* JADX INFO: renamed from: a */
                public final void m9340a() {
/* 2 */             float f = this.f18335d;
/* 4 */             float[] fArr = this.f18334c;
/* 6 */             fArr[2] = f;
/* 11 */            fArr[5] = this.f18336e;
/* 13 */            Matrix matrix = this.f18332a;
/* 15 */            matrix.setValues(fArr);
/* 22 */            l53.f13119a.mo6890P(this.f18333b, matrix);
                }
            }
