            package com.usercentrics.sdk.p009v2.settings.data;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import okhttp3.HttpUrl;
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.j13;
            import p000.nd0;
            import p000.sa1;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/ConsentDisclosure.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class ConsentDisclosure$$serializer implements uq0 {
                public static final ConsentDisclosure$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             ConsentDisclosure$$serializer consentDisclosure$$serializer = new ConsentDisclosure$$serializer();
/* 6 */             INSTANCE = consentDisclosure$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.ConsentDisclosure", consentDisclosure$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("identifier", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("type", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("name", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("maxAgeSeconds", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("cookieRefresh", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("purposes", true);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("domain", true);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("description", true);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private ConsentDisclosure$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = ConsentDisclosure.f6391i;
/* 3 */             vh2 vh2Var = vh2.f18183a;
/* 39 */            return new KSerializer[]{j13.m5647i(vh2Var), j13.m5647i(kSerializerArr[1]), j13.m5647i(vh2Var), j13.m5647i(sa1.f16487a), C0920fk.f8246a, kSerializerArr[5], j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public ConsentDisclosure deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = ConsentDisclosure.f6391i;
/* 17 */            ConsentDisclosure consentDisclosure = null;
/* 18 */            boolean z = true;
/* 19 */            String str = null;
/* 20 */            String str2 = null;
/* 21 */            ConsentDisclosureType consentDisclosureType = null;
/* 22 */            String str3 = null;
/* 23 */            Long l = null;
/* 24 */            List list = null;
/* 25 */            String str4 = null;
/* 26 */            int i = 0;
/* 27 */            boolean zMo4374t = false;
/* 28 */            while (z) {
/* 30 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 141 */                       z = false;
                                break;
                            case 0:
/* 135 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str2);
/* 137 */                       i |= 1;
                                break;
                            case 1:
/* 122 */                       consentDisclosureType = (ConsentDisclosureType) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, kSerializerArr[1], consentDisclosureType);
/* 124 */                       i |= 2;
                                break;
                            case 2:
/* 110 */                       str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, vh2.f18183a, str3);
/* 112 */                       i |= 4;
                                break;
                            case 3:
/* 97 */                        l = (Long) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, sa1.f16487a, l);
/* 99 */                        i |= 8;
                                break;
                            case 4:
/* 82 */                        zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 4);
/* 86 */                        i |= 16;
                                break;
                            case 5:
/* 76 */                        list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 5, kSerializerArr[5], list);
/* 78 */                        i |= 32;
                                break;
                            case 6:
/* 63 */                        str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str4);
/* 65 */                        i |= 64;
                                break;
                            case 7:
/* 49 */                        str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str);
/* 51 */                        i |= 128;
                                break;
                            default:
/* 37 */                        C1951n4.m6855e(iMo3299x);
/* 40 */                        return consentDisclosure;
                        }
/* 53 */                consentDisclosure = null;
                    }
/* 143 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 150 */           return new ConsentDisclosure(i, str2, consentDisclosureType, str3, l, zMo4374t, list, str4, str);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, ConsentDisclosure value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             String str = value.f6399h;
/* 9 */             String str2 = value.f6398g;
/* 11 */            List list = value.f6397f;
/* 13 */            boolean z = value.f6396e;
/* 15 */            Long l = value.f6395d;
/* 17 */            String str3 = value.f6394c;
/* 19 */            ConsentDisclosureType consentDisclosureType = value.f6393b;
/* 21 */            String str4 = value.f6392a;
/* 23 */            SerialDescriptor descriptor2 = getDescriptor();
/* 27 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 31 */            KSerializer[] kSerializerArr = ConsentDisclosure.f6391i;
/* 37 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str4 != null) {
/* 45 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, vh2.f18183a, str4);
                    }
/* 52 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || consentDisclosureType != null) {
/* 60 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, kSerializerArr[1], consentDisclosureType);
                    }
/* 67 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 75 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, vh2.f18183a, str3);
                    }
/* 82 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || l != null) {
/* 90 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, sa1.f16487a, l);
                    }
/* 97 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z) {
/* 103 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 4, z);
                    }
/* 110 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(list, nd0.f14189a)) {
/* 124 */               interfaceC1907lyMo1499c.mo1505i(descriptor2, 5, kSerializerArr[5], list);
                    }
/* 131 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 139 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, vh2.f18183a, str2);
                    }
/* 146 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 154 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 7, vh2.f18183a, str);
                    }
/* 157 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
