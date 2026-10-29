            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.dj0;
            import p000.ej0;
            import p000.fj0;
            import p000.n82;
            import p000.oe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FirstLayer {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6429f = {null, new oe0("com.usercentrics.sdk.v2.settings.data.FirstLayerLogoPosition", ej0.values()), new oe0("com.usercentrics.sdk.v2.settings.data.SecondLayerTrigger", n82.values()), new oe0("com.usercentrics.sdk.v2.settings.data.FirstLayerCloseOption", dj0.values()), new oe0("com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant", fj0.values())};

                /* JADX INFO: renamed from: a */
                public final Boolean f6430a;

                /* JADX INFO: renamed from: b */
                public final ej0 f6431b;

                /* JADX INFO: renamed from: c */
                public final n82 f6432c;

                /* JADX INFO: renamed from: d */
                public final dj0 f6433d;

                /* JADX INFO: renamed from: e */
                public final fj0 f6434e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/FirstLayer$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return FirstLayer$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ FirstLayer(int i, Boolean bool, ej0 ej0Var, n82 n82Var, dj0 dj0Var, fj0 fj0Var) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6430a = null;
                    } else {
/* 12 */                this.f6430a = bool;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6431b = null;
                    } else {
/* 21 */                this.f6431b = ej0Var;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6432c = null;
                    } else {
/* 30 */                this.f6432c = n82Var;
                    }
/* 34 */            if ((i & 8) == 0) {
/* 36 */                this.f6433d = null;
                    } else {
/* 39 */                this.f6433d = dj0Var;
                    }
/* 43 */            if ((i & 16) == 0) {
/* 45 */                this.f6434e = null;
                    } else {
/* 48 */                this.f6434e = fj0Var;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof FirstLayer)) {
/* 7 */                 return false;
                    }
/* 11 */            FirstLayer firstLayer = (FirstLayer) obj;
                    return Intrinsics.m6216a(this.f6430a, firstLayer.f6430a) && this.f6431b == firstLayer.f6431b && this.f6432c == firstLayer.f6432c && this.f6433d == firstLayer.f6433d && this.f6434e == firstLayer.f6434e;
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f6430a;
/* 12 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 14 */            ej0 ej0Var = this.f6431b;
/* 25 */            int iHashCode2 = (iHashCode + (ej0Var == null ? 0 : ej0Var.hashCode())) * 31;
/* 27 */            n82 n82Var = this.f6432c;
/* 38 */            int iHashCode3 = (iHashCode2 + (n82Var == null ? 0 : n82Var.hashCode())) * 31;
/* 40 */            dj0 dj0Var = this.f6433d;
/* 51 */            int iHashCode4 = (iHashCode3 + (dj0Var == null ? 0 : dj0Var.hashCode())) * 31;
/* 53 */            fj0 fj0Var = this.f6434e;
/* 62 */            return iHashCode4 + (fj0Var != null ? fj0Var.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "FirstLayer(hideButtonDeny=" + this.f6430a + ", logoPosition=" + this.f6431b + ", secondLayerTrigger=" + this.f6432c + ", closeOption=" + this.f6433d + ", mobileVariant=" + this.f6434e + ")";
                }
            }
