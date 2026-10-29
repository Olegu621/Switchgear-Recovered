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
/* 28 */    public final class TCFSpecialPurpose {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: e */
                public static final KSerializer[] f6194e = {null, new C0950gd(vh2.f18183a, 0), null, null};

                /* JADX INFO: renamed from: a */
                public final String f6195a;

                /* JADX INFO: renamed from: b */
                public final List f6196b;

                /* JADX INFO: renamed from: c */
                public final int f6197c;

                /* JADX INFO: renamed from: d */
                public final String f6198d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFSpecialPurpose$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TCFSpecialPurpose(int i, int i2, String str, String str2, List list) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, TCFSpecialPurpose$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6195a = str;
/* 12 */            this.f6196b = list;
/* 14 */            this.f6197c = i2;
/* 16 */            this.f6198d = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFSpecialPurpose)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFSpecialPurpose tCFSpecialPurpose = (TCFSpecialPurpose) obj;
                    return Intrinsics.m6216a(this.f6195a, tCFSpecialPurpose.f6195a) && Intrinsics.m6216a(this.f6196b, tCFSpecialPurpose.f6196b) && this.f6197c == tCFSpecialPurpose.f6197c && Intrinsics.m6216a(this.f6198d, tCFSpecialPurpose.f6198d);
                }

                public final int hashCode() {
/* 28 */            return this.f6198d.hashCode() + AbstractC0298j.m1860a(this.f6197c, AbstractC0298j.m1861b(this.f6195a.hashCode() * 31, 31, this.f6196b), 31);
                }

                public final String toString() {
/* 48 */            return "TCFSpecialPurpose(purposeDescription=" + this.f6195a + ", illustrations=" + this.f6196b + ", id=" + this.f6197c + ", name=" + this.f6198d + ")";
                }

/* 29 */        public TCFSpecialPurpose(int i, String str, String str2, List list) {
                    str.getClass();
                    list.getClass();
                    str2.getClass();
/* 31 */            this.f6195a = str;
/* 32 */            this.f6196b = list;
/* 33 */            this.f6197c = i;
/* 34 */            this.f6198d = str2;
                }
            }
