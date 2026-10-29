            package com.usercentrics.sdk.services.tcf.interfaces;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b40;
            import p000.pm2;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class TCFPurpose {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: l */
                public static final KSerializer[] f6173l = {null, new C0950gd(vh2.f18183a, 0), null, null, null, null, null, null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final String f6174a;

                /* JADX INFO: renamed from: b */
                public final List f6175b;

                /* JADX INFO: renamed from: c */
                public final int f6176c;

                /* JADX INFO: renamed from: d */
                public final String f6177d;

                /* JADX INFO: renamed from: e */
                public final Boolean f6178e;

                /* JADX INFO: renamed from: f */
                public final boolean f6179f;

                /* JADX INFO: renamed from: g */
                public final Boolean f6180g;

                /* JADX INFO: renamed from: h */
                public final boolean f6181h;

                /* JADX INFO: renamed from: i */
                public final boolean f6182i;

                /* JADX INFO: renamed from: j */
                public final Integer f6183j;

                /* JADX INFO: renamed from: k */
                public final Integer f6184k;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFPurpose$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TCFPurpose(int i, String str, List list, int i2, String str2, Boolean bool, boolean z, Boolean bool2, boolean z2, boolean z3, Integer num, Integer num2) {
/* 5 */             if (2047 != (i & 2047)) {
/* 39 */                b40.m1214E(i, 2047, TCFPurpose$$serializer.INSTANCE.getDescriptor());
/* 43 */                throw null;
                    }
/* 10 */            this.f6174a = str;
/* 12 */            this.f6175b = list;
/* 14 */            this.f6176c = i2;
/* 16 */            this.f6177d = str2;
/* 18 */            this.f6178e = bool;
/* 20 */            this.f6179f = z;
/* 22 */            this.f6180g = bool2;
/* 24 */            this.f6181h = z2;
/* 26 */            this.f6182i = z3;
/* 28 */            this.f6183j = num;
/* 30 */            this.f6184k = num2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFPurpose)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFPurpose tCFPurpose = (TCFPurpose) obj;
                    return Intrinsics.m6216a(this.f6174a, tCFPurpose.f6174a) && Intrinsics.m6216a(this.f6175b, tCFPurpose.f6175b) && this.f6176c == tCFPurpose.f6176c && Intrinsics.m6216a(this.f6177d, tCFPurpose.f6177d) && Intrinsics.m6216a(this.f6178e, tCFPurpose.f6178e) && this.f6179f == tCFPurpose.f6179f && Intrinsics.m6216a(this.f6180g, tCFPurpose.f6180g) && this.f6181h == tCFPurpose.f6181h && this.f6182i == tCFPurpose.f6182i && Intrinsics.m6216a(this.f6183j, tCFPurpose.f6183j) && Intrinsics.m6216a(this.f6184k, tCFPurpose.f6184k);
                }

                public final int hashCode() {
/* 24 */            int iM7485h = pm2.m7485h(AbstractC0298j.m1860a(this.f6176c, AbstractC0298j.m1861b(this.f6174a.hashCode() * 31, 31, this.f6175b), 31), 31, this.f6177d);
/* 29 */            Boolean bool = this.f6178e;
/* 43 */            int iM3504h = AbstractC0886en.m3504h((iM7485h + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f6179f);
/* 47 */            Boolean bool2 = this.f6180g;
/* 67 */            int iM3504h2 = AbstractC0886en.m3504h(AbstractC0886en.m3504h((iM3504h + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f6181h), 31, this.f6182i);
/* 71 */            Integer num = this.f6183j;
/* 82 */            int iHashCode = (iM3504h2 + (num == null ? 0 : num.hashCode())) * 31;
/* 83 */            Integer num2 = this.f6184k;
/* 92 */            return iHashCode + (num2 != null ? num2.hashCode() : 0);
                }

                public final String toString() {
/* 118 */           return "TCFPurpose(purposeDescription=" + this.f6174a + ", illustrations=" + this.f6175b + ", id=" + this.f6176c + ", name=" + this.f6177d + ", consent=" + this.f6178e + ", isPartOfASelectedStack=" + this.f6179f + ", legitimateInterestConsent=" + this.f6180g + ", showConsentToggle=" + this.f6181h + ", showLegitimateInterestToggle=" + this.f6182i + ", stackId=" + this.f6183j + ", numberOfVendors=" + this.f6184k + ")";
                }

/* 43 */        public TCFPurpose(String str, List list, int i, String str2, Boolean bool, boolean z, Boolean bool2, boolean z2, boolean z3, Integer num, Integer num2) {
                    str.getClass();
                    list.getClass();
                    str2.getClass();
/* 45 */            this.f6174a = str;
/* 46 */            this.f6175b = list;
/* 47 */            this.f6176c = i;
/* 48 */            this.f6177d = str2;
/* 49 */            this.f6178e = bool;
/* 50 */            this.f6179f = z;
/* 51 */            this.f6180g = bool2;
/* 52 */            this.f6181h = z2;
/* 53 */            this.f6182i = z3;
/* 54 */            this.f6183j = num;
/* 55 */            this.f6184k = num2;
                }
            }
