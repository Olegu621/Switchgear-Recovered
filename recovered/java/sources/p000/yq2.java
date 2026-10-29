            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yq2 {

                /* JADX INFO: renamed from: a */
                public final String f19756a;

                /* JADX INFO: renamed from: b */
                public final String f19757b;

                /* JADX INFO: renamed from: c */
                public final HashMap f19758c;

                /* JADX INFO: renamed from: d */
                public final fs0 f19759d;

                /* JADX INFO: renamed from: e */
                public final ArrayList f19760e;

                /* JADX INFO: renamed from: f */
                public final UUID f19761f;

                /* JADX INFO: renamed from: g */
                public final long f19762g;

                /* JADX INFO: renamed from: h */
                public final boolean f19763h;

                /* JADX INFO: renamed from: i */
                public final boolean f19764i;

                public yq2(AbstractC1812k abstractC1812k, fs0 fs0Var) {
/* 4 */             UUID uuidRandomUUID = UUID.randomUUID();
/* 8 */             uuidRandomUUID.getClass();
/* 11 */            this.f19761f = uuidRandomUUID;
/* 17 */            this.f19762g = System.currentTimeMillis();
/* 25 */            this.f19760e = CollectionsKt.m6194M(abstractC1812k.f12550a);
/* 40 */            this.f19758c = new HashMap(oc1.m7134h(abstractC1812k.mo104c()));
/* 42 */            this.f19759d = fs0Var;
/* 46 */            this.f19764i = abstractC1812k instanceof xq2;
/* 50 */            if (abstractC1812k instanceof fi2) {
/* 54 */                this.f19757b = "se";
/* 57 */                this.f19763h = true;
                    } else {
/* 68 */                AbstractC1910m0 abstractC1910m0 = abstractC1812k instanceof AbstractC1910m0 ? (AbstractC1910m0) abstractC1812k : null;
/* 75 */                this.f19756a = abstractC1910m0 != null ? abstractC1910m0.mo105d() : null;
/* 78 */                this.f19763h = false;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final List m10169a() {
/* 1 */             ArrayList arrayList = this.f19760e;
/* 3 */             if (arrayList != null) {
/* 5 */                 return arrayList;
                    }
/* 8 */             Intrinsics.m6220e("entities");
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public final Map m10170b() {
/* 1 */             HashMap map = this.f19758c;
/* 3 */             if (map != null) {
/* 5 */                 return map;
                    }
/* 8 */             Intrinsics.m6220e("payload");
/* 12 */            throw null;
                }
            }
