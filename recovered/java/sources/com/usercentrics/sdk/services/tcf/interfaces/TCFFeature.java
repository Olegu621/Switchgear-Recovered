            package com.usercentrics.sdk.services.tcf.interfaces;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class TCFFeature {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: e */
                public static final KSerializer[] f6168e = {null, new C0950gd(vh2.f18183a, 0), null, null};

                /* JADX INFO: renamed from: a */
                public final String f6169a;

                /* JADX INFO: renamed from: b */
                public final List f6170b;

                /* JADX INFO: renamed from: c */
                public final int f6171c;

                /* JADX INFO: renamed from: d */
                public final String f6172d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFFeature$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TCFFeature(int i, int i2, String str, String str2, List list) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, TCFFeature$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6169a = str;
/* 12 */            this.f6170b = list;
/* 14 */            this.f6171c = i2;
/* 16 */            this.f6172d = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFFeature)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFFeature tCFFeature = (TCFFeature) obj;
                    return Intrinsics.m6216a(this.f6169a, tCFFeature.f6169a) && Intrinsics.m6216a(this.f6170b, tCFFeature.f6170b) && this.f6171c == tCFFeature.f6171c && Intrinsics.m6216a(this.f6172d, tCFFeature.f6172d);
                }

                public final int hashCode() {
/* 28 */            return this.f6172d.hashCode() + AbstractC0298j.m1860a(this.f6171c, AbstractC0298j.m1861b(this.f6169a.hashCode() * 31, 31, this.f6170b), 31);
                }

                public final String toString() {
/* 48 */            return "TCFFeature(purposeDescription=" + this.f6169a + ", illustrations=" + this.f6170b + ", id=" + this.f6171c + ", name=" + this.f6172d + ")";
                }

/* 29 */        public TCFFeature(int i, String str, String str2, List list) {
                    str.getClass();
                    list.getClass();
                    str2.getClass();
/* 31 */            this.f6169a = str;
/* 32 */            this.f6170b = list;
/* 33 */            this.f6171c = i;
/* 34 */            this.f6172d = str2;
                }
            }
