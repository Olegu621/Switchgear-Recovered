            package com.usercentrics.sdk.services.tcf.interfaces;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.List;
            import kotlin.Metadata;
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
            import p000.az0;
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFPurpose.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TCFPurpose$$serializer implements uq0 {
                public static final TCFPurpose$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TCFPurpose$$serializer tCFPurpose$$serializer = new TCFPurpose$$serializer();
/* 6 */             INSTANCE = tCFPurpose$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose", tCFPurpose$$serializer, 11);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("purposeDescription", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("illustrations", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("consent", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("isPartOfASelectedStack", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("legitimateInterestConsent", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("showConsentToggle", false);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("showLegitimateInterestToggle", false);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("stackId", false);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("numberOfVendors", false);
/* 73 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private TCFPurpose$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 4 */             KSerializer kSerializer = TCFPurpose.f6173l[1];
/* 6 */             az0 az0Var = az0.f2143a;
/* 8 */             C0920fk c0920fk = C0920fk.f8246a;
/* 10 */            KSerializer kSerializerM5647i = j13.m5647i(c0920fk);
/* 14 */            KSerializer kSerializerM5647i2 = j13.m5647i(c0920fk);
/* 18 */            KSerializer kSerializerM5647i3 = j13.m5647i(az0Var);
/* 22 */            KSerializer kSerializerM5647i4 = j13.m5647i(az0Var);
/* 30 */            vh2 vh2Var = vh2.f18183a;
/* 28 */            return new KSerializer[]{vh2Var, kSerializer, az0Var, vh2Var, kSerializerM5647i, c0920fk, kSerializerM5647i2, c0920fk, c0920fk, kSerializerM5647i3, kSerializerM5647i4};
                }

                @Override // kotlinx.serialization.KSerializer
                public TCFPurpose deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = TCFPurpose.f6173l;
/* 18 */            Integer num = null;
/* 19 */            boolean z = true;
/* 20 */            Integer num2 = null;
/* 21 */            int i = 0;
/* 22 */            String strMo4376v = null;
/* 23 */            List list = null;
/* 24 */            int iMo4371q = 0;
/* 25 */            String strMo4376v2 = null;
/* 26 */            Boolean bool = null;
/* 27 */            boolean zMo4374t = false;
/* 28 */            Boolean bool2 = null;
/* 29 */            boolean zMo4374t2 = false;
/* 31 */            boolean zMo4374t3 = false;
/* 33 */            while (z) {
/* 35 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 188 */                       z = false;
                                break;
                            case 0:
/* 178 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 182 */                       i |= 1;
                                break;
                            case 1:
/* 170 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 1, kSerializerArr[1], list);
/* 172 */                       i |= 2;
                                break;
                            case 2:
/* 152 */                       iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 2);
/* 156 */                       i |= 4;
                                break;
                            case 3:
/* 142 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 146 */                       i |= 8;
                                break;
                            case 4:
/* 134 */                       bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, C0920fk.f8246a, bool);
/* 136 */                       i |= 16;
                                break;
                            case 5:
/* 117 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 5);
/* 121 */                       i |= 32;
                                break;
                            case 6:
/* 109 */                       bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, C0920fk.f8246a, bool2);
/* 111 */                       i |= 64;
                                break;
                            case 7:
/* 92 */                        zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 7);
/* 96 */                        i |= 128;
                                break;
                            case 8:
/* 82 */                        zMo4374t3 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 8);
/* 86 */                        i |= NotificationCompat.FLAG_LOCAL_ONLY;
                                break;
                            case 9:
/* 73 */                        num2 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, az0.f2143a, num2);
/* 75 */                        i |= NotificationCompat.FLAG_GROUP_SUMMARY;
                                break;
                            case 10:
/* 57 */                        num = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 10, az0.f2143a, num);
/* 59 */                        i |= Segment.SHARE_MINIMUM;
                                break;
                            default:
/* 42 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                        }
                    }
/* 191 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 200 */           return new TCFPurpose(i, strMo4376v, list, iMo4371q, strMo4376v2, bool, zMo4374t, bool2, zMo4374t2, zMo4374t3, num2, num);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TCFPurpose value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = TCFPurpose.f6173l;
/* 20 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6174a);
/* 28 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6175b);
/* 34 */            interfaceC1907lyMo1499c.mo1508l(2, value.f6176c, descriptor2);
/* 40 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6177d);
/* 43 */            C0920fk c0920fk = C0920fk.f8246a;
/* 48 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, c0920fk, value.f6178e);
/* 54 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 5, value.f6179f);
/* 60 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, c0920fk, value.f6180g);
/* 66 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 7, value.f6181h);
/* 73 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 8, value.f6182i);
/* 76 */            az0 az0Var = az0.f2143a;
/* 82 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 9, az0Var, value.f6183j);
/* 89 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 10, az0Var, value.f6184k);
/* 92 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
