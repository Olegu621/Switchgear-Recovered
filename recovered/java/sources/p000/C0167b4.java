            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: b4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0167b4 implements m10 {

                /* JADX INFO: renamed from: a */
                public final m10 f2198a;

                /* JADX INFO: renamed from: b */
                public final float f2199b;

                public C0167b4(float f, m10 m10Var) {
/* 6 */             while (m10Var instanceof C0167b4) {
/* 10 */                m10Var = ((C0167b4) m10Var).f2198a;
/* 17 */                f += ((C0167b4) m10Var).f2199b;
                    }
/* 19 */            this.f2198a = m10Var;
/* 21 */            this.f2199b = f;
                }

                @Override // p000.m10
                /* JADX INFO: renamed from: a */
                public final float mo47a(RectF rectF) {
/* 11 */            return Math.max(0.0f, this.f2198a.mo47a(rectF) + this.f2199b);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C0167b4)) {
/* 7 */                 return false;
                    }
/* 11 */            C0167b4 c0167b4 = (C0167b4) obj;
                    return this.f2198a.equals(c0167b4.f2198a) && this.f2199b == c0167b4.f2199b;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f2198a, Float.valueOf(this.f2199b)});
                }
            }
