            package com.usercentrics.sdk.p009v2.consent.data;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.ArrayList;
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
            public final class SaveConsentsDto {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: q */
                public static final KSerializer[] f6336q = {null, null, null, null, null, null, null, null, new C0950gd(ConsentStatusDto$$serializer.INSTANCE, 0), null, null, null, null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final String f6337a;

                /* JADX INFO: renamed from: b */
                public final String f6338b;

                /* JADX INFO: renamed from: c */
                public final String f6339c;

                /* JADX INFO: renamed from: d */
                public final String f6340d;

                /* JADX INFO: renamed from: e */
                public final String f6341e;

                /* JADX INFO: renamed from: f */
                public final String f6342f;

                /* JADX INFO: renamed from: g */
                public final String f6343g;

                /* JADX INFO: renamed from: h */
                public final String f6344h;

                /* JADX INFO: renamed from: i */
                public final List f6345i;

                /* JADX INFO: renamed from: j */
                public final String f6346j;

                /* JADX INFO: renamed from: k */
                public final String f6347k;

                /* JADX INFO: renamed from: l */
                public final String f6348l;

                /* JADX INFO: renamed from: m */
                public final boolean f6349m;

                /* JADX INFO: renamed from: n */
                public final boolean f6350n;

                /* JADX INFO: renamed from: o */
                public final String f6351o;

                /* JADX INFO: renamed from: p */
                public final boolean f6352p;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SaveConsentsDto$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SaveConsentsDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, boolean z, boolean z2, String str12, boolean z3) {
                    if (32767 != (i & 32767)) {
                        b40.m1214E(i, 32767, SaveConsentsDto$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6337a = str;
                    this.f6338b = str2;
                    this.f6339c = str3;
                    this.f6340d = str4;
                    this.f6341e = str5;
                    this.f6342f = str6;
                    this.f6343g = str7;
                    this.f6344h = str8;
                    this.f6345i = list;
                    this.f6346j = str9;
                    this.f6347k = str10;
                    this.f6348l = str11;
                    this.f6349m = z;
                    this.f6350n = z2;
                    this.f6351o = str12;
                    this.f6352p = (i & 32768) == 0 ? false : z3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SaveConsentsDto)) {
/* 7 */                 return false;
                    }
/* 11 */            SaveConsentsDto saveConsentsDto = (SaveConsentsDto) obj;
                    return Intrinsics.m6216a(this.f6337a, saveConsentsDto.f6337a) && Intrinsics.m6216a(this.f6338b, saveConsentsDto.f6338b) && Intrinsics.m6216a(this.f6339c, saveConsentsDto.f6339c) && Intrinsics.m6216a(this.f6340d, saveConsentsDto.f6340d) && Intrinsics.m6216a(this.f6341e, saveConsentsDto.f6341e) && Intrinsics.m6216a(this.f6342f, saveConsentsDto.f6342f) && Intrinsics.m6216a(this.f6343g, saveConsentsDto.f6343g) && Intrinsics.m6216a(this.f6344h, saveConsentsDto.f6344h) && Intrinsics.m6216a(this.f6345i, saveConsentsDto.f6345i) && Intrinsics.m6216a(this.f6346j, saveConsentsDto.f6346j) && Intrinsics.m6216a(this.f6347k, saveConsentsDto.f6347k) && Intrinsics.m6216a(this.f6348l, saveConsentsDto.f6348l) && this.f6349m == saveConsentsDto.f6349m && this.f6350n == saveConsentsDto.f6350n && Intrinsics.m6216a(this.f6351o, saveConsentsDto.f6351o) && this.f6352p == saveConsentsDto.f6352p;
                }

                public final int hashCode() {
/* 100 */           return Boolean.hashCode(this.f6352p) + pm2.m7485h(AbstractC0886en.m3504h(AbstractC0886en.m3504h(pm2.m7485h(pm2.m7485h(pm2.m7485h(AbstractC0298j.m1861b(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(this.f6337a.hashCode() * 31, 31, this.f6338b), 31, this.f6339c), 31, this.f6340d), 31, this.f6341e), 31, this.f6342f), 31, this.f6343g), 31, this.f6344h), 31, this.f6345i), 31, this.f6346j), 31, this.f6347k), 31, this.f6348l), 31, this.f6349m), 31, this.f6350n), 31, this.f6351o);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("SaveConsentsDto(action=", this.f6337a, ", appVersion=", this.f6338b, ", controllerId=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6339c, ", language=", this.f6340d, ", settingsId=");
/* 34 */            fm0.m3796v(sbM3514r, this.f6341e, ", settingsVersion=", this.f6342f, ", consentString=");
/* 45 */            fm0.m3796v(sbM3514r, this.f6343g, ", consentMeta=", this.f6344h, ", consents=");
/* 50 */            sbM3514r.append(this.f6345i);
/* 55 */            sbM3514r.append(", bundleId=");
/* 60 */            sbM3514r.append(this.f6346j);
/* 65 */            sbM3514r.append(", sdkVersion=");
/* 76 */            fm0.m3796v(sbM3514r, this.f6347k, ", userOS=", this.f6348l, ", xdevice=");
/* 81 */            sbM3514r.append(this.f6349m);
/* 86 */            sbM3514r.append(", analytics=");
/* 91 */            sbM3514r.append(this.f6350n);
/* 96 */            sbM3514r.append(", acString=");
/* 101 */           sbM3514r.append(this.f6351o);
/* 106 */           sbM3514r.append(", webhook=");
/* 111 */           sbM3514r.append(this.f6352p);
/* 116 */           sbM3514r.append(")");
/* 119 */           return sbM3514r.toString();
                }

/* 1 */         public SaveConsentsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, String str10, boolean z, boolean z2, String str11, boolean z3) {
                    str3.getClass();
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str9.getClass();
/* 3 */             this.f6337a = str;
/* 4 */             this.f6338b = str2;
/* 5 */             this.f6339c = str3;
/* 6 */             this.f6340d = str4;
/* 7 */             this.f6341e = str5;
/* 8 */             this.f6342f = str6;
/* 9 */             this.f6343g = str7;
/* 10 */            this.f6344h = str8;
/* 11 */            this.f6345i = arrayList;
/* 12 */            this.f6346j = str9;
/* 13 */            this.f6347k = "2.24.4";
/* 14 */            this.f6348l = str10;
/* 15 */            this.f6349m = z;
/* 16 */            this.f6350n = z2;
/* 17 */            this.f6351o = str11;
/* 18 */            this.f6352p = z3;
                }
            }
