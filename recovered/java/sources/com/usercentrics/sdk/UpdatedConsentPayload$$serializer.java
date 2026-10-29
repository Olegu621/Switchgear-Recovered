            package com.usercentrics.sdk;

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
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/UpdatedConsentPayload.$serializer", "Luq0;", "Lcom/usercentrics/sdk/UpdatedConsentPayload;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UpdatedConsentPayload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UpdatedConsentPayload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UpdatedConsentPayload$$serializer implements uq0 {
                public static final UpdatedConsentPayload$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UpdatedConsentPayload$$serializer updatedConsentPayload$$serializer = new UpdatedConsentPayload$$serializer();
/* 6 */             INSTANCE = updatedConsentPayload$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.UpdatedConsentPayload", updatedConsentPayload$$serializer, 5);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("consents", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("controllerId", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("tcString", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("uspString", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("acString", true);
/* 43 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private UpdatedConsentPayload$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 4 */             KSerializer kSerializer = UpdatedConsentPayload.f6028f[0];
/* 6 */             vh2 vh2Var = vh2.f18183a;
/* 21 */            return new KSerializer[]{kSerializer, vh2Var, j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public UpdatedConsentPayload deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = UpdatedConsentPayload.f6028f;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            String strMo4376v = null;
/* 20 */            String str = null;
/* 21 */            String str2 = null;
/* 22 */            String str3 = null;
/* 23 */            List list = null;
/* 24 */            while (z) {
/* 26 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 31 */                if (iMo3299x == -1) {
/* 105 */                   z = false;
                        } else if (iMo3299x == 0) {
/* 100 */                   list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, kSerializerArr[0], list);
/* 102 */                   i |= 1;
                        } else if (iMo3299x == 1) {
/* 86 */                    strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 90 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 81 */                    str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, vh2.f18183a, str);
/* 83 */                    i |= 4;
                        } else if (iMo3299x == 3) {
/* 69 */                    str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, vh2.f18183a, str2);
/* 71 */                    i |= 8;
                        } else {
/* 44 */                    if (iMo3299x != 4) {
/* 58 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 53 */                    str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, vh2.f18183a, str3);
/* 55 */                    i |= 16;
                        }
                    }
/* 107 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 112 */           return new UpdatedConsentPayload(i, strMo4376v, str, str2, str3, list);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UpdatedConsentPayload value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 18 */            KSerializer kSerializer = UpdatedConsentPayload.f6028f[0];
/* 20 */            List list = value.f6029a;
/* 22 */            String str = value.f6033e;
/* 24 */            String str2 = value.f6032d;
/* 26 */            String str3 = value.f6031c;
/* 28 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, kSerializer, list);
/* 34 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6030b);
/* 41 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 49 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, vh2.f18183a, str3);
                    }
/* 56 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 64 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, vh2.f18183a, str2);
                    }
/* 71 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 79 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, vh2.f18183a, str);
                    }
/* 82 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
