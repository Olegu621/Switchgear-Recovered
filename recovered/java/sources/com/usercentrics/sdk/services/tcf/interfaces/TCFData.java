            package com.usercentrics.sdk.services.tcf.interfaces;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 37 */    public final class TCFData {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: i */
                public static final KSerializer[] f6159i = {new C0950gd(TCFFeature$$serializer.INSTANCE, 0), new C0950gd(TCFPurpose$$serializer.INSTANCE, 0), new C0950gd(TCFSpecialFeature$$serializer.INSTANCE, 0), new C0950gd(TCFSpecialPurpose$$serializer.INSTANCE, 0), new C0950gd(TCFStack$$serializer.INSTANCE, 0), new C0950gd(TCFVendor$$serializer.INSTANCE, 0), null, null};

                /* JADX INFO: renamed from: a */
                public final List f6160a;

                /* JADX INFO: renamed from: b */
                public final List f6161b;

                /* JADX INFO: renamed from: c */
                public final List f6162c;

                /* JADX INFO: renamed from: d */
                public final List f6163d;

                /* JADX INFO: renamed from: e */
                public final List f6164e;

                /* JADX INFO: renamed from: f */
                public final List f6165f;

                /* JADX INFO: renamed from: g */
                public final String f6166g;

                /* JADX INFO: renamed from: h */
                public final int f6167h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFData$$serializer.INSTANCE;
                    }
                }

                public TCFData(List list, ArrayList arrayList, List list2, List list3, List list4, List list5, String str, int i) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 7 */             list3.getClass();
/* 10 */            list4.getClass();
/* 13 */            list5.getClass();
/* 16 */            str.getClass();
/* 22 */            this.f6160a = list;
/* 24 */            this.f6161b = arrayList;
/* 26 */            this.f6162c = list2;
/* 28 */            this.f6163d = list3;
/* 30 */            this.f6164e = list4;
/* 32 */            this.f6165f = list5;
/* 34 */            this.f6166g = str;
/* 36 */            this.f6167h = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFData)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFData tCFData = (TCFData) obj;
                    return Intrinsics.m6216a(this.f6160a, tCFData.f6160a) && Intrinsics.m6216a(this.f6161b, tCFData.f6161b) && Intrinsics.m6216a(this.f6162c, tCFData.f6162c) && Intrinsics.m6216a(this.f6163d, tCFData.f6163d) && Intrinsics.m6216a(this.f6164e, tCFData.f6164e) && Intrinsics.m6216a(this.f6165f, tCFData.f6165f) && Intrinsics.m6216a(this.f6166g, tCFData.f6166g) && this.f6167h == tCFData.f6167h;
                }

                public final int hashCode() {
/* 52 */            return Integer.hashCode(this.f6167h) + pm2.m7485h(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(this.f6160a.hashCode() * 31, 31, this.f6161b), 31, this.f6162c), 31, this.f6163d), 31, this.f6164e), 31, this.f6165f), 31, this.f6166g);
                }

                public final String toString() {
/* 88 */            return "TCFData(features=" + this.f6160a + ", purposes=" + this.f6161b + ", specialFeatures=" + this.f6162c + ", specialPurposes=" + this.f6163d + ", stacks=" + this.f6164e + ", vendors=" + this.f6165f + ", tcString=" + this.f6166g + ", thirdPartyCount=" + this.f6167h + ")";
                }

/* 38 */        public /* synthetic */ TCFData(int i, List list, List list2, List list3, List list4, List list5, List list6, String str, int i2) {
                    if (255 != (i & 255)) {
                        b40.m1214E(i, 255, TCFData$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6160a = list;
                    this.f6161b = list2;
                    this.f6162c = list3;
                    this.f6163d = list4;
                    this.f6164e = list5;
                    this.f6165f = list6;
                    this.f6166g = str;
                    this.f6167h = i2;
                }
            }
