            package com.usercentrics.sdk.p009v2.consent.data;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ConsentsDataDto {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: h */
                public static final KSerializer[] f6307h = {null, null, null, null, null, new C0950gd(ConsentStatusDto$$serializer.INSTANCE, 0), null};

                /* JADX INFO: renamed from: a */
                public final String f6308a;

                /* JADX INFO: renamed from: b */
                public final String f6309b;

                /* JADX INFO: renamed from: c */
                public final long f6310c;

                /* JADX INFO: renamed from: d */
                public final String f6311d;

                /* JADX INFO: renamed from: e */
                public final String f6312e;

                /* JADX INFO: renamed from: f */
                public final List f6313f;

                /* JADX INFO: renamed from: g */
                public final String f6314g;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentsDataDto$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConsentsDataDto(int i, String str, String str2, long j, String str3, String str4, List list, String str5) {
/* 6 */             if (38 != (i & 38)) {
/* 60 */                b40.m1214E(i, 38, ConsentsDataDto$$serializer.INSTANCE.getDescriptor());
/* 63 */                throw null;
                    }
/* 13 */            if ((i & 1) == 0) {
/* 15 */                this.f6308a = null;
                    } else {
/* 18 */                this.f6308a = str;
                    }
/* 20 */            this.f6309b = str2;
/* 22 */            this.f6310c = j;
/* 26 */            if ((i & 8) == 0) {
/* 28 */                this.f6311d = null;
                    } else {
/* 31 */                this.f6311d = str3;
                    }
/* 35 */            if ((i & 16) == 0) {
/* 37 */                this.f6312e = null;
                    } else {
/* 40 */                this.f6312e = str4;
                    }
/* 42 */            this.f6313f = list;
/* 46 */            if ((i & 64) == 0) {
/* 48 */                this.f6314g = null;
                    } else {
/* 51 */                this.f6314g = str5;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentsDataDto)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentsDataDto consentsDataDto = (ConsentsDataDto) obj;
                    return Intrinsics.m6216a(this.f6308a, consentsDataDto.f6308a) && Intrinsics.m6216a(this.f6309b, consentsDataDto.f6309b) && this.f6310c == consentsDataDto.f6310c && Intrinsics.m6216a(this.f6311d, consentsDataDto.f6311d) && Intrinsics.m6216a(this.f6312e, consentsDataDto.f6312e) && Intrinsics.m6216a(this.f6313f, consentsDataDto.f6313f) && Intrinsics.m6216a(this.f6314g, consentsDataDto.f6314g);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6308a;
/* 28 */            int iHashCode = (Long.hashCode(this.f6310c) + pm2.m7485h((str == null ? 0 : str.hashCode()) * 31, 31, this.f6309b)) * 31;
/* 29 */            String str2 = this.f6311d;
/* 40 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 41 */            String str3 = this.f6312e;
/* 55 */            int iM1861b = AbstractC0298j.m1861b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f6313f);
/* 59 */            String str4 = this.f6314g;
/* 68 */            return iM1861b + (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("ConsentsDataDto(action=", this.f6308a, ", settingsVersion=", this.f6309b, ", timestampInMillis=");
/* 17 */            sbM3514r.append(this.f6310c);
/* 22 */            sbM3514r.append(", consentString=");
/* 27 */            sbM3514r.append(this.f6311d);
/* 32 */            sbM3514r.append(", consentMeta=");
/* 37 */            sbM3514r.append(this.f6312e);
/* 42 */            sbM3514r.append(", consents=");
/* 47 */            sbM3514r.append(this.f6313f);
/* 56 */            return fm0.m3790p(sbM3514r, ", acString=", this.f6314g, ")");
                }
            }
