            package com.usercentrics.sdk;

            import com.google.firebase.analytics.FirebaseAnalytics;
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
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/AdTechProvider.$serializer", "Luq0;", "Lcom/usercentrics/sdk/AdTechProvider;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/AdTechProvider;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/AdTechProvider;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class AdTechProvider$$serializer implements uq0 {
                public static final AdTechProvider$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             AdTechProvider$$serializer adTechProvider$$serializer = new AdTechProvider$$serializer();
/* 6 */             INSTANCE = adTechProvider$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.AdTechProvider", adTechProvider$$serializer, 4);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("privacyPolicyUrl", false);
/* 34 */            pluginGeneratedSerialDescriptor.m6270j("consent", false);
/* 37 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private AdTechProvider$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 9 */             vh2 vh2Var = vh2.f18183a;
/* 2 */             return new KSerializer[]{az0.f2143a, vh2Var, vh2Var, C0920fk.f8246a};
                }

                @Override // kotlinx.serialization.KSerializer
                public AdTechProvider deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 15 */            boolean z = true;
/* 16 */            int i = 0;
/* 17 */            int iMo4371q = 0;
/* 18 */            boolean zMo4374t = false;
/* 19 */            String strMo4376v = null;
/* 20 */            String strMo4376v2 = null;
/* 21 */            while (z) {
/* 23 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 28 */                if (iMo3299x == -1) {
/* 72 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 65 */                    iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 0);
/* 69 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 58 */                    strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 62 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 51 */                    strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 55 */                    i |= 4;
                        } else {
/* 38 */                    if (iMo3299x != 3) {
/* 47 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                            }
/* 40 */                    zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 3);
/* 44 */                    i |= 8;
                        }
                    }
/* 74 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 79 */            return new AdTechProvider(i, iMo4371q, strMo4376v, strMo4376v2, zMo4374t);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, AdTechProvider value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 18 */            interfaceC1907lyMo1499c.mo1508l(0, value.f6022a, descriptor2);
/* 24 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6023b);
/* 30 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, value.f6024c);
/* 36 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 3, value.f6025d);
/* 39 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
