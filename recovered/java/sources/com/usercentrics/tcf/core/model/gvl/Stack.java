            package com.usercentrics.tcf.core.model.gvl;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.az0;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Stack {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6825f;

                /* JADX INFO: renamed from: a */
                public final List f6826a;

                /* JADX INFO: renamed from: b */
                public final List f6827b;

                /* JADX INFO: renamed from: c */
                public final String f6828c;

                /* JADX INFO: renamed from: d */
                public final int f6829d;

                /* JADX INFO: renamed from: e */
                public final String f6830e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/Stack$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/Stack;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return Stack$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            az0 az0Var = az0.f2143a;
/* 39 */            f6825f = new KSerializer[]{new C0950gd(az0Var, 0), new C0950gd(az0Var, 0), null, null, null};
                }

                public /* synthetic */ Stack(int i, int i2, String str, String str2, List list, List list2) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, Stack$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6826a = list;
/* 12 */            this.f6827b = list2;
/* 14 */            this.f6828c = str;
/* 16 */            this.f6829d = i2;
/* 18 */            this.f6830e = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Stack)) {
/* 7 */                 return false;
                    }
/* 11 */            Stack stack = (Stack) obj;
                    return Intrinsics.m6216a(this.f6826a, stack.f6826a) && Intrinsics.m6216a(this.f6827b, stack.f6827b) && Intrinsics.m6216a(this.f6828c, stack.f6828c) && this.f6829d == stack.f6829d && Intrinsics.m6216a(this.f6830e, stack.f6830e);
                }

                public final int hashCode() {
/* 34 */            return this.f6830e.hashCode() + AbstractC0298j.m1860a(this.f6829d, pm2.m7485h(AbstractC0298j.m1861b(this.f6826a.hashCode() * 31, 31, this.f6827b), 31, this.f6828c), 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Stack(purposes=");
/* 10 */            sb.append(this.f6826a);
/* 15 */            sb.append(", specialFeatures=");
/* 20 */            sb.append(this.f6827b);
/* 25 */            sb.append(", description=");
/* 30 */            sb.append(this.f6828c);
/* 35 */            sb.append(", id=");
/* 40 */            sb.append(this.f6829d);
/* 45 */            sb.append(", name=");
/* 52 */            return fm0.m3789o(sb, this.f6830e, ")");
                }
            }
