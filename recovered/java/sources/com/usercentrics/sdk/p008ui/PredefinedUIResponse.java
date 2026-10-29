            package com.usercentrics.sdk.p008ui;

            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.sdk.UsercentricsServiceConsent$$serializer;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.av1;
            import p000.b10;
            import p000.b40;
            import p000.fm0;
            import p000.j22;
            import p000.oe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class PredefinedUIResponse {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6232d = {new b10(j22.m5667a(av1.class), new oe0("com.usercentrics.sdk.ui.PredefinedUIInteraction", av1.values()), new KSerializer[0]), new C0950gd(UsercentricsServiceConsent$$serializer.INSTANCE, 0), null};

                /* JADX INFO: renamed from: a */
                public final av1 f6233a;

                /* JADX INFO: renamed from: b */
                public final List f6234b;

                /* JADX INFO: renamed from: c */
                public final String f6235c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/PredefinedUIResponse$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/ui/PredefinedUIResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return PredefinedUIResponse$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ PredefinedUIResponse(int i, av1 av1Var, List list, String str) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, PredefinedUIResponse$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6233a = av1Var;
/* 11 */            this.f6234b = list;
/* 13 */            this.f6235c = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof PredefinedUIResponse)) {
/* 7 */                 return false;
                    }
/* 11 */            PredefinedUIResponse predefinedUIResponse = (PredefinedUIResponse) obj;
                    return this.f6233a == predefinedUIResponse.f6233a && Intrinsics.m6216a(this.f6234b, predefinedUIResponse.f6234b) && Intrinsics.m6216a(this.f6235c, predefinedUIResponse.f6235c);
                }

                public final int hashCode() {
/* 22 */            return this.f6235c.hashCode() + AbstractC0298j.m1861b(this.f6233a.hashCode() * 31, 31, this.f6234b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PredefinedUIResponse(userInteraction=");
/* 10 */            sb.append(this.f6233a);
/* 15 */            sb.append(", consents=");
/* 20 */            sb.append(this.f6234b);
/* 25 */            sb.append(", controllerId=");
/* 32 */            return fm0.m3789o(sb, this.f6235c, ")");
                }

/* 26 */        public PredefinedUIResponse(av1 av1Var, ArrayList arrayList, String str) {
                    str.getClass();
/* 28 */            this.f6233a = av1Var;
/* 29 */            this.f6234b = arrayList;
/* 30 */            this.f6235c = str;
                }
            }
