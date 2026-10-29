            package com.usercentrics.sdk.services.tcf.interfaces;

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
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFData.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TCFData$$serializer implements uq0 {
                public static final TCFData$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TCFData$$serializer tCFData$$serializer = new TCFData$$serializer();
/* 6 */             INSTANCE = tCFData$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFData", tCFData$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("features", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("purposes", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("specialFeatures", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("specialPurposes", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("stacks", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("vendors", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("tcString", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("thirdPartyCount", false);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private TCFData$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = TCFData.f6159i;
/* 23 */            return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], vh2.f18183a, az0.f2143a};
                }

                @Override // kotlinx.serialization.KSerializer
                public TCFData deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = TCFData.f6159i;
/* 18 */            TCFData tCFData = null;
/* 19 */            boolean z = true;
/* 20 */            int i = 0;
/* 21 */            int iMo4371q = 0;
/* 23 */            List list = null;
/* 24 */            List list2 = null;
/* 25 */            List list3 = null;
/* 26 */            List list4 = null;
/* 27 */            List list5 = null;
/* 28 */            List list6 = null;
/* 29 */            String strMo4376v = null;
/* 30 */            while (z) {
/* 32 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 136 */                       z = false;
                                continue;
                            case 0:
/* 131 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, kSerializerArr[0], list);
/* 133 */                       i |= 1;
                                break;
                            case 1:
/* 119 */                       list2 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 1, kSerializerArr[1], list2);
/* 121 */                       i |= 2;
                                break;
                            case 2:
/* 107 */                       list3 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 2, kSerializerArr[2], list3);
/* 109 */                       i |= 4;
                                break;
                            case 3:
/* 94 */                        list4 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 3, kSerializerArr[3], list4);
/* 96 */                        i |= 8;
                                break;
                            case 4:
/* 81 */                        list5 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 4, kSerializerArr[4], list5);
/* 83 */                        i |= 16;
                                break;
                            case 5:
/* 67 */                        list6 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 5, kSerializerArr[5], list6);
/* 69 */                        i |= 32;
                                break;
                            case 6:
/* 52 */                        strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 56 */                        i |= 64;
                                continue;
                            case 7:
/* 44 */                        iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 7);
/* 48 */                        i |= 128;
                                continue;
                            default:
/* 39 */                        C1951n4.m6855e(iMo3299x);
/* 42 */                        return tCFData;
                        }
/* 71 */                tCFData = null;
                    }
/* 138 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 143 */           return new TCFData(i, list, list2, list3, list4, list5, list6, strMo4376v, iMo4371q);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TCFData value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = TCFData.f6159i;
/* 22 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, kSerializerArr[0], value.f6160a);
/* 30 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6161b);
/* 38 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 2, kSerializerArr[2], value.f6162c);
/* 46 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 3, kSerializerArr[3], value.f6163d);
/* 54 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 4, kSerializerArr[4], value.f6164e);
/* 62 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 5, kSerializerArr[5], value.f6165f);
/* 68 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, value.f6166g);
/* 74 */            interfaceC1907lyMo1499c.mo1508l(7, value.f6167h, descriptor2);
/* 77 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
