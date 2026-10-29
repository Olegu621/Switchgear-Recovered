            package androidx.media;

            import android.media.AudioAttributes;
            import p000.h23;
            import p000.i23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AudioAttributesImplApi21Parcelizer {
                public static AudioAttributesImplApi21 read(h23 h23Var) {
/* 3 */             AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
/* 7 */             audioAttributesImplApi21.f1547b = -1;
/* 18 */            audioAttributesImplApi21.f1546a = (AudioAttributes) h23Var.m4093g(audioAttributesImplApi21.f1546a, 1);
/* 27 */            audioAttributesImplApi21.f1547b = h23Var.m4092f(audioAttributesImplApi21.f1547b, 2);
/* 29 */            return audioAttributesImplApi21;
                }

                public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, h23 h23Var) {
/* 1 */             h23Var.getClass();
/* 4 */             AudioAttributes audioAttributes = audioAttributesImplApi21.f1546a;
/* 7 */             h23Var.mo4095i(1);
/* 16 */            ((i23) h23Var).f9423e.writeParcelable(audioAttributes, 0);
/* 22 */            h23Var.m4096j(audioAttributesImplApi21.f1547b, 2);
                }
            }
