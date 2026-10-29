            package p000;

            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: renamed from: ad */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0015ad extends i81 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f185b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0015ad(SerialDescriptor serialDescriptor, int i) {
/* 3 */             super(serialDescriptor);
/* 1 */             this.f185b = i;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
                    switch (this.f185b) {
                        case 0:
/* 15 */                    return "kotlin.Array";
                        case 1:
/* 12 */                    return "kotlin.collections.ArrayList";
                        case 2:
/* 9 */                     return "kotlin.collections.HashSet";
                        default:
/* 6 */                     return "kotlin.collections.LinkedHashSet";
                    }
                }
            }
