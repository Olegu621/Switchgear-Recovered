            package com.usercentrics.sdk;

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
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.j13;
            import p000.mz2;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/UsercentricsServiceConsent.$serializer", "Luq0;", "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UsercentricsServiceConsent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UsercentricsServiceConsent$$serializer implements uq0 {
                public static final UsercentricsServiceConsent$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UsercentricsServiceConsent$$serializer usercentricsServiceConsent$$serializer = new UsercentricsServiceConsent$$serializer();
/* 6 */             INSTANCE = usercentricsServiceConsent$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.UsercentricsServiceConsent", usercentricsServiceConsent$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("templateId", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j(NotificationCompat.CATEGORY_STATUS, false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("history", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("type", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("dataProcessor", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("version", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("isEssential", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("category", false);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private UsercentricsServiceConsent$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = UsercentricsServiceConsent.f6063i;
/* 4 */             KSerializer kSerializer = kSerializerArr[2];
/* 9 */             KSerializer kSerializerM5647i = j13.m5647i(kSerializerArr[3]);
/* 17 */            vh2 vh2Var = vh2.f18183a;
/* 22 */            C0920fk c0920fk = C0920fk.f8246a;
/* 15 */            return new KSerializer[]{vh2Var, c0920fk, kSerializer, kSerializerM5647i, vh2Var, vh2Var, c0920fk, vh2Var};
                }

                @Override // kotlinx.serialization.KSerializer
                public UsercentricsServiceConsent deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = UsercentricsServiceConsent.f6063i;
/* 18 */            UsercentricsServiceConsent usercentricsServiceConsent = null;
/* 19 */            boolean z = true;
/* 20 */            int i = 0;
/* 21 */            boolean zMo4374t = false;
/* 22 */            boolean zMo4374t2 = false;
/* 23 */            String strMo4376v = null;
/* 24 */            List list = null;
/* 25 */            mz2 mz2Var = null;
/* 26 */            String strMo4376v2 = null;
/* 27 */            String strMo4376v3 = null;
/* 28 */            String strMo4376v4 = null;
/* 30 */            while (z) {
/* 32 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 116 */                       z = false;
                                continue;
                            case 0:
/* 109 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 113 */                       i |= 1;
                                break;
                            case 1:
/* 102 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 1);
/* 106 */                       i |= 2;
                                break;
                            case 2:
/* 97 */                        list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 2, kSerializerArr[2], list);
/* 99 */                        i |= 4;
                                break;
                            case 3:
/* 83 */                        mz2Var = (mz2) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, kSerializerArr[3], mz2Var);
/* 85 */                        i |= 8;
                                break;
                            case 4:
/* 68 */                        strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 4);
/* 72 */                        i |= 16;
                                continue;
                            case 5:
/* 60 */                        strMo4376v3 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 5);
/* 64 */                        i |= 32;
                                continue;
                            case 6:
/* 52 */                        zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 6);
/* 56 */                        i |= 64;
                                continue;
                            case 7:
/* 44 */                        strMo4376v4 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 7);
/* 48 */                        i |= 128;
                                continue;
                            default:
/* 39 */                        C1951n4.m6855e(iMo3299x);
/* 42 */                        return usercentricsServiceConsent;
                        }
/* 87 */                usercentricsServiceConsent = null;
                    }
/* 118 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 123 */           return new UsercentricsServiceConsent(i, strMo4376v, zMo4374t, list, mz2Var, strMo4376v2, strMo4376v3, zMo4374t2, strMo4376v4);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UsercentricsServiceConsent value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = UsercentricsServiceConsent.f6063i;
/* 20 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6064a);
/* 26 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 1, value.f6065b);
/* 34 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 2, kSerializerArr[2], value.f6066c);
/* 42 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, kSerializerArr[3], value.f6067d);
/* 48 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 4, value.f6068e);
/* 54 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 5, value.f6069f);
/* 60 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 6, value.f6070g);
/* 66 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 7, value.f6071h);
/* 69 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
