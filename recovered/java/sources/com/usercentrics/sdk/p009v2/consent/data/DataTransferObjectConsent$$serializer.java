            package com.usercentrics.sdk.p009v2.consent.data;

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
            import p000.kz2;
            import p000.mz2;
            import p000.uq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class DataTransferObjectConsent$$serializer implements uq0 {
                public static final DataTransferObjectConsent$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             DataTransferObjectConsent$$serializer dataTransferObjectConsent$$serializer = new DataTransferObjectConsent$$serializer();
/* 6 */             INSTANCE = dataTransferObjectConsent$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.consent.data.DataTransferObjectConsent", dataTransferObjectConsent$$serializer, 2);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("action", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("type", false);
/* 27 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private DataTransferObjectConsent$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = DataTransferObjectConsent.f6321c;
/* 10 */            return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
                }

                @Override // kotlinx.serialization.KSerializer
                public DataTransferObjectConsent deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = DataTransferObjectConsent.f6321c;
/* 17 */            boolean z = true;
/* 18 */            int i = 0;
/* 19 */            kz2 kz2Var = null;
/* 20 */            mz2 mz2Var = null;
/* 21 */            while (z) {
/* 23 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 28 */                if (iMo3299x == -1) {
/* 60 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 55 */                    kz2Var = (kz2) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, kSerializerArr[0], kz2Var);
/* 57 */                    i |= 1;
                        } else {
/* 32 */                    if (iMo3299x != 1) {
/* 45 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 40 */                    mz2Var = (mz2) interfaceC1870kyMo3297c.mo4350A(descriptor2, 1, kSerializerArr[1], mz2Var);
/* 42 */                    i |= 2;
                        }
                    }
/* 62 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 67 */            return new DataTransferObjectConsent(i, kz2Var, mz2Var);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, DataTransferObjectConsent value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = DataTransferObjectConsent.f6321c;
/* 22 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, kSerializerArr[0], value.f6322a);
/* 30 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6323b);
/* 33 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
