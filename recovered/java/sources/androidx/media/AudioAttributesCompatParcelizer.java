            package androidx.media;

            import p000.h23;
            import p000.j23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AudioAttributesCompatParcelizer {
                public static AudioAttributesCompat read(h23 h23Var) {
/* 3 */             AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
/* 6 */             j23 j23VarM4094h = audioAttributesCompat.f1545a;
/* 13 */            if (h23Var.mo4091e(1)) {
/* 16 */                j23VarM4094h = h23Var.m4094h();
                    }
/* 22 */            audioAttributesCompat.f1545a = (AudioAttributesImpl) j23VarM4094h;
/* 24 */            return audioAttributesCompat;
                }

                public static void write(AudioAttributesCompat audioAttributesCompat, h23 h23Var) {
/* 1 */             h23Var.getClass();
/* 4 */             AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1545a;
/* 7 */             h23Var.mo4095i(1);
/* 10 */            h23Var.m4097k(audioAttributesImpl);
                }
            }
