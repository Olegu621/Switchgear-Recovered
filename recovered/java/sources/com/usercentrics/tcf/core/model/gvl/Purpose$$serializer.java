            package com.usercentrics.tcf.core.model.gvl;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.List;
            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.az0;
            import p000.de3;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/tcf/core/model/gvl/Purpose.$serializer", "Luq0;", "Lcom/usercentrics/tcf/core/model/gvl/Purpose;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/Purpose;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/Purpose;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class Purpose$$serializer implements uq0 {
                public static final Purpose$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             Purpose$$serializer purpose$$serializer = new Purpose$$serializer();
/* 6 */             INSTANCE = purpose$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.tcf.core.model.gvl.Purpose", purpose$$serializer, 4);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("description", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 34 */            pluginGeneratedSerialDescriptor.m6270j("illustrations", false);
/* 37 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private Purpose$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 4 */             KSerializer kSerializer = Purpose.f6818e[3];
/* 9 */             vh2 vh2Var = vh2.f18183a;
/* 7 */             return new KSerializer[]{vh2Var, az0.f2143a, vh2Var, kSerializer};
                }

                @Override // kotlinx.serialization.KSerializer
                public Purpose deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = Purpose.f6818e;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            int iMo4371q = 0;
/* 20 */            String strMo4376v = null;
/* 21 */            String strMo4376v2 = null;
/* 22 */            List list = null;
/* 23 */            while (z) {
/* 25 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 30 */                if (iMo3299x == -1) {
/* 79 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 72 */                    strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 76 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 65 */                    iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 1);
/* 69 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 58 */                    strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 62 */                    i |= 4;
                        } else {
/* 40 */                    if (iMo3299x != 3) {
/* 54 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 49 */                    list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 3, kSerializerArr[3], list);
/* 51 */                    i |= 8;
                        }
                    }
/* 81 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 86 */            return new Purpose(i, iMo4371q, strMo4376v, strMo4376v2, list);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, Purpose value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = Purpose.f6818e;
/* 20 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6819a);
/* 26 */            interfaceC1907lyMo1499c.mo1508l(1, value.f6820b, descriptor2);
/* 32 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, value.f6821c);
/* 40 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 3, kSerializerArr[3], value.f6822d);
/* 43 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
