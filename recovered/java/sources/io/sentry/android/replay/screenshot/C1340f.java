            package io.sentry.android.replay.screenshot;

            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffXfermode;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1340f extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public static final C1340f f10609a = new C1340f(0);

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 3 */             Paint paint = new Paint();
/* 13 */            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
/* 16 */            return paint;
                }
            }
