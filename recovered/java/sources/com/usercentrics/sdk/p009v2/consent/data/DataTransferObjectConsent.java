            package com.usercentrics.sdk.p009v2.consent.data;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.kz2;
            import p000.mz2;
            import p000.oe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class DataTransferObjectConsent {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6321c = {new oe0("com.usercentrics.sdk.models.settings.UsercentricsConsentAction", kz2.values()), new oe0("com.usercentrics.sdk.models.settings.UsercentricsConsentType", mz2.values())};

                /* JADX INFO: renamed from: a */
                public final kz2 f6322a;

                /* JADX INFO: renamed from: b */
                public final mz2 f6323b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return DataTransferObjectConsent$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DataTransferObjectConsent(int i, kz2 kz2Var, mz2 mz2Var) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, DataTransferObjectConsent$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6322a = kz2Var;
/* 11 */            this.f6323b = mz2Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DataTransferObjectConsent)) {
/* 7 */                 return false;
                    }
/* 11 */            DataTransferObjectConsent dataTransferObjectConsent = (DataTransferObjectConsent) obj;
                    return this.f6322a == dataTransferObjectConsent.f6322a && this.f6323b == dataTransferObjectConsent.f6323b;
                }

                public final int hashCode() {
/* 15 */            return this.f6323b.hashCode() + (this.f6322a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "DataTransferObjectConsent(action=" + this.f6322a + ", type=" + this.f6323b + ")";
                }

/* 24 */        public DataTransferObjectConsent(kz2 kz2Var, mz2 mz2Var) {
/* 26 */            this.f6322a = kz2Var;
/* 27 */            this.f6323b = mz2Var;
                }
            }
