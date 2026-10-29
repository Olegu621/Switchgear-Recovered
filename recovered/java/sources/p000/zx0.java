            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zx0 {

                /* JADX INFO: renamed from: a */
                public final InputConfiguration f20364a;

                public zx0(Object obj) {
/* 6 */             this.f20364a = (InputConfiguration) obj;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof zx0)) {
/* 5 */                 return false;
                    }
/* 13 */            return Objects.equals(this.f20364a, ((zx0) obj).f20364a);
                }

                public final int hashCode() {
/* 3 */             return this.f20364a.hashCode();
                }

                public final String toString() {
/* 3 */             return this.f20364a.toString();
                }
            }
