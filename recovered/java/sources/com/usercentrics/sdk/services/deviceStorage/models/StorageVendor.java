            package com.usercentrics.sdk.services.deviceStorage.models;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.az0;
            import p000.b40;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class StorageVendor {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6148d;

                /* JADX INFO: renamed from: a */
                public final List f6149a;

                /* JADX INFO: renamed from: b */
                public final List f6150b;

                /* JADX INFO: renamed from: c */
                public final List f6151c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return StorageVendor$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            az0 az0Var = az0.f2143a;
/* 37 */            f6148d = new KSerializer[]{new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0)};
/* 41 */            nd0 nd0Var = nd0.f14189a;
/* 43 */            new StorageVendor(nd0Var, nd0Var, nd0Var);
                }

                public /* synthetic */ StorageVendor(int i, List list, List list2, List list3) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, StorageVendor$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6149a = list;
/* 11 */            this.f6150b = list2;
/* 13 */            this.f6151c = list3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof StorageVendor)) {
/* 7 */                 return false;
                    }
/* 11 */            StorageVendor storageVendor = (StorageVendor) obj;
                    return Intrinsics.m6216a(this.f6149a, storageVendor.f6149a) && Intrinsics.m6216a(this.f6150b, storageVendor.f6150b) && Intrinsics.m6216a(this.f6151c, storageVendor.f6151c);
                }

                public final int hashCode() {
/* 22 */            return this.f6151c.hashCode() + AbstractC0298j.m1861b(this.f6149a.hashCode() * 31, 31, this.f6150b);
                }

                public final String toString() {
/* 38 */            return "StorageVendor(legitimateInterestPurposeIds=" + this.f6149a + ", consentPurposeIds=" + this.f6150b + ", specialPurposeIds=" + this.f6151c + ")";
                }

/* 26 */        public StorageVendor(List list, List list2, List list3) {
                    list.getClass();
                    list2.getClass();
                    list3.getClass();
/* 28 */            this.f6149a = list;
/* 29 */            this.f6150b = list2;
/* 30 */            this.f6151c = list3;
                }
            }
