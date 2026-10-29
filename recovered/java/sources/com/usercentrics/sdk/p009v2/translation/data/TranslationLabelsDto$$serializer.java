            package com.usercentrics.sdk.p009v2.translation.data;

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
            import p000.de3;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/translation/data/TranslationLabelsDto.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TranslationLabelsDto$$serializer implements uq0 {
                public static final TranslationLabelsDto$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TranslationLabelsDto$$serializer translationLabelsDto$$serializer = new TranslationLabelsDto$$serializer();
/* 6 */             INSTANCE = translationLabelsDto$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.translation.data.TranslationLabelsDto", translationLabelsDto$$serializer, 8);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("COOKIE_REFRESH", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("COOKIE_STORAGE", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("CNIL_DENY_LINK_TEXT", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("VENDORS_OUTSIDE_EU", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("DETAILS", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("CID_TITLE", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("MOBILE_TCF_MAX_STORAGE_DURATION_TEXT", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("MOBILE_TCF_MAX_STORAGE_DURATION_TITLE", false);
/* 58 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private TranslationLabelsDto$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 5 */             vh2 vh2Var = vh2.f18183a;
/* 3 */             return new KSerializer[]{vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var};
                }

                @Override // kotlinx.serialization.KSerializer
                public TranslationLabelsDto deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 15 */            boolean z = true;
/* 16 */            int i = 0;
/* 17 */            String strMo4376v = null;
/* 18 */            String strMo4376v2 = null;
/* 19 */            String strMo4376v3 = null;
/* 20 */            String strMo4376v4 = null;
/* 21 */            String strMo4376v5 = null;
/* 22 */            String strMo4376v6 = null;
/* 23 */            String strMo4376v7 = null;
/* 24 */            String strMo4376v8 = null;
/* 25 */            while (z) {
/* 27 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 100 */                       z = false;
                                break;
                            case 0:
/* 93 */                        strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 97 */                        i |= 1;
                                break;
                            case 1:
/* 86 */                        strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 90 */                        i |= 2;
                                break;
                            case 2:
/* 79 */                        strMo4376v3 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 83 */                        i |= 4;
                                break;
                            case 3:
/* 71 */                        strMo4376v4 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 75 */                        i |= 8;
                                break;
                            case 4:
/* 63 */                        strMo4376v5 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 4);
/* 67 */                        i |= 16;
                                break;
                            case 5:
/* 55 */                        strMo4376v6 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 5);
/* 59 */                        i |= 32;
                                break;
                            case 6:
/* 47 */                        strMo4376v7 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 51 */                        i |= 64;
                                break;
                            case 7:
/* 39 */                        strMo4376v8 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 7);
/* 43 */                        i |= 128;
                                break;
                            default:
/* 34 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                        }
                    }
/* 102 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 107 */           return new TranslationLabelsDto(i, strMo4376v, strMo4376v2, strMo4376v3, strMo4376v4, strMo4376v5, strMo4376v6, strMo4376v7, strMo4376v8);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TranslationLabelsDto value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 18 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6787a);
/* 24 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6788b);
/* 30 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, value.f6789c);
/* 36 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6790d);
/* 42 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 4, value.f6791e);
/* 48 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 5, value.f6792f);
/* 54 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, value.f6793g);
/* 60 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 7, value.f6794h);
/* 63 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
