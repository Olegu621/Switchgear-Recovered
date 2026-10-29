            package com.usercentrics.sdk.services.deviceStorage.models;

            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.az0;
            import p000.fm0;
            import p000.od0;
            import p000.rt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class StorageTCF {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6144d = {null, new rt0(az0.f2143a, StorageVendor$$serializer.INSTANCE, 1), null};

                /* JADX INFO: renamed from: a */
                public final String f6145a;

                /* JADX INFO: renamed from: b */
                public final Map f6146b;

                /* JADX INFO: renamed from: c */
                public final String f6147c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return StorageTCF$$serializer.INSTANCE;
                    }
                }

                public StorageTCF(int i, String str, Map map, String str2) {
/* 10 */            this.f6145a = (i & 1) == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
/* 14 */            if ((i & 2) == 0) {
/* 16 */                od0 od0Var = od0.f14715a;
/* 18 */                od0Var.getClass();
/* 21 */                this.f6146b = od0Var;
                    } else {
/* 24 */                this.f6146b = map;
                    }
/* 28 */            if ((i & 4) == 0) {
/* 31 */                this.f6147c = null;
                    } else {
/* 34 */                this.f6147c = str2;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof StorageTCF)) {
/* 7 */                 return false;
                    }
/* 11 */            StorageTCF storageTCF = (StorageTCF) obj;
                    return Intrinsics.m6216a(this.f6145a, storageTCF.f6145a) && Intrinsics.m6216a(this.f6146b, storageTCF.f6146b) && Intrinsics.m6216a(this.f6147c, storageTCF.f6147c);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.f6146b.hashCode() + (this.f6145a.hashCode() * 31)) * 31;
/* 18 */            String str = this.f6147c;
/* 28 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StorageTCF(tcString=");
/* 10 */            sb.append(this.f6145a);
/* 15 */            sb.append(", vendorsDisclosedMap=");
/* 20 */            sb.append(this.f6146b);
/* 25 */            sb.append(", acString=");
/* 32 */            return fm0.m3789o(sb, this.f6147c, ")");
                }

/* 36 */        public StorageTCF(String str, String str2, Map map) {
                    str.getClass();
                    map.getClass();
/* 38 */            this.f6145a = str;
/* 39 */            this.f6146b = map;
/* 40 */            this.f6147c = str2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 40 */        public StorageTCF() {
/* 41 */            od0 od0Var = od0.f14715a;
                    od0Var.getClass();
/* 42 */            this(HttpUrl.FRAGMENT_ENCODE_SET, null, od0Var);
                }
            }
