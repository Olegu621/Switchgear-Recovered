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
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TCFSpecialFeature$$serializer implements uq0 {
                public static final TCFSpecialFeature$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TCFSpecialFeature$$serializer tCFSpecialFeature$$serializer = new TCFSpecialFeature$$serializer();
/* 6 */             INSTANCE = tCFSpecialFeature$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature", tCFSpecialFeature$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("purposeDescription", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("illustrations", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("consent", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("isPartOfASelectedStack", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("stackId", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("showConsentToggle", false);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private TCFSpecialFeature$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 4 */             KSerializer kSerializer = TCFSpecialFeature.f6185i[1];
/* 6 */             az0 az0Var = az0.f2143a;
/* 8 */             C0920fk c0920fk = C0920fk.f8246a;
/* 10 */            KSerializer kSerializerM5647i = j13.m5647i(c0920fk);
/* 14 */            KSerializer kSerializerM5647i2 = j13.m5647i(az0Var);
/* 22 */            vh2 vh2Var = vh2.f18183a;
/* 20 */            return new KSerializer[]{vh2Var, kSerializer, az0Var, vh2Var, kSerializerM5647i, c0920fk, kSerializerM5647i2, c0920fk};
                }

                @Override // kotlinx.serialization.KSerializer
                public TCFSpecialFeature deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = TCFSpecialFeature.f6185i;
/* 18 */            TCFSpecialFeature tCFSpecialFeature = null;
/* 19 */            boolean z = true;
/* 20 */            int i = 0;
/* 21 */            int iMo4371q = 0;
/* 22 */            boolean zMo4374t = false;
/* 23 */            boolean zMo4374t2 = false;
/* 25 */            String strMo4376v = null;
/* 26 */            List list = null;
/* 27 */            String strMo4376v2 = null;
/* 28 */            Boolean bool = null;
/* 29 */            Integer num = null;
/* 30 */            while (z) {
/* 32 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 121 */                       z = false;
                                continue;
                            case 0:
/* 114 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 118 */                       i |= 1;
                                break;
                            case 1:
/* 109 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 1, kSerializerArr[1], list);
/* 111 */                       i |= 2;
                                break;
                            case 2:
/* 95 */                        iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 2);
/* 99 */                        i |= 4;
                                break;
                            case 3:
/* 87 */                        strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 91 */                        i |= 8;
                                break;
                            case 4:
/* 81 */                        bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, C0920fk.f8246a, bool);
/* 83 */                        i |= 16;
                                break;
                            case 5:
/* 66 */                        zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 5);
/* 70 */                        i |= 32;
                                break;
                            case 6:
/* 59 */                        num = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, az0.f2143a, num);
/* 61 */                        i |= 64;
                                break;
                            case 7:
/* 44 */                        zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 7);
/* 48 */                        i |= 128;
                                continue;
                            default:
/* 39 */                        C1951n4.m6855e(iMo3299x);
/* 42 */                        return tCFSpecialFeature;
                        }
/* 63 */                tCFSpecialFeature = null;
                    }
/* 123 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 128 */           return new TCFSpecialFeature(i, strMo4376v, list, iMo4371q, strMo4376v2, bool, zMo4374t, num, zMo4374t2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TCFSpecialFeature value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = TCFSpecialFeature.f6185i;
/* 20 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6186a);
/* 28 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6187b);
/* 34 */            interfaceC1907lyMo1499c.mo1508l(2, value.f6188c, descriptor2);
/* 40 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6189d);
/* 48 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, C0920fk.f8246a, value.f6190e);
/* 54 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 5, value.f6191f);
/* 62 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, az0.f2143a, value.f6192g);
/* 68 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 7, value.f6193h);
/* 71 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
