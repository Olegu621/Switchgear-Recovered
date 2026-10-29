            package kotlinx.serialization.internal;

            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import p000.C1983o;
            import p000.InterfaceC1895lm;
            import p000.ei2;
            import p000.gt1;
            import p000.nd0;
            import p000.od0;
            import p000.p51;
            import p000.py0;
            import p000.r02;
            import p000.r51;
            import p000.uq0;
            import p000.v51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class PluginGeneratedSerialDescriptor implements SerialDescriptor, InterfaceC1895lm {

                /* JADX INFO: renamed from: a */
                public final String f12950a;

                /* JADX INFO: renamed from: b */
                public final uq0 f12951b;

                /* JADX INFO: renamed from: c */
                public final int f12952c;

                /* JADX INFO: renamed from: d */
                public int f12953d;

                /* JADX INFO: renamed from: e */
                public final String[] f12954e;

                /* JADX INFO: renamed from: f */
                public final List[] f12955f;

                /* JADX INFO: renamed from: g */
                public final boolean[] f12956g;

                /* JADX INFO: renamed from: h */
                public Map f12957h;

                /* JADX INFO: renamed from: i */
                public final p51 f12958i;

                /* JADX INFO: renamed from: j */
                public final p51 f12959j;

                /* JADX INFO: renamed from: k */
                public final p51 f12960k;

                public PluginGeneratedSerialDescriptor(String str, uq0 uq0Var, int i) {
/* 1 */             str.getClass();
/* 7 */             this.f12950a = str;
/* 9 */             this.f12951b = uq0Var;
/* 11 */            this.f12952c = i;
/* 14 */            this.f12953d = -1;
/* 16 */            String[] strArr = new String[i];
/* 18 */            int i2 = 0;
/* 20 */            for (int i3 = 0; i3 < i; i3++) {
/* 24 */                strArr[i3] = "[UNINITIALIZED]";
                    }
/* 29 */            this.f12954e = strArr;
/* 31 */            int i4 = this.f12952c;
/* 35 */            this.f12955f = new List[i4];
/* 39 */            this.f12956g = new boolean[i4];
/* 41 */            od0 od0Var = od0.f14715a;
/* 43 */            od0Var.getClass();
/* 46 */            this.f12957h = od0Var;
/* 48 */            v51 v51Var = v51.f17865a;
/* 60 */            this.f12958i = r51.m8064a(v51Var, new gt1(this, 1));
/* 72 */            this.f12959j = r51.m8064a(v51Var, new gt1(this, 2));
/* 83 */            this.f12960k = r51.m8064a(v51Var, new gt1(this, i2));
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f12950a;
                }

                @Override // p000.InterfaceC1895lm
                /* JADX INFO: renamed from: b */
                public final Set mo131b() {
/* 3 */             return this.f12957h.keySet();
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
/* 10 */            Integer num = (Integer) this.f12957h.get(str);
/* 12 */            if (num != null) {
/* 14 */                return num.intValue();
                    }
/* 19 */            return -3;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public py0 mo134e() {
/* 1 */             return ei2.f7698k;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 113 */               return true;
                    }
/* 8 */             if (obj instanceof PluginGeneratedSerialDescriptor) {
/* 12 */                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
/* 24 */                if (Intrinsics.m6216a(this.f12950a, serialDescriptor.mo130a()) && Arrays.equals((SerialDescriptor[]) this.f12959j.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).f12959j.getValue())) {
/* 52 */                    int iMo135f = serialDescriptor.mo135f();
/* 56 */                    int i = this.f12952c;
/* 58 */                    if (i == iMo135f) {
/* 62 */                        for (int i2 = 0; i2 < i; i2++) {
/* 84 */                            if (Intrinsics.m6216a(mo138i(i2).mo130a(), serialDescriptor.mo138i(i2).mo130a()) && Intrinsics.m6216a(mo138i(i2).mo134e(), serialDescriptor.mo138i(i2).mo134e())) {
                                    }
                                }
/* 113 */                       return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 1 */             return this.f12952c;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 3 */             return this.f12954e[i];
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 1 */             return nd0.f14189a;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 3 */             List list = this.f12955f[i];
                    return list == null ? nd0.f14189a : list;
                }

                public int hashCode() {
/* 9 */             return ((Number) this.f12960k.getValue()).intValue();
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public SerialDescriptor mo138i(int i) {
/* 11 */            return ((KSerializer[]) this.f12958i.getValue())[i].getDescriptor();
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public boolean isInline() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: j */
                public final void m6270j(String str, boolean z) {
/* 1 */             str.getClass();
/* 6 */             int i = this.f12953d + 1;
/* 8 */             this.f12953d = i;
/* 10 */            String[] strArr = this.f12954e;
/* 12 */            strArr[i] = str;
/* 16 */            this.f12956g[i] = z;
/* 21 */            this.f12955f[i] = null;
/* 27 */            if (i == this.f12952c - 1) {
/* 31 */                HashMap map = new HashMap();
/* 34 */                int length = strArr.length;
/* 36 */                for (int i2 = 0; i2 < length; i2++) {
/* 44 */                    map.put(strArr[i2], Integer.valueOf(i2));
                        }
/* 50 */                this.f12957h = map;
                    }
                }

                public String toString() {
/* 40 */            return CollectionsKt.m6203x(r02.m8048e(0, this.f12952c), ", ", this.f12950a + '(', ")", new C1983o(this, 12), 24);
                }
            }
