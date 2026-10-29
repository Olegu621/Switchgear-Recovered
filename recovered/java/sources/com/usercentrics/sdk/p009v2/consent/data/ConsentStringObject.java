            package com.usercentrics.sdk.p009v2.consent.data;

            import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor$$serializer;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.az0;
            import p000.b40;
            import p000.od0;
            import p000.rt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class ConsentStringObject {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6301c = {null, new rt0(az0.f2143a, StorageVendor$$serializer.INSTANCE, 1)};

                /* JADX INFO: renamed from: a */
                public final String f6302a;

                /* JADX INFO: renamed from: b */
                public final Map f6303b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentStringObject$$serializer.INSTANCE;
                    }
                }

                public ConsentStringObject(int i, String str, Map map) {
/* 4 */             if (1 != (i & 1)) {
/* 32 */                b40.m1214E(i, 1, ConsentStringObject$$serializer.INSTANCE.getDescriptor());
/* 36 */                throw null;
                    }
/* 9 */             this.f6302a = str;
/* 13 */            if ((i & 2) != 0) {
/* 23 */                this.f6303b = map;
/* 25 */                return;
                    }
/* 15 */            od0 od0Var = od0.f14715a;
/* 17 */            od0Var.getClass();
/* 20 */            this.f6303b = od0Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentStringObject)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentStringObject consentStringObject = (ConsentStringObject) obj;
                    return Intrinsics.m6216a(this.f6302a, consentStringObject.f6302a) && Intrinsics.m6216a(this.f6303b, consentStringObject.f6303b);
                }

                public final int hashCode() {
/* 15 */            return this.f6303b.hashCode() + (this.f6302a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "ConsentStringObject(string=" + this.f6302a + ", tcfVendorsDisclosedMap=" + this.f6303b + ")";
                }

/* 36 */        public ConsentStringObject(String str, Map map) {
                    str.getClass();
                    map.getClass();
/* 38 */            this.f6302a = str;
/* 39 */            this.f6303b = map;
                }
            }
