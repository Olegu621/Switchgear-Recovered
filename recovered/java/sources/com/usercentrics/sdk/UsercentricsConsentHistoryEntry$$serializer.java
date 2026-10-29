            package com.usercentrics.sdk;

            import androidx.core.app.NotificationCompat;
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
            import p000.mz2;
            import p000.sa1;
            import p000.uq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/UsercentricsConsentHistoryEntry.$serializer", "Luq0;", "Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UsercentricsConsentHistoryEntry$$serializer implements uq0 {
                public static final UsercentricsConsentHistoryEntry$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UsercentricsConsentHistoryEntry$$serializer usercentricsConsentHistoryEntry$$serializer = new UsercentricsConsentHistoryEntry$$serializer();
/* 6 */             INSTANCE = usercentricsConsentHistoryEntry$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.UsercentricsConsentHistoryEntry", usercentricsConsentHistoryEntry$$serializer, 3);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j(NotificationCompat.CATEGORY_STATUS, false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("type", false);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("timestampInMillis", false);
/* 32 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private UsercentricsConsentHistoryEntry$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 7 */             return new KSerializer[]{C0920fk.f8246a, UsercentricsConsentHistoryEntry.f6038d[1], sa1.f16487a};
                }

                @Override // kotlinx.serialization.KSerializer
                public UsercentricsConsentHistoryEntry deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 12 */            KSerializer[] kSerializerArr = UsercentricsConsentHistoryEntry.f6038d;
/* 19 */            int i = 0;
/* 20 */            boolean zMo4374t = false;
/* 21 */            mz2 mz2Var = null;
/* 22 */            long jMo4363i = 0;
/* 23 */            boolean z = true;
/* 24 */            while (z) {
/* 26 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 31 */                if (iMo3299x == -1) {
/* 70 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 63 */                    zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 0);
/* 67 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 58 */                    mz2Var = (mz2) interfaceC1870kyMo3297c.mo4350A(descriptor2, 1, kSerializerArr[1], mz2Var);
/* 60 */                    i |= 2;
                        } else {
/* 38 */                    if (iMo3299x != 2) {
/* 47 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                            }
/* 40 */                    jMo4363i = interfaceC1870kyMo3297c.mo4363i(descriptor2, 2);
/* 44 */                    i |= 4;
                        }
                    }
/* 72 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 77 */            return new UsercentricsConsentHistoryEntry(i, zMo4374t, mz2Var, jMo4363i);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UsercentricsConsentHistoryEntry value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = UsercentricsConsentHistoryEntry.f6038d;
/* 20 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 0, value.f6039a);
/* 28 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6040b);
/* 34 */            interfaceC1907lyMo1499c.mo1487D(descriptor2, 2, value.f6041c);
/* 37 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
