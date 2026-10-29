            package com.usercentrics.sdk.services.tcf.interfaces;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class IdAndName {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final int f6157a;

                /* JADX INFO: renamed from: b */
                public final String f6158b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return IdAndName$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ IdAndName(int i, int i2, String str) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, IdAndName$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6157a = i2;
/* 11 */            this.f6158b = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IdAndName)) {
/* 7 */                 return false;
                    }
/* 11 */            IdAndName idAndName = (IdAndName) obj;
                    return this.f6157a == idAndName.f6157a && Intrinsics.m6216a(this.f6158b, idAndName.f6158b);
                }

                public final int hashCode() {
/* 15 */            return this.f6158b.hashCode() + (Integer.hashCode(this.f6157a) * 31);
                }

                public final String toString() {
/* 28 */            return "IdAndName(id=" + this.f6157a + ", name=" + this.f6158b + ")";
                }

/* 24 */        public IdAndName(int i, String str) {
                    str.getClass();
/* 26 */            this.f6157a = i;
/* 27 */            this.f6158b = str;
                }
            }
