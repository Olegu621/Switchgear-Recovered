            package com.usercentrics.sdk.services.deviceStorage.models;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.EnumDescriptor;
            import okhttp3.HttpUrl;
            import p000.de3;
            import p000.uq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class StorageConsentAction$$serializer implements uq0 {
                public static final StorageConsentAction$$serializer INSTANCE = new StorageConsentAction$$serializer();
                private static final /* synthetic */ EnumDescriptor descriptor;

                static {
/* 14 */            EnumDescriptor enumDescriptor = new EnumDescriptor("com.usercentrics.sdk.services.deviceStorage.models.StorageConsentAction", 8);
/* 20 */            enumDescriptor.m6270j("ACCEPT_ALL_SERVICES", false);
/* 25 */            enumDescriptor.m6270j("DENY_ALL_SERVICES", false);
/* 30 */            enumDescriptor.m6270j("ESSENTIAL_CHANGE", false);
/* 35 */            enumDescriptor.m6270j("INITIAL_PAGE_LOAD", false);
/* 40 */            enumDescriptor.m6270j("NON_EU_REGION", false);
/* 45 */            enumDescriptor.m6270j("SESSION_RESTORED", false);
/* 50 */            enumDescriptor.m6270j("TCF_STRING_CHANGE", false);
/* 55 */            enumDescriptor.m6270j("UPDATE_SERVICES", false);
/* 58 */            descriptor = enumDescriptor;
                }

                private StorageConsentAction$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 2 */             return new KSerializer[0];
                }

                @Override // kotlinx.serialization.KSerializer
                public StorageConsentAction deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 16 */            return StorageConsentAction.values()[decoder.mo4362h(getDescriptor())];
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, StorageConsentAction value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 15 */            encoder.mo1518v(getDescriptor(), value.ordinal());
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
