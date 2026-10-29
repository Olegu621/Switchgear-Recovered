            package p000;

            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class bp1 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final KSerializer f2559a;

                /* JADX INFO: renamed from: b */
                public final z92 f2560b;

                public bp1(KSerializer kSerializer) {
/* 1 */             kSerializer.getClass();
/* 7 */             this.f2559a = kSerializer;
/* 18 */            this.f2560b = new z92(kSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             if (decoder.mo3298w()) {
/* 9 */                 return decoder.mo4375u(this.f2559a);
                    }
/* 14 */            return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 40 */                return true;
                    }
                    return obj != null && j22.m5667a(bp1.class).equals(j22.m5667a(obj.getClass())) && Intrinsics.m6216a(this.f2559a, ((bp1) obj).f2559a);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return this.f2560b;
                }

                public final int hashCode() {
/* 3 */             return this.f2559a.hashCode();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             if (obj != null) {
/* 5 */                 encoder.mo1484A(this.f2559a, obj);
                    } else {
/* 9 */                 encoder.mo1502f();
                    }
                }
            }
