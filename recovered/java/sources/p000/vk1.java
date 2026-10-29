            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class vk1 {

                /* JADX INFO: renamed from: a */
                public final LinkedHashMap f18231a;

                /* JADX INFO: renamed from: b */
                public final gr0 f18232b;

                public vk1(LinkedHashMap linkedHashMap, boolean z) {
/* 4 */             this.f18231a = linkedHashMap;
/* 8 */             gr0 gr0Var = new gr0();
/* 16 */            gr0Var.f8789a = new AtomicBoolean(z);
/* 18 */            this.f18232b = gr0Var;
                }

                /* JADX INFO: renamed from: a */
                public final Map m9298a() {
                    Pair pair;
/* 3 */             Set<Map.Entry> setEntrySet = this.f18231a.entrySet();
/* 13 */            int iM6962c = nc1.m6962c(C2122qw.m8020h(setEntrySet, 10));
/* 19 */            if (iM6962c < 16) {
/* 21 */                iM6962c = 16;
                    }
/* 24 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 35 */            for (Map.Entry entry : setEntrySet) {
/* 43 */                Object value = entry.getValue();
/* 49 */                if (value instanceof byte[]) {
/* 57 */                    byte[] bArr = (byte[]) value;
/* 64 */                    pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
                        } else {
/* 78 */                    pair = new Pair(entry.getKey(), entry.getValue());
                        }
/* 85 */                linkedHashMap.put(pair.f12908a, pair.f12909b);
                    }
/* 89 */            Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
/* 93 */            mapUnmodifiableMap.getClass();
/* 96 */            return mapUnmodifiableMap;
                }

                /* JADX INFO: renamed from: b */
                public final void m9299b() {
/* 11 */            if (((AtomicBoolean) this.f18232b.f8789a).get()) {
/* 16 */                f42.m3656l("Do mutate preferences once returned to DataStore.");
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m9300c(iw1 iw1Var) {
/* 1 */             iw1Var.getClass();
/* 6 */             Object obj = this.f18231a.get(iw1Var);
/* 12 */            if (!(obj instanceof byte[])) {
/* 21 */                return obj;
                    }
/* 14 */            byte[] bArr = (byte[]) obj;
/* 17 */            return Arrays.copyOf(bArr, bArr.length);
                }

                /* JADX INFO: renamed from: d */
                public final void m9301d(iw1 iw1Var, Object obj) {
/* 1 */             iw1Var.getClass();
/* 4 */             m9299b();
/* 7 */             LinkedHashMap linkedHashMap = this.f18231a;
/* 9 */             if (obj == null) {
/* 11 */                m9299b();
/* 14 */                linkedHashMap.remove(iw1Var);
                    } else if (obj instanceof Set) {
/* 28 */                Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.m6195N((Set) obj));
/* 32 */                setUnmodifiableSet.getClass();
/* 35 */                linkedHashMap.put(iw1Var, setUnmodifiableSet);
                    } else if (!(obj instanceof byte[])) {
/* 54 */                linkedHashMap.put(iw1Var, obj);
                    } else {
/* 43 */                byte[] bArr = (byte[]) obj;
/* 50 */                linkedHashMap.put(iw1Var, Arrays.copyOf(bArr, bArr.length));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:27:0x005d  */
                public final boolean equals(Object obj) {
                    boolean zM6216a;
/* 4 */             if (obj instanceof vk1) {
/* 9 */                 LinkedHashMap linkedHashMap = ((vk1) obj).f18231a;
/* 11 */                LinkedHashMap linkedHashMap2 = this.f18231a;
/* 14 */                if (linkedHashMap != linkedHashMap2) {
/* 25 */                    if (linkedHashMap.size() == linkedHashMap2.size()) {
/* 32 */                        if (!linkedHashMap.isEmpty()) {
/* 47 */                            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 59 */                                Object obj2 = linkedHashMap2.get(entry.getKey());
/* 63 */                                if (obj2 != null) {
/* 65 */                                    Object value = entry.getValue();
/* 71 */                                    if (!(value instanceof byte[])) {
/* 89 */                                        zM6216a = Intrinsics.m6216a(value, obj2);
                                            } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
/* 87 */                                        zM6216a = true;
                                            } else {
/* 94 */                                        zM6216a = false;
                                            }
                                        } else {
/* 94 */                                    zM6216a = false;
                                        }
/* 95 */                                if (!zM6216a) {
                                        }
                                    }
                                }
                            }
                        }
/* 13 */                return true;
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 7 */             Iterator it = this.f18231a.entrySet().iterator();
/* 11 */            int iHashCode = 0;
/* 16 */            while (it.hasNext()) {
/* 24 */                Object value = ((Map.Entry) it.next()).getValue();
/* 43 */                iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
                    }
/* 45 */            return iHashCode;
                }

                public final String toString() {
/* 17 */            return CollectionsKt.m6203x(this.f18231a.entrySet(), ",\n", "{\n", "\n}", C0170b7.f2277v, 24);
                }

/* 20 */        public /* synthetic */ vk1(boolean z) {
/* 22 */            this(new LinkedHashMap(), z);
                }
            }
