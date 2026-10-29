            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.collections.IndexedValue;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class aa2 implements SerialDescriptor, InterfaceC1895lm {

                /* JADX INFO: renamed from: a */
                public final String f143a;

                /* JADX INFO: renamed from: b */
                public final py0 f144b;

                /* JADX INFO: renamed from: c */
                public final int f145c;

                /* JADX INFO: renamed from: d */
                public final List f146d;

                /* JADX INFO: renamed from: e */
                public final HashSet f147e;

                /* JADX INFO: renamed from: f */
                public final String[] f148f;

                /* JADX INFO: renamed from: g */
                public final SerialDescriptor[] f149g;

                /* JADX INFO: renamed from: h */
                public final List[] f150h;

                /* JADX INFO: renamed from: i */
                public final Map f151i;

                /* JADX INFO: renamed from: j */
                public final SerialDescriptor[] f152j;

                /* JADX INFO: renamed from: k */
                public final hk2 f153k;

                public aa2(String str, py0 py0Var, int i, List list, C0894ev c0894ev) {
/* 1 */             list.getClass();
/* 7 */             this.f143a = str;
/* 9 */             this.f144b = py0Var;
/* 11 */            this.f145c = i;
/* 15 */            this.f146d = c0894ev.f7886a;
/* 17 */            ArrayList arrayList = c0894ev.f7887b;
/* 23 */            this.f147e = CollectionsKt.m6190I(arrayList);
/* 25 */            int i2 = 0;
/* 28 */            Object[] array = arrayList.toArray(new String[0]);
/* 32 */            array.getClass();
/* 37 */            this.f148f = (String[]) array;
/* 45 */            this.f149g = xe2.m9771i(c0894ev.f7889d);
/* 51 */            Object[] array2 = c0894ev.f7890e.toArray(new List[0]);
/* 55 */            array2.getClass();
/* 60 */            this.f150h = (List[]) array2;
/* 62 */            ArrayList arrayList2 = c0894ev.f7891f;
/* 64 */            arrayList2.getClass();
/* 71 */            boolean[] zArr = new boolean[arrayList2.size()];
/* 73 */            Iterator it = arrayList2.iterator();
/* 77 */            int i3 = 0;
/* 82 */            while (it.hasNext()) {
/* 96 */                zArr[i3] = ((Boolean) it.next()).booleanValue();
/* 94 */                i3++;
                    }
/* 100 */           String[] strArr = this.f148f;
/* 102 */           strArr.getClass();
/* 112 */           mx0 mx0Var = new mx0(new C1997od(strArr, 0), i2);
/* 123 */           ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(mx0Var, 10));
/* 126 */           Iterator it2 = mx0Var.iterator();
                    while (true) {
/* 131 */               sa0 sa0Var = (sa0) it2;
/* 139 */               if (!sa0Var.f16485b.hasNext()) {
/* 168 */                   this.f151i = oc1.m7133g(arrayList3);
/* 174 */                   this.f152j = xe2.m9771i(list);
/* 187 */                   this.f153k = r51.m8065b(new C0908f8(this, 9));
/* 189 */                   return;
                        }
/* 145 */               IndexedValue indexedValue = (IndexedValue) sa0Var.next();
/* 160 */               arrayList3.add(new Pair(indexedValue.f12912b, Integer.valueOf(indexedValue.f12911a)));
                    }
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f143a;
                }

                @Override // p000.InterfaceC1895lm
                /* JADX INFO: renamed from: b */
                public final Set mo131b() {
/* 1 */             return this.f147e;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: c */
                public final boolean mo132c() {
/* 1 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: d */
                public final int mo133d(String str) {
/* 1 */             str.getClass();
/* 10 */            Integer num = (Integer) this.f151i.get(str);
/* 12 */            if (num != null) {
/* 14 */                return num.intValue();
                    }
/* 19 */            return -3;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 1 */             return this.f144b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 98 */                return true;
                    }
/* 7 */             if (obj instanceof aa2) {
/* 11 */                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
/* 23 */                if (this.f143a.equals(serialDescriptor.mo130a()) && Arrays.equals(this.f152j, ((aa2) obj).f152j)) {
/* 39 */                    int iMo135f = serialDescriptor.mo135f();
/* 43 */                    int i = this.f145c;
/* 45 */                    if (i == iMo135f) {
/* 49 */                        for (int i2 = 0; i2 < i; i2++) {
/* 51 */                            SerialDescriptor[] serialDescriptorArr = this.f149g;
/* 71 */                            if (Intrinsics.m6216a(serialDescriptorArr[i2].mo130a(), serialDescriptor.mo138i(i2).mo130a()) && Intrinsics.m6216a(serialDescriptorArr[i2].mo134e(), serialDescriptor.mo138i(i2).mo134e())) {
                                    }
                                }
/* 98 */                        return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 1 */             return this.f145c;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 3 */             return this.f148f[i];
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 1 */             return this.f146d;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 3 */             return this.f150h[i];
                }

                public final int hashCode() {
/* 9 */             return ((Number) this.f153k.getValue()).intValue();
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 3 */             return this.f149g[i];
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 1 */             return false;
                }

                public final String toString() {
/* 29 */            return CollectionsKt.m6203x(r02.m8048e(0, this.f145c), ", ", this.f143a.concat("("), ")", new C1983o(this, 17), 24);
                }
            }
