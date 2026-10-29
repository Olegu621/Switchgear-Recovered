            package io.sentry.android.replay.util;

            import android.graphics.Bitmap;
            import android.graphics.Paint;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1349c extends b51 implements Function0 {

                /* JADX INFO: renamed from: b */
                public static final C1349c f10650b;

                /* JADX INFO: renamed from: c */
                public static final C1349c f10651c;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10652a;

                static {
/* 3 */             int i = 0;
/* 8 */             f10650b = new C1349c(i, 0);
/* 16 */            f10651c = new C1349c(i, 1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1349c(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.f10652a = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (this.f10652a) {
                        case 0:
/* 15 */                    return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        default:
/* 8 */                     return new Paint();
                    }
                }
            }
