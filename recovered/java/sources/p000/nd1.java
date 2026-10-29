            package p000;

            import android.adservices.measurement.MeasurementManager;
            import android.content.Context;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nd1 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14190a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f14191b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ nd1(Context context, int i) {
/* 6 */             super(1);
/* 1 */             this.f14190a = i;
/* 3 */             this.f14191b = context;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f14190a;
/* 3 */             Context context = this.f14191b;
                    switch (i) {
                        case 0:
/* 29 */                    ((Context) obj).getClass();
/* 34 */                    context.getClass();
/* 1 */                     MeasurementManager measurementManager = MeasurementManager.get(context);
/* 41 */                    measurementManager.getClass();
/* 44 */                    return new od1(measurementManager);
                        default:
/* 8 */                     C2303vq c2303vq = (C2303vq) obj;
/* 10 */                    sx1 sx1Var = sx1.f16851g;
/* 12 */                    c2303vq.getClass();
/* 15 */                    sx1Var.f16855d = c2303vq;
/* 17 */                    Context contextM7433l = pg3.m7433l(context);
/* 21 */                    contextM7433l.getClass();
/* 24 */                    sx1Var.f16856e = contextM7433l;
/* 26 */                    return sx1Var;
                    }
                }
            }
