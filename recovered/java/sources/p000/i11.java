            package p000;

            import java.util.Date;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i11 implements ud0 {

                /* JADX INFO: renamed from: f */
                public static final g11 f9392f;

                /* JADX INFO: renamed from: g */
                public static final g11 f9393g;

                /* JADX INFO: renamed from: a */
                public final HashMap f9395a;

                /* JADX INFO: renamed from: b */
                public final HashMap f9396b;

                /* JADX INFO: renamed from: c */
                public final f11 f9397c;

                /* JADX INFO: renamed from: d */
                public boolean f9398d;

                /* JADX INFO: renamed from: e */
                public static final f11 f9391e = new f11(0);

                /* JADX INFO: renamed from: h */
                public static final h11 f9394h = new h11();

                /* JADX WARN: Type inference failed for: r0v1, types: [g11] */
                /* JADX WARN: Type inference failed for: r0v2, types: [g11] */
                static {
/* 3 */             final int i = 0;
/* 14 */            f9392f = new s13() { // from class: g11
                        @Override // p000.td0
                        /* JADX INFO: renamed from: a */
                        public final void mo3633a(Object obj, Object obj2) {
                            switch (i) {
                                case 0:
/* 22 */                            ((t13) obj2).mo4052b((String) obj);
                                    break;
                                default:
/* 14 */                            ((t13) obj2).mo4053c(((Boolean) obj).booleanValue());
                                    break;
                            }
                        }
                    };
/* 18 */            final int i2 = 1;
/* 22 */            f9393g = new s13() { // from class: g11
                        @Override // p000.td0
                        /* JADX INFO: renamed from: a */
                        public final void mo3633a(Object obj, Object obj2) {
                            switch (i2) {
                                case 0:
/* 22 */                            ((t13) obj2).mo4052b((String) obj);
                                    break;
                                default:
/* 14 */                            ((t13) obj2).mo4053c(((Boolean) obj).booleanValue());
                                    break;
                            }
                        }
                    };
                }

                public i11() {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.f9395a = map;
/* 13 */            HashMap map2 = new HashMap();
/* 16 */            this.f9396b = map2;
/* 20 */            this.f9397c = f9391e;
/* 23 */            this.f9398d = false;
/* 29 */            map2.put(String.class, f9392f);
/* 32 */            map.remove(String.class);
/* 39 */            map2.put(Boolean.class, f9393g);
/* 42 */            map.remove(Boolean.class);
/* 49 */            map2.put(Date.class, f9394h);
/* 52 */            map.remove(Date.class);
                }

                /* JADX INFO: renamed from: a */
                public final ud0 m4415a(Class cls, cp1 cp1Var) {
/* 3 */             this.f9395a.put(cls, cp1Var);
/* 8 */             this.f9396b.remove(cls);
/* 11 */            return this;
                }
            }
