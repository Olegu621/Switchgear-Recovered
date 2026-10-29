            package com.usercentrics.sdk.p009v2.settings.data;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.json.C1859c;
            import okhttp3.HttpUrl;
            import p000.C2122qw;
            import p000.a21;
            import p000.b21;
            import p000.b40;
            import p000.fm0;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class VariantsSettings {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final boolean f6752a;

                /* JADX INFO: renamed from: b */
                public final String f6753b;

                /* JADX INFO: renamed from: c */
                public final String f6754c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", HttpUrl.FRAGMENT_ENCODE_SET, "activateWithThirdParty", "Ljava/lang/String;", "activateWithUC", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return VariantsSettings$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ VariantsSettings(int i, String str, String str2, boolean z) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, VariantsSettings$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6752a = z;
/* 11 */            this.f6753b = str;
/* 13 */            this.f6754c = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v11 */
                /* JADX WARN: Type inference failed for: r2v2, types: [n42] */
                /* JADX WARN: Type inference failed for: r2v3 */
                /* JADX WARN: Type inference failed for: r2v4 */
                /* JADX WARN: Type inference failed for: r2v6 */
                /* JADX INFO: renamed from: a */
                public final List m2826a(a21 a21Var) {
                    ?? n42Var;
/* 1 */             a21Var.getClass();
                    try {
/* 4 */                 m42 m42Var = o42.f14612b;
/* 8 */                 KSerializer kSerializerSerializer = C1859c.Companion.serializer();
/* 24 */                Set setEntrySet = ((C1859c) b21.f2178a.m1198a(this.f6753b, kSerializerSerializer)).f12964a.entrySet();
/* 36 */                n42Var = new ArrayList(C2122qw.m8020h(setEntrySet, 10));
/* 39 */                Iterator it = setEntrySet.iterator();
/* 47 */                while (it.hasNext()) {
/* 61 */                    n42Var.add((String) ((Map.Entry) it.next()).getKey());
                        }
                    } catch (Throwable th) {
/* 66 */                m42 m42Var2 = o42.f14612b;
/* 70 */                n42Var = new n42(th);
                    }
/* 73 */            m42 m42Var3 = o42.f14612b;
/* 75 */            boolean z = n42Var instanceof n42;
                    ?? r2 = n42Var;
/* 77 */            if (z) {
/* 79 */                r2 = 0;
                    }
/* 80 */            return (List) r2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof VariantsSettings)) {
/* 7 */                 return false;
                    }
/* 11 */            VariantsSettings variantsSettings = (VariantsSettings) obj;
                    return this.f6752a == variantsSettings.f6752a && Intrinsics.m6216a(this.f6753b, variantsSettings.f6753b) && Intrinsics.m6216a(this.f6754c, variantsSettings.f6754c);
                }

                public final int hashCode() {
/* 22 */            return this.f6754c.hashCode() + pm2.m7485h(Boolean.hashCode(this.f6752a) * 31, 31, this.f6753b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VariantsSettings(enabled=");
/* 10 */            sb.append(this.f6752a);
/* 15 */            sb.append(", experimentsJson=");
/* 20 */            sb.append(this.f6753b);
/* 25 */            sb.append(", activateWith=");
/* 32 */            return fm0.m3789o(sb, this.f6754c, ")");
                }
            }
