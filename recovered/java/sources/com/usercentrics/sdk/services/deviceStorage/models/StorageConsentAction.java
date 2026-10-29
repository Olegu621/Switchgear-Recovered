            package com.usercentrics.sdk.services.deviceStorage.models;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.kz2;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StorageConsentAction {
                public static final Companion Companion;

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ StorageConsentAction[] f6112U;

                /* JADX INFO: renamed from: a */
                public static final p51 f6113a;

                /* JADX INFO: renamed from: b */
                public static final StorageConsentAction f6114b;

                /* JADX INFO: renamed from: c */
                public static final StorageConsentAction f6115c;

                /* JADX INFO: renamed from: d */
                public static final StorageConsentAction f6116d;

                /* JADX INFO: renamed from: e */
                public static final StorageConsentAction f6117e;

                /* JADX INFO: renamed from: f */
                public static final StorageConsentAction f6118f;

                /* JADX INFO: renamed from: i */
                public static final StorageConsentAction f6119i;

                /* JADX INFO: renamed from: v */
                public static final StorageConsentAction f6120v;

                /* JADX INFO: renamed from: w */
                public static final StorageConsentAction f6121w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    /* JADX INFO: renamed from: a */
                    public static StorageConsentAction m2780a(kz2 kz2Var) {
/* 1 */                 kz2Var.getClass();
                        switch (kz2Var.ordinal()) {
                            case 0:
/* 37 */                        return StorageConsentAction.f6114b;
                            case 1:
/* 34 */                        return StorageConsentAction.f6115c;
                            case 2:
/* 31 */                        return StorageConsentAction.f6116d;
                            case 3:
/* 28 */                        return StorageConsentAction.f6117e;
                            case 4:
/* 25 */                        return StorageConsentAction.f6118f;
                            case 5:
/* 22 */                        return StorageConsentAction.f6119i;
                            case 6:
/* 19 */                        return StorageConsentAction.f6120v;
                            case 7:
/* 16 */                        return StorageConsentAction.f6121w;
                            default:
/* 11 */                        ds0.m3187b();
/* 14 */                        return null;
                        }
                    }

                    public final KSerializer serializer() {
/* 7 */                 return (KSerializer) StorageConsentAction.f6113a.getValue();
                    }
                }

                static {
/* 6 */             StorageConsentAction storageConsentAction = new StorageConsentAction("ACCEPT_ALL_SERVICES", 0);
/* 9 */             f6114b = storageConsentAction;
/* 16 */            StorageConsentAction storageConsentAction2 = new StorageConsentAction("DENY_ALL_SERVICES", 1);
/* 19 */            f6115c = storageConsentAction2;
/* 26 */            StorageConsentAction storageConsentAction3 = new StorageConsentAction("ESSENTIAL_CHANGE", 2);
/* 29 */            f6116d = storageConsentAction3;
/* 36 */            StorageConsentAction storageConsentAction4 = new StorageConsentAction("INITIAL_PAGE_LOAD", 3);
/* 39 */            f6117e = storageConsentAction4;
/* 46 */            StorageConsentAction storageConsentAction5 = new StorageConsentAction("NON_EU_REGION", 4);
/* 49 */            f6118f = storageConsentAction5;
/* 56 */            StorageConsentAction storageConsentAction6 = new StorageConsentAction("SESSION_RESTORED", 5);
/* 59 */            f6119i = storageConsentAction6;
/* 66 */            StorageConsentAction storageConsentAction7 = new StorageConsentAction("TCF_STRING_CHANGE", 6);
/* 69 */            f6120v = storageConsentAction7;
/* 76 */            StorageConsentAction storageConsentAction8 = new StorageConsentAction("UPDATE_SERVICES", 7);
/* 79 */            f6121w = storageConsentAction8;
/* 85 */            f6112U = new StorageConsentAction[]{storageConsentAction, storageConsentAction2, storageConsentAction3, storageConsentAction4, storageConsentAction5, storageConsentAction6, storageConsentAction7, storageConsentAction8};
/* 94 */            Companion = new Companion();
/* 104 */           f6113a = r51.m8064a(v51.f17865a, C0812a.f6152a);
                }

                public static StorageConsentAction valueOf(String str) {
/* 7 */             return (StorageConsentAction) Enum.valueOf(StorageConsentAction.class, str);
                }

                public static StorageConsentAction[] values() {
/* 7 */             return (StorageConsentAction[]) f6112U.clone();
                }
            }
