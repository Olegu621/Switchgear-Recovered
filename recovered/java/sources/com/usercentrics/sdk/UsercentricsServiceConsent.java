            package com.usercentrics.sdk;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b10;
            import p000.b40;
            import p000.fm0;
            import p000.j13;
            import p000.j22;
            import p000.mz2;
            import p000.oe0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public final class UsercentricsServiceConsent {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: i */
                public static final KSerializer[] f6063i = {null, null, new C0950gd(UsercentricsConsentHistoryEntry$$serializer.INSTANCE, 0), new b10(j22.m5667a(mz2.class), j13.m5647i(new oe0("com.usercentrics.sdk.models.settings.UsercentricsConsentType", mz2.values())), new KSerializer[0]), null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final String f6064a;

                /* JADX INFO: renamed from: b */
                public final boolean f6065b;

                /* JADX INFO: renamed from: c */
                public final List f6066c;

                /* JADX INFO: renamed from: d */
                public final mz2 f6067d;

                /* JADX INFO: renamed from: e */
                public final String f6068e;

                /* JADX INFO: renamed from: f */
                public final String f6069f;

                /* JADX INFO: renamed from: g */
                public final boolean f6070g;

                /* JADX INFO: renamed from: h */
                public final String f6071h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UsercentricsServiceConsent$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsServiceConsent$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsServiceConsent(int i, String str, boolean z, List list, mz2 mz2Var, String str2, String str3, boolean z2, String str4) {
/* 5 */             if (255 != (i & 255)) {
/* 33 */                b40.m1214E(i, 255, UsercentricsServiceConsent$$serializer.INSTANCE.getDescriptor());
/* 37 */                throw null;
                    }
/* 10 */            this.f6064a = str;
/* 12 */            this.f6065b = z;
/* 14 */            this.f6066c = list;
/* 16 */            this.f6067d = mz2Var;
/* 18 */            this.f6068e = str2;
/* 20 */            this.f6069f = str3;
/* 22 */            this.f6070g = z2;
/* 24 */            this.f6071h = str4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsServiceConsent)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsServiceConsent usercentricsServiceConsent = (UsercentricsServiceConsent) obj;
                    return Intrinsics.m6216a(this.f6064a, usercentricsServiceConsent.f6064a) && this.f6065b == usercentricsServiceConsent.f6065b && Intrinsics.m6216a(this.f6066c, usercentricsServiceConsent.f6066c) && this.f6067d == usercentricsServiceConsent.f6067d && Intrinsics.m6216a(this.f6068e, usercentricsServiceConsent.f6068e) && Intrinsics.m6216a(this.f6069f, usercentricsServiceConsent.f6069f) && this.f6070g == usercentricsServiceConsent.f6070g && Intrinsics.m6216a(this.f6071h, usercentricsServiceConsent.f6071h);
                }

                public final int hashCode() {
/* 18 */            int iM1861b = AbstractC0298j.m1861b(AbstractC0886en.m3504h(this.f6064a.hashCode() * 31, 31, this.f6065b), 31, this.f6066c);
/* 22 */            mz2 mz2Var = this.f6067d;
/* 58 */            return this.f6071h.hashCode() + AbstractC0886en.m3504h(pm2.m7485h(pm2.m7485h((iM1861b + (mz2Var == null ? 0 : mz2Var.hashCode())) * 31, 31, this.f6068e), 31, this.f6069f), 31, this.f6070g);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsServiceConsent(templateId=");
/* 10 */            sb.append(this.f6064a);
/* 15 */            sb.append(", status=");
/* 20 */            sb.append(this.f6065b);
/* 25 */            sb.append(", history=");
/* 30 */            sb.append(this.f6066c);
/* 35 */            sb.append(", type=");
/* 40 */            sb.append(this.f6067d);
/* 45 */            sb.append(", dataProcessor=");
/* 56 */            fm0.m3796v(sb, this.f6068e, ", version=", this.f6069f, ", isEssential=");
/* 61 */            sb.append(this.f6070g);
/* 66 */            sb.append(", category=");
/* 71 */            sb.append(this.f6071h);
/* 76 */            sb.append(")");
/* 79 */            return sb.toString();
                }

/* 37 */        public UsercentricsServiceConsent(String str, boolean z, ArrayList arrayList, mz2 mz2Var, String str2, String str3, boolean z2, String str4) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
/* 39 */            this.f6064a = str;
/* 40 */            this.f6065b = z;
/* 41 */            this.f6066c = arrayList;
/* 42 */            this.f6067d = mz2Var;
/* 43 */            this.f6068e = str2;
/* 44 */            this.f6069f = str3;
/* 45 */            this.f6070g = z2;
/* 46 */            this.f6071h = str4;
                }
            }
