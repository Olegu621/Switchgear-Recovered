            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
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
            import okio.Segment;
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.j13;
            import p000.nd0;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class ServiceConsentTemplate$$serializer implements uq0 {
                public static final ServiceConsentTemplate$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             ServiceConsentTemplate$$serializer serviceConsentTemplate$$serializer = new ServiceConsentTemplate$$serializer();
/* 6 */             INSTANCE = serviceConsentTemplate$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate", serviceConsentTemplate$$serializer, 11);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("isDeactivated", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("defaultConsentStatus", true);
/* 31 */            pluginGeneratedSerialDescriptor.m6270j("templateId", false);
/* 36 */            pluginGeneratedSerialDescriptor.m6270j("version", false);
/* 41 */            pluginGeneratedSerialDescriptor.m6270j("categorySlug", true);
/* 46 */            pluginGeneratedSerialDescriptor.m6270j("description", true);
/* 51 */            pluginGeneratedSerialDescriptor.m6270j("isHidden", false);
/* 56 */            pluginGeneratedSerialDescriptor.m6270j("subConsents", true);
/* 61 */            pluginGeneratedSerialDescriptor.m6270j("isAutoUpdateAllowed", true);
/* 66 */            pluginGeneratedSerialDescriptor.m6270j("legalBasisList", true);
/* 71 */            pluginGeneratedSerialDescriptor.m6270j("disableLegalBasis", true);
/* 74 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private ServiceConsentTemplate$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = ServiceConsentTemplate.f6446l;
/* 3 */             C0920fk c0920fk = C0920fk.f8246a;
/* 5 */             KSerializer kSerializerM5647i = j13.m5647i(c0920fk);
/* 9 */             KSerializer kSerializerM5647i2 = j13.m5647i(c0920fk);
/* 13 */            vh2 vh2Var = vh2.f18183a;
/* 44 */            return new KSerializer[]{kSerializerM5647i, kSerializerM5647i2, vh2Var, vh2Var, j13.m5647i(vh2Var), j13.m5647i(vh2Var), c0920fk, kSerializerArr[7], j13.m5647i(c0920fk), j13.m5647i(kSerializerArr[9]), j13.m5647i(c0920fk)};
                }

                @Override // kotlinx.serialization.KSerializer
                public ServiceConsentTemplate deserialize(Decoder decoder) {
                    KSerializer[] kSerializerArr;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr2 = ServiceConsentTemplate.f6446l;
/* 18 */            Boolean bool = null;
/* 19 */            List list = null;
/* 20 */            Boolean bool2 = null;
/* 21 */            boolean z = true;
/* 22 */            List list2 = null;
/* 23 */            int i = 0;
/* 24 */            Boolean bool3 = null;
/* 25 */            Boolean bool4 = null;
/* 26 */            String strMo4376v = null;
/* 27 */            String strMo4376v2 = null;
/* 28 */            String str = null;
/* 29 */            String str2 = null;
/* 30 */            boolean zMo4374t = false;
/* 31 */            while (z) {
/* 33 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 228 */                       z = false;
                                break;
                            case 0:
/* 209 */                       kSerializerArr = kSerializerArr2;
/* 222 */                       bool3 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, C0920fk.f8246a, bool3);
/* 224 */                       i |= 1;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 1:
/* 191 */                       kSerializerArr = kSerializerArr2;
/* 203 */                       bool4 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, C0920fk.f8246a, bool4);
/* 205 */                       i |= 2;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 2:
/* 184 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 188 */                       i |= 4;
/* 130 */                       kSerializerArr2 = kSerializerArr2;
                                break;
                            case 3:
/* 172 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 176 */                       i |= 8;
/* 130 */                       kSerializerArr2 = kSerializerArr2;
                                break;
                            case 4:
/* 150 */                       kSerializerArr = kSerializerArr2;
/* 162 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, vh2.f18183a, str);
/* 164 */                       i |= 16;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 5:
/* 133 */                       kSerializerArr = kSerializerArr2;
/* 145 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, vh2.f18183a, str2);
/* 147 */                       i |= 32;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 6:
/* 124 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 6);
/* 128 */                       i |= 64;
/* 130 */                       kSerializerArr2 = kSerializerArr2;
                                break;
                            case 7:
/* 102 */                       kSerializerArr = kSerializerArr2;
/* 114 */                       list2 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 7, kSerializerArr[7], list2);
/* 116 */                       i |= 128;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 8:
/* 84 */                        kSerializerArr = kSerializerArr2;
/* 97 */                        bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 8, C0920fk.f8246a, bool2);
/* 99 */                        i |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 9:
/* 66 */                        kSerializerArr = kSerializerArr2;
/* 79 */                        list = (List) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, kSerializerArr[9], list);
/* 81 */                        i |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            case 10:
/* 44 */                        kSerializerArr = kSerializerArr2;
/* 57 */                        bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 10, C0920fk.f8246a, bool);
/* 59 */                        i |= Segment.SHARE_MINIMUM;
/* 61 */                        kSerializerArr2 = kSerializerArr;
/* 63 */                        z = z;
                                break;
                            default:
/* 40 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                        }
                    }
/* 231 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 244 */           return new ServiceConsentTemplate(i, bool3, bool4, strMo4376v, strMo4376v2, str, str2, zMo4374t, list2, bool2, list, bool);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, ServiceConsentTemplate value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             Boolean bool = value.f6448b;
/* 9 */             Boolean bool2 = value.f6447a;
/* 11 */            SerialDescriptor descriptor2 = getDescriptor();
/* 15 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 19 */            KSerializer[] kSerializerArr = ServiceConsentTemplate.f6446l;
/* 25 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool2 != null) {
/* 33 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, C0920fk.f8246a, bool2);
                    }
/* 40 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool != null) {
/* 48 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, C0920fk.f8246a, bool);
                    }
/* 51 */            String str = value.f6449c;
/* 53 */            Boolean bool3 = value.f6457k;
/* 55 */            List list = value.f6456j;
/* 57 */            Boolean bool4 = value.f6455i;
/* 59 */            List list2 = value.f6454h;
/* 61 */            String str2 = value.f6452f;
/* 63 */            String str3 = value.f6451e;
/* 66 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, str);
/* 72 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6450d);
/* 79 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 87 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, vh2.f18183a, str3);
                    }
/* 94 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 102 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 5, vh2.f18183a, str2);
                    }
/* 108 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 6, value.f6453g);
/* 115 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(list2, nd0.f14189a)) {
/* 129 */               interfaceC1907lyMo1499c.mo1505i(descriptor2, 7, kSerializerArr[7], list2);
                    }
/* 136 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool4 != null) {
/* 145 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 8, C0920fk.f8246a, bool4);
                    }
/* 152 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || list != null) {
/* 161 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 9, kSerializerArr[9], list);
                    }
/* 168 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool3 != null) {
/* 177 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 10, C0920fk.f8246a, bool3);
                    }
/* 180 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
