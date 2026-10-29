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
/* 36 */    public final class TCFSpecialFeature {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: i */
                public static final KSerializer[] f6185i = {null, new C0950gd(vh2.f18183a, 0), null, null, null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final String f6186a;

                /* JADX INFO: renamed from: b */
                public final List f6187b;

                /* JADX INFO: renamed from: c */
                public final int f6188c;

                /* JADX INFO: renamed from: d */
                public final String f6189d;

                /* JADX INFO: renamed from: e */
                public final Boolean f6190e;

                /* JADX INFO: renamed from: f */
                public final boolean f6191f;

                /* JADX INFO: renamed from: g */
                public final Integer f6192g;

                /* JADX INFO: renamed from: h */
                public final boolean f6193h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFSpecialFeature$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TCFSpecialFeature(int i, String str, List list, int i2, String str2, Boolean bool, boolean z, Integer num, boolean z2) {
/* 5 */             if (255 != (i & 255)) {
/* 33 */                b40.m1214E(i, 255, TCFSpecialFeature$$serializer.INSTANCE.getDescriptor());
/* 37 */                throw null;
                    }
/* 10 */            this.f6186a = str;
/* 12 */            this.f6187b = list;
/* 14 */            this.f6188c = i2;
/* 16 */            this.f6189d = str2;
/* 18 */            this.f6190e = bool;
/* 20 */            this.f6191f = z;
/* 22 */            this.f6192g = num;
/* 24 */            this.f6193h = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFSpecialFeature)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFSpecialFeature tCFSpecialFeature = (TCFSpecialFeature) obj;
                    return Intrinsics.m6216a(this.f6186a, tCFSpecialFeature.f6186a) && Intrinsics.m6216a(this.f6187b, tCFSpecialFeature.f6187b) && this.f6188c == tCFSpecialFeature.f6188c && Intrinsics.m6216a(this.f6189d, tCFSpecialFeature.f6189d) && Intrinsics.m6216a(this.f6190e, tCFSpecialFeature.f6190e) && this.f6191f == tCFSpecialFeature.f6191f && Intrinsics.m6216a(this.f6192g, tCFSpecialFeature.f6192g) && this.f6193h == tCFSpecialFeature.f6193h;
                }

                public final int hashCode() {
/* 24 */            int iM7485h = pm2.m7485h(AbstractC0298j.m1860a(this.f6188c, AbstractC0298j.m1861b(this.f6186a.hashCode() * 31, 31, this.f6187b), 31), 31, this.f6189d);
/* 29 */            Boolean bool = this.f6190e;
/* 43 */            int iM3504h = AbstractC0886en.m3504h((iM7485h + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f6191f);
/* 47 */            Integer num = this.f6192g;
/* 64 */            return Boolean.hashCode(this.f6193h) + ((iM3504h + (num != null ? num.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 88 */            return "TCFSpecialFeature(purposeDescription=" + this.f6186a + ", illustrations=" + this.f6187b + ", id=" + this.f6188c + ", name=" + this.f6189d + ", consent=" + this.f6190e + ", isPartOfASelectedStack=" + this.f6191f + ", stackId=" + this.f6192g + ", showConsentToggle=" + this.f6193h + ")";
                }

/* 37 */        public TCFSpecialFeature(String str, List list, int i, String str2, Boolean bool, boolean z, Integer num, boolean z2) {
                    str.getClass();
                    list.getClass();
                    str2.getClass();
/* 39 */            this.f6186a = str;
/* 40 */            this.f6187b = list;
/* 41 */            this.f6188c = i;
/* 42 */            this.f6189d = str2;
/* 43 */            this.f6190e = bool;
/* 44 */            this.f6191f = z;
/* 45 */            this.f6192g = num;
/* 46 */            this.f6193h = z2;
                }
            }
