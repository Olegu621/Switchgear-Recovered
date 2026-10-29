            package androidx.media;

            import p000.h23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AudioAttributesImplBaseParcelizer {
                public static AudioAttributesImplBase read(h23 h23Var) {
/* 3 */             AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
/* 7 */             audioAttributesImplBase.f1548a = 0;
/* 9 */             audioAttributesImplBase.f1549b = 0;
/* 11 */            audioAttributesImplBase.f1550c = 0;
/* 14 */            audioAttributesImplBase.f1551d = -1;
/* 21 */            audioAttributesImplBase.f1548a = h23Var.m4092f(0, 1);
/* 30 */            audioAttributesImplBase.f1549b = h23Var.m4092f(audioAttributesImplBase.f1549b, 2);
/* 39 */            audioAttributesImplBase.f1550c = h23Var.m4092f(audioAttributesImplBase.f1550c, 3);
/* 48 */            audioAttributesImplBase.f1551d = h23Var.m4092f(audioAttributesImplBase.f1551d, 4);
/* 50 */            return audioAttributesImplBase;
                }

                public static void write(AudioAttributesImplBase audioAttributesImplBase, h23 h23Var) {
/* 1 */             h23Var.getClass();
/* 7 */             h23Var.m4096j(audioAttributesImplBase.f1548a, 1);
/* 13 */            h23Var.m4096j(audioAttributesImplBase.f1549b, 2);
/* 19 */            h23Var.m4096j(audioAttributesImplBase.f1550c, 3);
/* 25 */            h23Var.m4096j(audioAttributesImplBase.f1551d, 4);
                }
            }
