            package com.usercentrics.sdk.services.deviceStorage.models;

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
            import p000.sa1;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class StorageConsentHistory$$serializer implements uq0 {
                public static final StorageConsentHistory$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             StorageConsentHistory$$serializer storageConsentHistory$$serializer = new StorageConsentHistory$$serializer();
/* 6 */             INSTANCE = storageConsentHistory$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory", storageConsentHistory$$serializer, 5);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("action", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j(NotificationCompat.CATEGORY_STATUS, false);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("type", false);
/* 34 */            pluginGeneratedSerialDescriptor.m6270j("language", false);
/* 39 */            pluginGeneratedSerialDescriptor.m6270j("timestampInMillis", false);
/* 42 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private StorageConsentHistory$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 2 */             return new KSerializer[]{StorageConsentAction$$serializer.INSTANCE, C0920fk.f8246a, StorageConsentType$$serializer.INSTANCE, vh2.f18183a, sa1.f16487a};
                }

                @Override // kotlinx.serialization.KSerializer
                public StorageConsentHistory deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 17 */            int i = 0;
/* 18 */            boolean zMo4374t = false;
/* 19 */            StorageConsentAction storageConsentAction = null;
/* 20 */            StorageConsentType storageConsentType = null;
/* 21 */            String strMo4376v = null;
/* 22 */            long jMo4363i = 0;
/* 23 */            boolean z = true;
/* 24 */            while (z) {
/* 26 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 31 */                if (iMo3299x == -1) {
/* 95 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 90 */                    storageConsentAction = (StorageConsentAction) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, StorageConsentAction$$serializer.INSTANCE, storageConsentAction);
/* 92 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 76 */                    zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 1);
/* 80 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 71 */                    storageConsentType = (StorageConsentType) interfaceC1870kyMo3297c.mo4350A(descriptor2, 2, StorageConsentType$$serializer.INSTANCE, storageConsentType);
/* 73 */                    i |= 4;
                        } else if (iMo3299x == 3) {
/* 57 */                    strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 61 */                    i |= 8;
                        } else {
/* 44 */                    if (iMo3299x != 4) {
/* 53 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                            }
/* 46 */                    jMo4363i = interfaceC1870kyMo3297c.mo4363i(descriptor2, 4);
/* 50 */                    i |= 16;
                        }
                    }
/* 97 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 102 */           return new StorageConsentHistory(i, storageConsentAction, zMo4374t, storageConsentType, strMo4376v, jMo4363i);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, StorageConsentHistory value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 20 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, StorageConsentAction$$serializer.INSTANCE, value.f6122a);
/* 26 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 1, value.f6123b);
/* 34 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 2, StorageConsentType$$serializer.INSTANCE, value.f6124c);
/* 40 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6125d);
/* 46 */            interfaceC1907lyMo1499c.mo1487D(descriptor2, 4, value.f6126e);
/* 49 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
