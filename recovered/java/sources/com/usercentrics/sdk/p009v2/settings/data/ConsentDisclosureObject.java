            package com.usercentrics.sdk.p009v2.settings.data;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class ConsentDisclosureObject {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: b */
                public static final KSerializer[] f6400b = {new C0950gd(ConsentDisclosure$$serializer.INSTANCE, 0)};

                /* JADX INFO: renamed from: a */
                public final List f6401a;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentDisclosureObject$$serializer.INSTANCE;
                    }
                }

                public ConsentDisclosureObject(int i, List list) {
/* 6 */             if ((i & 1) == 0) {
/* 10 */                this.f6401a = nd0.f14189a;
                    } else {
/* 13 */                this.f6401a = list;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof ConsentDisclosureObject) && Intrinsics.m6216a(this.f6401a, ((ConsentDisclosureObject) obj).f6401a);
                }

                public final int hashCode() {
/* 3 */             return this.f6401a.hashCode();
                }

                public final String toString() {
/* 18 */            return "ConsentDisclosureObject(disclosures=" + this.f6401a + ")";
                }

/* 15 */        public ConsentDisclosureObject() {
/* 16 */            nd0 nd0Var = nd0.f14189a;
/* 17 */            nd0Var.getClass();
/* 19 */            this.f6401a = nd0Var;
                }
            }
