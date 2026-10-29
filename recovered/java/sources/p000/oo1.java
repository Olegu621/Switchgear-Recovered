            package p000;

            import android.media.AudioAttributes;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class oo1 {
                /* JADX INFO: renamed from: a */
                public static AudioAttributes m7218a(AudioAttributes.Builder builder) {
/* 1 */             return builder.build();
                }

                /* JADX INFO: renamed from: b */
                public static AudioAttributes.Builder m7219b() {
/* 3 */             return new AudioAttributes.Builder();
                }

                /* JADX INFO: renamed from: c */
                public static AudioAttributes.Builder m7220c(AudioAttributes.Builder builder, int i) {
/* 1 */             return builder.setContentType(i);
                }

                /* JADX INFO: renamed from: d */
                public static AudioAttributes.Builder m7221d(AudioAttributes.Builder builder, int i) {
/* 1 */             return builder.setLegacyStreamType(i);
                }

                /* JADX INFO: renamed from: e */
                public static AudioAttributes.Builder m7222e(AudioAttributes.Builder builder, int i) {
/* 1 */             return builder.setUsage(i);
                }
            }
