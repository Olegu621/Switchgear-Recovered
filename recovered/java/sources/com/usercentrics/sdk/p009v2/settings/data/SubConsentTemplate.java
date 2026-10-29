            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.InterfaceC0972gz;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SubConsentTemplate implements InterfaceC0972gz {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final Boolean f6458a;

                /* JADX INFO: renamed from: b */
                public final Boolean f6459b;

                /* JADX INFO: renamed from: c */
                public final String f6460c;

                /* JADX INFO: renamed from: d */
                public final String f6461d;

                /* JADX INFO: renamed from: e */
                public final String f6462e;

                /* JADX INFO: renamed from: f */
                public final String f6463f;

                /* JADX INFO: renamed from: g */
                public final boolean f6464g;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SubConsentTemplate$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SubConsentTemplate(int i, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, boolean z) {
/* 6 */             if (76 != (i & 76)) {
/* 60 */                b40.m1214E(i, 76, SubConsentTemplate$$serializer.INSTANCE.getDescriptor());
/* 63 */                throw null;
                    }
/* 13 */            if ((i & 1) == 0) {
/* 15 */                this.f6458a = null;
                    } else {
/* 18 */                this.f6458a = bool;
                    }
/* 22 */            if ((i & 2) == 0) {
/* 24 */                this.f6459b = null;
                    } else {
/* 27 */                this.f6459b = bool2;
                    }
/* 29 */            this.f6460c = str;
/* 31 */            this.f6461d = str2;
/* 35 */            if ((i & 16) == 0) {
/* 37 */                this.f6462e = null;
                    } else {
/* 40 */                this.f6462e = str3;
                    }
/* 44 */            if ((i & 32) == 0) {
/* 46 */                this.f6463f = null;
                    } else {
/* 49 */                this.f6463f = str4;
                    }
/* 51 */            this.f6464g = z;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: a */
                public final boolean mo2820a() {
/* 1 */             return this.f6464g;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: b */
                public final String mo2821b() {
/* 1 */             return this.f6460c;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: c */
                public final String mo2822c() {
/* 1 */             return this.f6462e;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: d */
                public final Boolean mo2823d() {
/* 1 */             return this.f6458a;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: e */
                public final String mo2824e() {
/* 1 */             return this.f6461d;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SubConsentTemplate)) {
/* 7 */                 return false;
                    }
/* 11 */            SubConsentTemplate subConsentTemplate = (SubConsentTemplate) obj;
                    return Intrinsics.m6216a(this.f6458a, subConsentTemplate.f6458a) && Intrinsics.m6216a(this.f6459b, subConsentTemplate.f6459b) && Intrinsics.m6216a(this.f6460c, subConsentTemplate.f6460c) && Intrinsics.m6216a(this.f6461d, subConsentTemplate.f6461d) && Intrinsics.m6216a(this.f6462e, subConsentTemplate.f6462e) && Intrinsics.m6216a(this.f6463f, subConsentTemplate.f6463f) && this.f6464g == subConsentTemplate.f6464g;
                }

                @Override // p000.InterfaceC0972gz
                public final String getDescription() {
/* 1 */             return this.f6463f;
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f6458a;
/* 14 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 15 */            Boolean bool2 = this.f6459b;
/* 35 */            int iM7485h = pm2.m7485h(pm2.m7485h((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f6460c), 31, this.f6461d);
/* 39 */            String str = this.f6462e;
/* 50 */            int iHashCode2 = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 51 */            String str2 = this.f6463f;
/* 68 */            return Boolean.hashCode(this.f6464g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SubConsentTemplate(isDeactivated=");
/* 10 */            sb.append(this.f6458a);
/* 15 */            sb.append(", defaultConsentStatus=");
/* 20 */            sb.append(this.f6459b);
/* 25 */            sb.append(", templateId=");
/* 36 */            fm0.m3796v(sb, this.f6460c, ", version=", this.f6461d, ", categorySlug=");
/* 47 */            fm0.m3796v(sb, this.f6462e, ", description=", this.f6463f, ", isHidden=");
/* 54 */            return AbstractC0886en.m3511o(sb, this.f6464g, ")");
                }
            }
