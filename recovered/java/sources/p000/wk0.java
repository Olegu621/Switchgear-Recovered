            package p000;

            import io.flutter.embedding.engine.systemchannels.PlatformChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class wk0 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f18669a;

                static {
/* 6 */             int[] iArr = new int[PlatformChannel.HapticFeedbackType.values().length];
/* 8 */             f18669a = iArr;
                    try {
/* 17 */                iArr[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 28 */                f18669a[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 39 */                f18669a[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
/* 50 */                f18669a[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
/* 61 */                f18669a[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }
