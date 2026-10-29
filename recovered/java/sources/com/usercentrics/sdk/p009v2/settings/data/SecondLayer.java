            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SecondLayer {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6438a;

                /* JADX INFO: renamed from: b */
                public final String f6439b;

                /* JADX INFO: renamed from: c */
                public final boolean f6440c;

                /* JADX INFO: renamed from: d */
                public final boolean f6441d;

                /* JADX INFO: renamed from: e */
                public final Boolean f6442e;

                /* JADX INFO: renamed from: f */
                public final Boolean f6443f;

                /* JADX INFO: renamed from: g */
                public final String f6444g;

                /* JADX INFO: renamed from: h */
                public final String f6445h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/SecondLayer$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SecondLayer$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SecondLayer(int i, String str, String str2, boolean z, boolean z2, Boolean bool, Boolean bool2, String str3, String str4) {
/* 6 */             if (15 != (i & 15)) {
/* 62 */                b40.m1214E(i, 15, SecondLayer$$serializer.INSTANCE.getDescriptor());
/* 65 */                throw null;
                    }
/* 11 */            this.f6438a = str;
/* 13 */            this.f6439b = str2;
/* 15 */            this.f6440c = z;
/* 17 */            this.f6441d = z2;
/* 21 */            if ((i & 16) == 0) {
/* 23 */                this.f6442e = null;
                    } else {
/* 26 */                this.f6442e = bool;
                    }
/* 30 */            if ((i & 32) == 0) {
/* 32 */                this.f6443f = null;
                    } else {
/* 35 */                this.f6443f = bool2;
                    }
/* 39 */            if ((i & 64) == 0) {
/* 41 */                this.f6444g = null;
                    } else {
/* 44 */                this.f6444g = str3;
                    }
/* 48 */            if ((i & 128) == 0) {
/* 50 */                this.f6445h = null;
                    } else {
/* 53 */                this.f6445h = str4;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SecondLayer)) {
/* 7 */                 return false;
                    }
/* 11 */            SecondLayer secondLayer = (SecondLayer) obj;
                    return Intrinsics.m6216a(this.f6438a, secondLayer.f6438a) && Intrinsics.m6216a(this.f6439b, secondLayer.f6439b) && this.f6440c == secondLayer.f6440c && this.f6441d == secondLayer.f6441d && Intrinsics.m6216a(this.f6442e, secondLayer.f6442e) && Intrinsics.m6216a(this.f6443f, secondLayer.f6443f) && Intrinsics.m6216a(this.f6444g, secondLayer.f6444g) && Intrinsics.m6216a(this.f6445h, secondLayer.f6445h);
                }

                public final int hashCode() {
/* 24 */            int iM3504h = AbstractC0886en.m3504h(AbstractC0886en.m3504h(pm2.m7485h(this.f6438a.hashCode() * 31, 31, this.f6439b), 31, this.f6440c), 31, this.f6441d);
/* 29 */            Boolean bool = this.f6442e;
/* 40 */            int iHashCode = (iM3504h + (bool == null ? 0 : bool.hashCode())) * 31;
/* 41 */            Boolean bool2 = this.f6443f;
/* 52 */            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 53 */            String str = this.f6444g;
/* 64 */            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
/* 65 */            String str2 = this.f6445h;
/* 74 */            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("SecondLayer(tabsCategoriesLabel=", this.f6438a, ", tabsServicesLabel=", this.f6439b, ", hideTogglesForServices=");
/* 17 */            sbM3514r.append(this.f6440c);
/* 22 */            sbM3514r.append(", hideDataProcessingServices=");
/* 27 */            sbM3514r.append(this.f6441d);
/* 32 */            sbM3514r.append(", hideButtonDeny=");
/* 37 */            sbM3514r.append(this.f6442e);
/* 42 */            sbM3514r.append(", hideLanguageSwitch=");
/* 47 */            sbM3514r.append(this.f6443f);
/* 52 */            sbM3514r.append(", acceptButtonText=");
/* 63 */            return fm0.m3791q(sbM3514r, this.f6444g, ", denyButtonText=", this.f6445h, ")");
                }
            }
