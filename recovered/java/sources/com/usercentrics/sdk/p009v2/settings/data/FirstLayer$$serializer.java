            package com.usercentrics.sdk.p009v2.settings.data;

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
            import p000.de3;
            import p000.dj0;
            import p000.ej0;
            import p000.fj0;
            import p000.j13;
            import p000.n82;
            import p000.uq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/FirstLayer.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class FirstLayer$$serializer implements uq0 {
                public static final FirstLayer$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             FirstLayer$$serializer firstLayer$$serializer = new FirstLayer$$serializer();
/* 6 */             INSTANCE = firstLayer$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.FirstLayer", firstLayer$$serializer, 5);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("hideButtonDeny", true);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("logoPosition", true);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("secondLayerTrigger", true);
/* 34 */            pluginGeneratedSerialDescriptor.m6270j("closeOption", true);
/* 39 */            pluginGeneratedSerialDescriptor.m6270j("mobileVariant", true);
/* 42 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private FirstLayer$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = FirstLayer.f6429f;
/* 38 */            return new KSerializer[]{j13.m5647i(C0920fk.f8246a), j13.m5647i(kSerializerArr[1]), j13.m5647i(kSerializerArr[2]), j13.m5647i(kSerializerArr[3]), j13.m5647i(kSerializerArr[4])};
                }

                @Override // kotlinx.serialization.KSerializer
                public FirstLayer deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = FirstLayer.f6429f;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            Boolean bool = null;
/* 20 */            ej0 ej0Var = null;
/* 21 */            n82 n82Var = null;
/* 22 */            dj0 dj0Var = null;
/* 23 */            fj0 fj0Var = null;
/* 24 */            while (z) {
/* 26 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 31 */                if (iMo3299x == -1) {
/* 110 */                   z = false;
                        } else if (iMo3299x == 0) {
/* 105 */                   bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, C0920fk.f8246a, bool);
/* 107 */                   i |= 1;
                        } else if (iMo3299x == 1) {
/* 93 */                    ej0Var = (ej0) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, kSerializerArr[1], ej0Var);
/* 95 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 81 */                    n82Var = (n82) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, kSerializerArr[2], n82Var);
/* 83 */                    i |= 4;
                        } else if (iMo3299x == 3) {
/* 69 */                    dj0Var = (dj0) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, kSerializerArr[3], dj0Var);
/* 71 */                    i |= 8;
                        } else {
/* 44 */                    if (iMo3299x != 4) {
/* 58 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 53 */                    fj0Var = (fj0) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, kSerializerArr[4], fj0Var);
/* 55 */                    i |= 16;
                        }
                    }
/* 112 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 117 */           return new FirstLayer(i, bool, ej0Var, n82Var, dj0Var, fj0Var);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, FirstLayer value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             fj0 fj0Var = value.f6434e;
/* 9 */             dj0 dj0Var = value.f6433d;
/* 11 */            n82 n82Var = value.f6432c;
/* 13 */            ej0 ej0Var = value.f6431b;
/* 15 */            Boolean bool = value.f6430a;
/* 17 */            SerialDescriptor descriptor2 = getDescriptor();
/* 21 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 25 */            KSerializer[] kSerializerArr = FirstLayer.f6429f;
/* 31 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool != null) {
/* 39 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, C0920fk.f8246a, bool);
                    }
/* 46 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || ej0Var != null) {
/* 54 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, kSerializerArr[1], ej0Var);
                    }
/* 61 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || n82Var != null) {
/* 69 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, kSerializerArr[2], n82Var);
                    }
/* 76 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || dj0Var != null) {
/* 84 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, kSerializerArr[3], dj0Var);
                    }
/* 91 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || fj0Var != null) {
/* 99 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, kSerializerArr[4], fj0Var);
                    }
/* 102 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
