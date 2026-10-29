            package io.sentry;

            import java.util.Locale;
            
            /* JADX INFO: renamed from: io.sentry.p6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1584p6 {
                LOW(0.8f, 50000, 10),
                MEDIUM(1.0f, 75000, 30),
                HIGH(1.0f, 100000, 50);

                public final int bitRate;
                public final int screenshotQuality;
                public final float sizeScale;

                EnumC1584p6(float f, int i, int i2) {
/* 4 */             this.sizeScale = f;
/* 6 */             this.bitRate = i;
/* 8 */             this.screenshotQuality = i2;
                }

                public String serializedName() {
/* 7 */             return name().toLowerCase(Locale.ROOT);
                }
            }
