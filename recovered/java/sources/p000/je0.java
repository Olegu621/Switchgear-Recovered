            package p000;

            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.internal.EnumDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class je0 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12236a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12237b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ EnumDescriptor f12238c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public je0(int i, String str, EnumDescriptor enumDescriptor) {
/* 8 */             super(0);
/* 1 */             this.f12236a = i;
/* 3 */             this.f12237b = str;
/* 5 */             this.f12238c = enumDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f12236a;
/* 3 */             SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 45 */                serialDescriptorArr[i2] = hu0.m4322L(this.f12237b + '.' + this.f12238c.f12954e[i2], ei2.f7701n, new SerialDescriptor[0]);
                    }
/* 50 */            return serialDescriptorArr;
                }
            }
