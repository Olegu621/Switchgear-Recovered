            package io.sentry.android.replay.screenshot;

            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import io.sentry.android.replay.C1372x;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1341g extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10610a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1342h f10611b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1341g(C1342h c1342h, int i) {
/* 6 */             super(0);
/* 1 */             this.f10610a = i;
/* 3 */             this.f10611b = c1342h;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f10610a;
/* 3 */             C1342h c1342h = this.f10611b;
                    switch (i) {
                        case 0:
/* 18 */                    Matrix matrix = new Matrix();
/* 21 */                    C1372x c1372x = c1342h.f10614c;
/* 27 */                    matrix.preScale(c1372x.f10705c, c1372x.f10706d);
/* 30 */                    return matrix;
                        default:
/* 12 */                    return new Canvas(c1342h.f10618g);
                    }
                }
            }
