            package com.usercentrics.sdk.services.tcf.interfaces;

            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.tcf.core.model.gvl.DataRetention;
            import com.usercentrics.tcf.core.model.gvl.VendorUrl$$serializer;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public final class TCFVendor {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: x */
                public static final KSerializer[] f6205x;

                /* JADX INFO: renamed from: a */
                public final Boolean f6206a;

                /* JADX INFO: renamed from: b */
                public final List f6207b;

                /* JADX INFO: renamed from: c */
                public final List f6208c;

                /* JADX INFO: renamed from: d */
                public final int f6209d;

                /* JADX INFO: renamed from: e */
                public final Boolean f6210e;

                /* JADX INFO: renamed from: f */
                public final List f6211f;

                /* JADX INFO: renamed from: g */
                public final String f6212g;

                /* JADX INFO: renamed from: h */
                public final String f6213h;

                /* JADX INFO: renamed from: i */
                public final List f6214i;

                /* JADX INFO: renamed from: j */
                public final List f6215j;

                /* JADX INFO: renamed from: k */
                public final List f6216k;

                /* JADX INFO: renamed from: l */
                public final List f6217l;

                /* JADX INFO: renamed from: m */
                public final boolean f6218m;

                /* JADX INFO: renamed from: n */
                public final boolean f6219n;

                /* JADX INFO: renamed from: o */
                public final Double f6220o;

                /* JADX INFO: renamed from: p */
                public final boolean f6221p;

                /* JADX INFO: renamed from: q */
                public final String f6222q;

                /* JADX INFO: renamed from: r */
                public final boolean f6223r;

                /* JADX INFO: renamed from: s */
                public final Boolean f6224s;

                /* JADX INFO: renamed from: t */
                public final Boolean f6225t;

                /* JADX INFO: renamed from: u */
                public final DataRetention f6226u;

                /* JADX INFO: renamed from: v */
                public final List f6227v;

                /* JADX INFO: renamed from: w */
                public final List f6228w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFVendor$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            IdAndName$$serializer idAndName$$serializer = IdAndName$$serializer.INSTANCE;
/* 148 */           f6205x = new KSerializer[]{null, new C0950gd(idAndName$$serializer, 0), new C0950gd(idAndName$$serializer, 0), null, null, new C0950gd(idAndName$$serializer, 0), null, null, new C0950gd(idAndName$$serializer, 0), new C0950gd(TCFVendorRestriction$$serializer.INSTANCE, 0), new C0950gd(idAndName$$serializer, 0), new C0950gd(idAndName$$serializer, 0), null, null, null, null, null, null, null, null, null, new C0950gd(idAndName$$serializer, 0), new C0950gd(VendorUrl$$serializer.INSTANCE, 0)};
                }

                public /* synthetic */ TCFVendor(int i, Boolean bool, List list, List list2, int i2, Boolean bool2, List list3, String str, String str2, List list4, List list5, List list6, List list7, boolean z, boolean z2, Double d, boolean z3, String str3, boolean z4, Boolean bool3, Boolean bool4, DataRetention dataRetention, List list8, List list9) {
                    if (6340607 != (i & 6340607)) {
                        b40.m1214E(i, 6340607, TCFVendor$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6206a = bool;
                    this.f6207b = list;
                    this.f6208c = list2;
                    this.f6209d = i2;
                    this.f6210e = bool2;
                    this.f6211f = list3;
                    this.f6212g = str;
                    this.f6213h = str2;
                    this.f6214i = list4;
                    this.f6215j = list5;
                    this.f6216k = list6;
                    this.f6217l = list7;
                    this.f6218m = z;
                    this.f6219n = z2;
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        this.f6220o = null;
                    } else {
                        this.f6220o = d;
                    }
                    this.f6221p = z3;
                    if ((65536 & i) == 0) {
                        this.f6222q = null;
                    } else {
                        this.f6222q = str3;
                    }
                    this.f6223r = (131072 & i) == 0 ? false : z4;
/* 3 */             this.f6224s = (262144 & i) == 0 ? Boolean.FALSE : bool3;
/* 5 */             this.f6225t = (524288 & i) == 0 ? Boolean.FALSE : bool4;
                    if ((i & 1048576) == 0) {
                        this.f6226u = null;
                    } else {
                        this.f6226u = dataRetention;
                    }
                    this.f6227v = list8;
                    this.f6228w = list9;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFVendor)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFVendor tCFVendor = (TCFVendor) obj;
                    return Intrinsics.m6216a(this.f6206a, tCFVendor.f6206a) && Intrinsics.m6216a(this.f6207b, tCFVendor.f6207b) && Intrinsics.m6216a(this.f6208c, tCFVendor.f6208c) && this.f6209d == tCFVendor.f6209d && Intrinsics.m6216a(this.f6210e, tCFVendor.f6210e) && Intrinsics.m6216a(this.f6211f, tCFVendor.f6211f) && Intrinsics.m6216a(this.f6212g, tCFVendor.f6212g) && Intrinsics.m6216a(this.f6213h, tCFVendor.f6213h) && Intrinsics.m6216a(this.f6214i, tCFVendor.f6214i) && Intrinsics.m6216a(this.f6215j, tCFVendor.f6215j) && Intrinsics.m6216a(this.f6216k, tCFVendor.f6216k) && Intrinsics.m6216a(this.f6217l, tCFVendor.f6217l) && this.f6218m == tCFVendor.f6218m && this.f6219n == tCFVendor.f6219n && Intrinsics.m6216a(this.f6220o, tCFVendor.f6220o) && this.f6221p == tCFVendor.f6221p && Intrinsics.m6216a(this.f6222q, tCFVendor.f6222q) && this.f6223r == tCFVendor.f6223r && Intrinsics.m6216a(this.f6224s, tCFVendor.f6224s) && Intrinsics.m6216a(this.f6225t, tCFVendor.f6225t) && Intrinsics.m6216a(this.f6226u, tCFVendor.f6226u) && Intrinsics.m6216a(this.f6227v, tCFVendor.f6227v) && Intrinsics.m6216a(this.f6228w, tCFVendor.f6228w);
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f6206a;
/* 29 */            int iM1860a = AbstractC0298j.m1860a(this.f6209d, AbstractC0298j.m1861b(AbstractC0298j.m1861b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f6207b), 31, this.f6208c), 31);
/* 33 */            Boolean bool2 = this.f6210e;
/* 95 */            int iM3504h = AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(pm2.m7485h(pm2.m7485h(AbstractC0298j.m1861b((iM1860a + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f6211f), 31, this.f6212g), 31, this.f6213h), 31, this.f6214i), 31, this.f6215j), 31, this.f6216k), 31, this.f6217l), 31, this.f6218m), 31, this.f6219n);
/* 99 */            Double d = this.f6220o;
/* 113 */           int iM3504h2 = AbstractC0886en.m3504h((iM3504h + (d == null ? 0 : d.hashCode())) * 31, 31, this.f6221p);
/* 117 */           String str = this.f6222q;
/* 131 */           int iM3504h3 = AbstractC0886en.m3504h((iM3504h2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6223r);
/* 135 */           Boolean bool3 = this.f6224s;
/* 146 */           int iHashCode = (iM3504h3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 147 */           Boolean bool4 = this.f6225t;
/* 158 */           int iHashCode2 = (iHashCode + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 159 */           DataRetention dataRetention = this.f6226u;
/* 182 */           return this.f6228w.hashCode() + AbstractC0298j.m1861b((iHashCode2 + (dataRetention != null ? dataRetention.hashCode() : 0)) * 31, 31, this.f6227v);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TCFVendor(consent=");
/* 10 */            sb.append(this.f6206a);
/* 15 */            sb.append(", features=");
/* 20 */            sb.append(this.f6207b);
/* 25 */            sb.append(", flexiblePurposes=");
/* 30 */            sb.append(this.f6208c);
/* 35 */            sb.append(", id=");
/* 40 */            sb.append(this.f6209d);
/* 45 */            sb.append(", legitimateInterestConsent=");
/* 50 */            sb.append(this.f6210e);
/* 55 */            sb.append(", legitimateInterestPurposes=");
/* 60 */            sb.append(this.f6211f);
/* 65 */            sb.append(", name=");
/* 76 */            fm0.m3796v(sb, this.f6212g, ", policyUrl=", this.f6213h, ", purposes=");
/* 81 */            sb.append(this.f6214i);
/* 86 */            sb.append(", restrictions=");
/* 91 */            sb.append(this.f6215j);
/* 96 */            sb.append(", specialFeatures=");
/* 101 */           sb.append(this.f6216k);
/* 106 */           sb.append(", specialPurposes=");
/* 111 */           sb.append(this.f6217l);
/* 116 */           sb.append(", showConsentToggle=");
/* 121 */           sb.append(this.f6218m);
/* 126 */           sb.append(", showLegitimateInterestToggle=");
/* 131 */           sb.append(this.f6219n);
/* 136 */           sb.append(", cookieMaxAgeSeconds=");
/* 141 */           sb.append(this.f6220o);
/* 146 */           sb.append(", usesNonCookieAccess=");
/* 151 */           sb.append(this.f6221p);
/* 156 */           sb.append(", deviceStorageDisclosureUrl=");
/* 161 */           sb.append(this.f6222q);
/* 166 */           sb.append(", usesCookies=");
/* 171 */           sb.append(this.f6223r);
/* 176 */           sb.append(", cookieRefresh=");
/* 181 */           sb.append(this.f6224s);
/* 186 */           sb.append(", dataSharedOutsideEU=");
/* 191 */           sb.append(this.f6225t);
/* 196 */           sb.append(", dataRetention=");
/* 201 */           sb.append(this.f6226u);
/* 206 */           sb.append(", dataCategories=");
/* 211 */           sb.append(this.f6227v);
/* 216 */           sb.append(", vendorUrls=");
/* 221 */           sb.append(this.f6228w);
/* 226 */           sb.append(")");
/* 229 */           return sb.toString();
                }

/* 5 */         public TCFVendor(Boolean bool, ArrayList arrayList, ArrayList arrayList2, int i, Boolean bool2, List list, String str, String str2, List list2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, boolean z, boolean z2, Double d, boolean z3, String str3, boolean z4, Boolean bool3, Boolean bool4, DataRetention dataRetention, List list3, List list4) {
                    list.getClass();
                    str.getClass();
                    str2.getClass();
                    list2.getClass();
                    list3.getClass();
                    list4.getClass();
/* 7 */             this.f6206a = bool;
/* 8 */             this.f6207b = arrayList;
/* 9 */             this.f6208c = arrayList2;
/* 10 */            this.f6209d = i;
/* 11 */            this.f6210e = bool2;
/* 12 */            this.f6211f = list;
/* 13 */            this.f6212g = str;
/* 14 */            this.f6213h = str2;
/* 15 */            this.f6214i = list2;
/* 16 */            this.f6215j = arrayList3;
/* 17 */            this.f6216k = arrayList4;
/* 18 */            this.f6217l = arrayList5;
/* 19 */            this.f6218m = z;
/* 20 */            this.f6219n = z2;
/* 21 */            this.f6220o = d;
/* 22 */            this.f6221p = z3;
/* 23 */            this.f6222q = str3;
/* 24 */            this.f6223r = z4;
/* 25 */            this.f6224s = bool3;
/* 26 */            this.f6225t = bool4;
/* 27 */            this.f6226u = dataRetention;
/* 28 */            this.f6227v = list3;
/* 29 */            this.f6228w = list4;
                }
            }
