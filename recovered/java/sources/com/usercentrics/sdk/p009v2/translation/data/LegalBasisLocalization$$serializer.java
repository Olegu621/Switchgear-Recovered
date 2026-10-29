            package com.usercentrics.sdk.p009v2.translation.data;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Map;
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
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/translation/data/LegalBasisLocalization.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class LegalBasisLocalization$$serializer implements uq0 {
                public static final LegalBasisLocalization$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             LegalBasisLocalization$$serializer legalBasisLocalization$$serializer = new LegalBasisLocalization$$serializer();
/* 6 */             INSTANCE = legalBasisLocalization$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization", legalBasisLocalization$$serializer, 3);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("labels", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("labelsAria", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("legalBasis", true);
/* 33 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private LegalBasisLocalization$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 17 */            return new KSerializer[]{TranslationLabelsDto$$serializer.INSTANCE, j13.m5647i(TranslationAriaLabels$$serializer.INSTANCE), j13.m5647i(LegalBasisLocalization.f6756d[2])};
                }

                @Override // kotlinx.serialization.KSerializer
                public LegalBasisLocalization deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = LegalBasisLocalization.f6756d;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            TranslationLabelsDto translationLabelsDto = null;
/* 20 */            TranslationAriaLabels translationAriaLabels = null;
/* 21 */            Map map = null;
/* 22 */            while (z) {
/* 24 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 29 */                if (iMo3299x == -1) {
/* 75 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 70 */                    translationLabelsDto = (TranslationLabelsDto) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, TranslationLabelsDto$$serializer.INSTANCE, translationLabelsDto);
/* 72 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 59 */                    translationAriaLabels = (TranslationAriaLabels) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, TranslationAriaLabels$$serializer.INSTANCE, translationAriaLabels);
/* 61 */                    i |= 2;
                        } else {
/* 36 */                    if (iMo3299x != 2) {
/* 49 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 44 */                    map = (Map) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, kSerializerArr[2], map);
/* 46 */                    i |= 4;
                        }
                    }
/* 77 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 82 */            return new LegalBasisLocalization(i, translationLabelsDto, translationAriaLabels, map);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, LegalBasisLocalization value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = LegalBasisLocalization.f6756d;
/* 17 */            TranslationLabelsDto$$serializer translationLabelsDto$$serializer = TranslationLabelsDto$$serializer.INSTANCE;
/* 19 */            TranslationLabelsDto translationLabelsDto = value.f6757a;
/* 21 */            Map map = value.f6759c;
/* 23 */            TranslationAriaLabels translationAriaLabels = value.f6758b;
/* 26 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, translationLabelsDto$$serializer, translationLabelsDto);
/* 33 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || translationAriaLabels != null) {
/* 41 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, TranslationAriaLabels$$serializer.INSTANCE, translationAriaLabels);
                    }
/* 48 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || map != null) {
/* 56 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, kSerializerArr[2], map);
                    }
/* 59 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
