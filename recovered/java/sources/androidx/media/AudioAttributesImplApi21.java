            package androidx.media;

            import android.media.AudioAttributes;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AudioAttributesImplApi21 implements AudioAttributesImpl {

                /* JADX INFO: renamed from: a */
                public AudioAttributes f1546a;

                /* JADX INFO: renamed from: b */
                public int f1547b;

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof AudioAttributesImplApi21) {
/* 13 */                return this.f1546a.equals(((AudioAttributesImplApi21) obj).f1546a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f1546a.hashCode();
                }

                public final String toString() {
/* 13 */            return "AudioAttributesCompat: audioattributes=" + this.f1546a;
                }
            }
