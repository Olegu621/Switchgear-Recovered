            package com.usercentrics.sdk.p009v2.language.data;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.nd0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LanguageData {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6353c;

                /* JADX INFO: renamed from: a */
                public final List f6354a;

                /* JADX INFO: renamed from: b */
                public final List f6355b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/language/data/LanguageData$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/language/data/LanguageData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return LanguageData$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 29 */            f6353c = new KSerializer[]{new C0950gd(vh2Var, 0), new C0950gd(vh2Var, 0)};
                }

                public LanguageData(int i, List list, List list2) {
/* 10 */            this.f6354a = (i & 1) == 0 ? nd0.f14189a : list;
/* 14 */            if ((i & 2) == 0) {
/* 18 */                this.f6355b = nd0.f14189a;
                    } else {
/* 21 */                this.f6355b = list2;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof LanguageData)) {
/* 7 */                 return false;
                    }
/* 11 */            LanguageData languageData = (LanguageData) obj;
                    return Intrinsics.m6216a(this.f6354a, languageData.f6354a) && Intrinsics.m6216a(this.f6355b, languageData.f6355b);
                }

                public final int hashCode() {
/* 15 */            return this.f6355b.hashCode() + (this.f6354a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "LanguageData(languagesAvailable=" + this.f6354a + ", editableLanguages=" + this.f6355b + ")";
                }
            }
