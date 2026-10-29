            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlinx.serialization.KSerializer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class dc1 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7109a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KSerializer f7110b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KSerializer f7111c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ dc1(KSerializer kSerializer, KSerializer kSerializer2, int i) {
/* 8 */             super(1);
/* 1 */             this.f7109a = i;
/* 3 */             this.f7110b = kSerializer;
/* 5 */             this.f7111c = kSerializer2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f7109a;
/* 3 */             KSerializer kSerializer = this.f7111c;
/* 5 */             KSerializer kSerializer2 = this.f7110b;
                    switch (i) {
                        case 0:
/* 36 */                    C0894ev c0894ev = (C0894ev) obj;
/* 38 */                    c0894ev.getClass();
/* 47 */                    C0894ev.m3601a(c0894ev, "key", kSerializer2.getDescriptor());
/* 56 */                    C0894ev.m3601a(c0894ev, FirebaseAnalytics.Param.VALUE, kSerializer.getDescriptor());
                            break;
                        default:
/* 10 */                    C0894ev c0894ev2 = (C0894ev) obj;
/* 12 */                    c0894ev2.getClass();
/* 21 */                    C0894ev.m3601a(c0894ev2, "first", kSerializer2.getDescriptor());
/* 30 */                    C0894ev.m3601a(c0894ev2, "second", kSerializer.getDescriptor());
                            break;
                    }
/* 33 */            return Unit.f12910a;
                }
            }
