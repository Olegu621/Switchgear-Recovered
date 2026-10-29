            package com.usercentrics.sdk.p009v2.settings.data;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.az0;
            import p000.b10;
            import p000.fm0;
            import p000.j13;
            import p000.j22;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ConsentDisclosure {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: i */
                public static final KSerializer[] f6391i = {null, new b10(j22.m5667a(ConsentDisclosureType.class), j13.m5647i(ConsentDisclosureType$$serializer.INSTANCE), new KSerializer[0]), null, null, null, new C0950gd(az0.f2143a, 0), null, null};

                /* JADX INFO: renamed from: a */
                public final String f6392a;

                /* JADX INFO: renamed from: b */
                public final ConsentDisclosureType f6393b;

                /* JADX INFO: renamed from: c */
                public final String f6394c;

                /* JADX INFO: renamed from: d */
                public final Long f6395d;

                /* JADX INFO: renamed from: e */
                public final boolean f6396e;

                /* JADX INFO: renamed from: f */
                public final List f6397f;

                /* JADX INFO: renamed from: g */
                public final String f6398g;

                /* JADX INFO: renamed from: h */
                public final String f6399h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentDisclosure$$serializer.INSTANCE;
                    }
                }

                public ConsentDisclosure(int i, String str, ConsentDisclosureType consentDisclosureType, String str2, Long l, boolean z, List list, String str3, String str4) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6392a = null;
                    } else {
/* 12 */                this.f6392a = str;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6393b = null;
                    } else {
/* 21 */                this.f6393b = consentDisclosureType;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6394c = null;
                    } else {
/* 30 */                this.f6394c = str2;
                    }
/* 34 */            if ((i & 8) == 0) {
/* 36 */                this.f6395d = null;
                    } else {
/* 39 */                this.f6395d = l;
                    }
/* 43 */            if ((i & 16) == 0) {
/* 46 */                this.f6396e = false;
                    } else {
/* 49 */                this.f6396e = z;
                    }
/* 53 */            if ((i & 32) == 0) {
/* 57 */                this.f6397f = nd0.f14189a;
                    } else {
/* 60 */                this.f6397f = list;
                    }
/* 64 */            if ((i & 64) == 0) {
/* 66 */                this.f6398g = null;
                    } else {
/* 69 */                this.f6398g = str3;
                    }
/* 73 */            if ((i & 128) == 0) {
/* 75 */                this.f6399h = null;
                    } else {
/* 78 */                this.f6399h = str4;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentDisclosure)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentDisclosure consentDisclosure = (ConsentDisclosure) obj;
                    return Intrinsics.m6216a(this.f6392a, consentDisclosure.f6392a) && this.f6393b == consentDisclosure.f6393b && Intrinsics.m6216a(this.f6394c, consentDisclosure.f6394c) && Intrinsics.m6216a(this.f6395d, consentDisclosure.f6395d) && this.f6396e == consentDisclosure.f6396e && Intrinsics.m6216a(this.f6397f, consentDisclosure.f6397f) && Intrinsics.m6216a(this.f6398g, consentDisclosure.f6398g) && Intrinsics.m6216a(this.f6399h, consentDisclosure.f6399h);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6392a;
/* 14 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 15 */            ConsentDisclosureType consentDisclosureType = this.f6393b;
/* 26 */            int iHashCode2 = (iHashCode + (consentDisclosureType == null ? 0 : consentDisclosureType.hashCode())) * 31;
/* 27 */            String str2 = this.f6394c;
/* 38 */            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 39 */            Long l = this.f6395d;
/* 59 */            int iM1861b = AbstractC0298j.m1861b(AbstractC0886en.m3504h((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f6396e), 31, this.f6397f);
/* 63 */            String str3 = this.f6398g;
/* 74 */            int iHashCode4 = (iM1861b + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 75 */            String str4 = this.f6399h;
/* 84 */            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ConsentDisclosure(identifier=");
/* 10 */            sb.append(this.f6392a);
/* 15 */            sb.append(", type=");
/* 20 */            sb.append(this.f6393b);
/* 25 */            sb.append(", name=");
/* 30 */            sb.append(this.f6394c);
/* 35 */            sb.append(", maxAgeSeconds=");
/* 40 */            sb.append(this.f6395d);
/* 45 */            sb.append(", cookieRefresh=");
/* 50 */            sb.append(this.f6396e);
/* 55 */            sb.append(", purposes=");
/* 60 */            sb.append(this.f6397f);
/* 65 */            sb.append(", domain=");
/* 76 */            return fm0.m3791q(sb, this.f6398g, ", description=", this.f6399h, ")");
                }
            }
