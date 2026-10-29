            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0862e implements m10 {

                /* JADX INFO: renamed from: a */
                public final float f7457a;

                public C0862e(float f) {
/* 4 */             this.f7457a = f;
                }

                @Override // p000.m10
                /* JADX INFO: renamed from: a */
                public final float mo47a(RectF rectF) {
/* 1 */             return this.f7457a;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof C0862e) && this.f7457a == ((C0862e) obj).f7457a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Float.valueOf(this.f7457a)});
                }
            }
