            package p000;

            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1859c;
            import kotlinx.serialization.json.JsonNull;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class e21 extends AbstractC1946n {

                /* JADX INFO: renamed from: e */
                public final C1859c f7485e;

                /* JADX INFO: renamed from: f */
                public final String f7486f;

                /* JADX INFO: renamed from: g */
                public final SerialDescriptor f7487g;

                /* JADX INFO: renamed from: h */
                public int f7488h;

                /* JADX INFO: renamed from: i */
                public boolean f7489i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e21(b11 b11Var, C1859c c1859c, String str, SerialDescriptor serialDescriptor) {
/* 4 */             super(b11Var);
/* 1 */             b11Var.getClass();
/* 7 */             this.f7485e = c1859c;
/* 9 */             this.f7486f = str;
/* 11 */            this.f7487g = serialDescriptor;
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: G */
                public AbstractC1858b mo3292G(String str) {
/* 1 */             str.getClass();
/* 4 */             C1859c c1859cMo3294T = mo3294T();
/* 8 */             c1859cMo3294T.getClass();
/* 15 */            return (AbstractC1858b) mc1.m6638a(c1859cMo3294T, str);
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: Q */
                public String mo3293Q(SerialDescriptor serialDescriptor, int i) {
                    Object next;
/* 1 */             serialDescriptor.getClass();
/* 4 */             String strMo136g = serialDescriptor.mo136g(i);
/* 10 */            this.f14082d.getClass();
/* 27 */            if (!mo3294T().f12964a.keySet().contains(strMo136g)) {
/* 30 */                b11 b11Var = this.f14081c;
/* 32 */                b11Var.getClass();
/* 56 */                Map map = (Map) b11Var.f2164c.m10192c(serialDescriptor, new v11(0, serialDescriptor, w11.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1, 1));
/* 68 */                Iterator it = mo3294T().f12964a.keySet().iterator();
                        while (true) {
/* 76 */                    if (!it.hasNext()) {
/* 101 */                       next = null;
                                break;
                            }
/* 78 */                    next = it.next();
/* 89 */                    Integer num = (Integer) map.get((String) next);
/* 91 */                    if (num != null && num.intValue() == i) {
                                break;
                            }
                        }
/* 102 */               String str = (String) next;
/* 104 */               if (str != null) {
/* 107 */                   return str;
                        }
                    }
/* 106 */           return strMo136g;
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
                public C1859c mo3294T() {
/* 1 */             return this.f7485e;
                }

                @Override // p000.AbstractC1946n, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: b */
                public void mo3296b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             if (this.f14082d.f18681c || (serialDescriptor.mo134e() instanceof lt1)) {
/* 175 */               return;
                    }
/* 20 */            Set setM9766d = xe2.m9766d(serialDescriptor);
/* 24 */            b11 b11Var = this.f14081c;
/* 26 */            b11Var.getClass();
/* 29 */            C2515yy c2515yy = b11Var.f2164c;
/* 31 */            xt0 xt0Var = w11.f18416a;
/* 33 */            c2515yy.getClass();
/* 42 */            Map map = (Map) c2515yy.f19853a.get(serialDescriptor);
/* 52 */            Object obj = map != null ? map.get(xt0Var) : null;
/* 53 */            if (obj == null) {
/* 55 */                obj = null;
                    }
/* 56 */            Map map2 = (Map) obj;
/* 60 */            Set setKeySet = map2 != null ? map2.keySet() : null;
/* 64 */            if (setKeySet == null) {
/* 66 */                setKeySet = qd0.f15493a;
                    }
/* 68 */            setM9766d.getClass();
/* 71 */            setKeySet.getClass();
/* 89 */            LinkedHashSet linkedHashSet = new LinkedHashSet(nc1.m6962c(setM9766d.size() + setKeySet.size()));
/* 92 */            linkedHashSet.addAll(setM9766d);
/* 95 */            C2270uw.m9140k(linkedHashSet, setKeySet);
/* 116 */           for (String str : mo3294T().f12964a.keySet()) {
/* 128 */               if (!linkedHashSet.contains(str) && !Intrinsics.m6216a(str, this.f7486f)) {
/* 143 */                   String string = mo3294T().toString();
/* 147 */                   str.getClass();
/* 154 */                   StringBuilder sbM3513q = AbstractC0886en.m3513q("Encountered unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
/* 163 */                   sbM3513q.append((Object) kb1.m6038L(string, -1));
/* 174 */                   throw kb1.m6050c(-1, sbM3513q.toString());
                        }
                    }
                }

                @Override // p000.AbstractC1946n, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: c */
                public final InterfaceC1870ky mo3297c(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                    return serialDescriptor == this.f7487g ? this : super.mo3297c(serialDescriptor);
                }

                @Override // p000.AbstractC1946n, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: w */
                public final boolean mo3298w() {
                    return !this.f7489i && super.mo3298w();
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: x */
                public int mo3299x(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 10 */            while (this.f7488h < serialDescriptor.mo135f()) {
/* 12 */                int i = this.f7488h;
/* 16 */                this.f7488h = i + 1;
/* 18 */                String strM6847S = m6847S(serialDescriptor, i);
/* 24 */                int i2 = this.f7488h - 1;
/* 27 */                this.f7489i = false;
/* 33 */                boolean zContainsKey = mo3294T().containsKey(strM6847S);
/* 37 */                b11 b11Var = this.f14081c;
/* 39 */                if (zContainsKey) {
/* 50 */                    if (this.f14082d.f18682d) {
/* 52 */                        SerialDescriptor serialDescriptorMo138i = serialDescriptor.mo138i(i2);
/* 60 */                        if (serialDescriptorMo138i.mo132c() || !(mo3292G(strM6847S) instanceof JsonNull)) {
/* 81 */                            if (Intrinsics.m6216a(serialDescriptorMo138i.mo134e(), ca2.f2798k)) {
/* 83 */                                AbstractC1858b abstractC1858bMo3292G = mo3292G(strM6847S);
/* 89 */                                String strMo6271a = null;
/* 95 */                                AbstractC1860d abstractC1860d = abstractC1858bMo3292G instanceof AbstractC1860d ? (AbstractC1860d) abstractC1858bMo3292G : null;
/* 96 */                                if (abstractC1860d != null && !(abstractC1860d instanceof JsonNull)) {
/* 103 */                                   strMo6271a = abstractC1860d.mo6271a();
                                        }
/* 107 */                               if (strMo6271a != null && w11.m9444o(serialDescriptorMo138i, b11Var, strMo6271a) == -3) {
                                        }
                                    }
                                }
                            }
/* 118 */                   return i2;
                        }
/* 41 */                wl0 wl0Var = b11Var.f2162a;
/* 43 */                this.f7489i = false;
                    }
/* 119 */           return -1;
                }
            }
