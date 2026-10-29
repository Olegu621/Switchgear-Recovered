            package com.usercentrics.tcf.core.model.gvl;

            import java.util.ArrayList;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.az0;
            import p000.b40;
            import p000.oc1;
            import p000.od0;
            import p000.rt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class RetentionPeriod {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: b */
                public static final KSerializer[] f6823b;

                /* JADX INFO: renamed from: a */
                public final Map f6824a;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    /* JADX WARN: Code duplicated, block: B:9:0x0040  */
                    /* JADX INFO: renamed from: a */
                    public static RetentionPeriod m2827a(Map map) {
                        Map mapM7133g;
/* 1 */                 if (map != null) {
/* 9 */                     ArrayList arrayList = new ArrayList(map.size());
/* 24 */                    for (Map.Entry entry : map.entrySet()) {
/* 55 */                        arrayList.add(new Pair(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue()));
                            }
/* 59 */                    mapM7133g = oc1.m7133g(arrayList);
/* 63 */                    if (mapM7133g == null) {
/* 65 */                        mapM7133g = od0.f14715a;
/* 67 */                        mapM7133g.getClass();
                            }
                        } else {
/* 65 */                    mapM7133g = od0.f14715a;
/* 67 */                    mapM7133g.getClass();
                        }
/* 72 */                return new RetentionPeriod(mapM7133g);
                    }

                    public final KSerializer serializer() {
/* 1 */                 return RetentionPeriod$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            az0 az0Var = az0.f2143a;
/* 21 */            f6823b = new KSerializer[]{new rt0(az0Var, az0Var, 1)};
                }

                public /* synthetic */ RetentionPeriod(int i, Map map) {
/* 4 */             if (1 == (i & 1)) {
/* 9 */                 this.f6824a = map;
                    } else {
/* 18 */                b40.m1214E(i, 1, RetentionPeriod$$serializer.INSTANCE.getDescriptor());
/* 22 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof RetentionPeriod) && Intrinsics.m6216a(this.f6824a, ((RetentionPeriod) obj).f6824a);
                }

                public final int hashCode() {
/* 3 */             return this.f6824a.hashCode();
                }

                public final String toString() {
/* 18 */            return "RetentionPeriod(idAndPeriod=" + this.f6824a + ")";
                }

/* 22 */        public RetentionPeriod(Map map) {
/* 24 */            this.f6824a = map;
                }
            }
