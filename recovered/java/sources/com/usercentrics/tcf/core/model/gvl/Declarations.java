            package com.usercentrics.tcf.core.model.gvl;

            import java.util.Map;
            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.rt0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Declarations {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: g */
                public static final KSerializer[] f6801g;

                /* JADX INFO: renamed from: a */
                public final Map f6802a;

                /* JADX INFO: renamed from: b */
                public final Map f6803b;

                /* JADX INFO: renamed from: c */
                public final Map f6804c;

                /* JADX INFO: renamed from: d */
                public final Map f6805d;

                /* JADX INFO: renamed from: e */
                public final Map f6806e;

                /* JADX INFO: renamed from: f */
                public final Map f6807f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/Declarations$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/Declarations;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return Declarations$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 12 */            Purpose$$serializer purpose$$serializer = Purpose$$serializer.INSTANCE;
/* 15 */            rt0 rt0Var = new rt0(vh2Var, purpose$$serializer, 1);
/* 20 */            rt0 rt0Var2 = new rt0(vh2Var, purpose$$serializer, 1);
/* 25 */            Feature$$serializer feature$$serializer = Feature$$serializer.INSTANCE;
/* 69 */            f6801g = new KSerializer[]{rt0Var, rt0Var2, new rt0(vh2Var, feature$$serializer, 1), new rt0(vh2Var, feature$$serializer, 1), new rt0(vh2Var, Stack$$serializer.INSTANCE, 1), new rt0(vh2Var, DataCategory$$serializer.INSTANCE, 1)};
                }

                public /* synthetic */ Declarations(int i, Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6802a = null;
                    } else {
/* 12 */                this.f6802a = map;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6803b = null;
                    } else {
/* 21 */                this.f6803b = map2;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6804c = null;
                    } else {
/* 30 */                this.f6804c = map3;
                    }
/* 34 */            if ((i & 8) == 0) {
/* 36 */                this.f6805d = null;
                    } else {
/* 39 */                this.f6805d = map4;
                    }
/* 43 */            if ((i & 16) == 0) {
/* 45 */                this.f6806e = null;
                    } else {
/* 48 */                this.f6806e = map5;
                    }
/* 52 */            if ((i & 32) == 0) {
/* 54 */                this.f6807f = null;
                    } else {
/* 57 */                this.f6807f = map6;
                    }
                }
            }
