            package com.usercentrics.sdk.p009v2.settings.data;

            import com.google.firebase.analytics.FirebaseAnalytics;
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
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/CustomizationFont.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class CustomizationFont$$serializer implements uq0 {
                public static final CustomizationFont$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             CustomizationFont$$serializer customizationFont$$serializer = new CustomizationFont$$serializer();
/* 6 */             INSTANCE = customizationFont$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.CustomizationFont", customizationFont$$serializer, 2);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("family", true);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("size", true);
/* 27 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private CustomizationFont$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 14 */            return new KSerializer[]{j13.m5647i(vh2.f18183a), j13.m5647i(az0.f2143a)};
                }

                @Override // kotlinx.serialization.KSerializer
                public CustomizationFont deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 15 */            boolean z = true;
/* 16 */            int i = 0;
/* 17 */            String str = null;
/* 18 */            Integer num = null;
/* 19 */            while (z) {
/* 21 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 26 */                if (iMo3299x == -1) {
/* 58 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 53 */                    str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str);
/* 55 */                    i |= 1;
                        } else {
/* 30 */                    if (iMo3299x != 1) {
/* 43 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                            }
/* 38 */                    num = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, az0.f2143a, num);
/* 40 */                    i |= 2;
                        }
                    }
/* 60 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 65 */            return new CustomizationFont(str, i, num);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, CustomizationFont value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             Integer num = value.f6428b;
/* 9 */             String str = value.f6427a;
/* 11 */            SerialDescriptor descriptor2 = getDescriptor();
/* 15 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 23 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 31 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, vh2.f18183a, str);
                    }
/* 38 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num != null) {
/* 46 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, az0.f2143a, num);
                    }
/* 49 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
