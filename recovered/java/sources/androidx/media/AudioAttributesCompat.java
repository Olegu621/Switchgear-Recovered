            package androidx.media;

            import android.util.SparseIntArray;
            import p000.j23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AudioAttributesCompat implements j23 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f1544b = 0;

                /* JADX INFO: renamed from: a */
                public AudioAttributesImpl f1545a;

                static {
/* 3 */             SparseIntArray sparseIntArray = new SparseIntArray();
/* 8 */             sparseIntArray.put(5, 1);
/* 13 */            sparseIntArray.put(6, 2);
/* 17 */            sparseIntArray.put(7, 2);
/* 22 */            sparseIntArray.put(8, 1);
/* 27 */            sparseIntArray.put(9, 1);
/* 32 */            sparseIntArray.put(10, 1);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AudioAttributesCompat)) {
/* 3 */                 return false;
                    }
/* 9 */             AudioAttributesImpl audioAttributesImpl = this.f1545a;
/* 11 */            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f1545a;
/* 13 */            if (audioAttributesImpl == null) {
                        return audioAttributesImpl2 == null;
                    }
/* 20 */            return audioAttributesImpl.equals(audioAttributesImpl2);
                }

                public final int hashCode() {
/* 3 */             return this.f1545a.hashCode();
                }

                public final String toString() {
/* 3 */             return this.f1545a.toString();
                }
            }
