            package com.usercentrics.tcf.core.model.gvl;

            import androidx.core.app.NotificationCompat;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.rt0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class VendorList {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: l */
                public static final KSerializer[] f6851l;

                /* JADX INFO: renamed from: a */
                public final String f6852a;

                /* JADX INFO: renamed from: b */
                public final Integer f6853b;

                /* JADX INFO: renamed from: c */
                public final Integer f6854c;

                /* JADX INFO: renamed from: d */
                public final Integer f6855d;

                /* JADX INFO: renamed from: e */
                public final Map f6856e;

                /* JADX INFO: renamed from: f */
                public final Map f6857f;

                /* JADX INFO: renamed from: g */
                public final Map f6858g;

                /* JADX INFO: renamed from: h */
                public final Map f6859h;

                /* JADX INFO: renamed from: i */
                public final Map f6860i;

                /* JADX INFO: renamed from: j */
                public final Map f6861j;

                /* JADX INFO: renamed from: k */
                public final Map f6862k;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/VendorList$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/VendorList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return VendorList$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 15 */            rt0 rt0Var = new rt0(vh2Var, Vendor$$serializer.INSTANCE, 1);
/* 20 */            Purpose$$serializer purpose$$serializer = Purpose$$serializer.INSTANCE;
/* 22 */            rt0 rt0Var2 = new rt0(vh2Var, purpose$$serializer, 1);
/* 27 */            Feature$$serializer feature$$serializer = Feature$$serializer.INSTANCE;
/* 96 */            f6851l = new KSerializer[]{null, null, null, null, rt0Var, rt0Var2, new rt0(vh2Var, feature$$serializer, 1), new rt0(vh2Var, feature$$serializer, 1), new rt0(vh2Var, purpose$$serializer, 1), new rt0(vh2Var, Stack$$serializer.INSTANCE, 1), new rt0(vh2Var, DataCategory$$serializer.INSTANCE, 1)};
                }

                public /* synthetic */ VendorList(int i, String str, Integer num, Integer num2, Integer num3, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6852a = null;
                    } else {
/* 12 */                this.f6852a = str;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6853b = null;
                    } else {
/* 21 */                this.f6853b = num;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6854c = null;
                    } else {
/* 30 */                this.f6854c = num2;
                    }
/* 34 */            if ((i & 8) == 0) {
/* 36 */                this.f6855d = null;
                    } else {
/* 39 */                this.f6855d = num3;
                    }
/* 43 */            if ((i & 16) == 0) {
/* 45 */                this.f6856e = null;
                    } else {
/* 48 */                this.f6856e = map;
                    }
/* 52 */            if ((i & 32) == 0) {
/* 54 */                this.f6857f = null;
                    } else {
/* 57 */                this.f6857f = map2;
                    }
/* 61 */            if ((i & 64) == 0) {
/* 63 */                this.f6858g = null;
                    } else {
/* 66 */                this.f6858g = map3;
                    }
/* 70 */            if ((i & 128) == 0) {
/* 72 */                this.f6859h = null;
                    } else {
/* 75 */                this.f6859h = map4;
                    }
/* 79 */            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
/* 81 */                this.f6860i = null;
                    } else {
/* 84 */                this.f6860i = map5;
                    }
/* 88 */            if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
/* 90 */                this.f6861j = null;
                    } else {
/* 93 */                this.f6861j = map6;
                    }
/* 97 */            if ((i & Segment.SHARE_MINIMUM) == 0) {
/* 99 */                this.f6862k = null;
                    } else {
/* 102 */               this.f6862k = map7;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof VendorList)) {
/* 7 */                 return false;
                    }
/* 11 */            VendorList vendorList = (VendorList) obj;
                    return Intrinsics.m6216a(this.f6852a, vendorList.f6852a) && Intrinsics.m6216a(this.f6853b, vendorList.f6853b) && Intrinsics.m6216a(this.f6854c, vendorList.f6854c) && Intrinsics.m6216a(this.f6855d, vendorList.f6855d) && Intrinsics.m6216a(this.f6856e, vendorList.f6856e) && Intrinsics.m6216a(this.f6857f, vendorList.f6857f) && Intrinsics.m6216a(this.f6858g, vendorList.f6858g) && Intrinsics.m6216a(this.f6859h, vendorList.f6859h) && Intrinsics.m6216a(this.f6860i, vendorList.f6860i) && Intrinsics.m6216a(this.f6861j, vendorList.f6861j) && Intrinsics.m6216a(this.f6862k, vendorList.f6862k);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6852a;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            Integer num = this.f6853b;
/* 25 */            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
/* 27 */            Integer num2 = this.f6854c;
/* 38 */            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 40 */            Integer num3 = this.f6855d;
/* 51 */            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
/* 53 */            Map map = this.f6856e;
/* 64 */            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
/* 66 */            Map map2 = this.f6857f;
/* 77 */            int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
/* 79 */            Map map3 = this.f6858g;
/* 90 */            int iHashCode7 = (iHashCode6 + (map3 == null ? 0 : map3.hashCode())) * 31;
/* 92 */            Map map4 = this.f6859h;
/* 103 */           int iHashCode8 = (iHashCode7 + (map4 == null ? 0 : map4.hashCode())) * 31;
/* 105 */           Map map5 = this.f6860i;
/* 116 */           int iHashCode9 = (iHashCode8 + (map5 == null ? 0 : map5.hashCode())) * 31;
/* 118 */           Map map6 = this.f6861j;
/* 129 */           int iHashCode10 = (iHashCode9 + (map6 == null ? 0 : map6.hashCode())) * 31;
/* 131 */           Map map7 = this.f6862k;
/* 140 */           return iHashCode10 + (map7 != null ? map7.hashCode() : 0);
                }

                public final String toString() {
/* 118 */           return "VendorList(lastUpdated=" + this.f6852a + ", gvlSpecificationVersion=" + this.f6853b + ", vendorListVersion=" + this.f6854c + ", tcfPolicyVersion=" + this.f6855d + ", vendors=" + this.f6856e + ", purposes=" + this.f6857f + ", features=" + this.f6858g + ", specialFeatures=" + this.f6859h + ", specialPurposes=" + this.f6860i + ", stacks=" + this.f6861j + ", dataCategories=" + this.f6862k + ")";
                }
            }
