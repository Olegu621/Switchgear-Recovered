            package p000;

            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class cx1 extends i81 {

                /* JADX INFO: renamed from: b */
                public final String f6933b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public cx1(SerialDescriptor serialDescriptor) {
/* 4 */             super(serialDescriptor);
/* 1 */             serialDescriptor.getClass();
/* 28 */            this.f6933b = serialDescriptor.mo130a() + "Array";
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f6933b;
                }
            }
