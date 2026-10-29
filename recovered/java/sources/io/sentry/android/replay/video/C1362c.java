            package io.sentry.android.replay.video;

            import android.media.MediaCodecInfo;
            import android.media.MediaCodecList;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.StringsKt;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.video.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1362c extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public static final C1362c f10679a = new C1362c(0);

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 3 */             boolean z = false;
/* 7 */             MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
/* 11 */            codecInfos.getClass();
/* 16 */            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
/* 20 */                String name = mediaCodecInfo.getName();
/* 24 */                name.getClass();
/* 33 */                if (StringsKt.m6240z(name, "c2.exynos", false)) {
/* 35 */                    z = true;
                            break;
                        }
                    }
/* 40 */            return Boolean.valueOf(z);
                }
            }
