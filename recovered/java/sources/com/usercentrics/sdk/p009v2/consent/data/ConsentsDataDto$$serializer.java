            package com.usercentrics.sdk.p009v2.consent.data;

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
            import p000.de3;
            import p000.j13;
            import p000.sa1;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/consent/data/ConsentsDataDto.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class ConsentsDataDto$$serializer implements uq0 {
                public static final ConsentsDataDto$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             ConsentsDataDto$$serializer consentsDataDto$$serializer = new ConsentsDataDto$$serializer();
/* 6 */             INSTANCE = consentsDataDto$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.consent.data.ConsentsDataDto", consentsDataDto$$serializer, 7);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("action", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("settingsVersion", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("timestamp", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("consentString", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("consentMeta", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("consents", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("acString", true);
/* 53 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private ConsentsDataDto$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = ConsentsDataDto.f6307h;
/* 3 */             vh2 vh2Var = vh2.f18183a;
/* 25 */            return new KSerializer[]{j13.m5647i(vh2Var), vh2Var, sa1.f16487a, j13.m5647i(vh2Var), j13.m5647i(vh2Var), kSerializerArr[5], j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public ConsentsDataDto deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = ConsentsDataDto.f6307h;
/* 17 */            ConsentsDataDto consentsDataDto = null;
/* 20 */            String str = null;
/* 21 */            String str2 = null;
/* 22 */            String strMo4376v = null;
/* 23 */            String str3 = null;
/* 24 */            String str4 = null;
/* 25 */            long jMo4363i = 0;
/* 26 */            int i = 0;
/* 27 */            boolean z = true;
/* 28 */            List list = null;
/* 29 */            while (z) {
/* 31 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 124 */                       z = false;
                                break;
                            case 0:
/* 118 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str2);
/* 120 */                       i |= 1;
                                break;
                            case 1:
/* 103 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 107 */                       i |= 2;
                                break;
                            case 2:
/* 96 */                        jMo4363i = interfaceC1870kyMo3297c.mo4363i(descriptor2, 2);
/* 100 */                       i |= 4;
                                break;
                            case 3:
/* 90 */                        str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, vh2.f18183a, str3);
/* 92 */                        i |= 8;
                                break;
                            case 4:
/* 77 */                        str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, vh2.f18183a, str4);
/* 79 */                        i |= 16;
                                break;
                            case 5:
/* 64 */                        list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 5, kSerializerArr[5], list);
/* 66 */                        i |= 32;
                                break;
                            case 6:
/* 50 */                        str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str);
/* 52 */                        i |= 64;
                                break;
                            default:
/* 38 */                        C1951n4.m6855e(iMo3299x);
/* 41 */                        return consentsDataDto;
                        }
/* 54 */                consentsDataDto = null;
                    }
/* 126 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 135 */           return new ConsentsDataDto(i, str2, strMo4376v, jMo4363i, str3, str4, list, str);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, ConsentsDataDto value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             String str = value.f6308a;
/* 9 */             SerialDescriptor descriptor2 = getDescriptor();
/* 13 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 17 */            KSerializer[] kSerializerArr = ConsentsDataDto.f6307h;
/* 23 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 31 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, vh2.f18183a, str);
                    }
/* 34 */            String str2 = value.f6309b;
/* 36 */            String str3 = value.f6314g;
/* 38 */            String str4 = value.f6312e;
/* 40 */            String str5 = value.f6311d;
/* 43 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, str2);
/* 49 */            interfaceC1907lyMo1499c.mo1487D(descriptor2, 2, value.f6310c);
/* 56 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str5 != null) {
/* 64 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, vh2.f18183a, str5);
                    }
/* 71 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str4 != null) {
/* 79 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, vh2.f18183a, str4);
                    }
/* 87 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 5, kSerializerArr[5], value.f6313f);
/* 94 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 102 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, vh2.f18183a, str3);
                    }
/* 105 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
