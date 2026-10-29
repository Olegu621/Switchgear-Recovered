            package com.usercentrics.sdk.p009v2.translation.data;

            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.rt0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LegalBasisLocalization {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6756d;

                /* JADX INFO: renamed from: a */
                public final TranslationLabelsDto f6757a;

                /* JADX INFO: renamed from: b */
                public final TranslationAriaLabels f6758b;

                /* JADX INFO: renamed from: c */
                public final Map f6759c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return LegalBasisLocalization$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 28 */            f6756d = new KSerializer[]{null, null, new rt0(vh2Var, vh2Var, 1)};
                }

                public /* synthetic */ LegalBasisLocalization(int i, TranslationLabelsDto translationLabelsDto, TranslationAriaLabels translationAriaLabels, Map map) {
/* 5 */             if (1 != (i & 1)) {
/* 37 */                b40.m1214E(i, 1, LegalBasisLocalization$$serializer.INSTANCE.getDescriptor());
/* 40 */                throw null;
                    }
/* 10 */            this.f6757a = translationLabelsDto;
/* 14 */            if ((i & 2) == 0) {
/* 16 */                this.f6758b = null;
                    } else {
/* 19 */                this.f6758b = translationAriaLabels;
                    }
/* 23 */            if ((i & 4) == 0) {
/* 25 */                this.f6759c = null;
                    } else {
/* 28 */                this.f6759c = map;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof LegalBasisLocalization)) {
/* 7 */                 return false;
                    }
/* 11 */            LegalBasisLocalization legalBasisLocalization = (LegalBasisLocalization) obj;
                    return Intrinsics.m6216a(this.f6757a, legalBasisLocalization.f6757a) && Intrinsics.m6216a(this.f6758b, legalBasisLocalization.f6758b) && Intrinsics.m6216a(this.f6759c, legalBasisLocalization.f6759c);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f6757a.hashCode() * 31;
/* 10 */            TranslationAriaLabels translationAriaLabels = this.f6758b;
/* 21 */            int iHashCode2 = (iHashCode + (translationAriaLabels == null ? 0 : translationAriaLabels.hashCode())) * 31;
/* 23 */            Map map = this.f6759c;
/* 32 */            return iHashCode2 + (map != null ? map.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "LegalBasisLocalization(labels=" + this.f6757a + ", labelsAria=" + this.f6758b + ", data=" + this.f6759c + ")";
                }
            }
