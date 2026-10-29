            package p000;

            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.KSerializer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class om2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14825a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AbstractC1946n f14826b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KSerializer f14827c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f14828d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ om2(AbstractC1946n abstractC1946n, KSerializer kSerializer, Object obj, int i) {
/* 10 */            super(0);
/* 1 */             this.f14825a = i;
/* 3 */             this.f14826b = abstractC1946n;
/* 5 */             this.f14827c = kSerializer;
/* 7 */             this.f14828d = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f14825a;
/* 3 */             KSerializer kSerializer = this.f14827c;
/* 5 */             AbstractC1946n abstractC1946n = this.f14826b;
                    switch (i) {
                        case 0:
/* 22 */                    if (!abstractC1946n.mo3298w()) {
/* 32 */                        return null;
                            }
/* 24 */                    kSerializer.getClass();
/* 27 */                    return abstractC1946n.mo4375u(kSerializer);
                        default:
/* 10 */                    kSerializer.getClass();
/* 13 */                    return abstractC1946n.mo4375u(kSerializer);
                    }
                }
            }
