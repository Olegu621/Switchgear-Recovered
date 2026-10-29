            package com.usercentrics.sdk.p009v2.settings.data;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
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
            import p000.tj0;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/UsercentricsCustomization.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UsercentricsCustomization$$serializer implements uq0 {
                public static final UsercentricsCustomization$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UsercentricsCustomization$$serializer usercentricsCustomization$$serializer = new UsercentricsCustomization$$serializer();
/* 6 */             INSTANCE = usercentricsCustomization$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.UsercentricsCustomization", usercentricsCustomization$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("logoUrl", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("borderRadiusLayer", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("borderRadiusButton", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("overlayOpacity", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("font", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("color", true);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("logoAltTag", true);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("buttonAlignment", true);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private UsercentricsCustomization$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             vh2 vh2Var = vh2.f18183a;
/* 3 */             KSerializer kSerializerM5647i = j13.m5647i(vh2Var);
/* 7 */             az0 az0Var = az0.f2143a;
/* 41 */            return new KSerializer[]{kSerializerM5647i, j13.m5647i(az0Var), j13.m5647i(az0Var), j13.m5647i(tj0.f17125a), j13.m5647i(CustomizationFont$$serializer.INSTANCE), j13.m5647i(CustomizationColor$$serializer.INSTANCE), vh2Var, j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public UsercentricsCustomization deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 16 */            UsercentricsCustomization usercentricsCustomization = null;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            String str = null;
/* 20 */            Integer num = null;
/* 21 */            Integer num2 = null;
/* 22 */            Float f = null;
/* 23 */            CustomizationFont customizationFont = null;
/* 24 */            CustomizationColor customizationColor = null;
/* 25 */            String strMo4376v = null;
/* 26 */            String str2 = null;
/* 27 */            while (z) {
/* 29 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 138 */                       z = false;
                                continue;
                            case 0:
/* 133 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str);
/* 135 */                       i |= 1;
                                break;
                            case 1:
/* 121 */                       num = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, az0.f2143a, num);
/* 123 */                       i |= 2;
                                break;
                            case 2:
/* 109 */                       num2 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, az0.f2143a, num2);
/* 111 */                       i |= 4;
                                break;
                            case 3:
/* 96 */                        f = (Float) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, tj0.f17125a, f);
/* 98 */                        i |= 8;
                                break;
                            case 4:
/* 83 */                        customizationFont = (CustomizationFont) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, CustomizationFont$$serializer.INSTANCE, customizationFont);
/* 85 */                        i |= 16;
                                break;
                            case 5:
/* 70 */                        customizationColor = (CustomizationColor) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, CustomizationColor$$serializer.INSTANCE, customizationColor);
/* 72 */                        i |= 32;
                                break;
                            case 6:
/* 55 */                        strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 59 */                        i |= 64;
                                break;
                            case 7:
/* 48 */                        str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str2);
/* 50 */                        i |= 128;
                                break;
                            default:
/* 36 */                        C1951n4.m6855e(iMo3299x);
/* 39 */                        return usercentricsCustomization;
                        }
/* 52 */                usercentricsCustomization = null;
                    }
/* 140 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 145 */           return new UsercentricsCustomization(i, str, num, num2, f, customizationFont, customizationColor, strMo4376v, str2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UsercentricsCustomization value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             String str = value.f6545h;
/* 9 */             String str2 = value.f6544g;
/* 11 */            CustomizationColor customizationColor = value.f6543f;
/* 13 */            CustomizationFont customizationFont = value.f6542e;
/* 15 */            Float f = value.f6541d;
/* 17 */            Integer num = value.f6540c;
/* 19 */            Integer num2 = value.f6539b;
/* 21 */            String str3 = value.f6538a;
/* 23 */            SerialDescriptor descriptor2 = getDescriptor();
/* 27 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 35 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 43 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, vh2.f18183a, str3);
                    }
/* 50 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num2 != null) {
/* 58 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, az0.f2143a, num2);
                    }
/* 65 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num != null) {
/* 73 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, az0.f2143a, num);
                    }
/* 80 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || f != null) {
/* 88 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, tj0.f17125a, f);
                    }
/* 95 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || customizationFont != null) {
/* 103 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, CustomizationFont$$serializer.INSTANCE, customizationFont);
                    }
/* 110 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || customizationColor != null) {
/* 118 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 5, CustomizationColor$$serializer.INSTANCE, customizationColor);
                    }
/* 125 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(str2, HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 137 */               interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, str2);
                    }
/* 144 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 152 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 7, vh2.f18183a, str);
                    }
/* 155 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
