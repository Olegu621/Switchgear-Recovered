            package p000;

            import android.hardware.camera2.params.DynamicRangeProfiles;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qb0 implements pb0 {

                /* JADX INFO: renamed from: a */
                public final DynamicRangeProfiles f15478a;

                public qb0(Object obj) {
/* 6 */             this.f15478a = (DynamicRangeProfiles) obj;
                }

                /* JADX INFO: renamed from: d */
                public static Set m7760d(Set set) {
/* 5 */             if (set.isEmpty()) {
/* 7 */                 return Collections.EMPTY_SET;
                    }
/* 16 */            HashSet hashSet = new HashSet(set.size());
/* 19 */            Iterator it = set.iterator();
/* 27 */            while (it.hasNext()) {
/* 33 */                Long l = (Long) it.next();
/* 35 */                long jLongValue = l.longValue();
/* 45 */                mb0 mb0Var = (mb0) nb0.f14175a.get(l);
/* 61 */                de3.m3027i(mb0Var, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
/* 64 */                hashSet.add(mb0Var);
                    }
/* 68 */            return Collections.unmodifiableSet(hashSet);
                }

                @Override // p000.pb0
                /* JADX INFO: renamed from: a */
                public final DynamicRangeProfiles mo7380a() {
/* 1 */             return this.f15478a;
                }

                @Override // p000.pb0
                /* JADX INFO: renamed from: b */
                public final Set mo7381b() {
/* 7 */             return m7760d(this.f15478a.getSupportedProfiles());
                }

                @Override // p000.pb0
                /* JADX INFO: renamed from: c */
                public final Set mo7382c(mb0 mb0Var) {
/* 3 */             Long lM6958a = nb0.m6958a(mb0Var, this.f15478a);
/* 26 */            de3.m3023e("DynamicRange is not supported: " + mb0Var, lM6958a != null);
/* 39 */            return m7760d(this.f15478a.getProfileCaptureRequestConstraints(lM6958a.longValue()));
                }
            }
