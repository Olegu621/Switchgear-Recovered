            package com.usercentrics.sdk.services.deviceStorage.models;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.mz2;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StorageConsentType {
                public static final Companion Companion;

                /* JADX INFO: renamed from: a */
                public static final p51 f6127a;

                /* JADX INFO: renamed from: b */
                public static final StorageConsentType f6128b;

                /* JADX INFO: renamed from: c */
                public static final StorageConsentType f6129c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ StorageConsentType[] f6130d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    /* JADX INFO: renamed from: a */
                    public static StorageConsentType m2782a(mz2 mz2Var) {
/* 1 */                 mz2Var.getClass();
/* 4 */                 int iOrdinal = mz2Var.ordinal();
/* 8 */                 if (iOrdinal == 0) {
/* 21 */                    return StorageConsentType.f6128b;
                        }
/* 11 */                if (iOrdinal == 1) {
/* 13 */                    return StorageConsentType.f6129c;
                        }
/* 16 */                ds0.m3187b();
/* 19 */                return null;
                    }

                    public final KSerializer serializer() {
/* 7 */                 return (KSerializer) StorageConsentType.f6127a.getValue();
                    }
                }

                static {
/* 6 */             StorageConsentType storageConsentType = new StorageConsentType("EXPLICIT", 0);
/* 9 */             f6128b = storageConsentType;
/* 16 */            StorageConsentType storageConsentType2 = new StorageConsentType("IMPLICIT", 1);
/* 19 */            f6129c = storageConsentType2;
/* 25 */            f6130d = new StorageConsentType[]{storageConsentType, storageConsentType2};
/* 34 */            Companion = new Companion();
/* 44 */            f6127a = r51.m8064a(v51.f17865a, C0813b.f6153a);
                }

                public static StorageConsentType valueOf(String str) {
/* 7 */             return (StorageConsentType) Enum.valueOf(StorageConsentType.class, str);
                }

                public static StorageConsentType[] values() {
/* 7 */             return (StorageConsentType[]) f6130d.clone();
                }
            }
