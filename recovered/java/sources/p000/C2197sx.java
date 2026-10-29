            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            
            /* JADX INFO: renamed from: sx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2197sx {

                /* JADX INFO: renamed from: a */
                public final String f16831a;

                /* JADX INFO: renamed from: b */
                public final Set f16832b;

                /* JADX INFO: renamed from: c */
                public final Set f16833c;

                /* JADX INFO: renamed from: d */
                public final int f16834d;

                /* JADX INFO: renamed from: e */
                public final int f16835e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC0934fy f16836f;

                /* JADX INFO: renamed from: g */
                public final Set f16837g;

                public C2197sx(String str, Set set, Set set2, int i, int i2, InterfaceC0934fy interfaceC0934fy, Set set3) {
/* 4 */             this.f16831a = str;
/* 10 */            this.f16832b = Collections.unmodifiableSet(set);
/* 16 */            this.f16833c = Collections.unmodifiableSet(set2);
/* 18 */            this.f16834d = i;
/* 20 */            this.f16835e = i2;
/* 22 */            this.f16836f = interfaceC0934fy;
/* 28 */            this.f16837g = Collections.unmodifiableSet(set3);
                }

                /* JADX INFO: renamed from: a */
                public static C2160rx m8643a(f02 f02Var) {
/* 6 */             return new C2160rx(f02Var, new f02[0]);
                }

                /* JADX INFO: renamed from: b */
                public static C2160rx m8644b(Class cls) {
/* 6 */             return new C2160rx(cls, new Class[0]);
                }

                /* JADX INFO: renamed from: c */
                public static C2197sx m8645c(Object obj, Class cls, Class... clsArr) {
/* 3 */             HashSet hashSet = new HashSet();
/* 8 */             HashSet hashSet2 = new HashSet();
/* 13 */            HashSet hashSet3 = new HashSet();
/* 20 */            hashSet.add(f02.m3619a(cls));
/* 26 */            for (Class cls2 : clsArr) {
/* 32 */                xe2.m9769g(cls2, "Null interface");
/* 39 */                hashSet.add(f02.m3619a(cls2));
                    }
/* 65 */            return new C2197sx(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C2123qx(obj, 1), hashSet3);
                }

                public final String toString() {
/* 64 */            return "Component<" + Arrays.toString(this.f16832b.toArray()) + ">{" + this.f16834d + ", type=" + this.f16835e + ", deps=" + Arrays.toString(this.f16833c.toArray()) + "}";
                }
            }
