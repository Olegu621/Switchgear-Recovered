            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a32 implements m10 {

                /* JADX INFO: renamed from: a */
                public final float f76a;

                public a32(float f) {
/* 4 */             this.f76a = f;
                }

                @Override // p000.m10
                /* JADX INFO: renamed from: a */
                public final float mo47a(RectF rectF) {
/* 7 */             return rectF.height() * this.f76a;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof a32) && this.f76a == ((a32) obj).f76a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Float.valueOf(this.f76a)});
                }
            }
