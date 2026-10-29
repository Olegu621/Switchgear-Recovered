            package com.usercentrics.sdk.services.deviceStorage.models;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.ds0;
            import p000.fm0;
            import p000.j61;
            import p000.kz2;
            import p000.mz2;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class StorageConsentHistory {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final StorageConsentAction f6122a;

                /* JADX INFO: renamed from: b */
                public final boolean f6123b;

                /* JADX INFO: renamed from: c */
                public final StorageConsentType f6124c;

                /* JADX INFO: renamed from: d */
                public final String f6125d;

                /* JADX INFO: renamed from: e */
                public final long f6126e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return StorageConsentHistory$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ StorageConsentHistory(int i, StorageConsentAction storageConsentAction, boolean z, StorageConsentType storageConsentType, String str, long j) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, StorageConsentHistory$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6122a = storageConsentAction;
/* 12 */            this.f6123b = z;
/* 14 */            this.f6124c = storageConsentType;
/* 16 */            this.f6125d = str;
/* 18 */            this.f6126e = j;
                }

                /* JADX INFO: renamed from: a */
                public final j61 m2781a() {
                    kz2 kz2Var;
                    mz2 mz2Var;
                    switch (this.f6122a.ordinal()) {
                        case 0:
/* 38 */                    kz2Var = kz2.ACCEPT_ALL_SERVICES;
                            break;
                        case 1:
/* 35 */                    kz2Var = kz2.DENY_ALL_SERVICES;
                            break;
                        case 2:
/* 32 */                    kz2Var = kz2.ESSENTIAL_CHANGE;
                            break;
                        case 3:
/* 29 */                    kz2Var = kz2.INITIAL_PAGE_LOAD;
                            break;
                        case 4:
/* 26 */                    kz2Var = kz2.NON_EU_REGION;
                            break;
                        case 5:
/* 23 */                    kz2Var = kz2.SESSION_RESTORED;
                            break;
                        case 6:
/* 20 */                    kz2Var = kz2.TCF_STRING_CHANGE;
                            break;
                        case 7:
/* 17 */                    kz2Var = kz2.UPDATE_SERVICES;
                            break;
                        default:
/* 13 */                    ds0.m3187b();
/* 9 */                     return null;
                    }
/* 42 */            int iOrdinal = this.f6124c.ordinal();
/* 46 */            if (iOrdinal == 0) {
/* 59 */                mz2Var = mz2.f14076a;
                    } else {
/* 49 */                if (iOrdinal != 1) {
/* 55 */                    ds0.m3187b();
/* 9 */                     return null;
                        }
/* 51 */                mz2Var = mz2.f14077b;
                    }
/* 68 */            return new j61(kz2Var, this.f6123b, mz2Var, this.f6125d, this.f6126e);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof StorageConsentHistory)) {
/* 7 */                 return false;
                    }
/* 11 */            StorageConsentHistory storageConsentHistory = (StorageConsentHistory) obj;
                    return this.f6122a == storageConsentHistory.f6122a && this.f6123b == storageConsentHistory.f6123b && this.f6124c == storageConsentHistory.f6124c && Intrinsics.m6216a(this.f6125d, storageConsentHistory.f6125d) && this.f6126e == storageConsentHistory.f6126e;
                }

                public final int hashCode() {
/* 36 */            return Long.hashCode(this.f6126e) + pm2.m7485h((this.f6124c.hashCode() + AbstractC0886en.m3504h(this.f6122a.hashCode() * 31, 31, this.f6123b)) * 31, 31, this.f6125d);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StorageConsentHistory(action=");
/* 10 */            sb.append(this.f6122a);
/* 15 */            sb.append(", status=");
/* 20 */            sb.append(this.f6123b);
/* 25 */            sb.append(", type=");
/* 30 */            sb.append(this.f6124c);
/* 35 */            sb.append(", language=");
/* 40 */            sb.append(this.f6125d);
/* 45 */            sb.append(", timestampInMillis=");
/* 52 */            return fm0.m3787m(sb, this.f6126e, ")");
                }

/* 31 */        public StorageConsentHistory(StorageConsentAction storageConsentAction, boolean z, StorageConsentType storageConsentType, String str, long j) {
                    str.getClass();
/* 33 */            this.f6122a = storageConsentAction;
/* 34 */            this.f6123b = z;
/* 35 */            this.f6124c = storageConsentType;
/* 36 */            this.f6125d = str;
/* 37 */            this.f6126e = j;
                }
            }
