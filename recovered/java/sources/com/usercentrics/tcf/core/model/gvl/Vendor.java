            package com.usercentrics.tcf.core.model.gvl;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.az0;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Vendor {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: t */
                public static final KSerializer[] f6831t;

                /* JADX INFO: renamed from: a */
                public final List f6832a;

                /* JADX INFO: renamed from: b */
                public final List f6833b;

                /* JADX INFO: renamed from: c */
                public final List f6834c;

                /* JADX INFO: renamed from: d */
                public final List f6835d;

                /* JADX INFO: renamed from: e */
                public final List f6836e;

                /* JADX INFO: renamed from: f */
                public final List f6837f;

                /* JADX INFO: renamed from: g */
                public final String f6838g;

                /* JADX INFO: renamed from: h */
                public final String f6839h;

                /* JADX INFO: renamed from: i */
                public final Overflow f6840i;

                /* JADX INFO: renamed from: j */
                public final Double f6841j;

                /* JADX INFO: renamed from: k */
                public final boolean f6842k;

                /* JADX INFO: renamed from: l */
                public final String f6843l;

                /* JADX INFO: renamed from: m */
                public final boolean f6844m;

                /* JADX INFO: renamed from: n */
                public final Boolean f6845n;

                /* JADX INFO: renamed from: o */
                public final int f6846o;

                /* JADX INFO: renamed from: p */
                public final String f6847p;

                /* JADX INFO: renamed from: q */
                public final GvlDataRetention f6848q;

                /* JADX INFO: renamed from: r */
                public final List f6849r;

                /* JADX INFO: renamed from: s */
                public final List f6850s;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/Vendor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/Vendor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return Vendor$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            az0 az0Var = az0.f2143a;
/* 125 */           f6831t = new KSerializer[]{new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), null, null, null, null, null, null, null, null, null, null, null, new C0950gd(VendorUrl$$serializer.INSTANCE, 0), new C0950gd(az0Var, 0)};
                }

                public /* synthetic */ Vendor(int i, List list, List list2, List list3, List list4, List list5, List list6, String str, String str2, Overflow overflow, Double d, boolean z, String str3, boolean z2, Boolean bool, int i2, String str4, GvlDataRetention gvlDataRetention, List list7, List list8) {
                    if (246847 != (i & 246847)) {
                        b40.m1214E(i, 246847, Vendor$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6832a = list;
                    this.f6833b = list2;
                    this.f6834c = list3;
                    this.f6835d = list4;
                    this.f6836e = list5;
                    this.f6837f = list6;
                    if ((i & 64) == 0) {
/* 3 */                 this.f6838g = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        this.f6838g = str;
                    }
                    if ((i & 128) == 0) {
                        this.f6839h = null;
                    } else {
                        this.f6839h = str2;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        this.f6840i = null;
                    } else {
                        this.f6840i = overflow;
                    }
                    if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
                        this.f6841j = null;
                    } else {
                        this.f6841j = d;
                    }
                    this.f6842k = z;
                    if ((i & 2048) == 0) {
                        this.f6843l = null;
                    } else {
                        this.f6843l = str3;
                    }
                    this.f6844m = (i & 4096) == 0 ? false : z2;
/* 5 */             this.f6845n = (i & Segment.SIZE) == 0 ? Boolean.FALSE : bool;
                    this.f6846o = i2;
                    this.f6847p = str4;
                    this.f6848q = gvlDataRetention;
                    this.f6849r = list7;
                    if ((i & 262144) == 0) {
                        this.f6850s = null;
                    } else {
                        this.f6850s = list8;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Vendor)) {
/* 7 */                 return false;
                    }
/* 11 */            Vendor vendor = (Vendor) obj;
                    return Intrinsics.m6216a(this.f6832a, vendor.f6832a) && Intrinsics.m6216a(this.f6833b, vendor.f6833b) && Intrinsics.m6216a(this.f6834c, vendor.f6834c) && Intrinsics.m6216a(this.f6835d, vendor.f6835d) && Intrinsics.m6216a(this.f6836e, vendor.f6836e) && Intrinsics.m6216a(this.f6837f, vendor.f6837f) && Intrinsics.m6216a(this.f6838g, vendor.f6838g) && Intrinsics.m6216a(this.f6839h, vendor.f6839h) && Intrinsics.m6216a(this.f6840i, vendor.f6840i) && Intrinsics.m6216a(this.f6841j, vendor.f6841j) && this.f6842k == vendor.f6842k && Intrinsics.m6216a(this.f6843l, vendor.f6843l) && this.f6844m == vendor.f6844m && Intrinsics.m6216a(this.f6845n, vendor.f6845n) && this.f6846o == vendor.f6846o && Intrinsics.m6216a(this.f6847p, vendor.f6847p) && Intrinsics.m6216a(this.f6848q, vendor.f6848q) && Intrinsics.m6216a(this.f6849r, vendor.f6849r) && Intrinsics.m6216a(this.f6850s, vendor.f6850s);
                }

                public final int hashCode() {
/* 42 */            int iM7485h = pm2.m7485h(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b(this.f6832a.hashCode() * 31, 31, this.f6833b), 31, this.f6834c), 31, this.f6835d), 31, this.f6836e), 31, this.f6837f), 31, this.f6838g);
/* 47 */            String str = this.f6839h;
/* 58 */            int iHashCode = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 59 */            Overflow overflow = this.f6840i;
/* 72 */            int iHashCode2 = (iHashCode + (overflow == null ? 0 : Integer.hashCode(overflow.f6817a))) * 31;
/* 73 */            Double d = this.f6841j;
/* 87 */            int iM3504h = AbstractC0886en.m3504h((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.f6842k);
/* 91 */            String str2 = this.f6843l;
/* 105 */           int iM3504h2 = AbstractC0886en.m3504h((iM3504h + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6844m);
/* 109 */           Boolean bool = this.f6845n;
/* 129 */           int iM7485h2 = pm2.m7485h(AbstractC0298j.m1860a(this.f6846o, (iM3504h2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31, this.f6847p);
/* 133 */           GvlDataRetention gvlDataRetention = this.f6848q;
/* 144 */           int iHashCode3 = (iM7485h2 + (gvlDataRetention == null ? 0 : gvlDataRetention.hashCode())) * 31;
/* 145 */           List list = this.f6849r;
/* 156 */           int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
/* 157 */           List list2 = this.f6850s;
/* 166 */           return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Vendor(purposes=");
/* 10 */            sb.append(this.f6832a);
/* 15 */            sb.append(", legIntPurposes=");
/* 20 */            sb.append(this.f6833b);
/* 25 */            sb.append(", flexiblePurposes=");
/* 30 */            sb.append(this.f6834c);
/* 35 */            sb.append(", specialPurposes=");
/* 40 */            sb.append(this.f6835d);
/* 45 */            sb.append(", features=");
/* 50 */            sb.append(this.f6836e);
/* 55 */            sb.append(", specialFeatures=");
/* 60 */            sb.append(this.f6837f);
/* 65 */            sb.append(", policyUrl=");
/* 76 */            fm0.m3796v(sb, this.f6838g, ", deletedDate=", this.f6839h, ", overflow=");
/* 81 */            sb.append(this.f6840i);
/* 86 */            sb.append(", cookieMaxAgeSeconds=");
/* 91 */            sb.append(this.f6841j);
/* 96 */            sb.append(", usesNonCookieAccess=");
/* 101 */           sb.append(this.f6842k);
/* 106 */           sb.append(", deviceStorageDisclosureUrl=");
/* 111 */           sb.append(this.f6843l);
/* 116 */           sb.append(", usesCookies=");
/* 121 */           sb.append(this.f6844m);
/* 126 */           sb.append(", cookieRefresh=");
/* 131 */           sb.append(this.f6845n);
/* 136 */           sb.append(", id=");
/* 141 */           sb.append(this.f6846o);
/* 146 */           sb.append(", name=");
/* 151 */           sb.append(this.f6847p);
/* 156 */           sb.append(", dataRetention=");
/* 161 */           sb.append(this.f6848q);
/* 166 */           sb.append(", urls=");
/* 171 */           sb.append(this.f6849r);
/* 176 */           sb.append(", dataDeclaration=");
/* 181 */           sb.append(this.f6850s);
/* 186 */           sb.append(")");
/* 189 */           return sb.toString();
                }
            }
