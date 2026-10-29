            package p000;

            import java.util.ArrayList;
            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class gt1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8808a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PluginGeneratedSerialDescriptor f8809b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ gt1(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i) {
/* 6 */             super(0);
/* 1 */             this.f8808a = i;
/* 3 */             this.f8809b = pluginGeneratedSerialDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KSerializer[] kSerializerArrChildSerializers;
                    ArrayList arrayList;
                    KSerializer[] kSerializerArrTypeParametersSerializers;
/* 1 */             int i = this.f8808a;
/* 3 */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f8809b;
                    switch (i) {
                        case 0:
/* 71 */                    return Integer.valueOf(k50.m5989z(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f12959j.getValue()));
                        case 1:
/* 46 */                    uq0 uq0Var = pluginGeneratedSerialDescriptor.f12951b;
                            return (uq0Var == null || (kSerializerArrChildSerializers = uq0Var.childSerializers()) == null) ? de3.f7144d : kSerializerArrChildSerializers;
                        default:
/* 8 */                     uq0 uq0Var2 = pluginGeneratedSerialDescriptor.f12951b;
/* 10 */                    if (uq0Var2 == null || (kSerializerArrTypeParametersSerializers = uq0Var2.typeParametersSerializers()) == null) {
/* 40 */                        arrayList = null;
                            } else {
/* 21 */                        arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
/* 26 */                        for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
/* 34 */                            arrayList.add(kSerializer.getDescriptor());
                                }
                            }
/* 41 */                    return xe2.m9771i(arrayList);
                    }
                }
            }
