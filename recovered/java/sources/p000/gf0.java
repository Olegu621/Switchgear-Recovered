            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gf0 {

                /* JADX INFO: renamed from: g */
                public static final /* synthetic */ u21[] f8576g = {new sy1(gf0.class, "tracker", "getTracker()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, gf0.class, "eventData", "getEventData()Ljava/util/Map;", 0), new sy1(gf0.class, "contexts", "getContexts()Ljava/util/List;", 0), new sy1(gf0.class, "mediaTrackingId", "getMediaTrackingId()Ljava/lang/String;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f8577a;

                /* JADX INFO: renamed from: b */
                public final Map f8578b;

                /* JADX INFO: renamed from: c */
                public final hk2 f8579c;

                /* JADX INFO: renamed from: d */
                public final hk2 f8580d;

                /* JADX INFO: renamed from: e */
                public final hk2 f8581e;

                /* JADX INFO: renamed from: f */
                public final hk2 f8582f;

                public gf0(Map map) {
/* 4 */             this.f8577a = map;
/* 16 */            this.f8578b = mc1.m6639b(map, new C0197bz(4));
/* 20 */            final int i = 0;
/* 28 */            this.f8579c = r51.m8065b(new Function0(this) { // from class: ff0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ gf0 f8186b;

                        {
/* 3 */                     this.f8186b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i2 = i;
/* 3 */                     ArrayList arrayList = null;
/* 4 */                     gf0 gf0Var = this.f8186b;
                            switch (i2) {
                                case 0:
/* 78 */                            List list = (List) mc1.m6638a(gf0Var.f8578b, gf0.f8576g[2].getName());
/* 80 */                            if (list != null) {
/* 90 */                                arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 93 */                                Iterator it = list.iterator();
/* 101 */                               while (it.hasNext()) {
/* 118 */                                   arrayList.add(new c92((Map) it.next()).m1552a());
                                        }
                                    }
/* 122 */                           return arrayList;
                                case 1:
/* 49 */                            Object obj = gf0Var.f8577a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 2:
/* 31 */                            Object obj2 = gf0Var.f8577a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = gf0Var.f8577a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 32 */            final int i2 = 1;
/* 40 */            this.f8580d = r51.m8065b(new Function0(this) { // from class: ff0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ gf0 f8186b;

                        {
/* 3 */                     this.f8186b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i3 = i2;
/* 3 */                     ArrayList arrayList = null;
/* 4 */                     gf0 gf0Var = this.f8186b;
                            switch (i3) {
                                case 0:
/* 78 */                            List list = (List) mc1.m6638a(gf0Var.f8578b, gf0.f8576g[2].getName());
/* 80 */                            if (list != null) {
/* 90 */                                arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 93 */                                Iterator it = list.iterator();
/* 101 */                               while (it.hasNext()) {
/* 118 */                                   arrayList.add(new c92((Map) it.next()).m1552a());
                                        }
                                    }
/* 122 */                           return arrayList;
                                case 1:
/* 49 */                            Object obj = gf0Var.f8577a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 2:
/* 31 */                            Object obj2 = gf0Var.f8577a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = gf0Var.f8577a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 44 */            final int i3 = 2;
/* 52 */            this.f8581e = r51.m8065b(new Function0(this) { // from class: ff0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ gf0 f8186b;

                        {
/* 3 */                     this.f8186b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i4 = i3;
/* 3 */                     ArrayList arrayList = null;
/* 4 */                     gf0 gf0Var = this.f8186b;
                            switch (i4) {
                                case 0:
/* 78 */                            List list = (List) mc1.m6638a(gf0Var.f8578b, gf0.f8576g[2].getName());
/* 80 */                            if (list != null) {
/* 90 */                                arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 93 */                                Iterator it = list.iterator();
/* 101 */                               while (it.hasNext()) {
/* 118 */                                   arrayList.add(new c92((Map) it.next()).m1552a());
                                        }
                                    }
/* 122 */                           return arrayList;
                                case 1:
/* 49 */                            Object obj = gf0Var.f8577a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 2:
/* 31 */                            Object obj2 = gf0Var.f8577a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = gf0Var.f8577a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 56 */            final int i4 = 3;
/* 64 */            this.f8582f = r51.m8065b(new Function0(this) { // from class: ff0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ gf0 f8186b;

                        {
/* 3 */                     this.f8186b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i5 = i4;
/* 3 */                     ArrayList arrayList = null;
/* 4 */                     gf0 gf0Var = this.f8186b;
                            switch (i5) {
                                case 0:
/* 78 */                            List list = (List) mc1.m6638a(gf0Var.f8578b, gf0.f8576g[2].getName());
/* 80 */                            if (list != null) {
/* 90 */                                arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 93 */                                Iterator it = list.iterator();
/* 101 */                               while (it.hasNext()) {
/* 118 */                                   arrayList.add(new c92((Map) it.next()).m1552a());
                                        }
                                    }
/* 122 */                           return arrayList;
                                case 1:
/* 49 */                            Object obj = gf0Var.f8577a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 2:
/* 31 */                            Object obj2 = gf0Var.f8577a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = gf0Var.f8577a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
                }

                /* JADX INFO: renamed from: a */
                public final void m3913a(AbstractC1812k abstractC1812k) {
/* 7 */             List list = (List) this.f8579c.getValue();
/* 9 */             if (list != null) {
/* 13 */                abstractC1812k.f12550a.addAll(list);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final Map m3914b() {
/* 16 */            return (Map) mc1.m6638a(this.f8577a, f8576g[1].getName());
                }
            }
