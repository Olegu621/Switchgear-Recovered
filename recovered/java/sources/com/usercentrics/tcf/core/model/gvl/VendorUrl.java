            package com.usercentrics.tcf.core.model.gvl;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class VendorUrl {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6863a;

                /* JADX INFO: renamed from: b */
                public final String f6864b;

                /* JADX INFO: renamed from: c */
                public final String f6865c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/VendorUrl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return VendorUrl$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ VendorUrl(int i, String str, String str2, String str3) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6863a = null;
                    } else {
/* 12 */                this.f6863a = str;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6864b = null;
                    } else {
/* 21 */                this.f6864b = str2;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6865c = null;
                    } else {
/* 30 */                this.f6865c = str3;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof VendorUrl)) {
/* 7 */                 return false;
                    }
/* 11 */            VendorUrl vendorUrl = (VendorUrl) obj;
                    return Intrinsics.m6216a(this.f6863a, vendorUrl.f6863a) && Intrinsics.m6216a(this.f6864b, vendorUrl.f6864b) && Intrinsics.m6216a(this.f6865c, vendorUrl.f6865c);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6863a;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.f6864b;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            String str3 = this.f6865c;
/* 36 */            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
/* 19 */            return fm0.m3789o(AbstractC0886en.m3514r("VendorUrl(langId=", this.f6863a, ", privacy=", this.f6864b, ", legIntClaim="), this.f6865c, ")");
                }
            }
