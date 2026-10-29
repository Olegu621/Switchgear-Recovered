            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UsercentricsCategory {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6533a;

                /* JADX INFO: renamed from: b */
                public final String f6534b;

                /* JADX INFO: renamed from: c */
                public final String f6535c;

                /* JADX INFO: renamed from: d */
                public final boolean f6536d;

                /* JADX INFO: renamed from: e */
                public final boolean f6537e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsCategory$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsCategory(int i, String str, String str2, String str3, boolean z, boolean z2) {
/* 5 */             if (1 != (i & 1)) {
/* 58 */                b40.m1214E(i, 1, UsercentricsCategory$$serializer.INSTANCE.getDescriptor());
/* 61 */                throw null;
                    }
/* 10 */            this.f6533a = str;
/* 14 */            if ((i & 2) == 0) {
/* 18 */                this.f6534b = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 21 */                this.f6534b = str2;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6535c = null;
                    } else {
/* 30 */                this.f6535c = str3;
                    }
/* 35 */            if ((i & 8) == 0) {
/* 37 */                this.f6536d = false;
                    } else {
/* 40 */                this.f6536d = z;
                    }
/* 44 */            if ((i & 16) == 0) {
/* 46 */                this.f6537e = false;
                    } else {
/* 49 */                this.f6537e = z2;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsCategory)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsCategory usercentricsCategory = (UsercentricsCategory) obj;
                    return Intrinsics.m6216a(this.f6533a, usercentricsCategory.f6533a) && Intrinsics.m6216a(this.f6534b, usercentricsCategory.f6534b) && Intrinsics.m6216a(this.f6535c, usercentricsCategory.f6535c) && this.f6536d == usercentricsCategory.f6536d && this.f6537e == usercentricsCategory.f6537e;
                }

                public final int hashCode() {
/* 12 */            int iM7485h = pm2.m7485h(this.f6533a.hashCode() * 31, 31, this.f6534b);
/* 16 */            String str = this.f6535c;
/* 40 */            return Boolean.hashCode(this.f6537e) + AbstractC0886en.m3504h((iM7485h + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6536d);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("UsercentricsCategory(categorySlug=", this.f6533a, ", label=", this.f6534b, ", description=");
/* 17 */            sbM3514r.append(this.f6535c);
/* 22 */            sbM3514r.append(", isEssential=");
/* 27 */            sbM3514r.append(this.f6536d);
/* 32 */            sbM3514r.append(", isHidden=");
/* 39 */            return AbstractC0886en.m3511o(sbM3514r, this.f6537e, ")");
                }
            }
