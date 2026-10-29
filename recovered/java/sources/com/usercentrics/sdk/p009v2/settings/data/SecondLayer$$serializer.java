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
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/SecondLayer.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class SecondLayer$$serializer implements uq0 {
                public static final SecondLayer$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             SecondLayer$$serializer secondLayer$$serializer = new SecondLayer$$serializer();
/* 6 */             INSTANCE = secondLayer$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.SecondLayer", secondLayer$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("tabsCategoriesLabel", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("tabsServicesLabel", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("hideTogglesForServices", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("hideDataProcessingServices", false);
/* 41 */            pluginGeneratedSerialDescriptor.m6270j("hideButtonDeny", true);
/* 46 */            pluginGeneratedSerialDescriptor.m6270j("hideLanguageSwitch", true);
/* 51 */            pluginGeneratedSerialDescriptor.m6270j("acceptButtonText", true);
/* 56 */            pluginGeneratedSerialDescriptor.m6270j("denyButtonText", true);
/* 59 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private SecondLayer$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             vh2 vh2Var = vh2.f18183a;
/* 3 */             C0920fk c0920fk = C0920fk.f8246a;
/* 23 */            return new KSerializer[]{vh2Var, vh2Var, c0920fk, c0920fk, j13.m5647i(c0920fk), j13.m5647i(c0920fk), j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public SecondLayer deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 16 */            SecondLayer secondLayer = null;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            boolean zMo4374t = false;
/* 20 */            boolean zMo4374t2 = false;
/* 21 */            String strMo4376v = null;
/* 22 */            String strMo4376v2 = null;
/* 23 */            Boolean bool = null;
/* 24 */            Boolean bool2 = null;
/* 25 */            String str = null;
/* 26 */            String str2 = null;
/* 27 */            while (z) {
/* 29 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 123 */                       z = false;
                                continue;
                            case 0:
/* 116 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 120 */                       i |= 1;
                                break;
                            case 1:
/* 109 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 113 */                       i |= 2;
                                break;
                            case 2:
/* 102 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 2);
/* 106 */                       i |= 4;
                                break;
                            case 3:
/* 94 */                        zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 3);
/* 98 */                        i |= 8;
                                break;
                            case 4:
/* 88 */                        bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, C0920fk.f8246a, bool);
/* 90 */                        i |= 16;
                                break;
                            case 5:
/* 75 */                        bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, C0920fk.f8246a, bool2);
/* 77 */                        i |= 32;
                                break;
                            case 6:
/* 62 */                        str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str);
/* 64 */                        i |= 64;
                                break;
                            case 7:
/* 48 */                        str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str2);
/* 50 */                        i |= 128;
                                break;
                            default:
/* 36 */                        C1951n4.m6855e(iMo3299x);
/* 39 */                        return secondLayer;
                        }
/* 52 */                secondLayer = null;
                    }
/* 125 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 130 */           return new SecondLayer(i, strMo4376v, strMo4376v2, zMo4374t, zMo4374t2, bool, bool2, str, str2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, SecondLayer value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            String str = value.f6438a;
/* 17 */            String str2 = value.f6445h;
/* 19 */            String str3 = value.f6444g;
/* 21 */            Boolean bool = value.f6443f;
/* 23 */            Boolean bool2 = value.f6442e;
/* 26 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, str);
/* 32 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6439b);
/* 38 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 2, value.f6440c);
/* 44 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 3, value.f6441d);
/* 51 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool2 != null) {
/* 59 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, C0920fk.f8246a, bool2);
                    }
/* 66 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || bool != null) {
/* 74 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 5, C0920fk.f8246a, bool);
                    }
/* 81 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 89 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, vh2.f18183a, str3);
                    }
/* 96 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 104 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 7, vh2.f18183a, str2);
                    }
/* 107 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
