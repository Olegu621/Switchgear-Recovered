            package com.usercentrics.sdk.p009v2.settings.data;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.az0;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public final class TCF2ChangedPurposes {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6465d;

                /* JADX INFO: renamed from: a */
                public final List f6466a;

                /* JADX INFO: renamed from: b */
                public final List f6467b;

                /* JADX INFO: renamed from: c */
                public final List f6468c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCF2ChangedPurposes$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            az0 az0Var = az0.f2143a;
/* 37 */            f6465d = new KSerializer[]{new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0)};
                }

                public TCF2ChangedPurposes(int i, List list, List list2, List list3) {
/* 10 */            this.f6466a = (i & 1) == 0 ? nd0.f14189a : list;
/* 14 */            if ((i & 2) == 0) {
/* 18 */                this.f6467b = nd0.f14189a;
                    } else {
/* 21 */                this.f6467b = list2;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 29 */                this.f6468c = nd0.f14189a;
                    } else {
/* 32 */                this.f6468c = list3;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCF2ChangedPurposes)) {
/* 7 */                 return false;
                    }
/* 11 */            TCF2ChangedPurposes tCF2ChangedPurposes = (TCF2ChangedPurposes) obj;
                    return Intrinsics.m6216a(this.f6466a, tCF2ChangedPurposes.f6466a) && Intrinsics.m6216a(this.f6467b, tCF2ChangedPurposes.f6467b) && Intrinsics.m6216a(this.f6468c, tCF2ChangedPurposes.f6468c);
                }

                public final int hashCode() {
/* 22 */            return this.f6468c.hashCode() + AbstractC0298j.m1861b(this.f6466a.hashCode() * 31, 31, this.f6467b);
                }

                public final String toString() {
/* 38 */            return "TCF2ChangedPurposes(purposes=" + this.f6466a + ", legIntPurposes=" + this.f6467b + ", notAllowedPurposes=" + this.f6468c + ")";
                }

/* 34 */        public TCF2ChangedPurposes(List list, List list2, List list3) {
                    list.getClass();
                    list2.getClass();
                    list3.getClass();
/* 36 */            this.f6466a = list;
/* 37 */            this.f6467b = list2;
/* 38 */            this.f6468c = list3;
                }
            }
