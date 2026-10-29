            package p000;

            import java.util.Map;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qy2 {

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ u21[] f15800e = {new sy1(qy2.class, "tracker", "getTracker()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, qy2.class, "mediaTrackingId", "getMediaTrackingId()Ljava/lang/String;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f15801a;

                /* JADX INFO: renamed from: b */
                public final hk2 f15802b;

                /* JADX INFO: renamed from: c */
                public final hk2 f15803c;

                /* JADX INFO: renamed from: d */
                public final hk2 f15804d;

                public qy2(Map map) {
/* 4 */             this.f15801a = map;
/* 8 */             final int i = 0;
/* 16 */            this.f15802b = r51.m8065b(new Function0(this) { // from class: py2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ qy2 f15340b;

                        {
/* 3 */                     this.f15340b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i2 = i;
/* 4 */                     qy2 qy2Var = this.f15340b;
                            switch (i2) {
                                case 0:
/* 49 */                            Object obj = qy2Var.f15801a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 1:
/* 31 */                            Object obj2 = qy2Var.f15801a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = qy2Var.f15801a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 20 */            final int i2 = 1;
/* 28 */            this.f15803c = r51.m8065b(new Function0(this) { // from class: py2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ qy2 f15340b;

                        {
/* 3 */                     this.f15340b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i3 = i2;
/* 4 */                     qy2 qy2Var = this.f15340b;
                            switch (i3) {
                                case 0:
/* 49 */                            Object obj = qy2Var.f15801a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 1:
/* 31 */                            Object obj2 = qy2Var.f15801a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = qy2Var.f15801a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 32 */            final int i3 = 2;
/* 40 */            this.f15804d = r51.m8065b(new Function0(this) { // from class: py2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ qy2 f15340b;

                        {
/* 3 */                     this.f15340b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i4 = i3;
/* 4 */                     qy2 qy2Var = this.f15340b;
                            switch (i4) {
                                case 0:
/* 49 */                            Object obj = qy2Var.f15801a.get("player");
/* 53 */                            if (obj != null) {
/* 59 */                                return new jf1((Map) obj);
                                    }
/* 3 */                             return null;
                                case 1:
/* 31 */                            Object obj2 = qy2Var.f15801a.get("ad");
/* 35 */                            if (obj2 != null) {
/* 41 */                                return new ae1((Map) obj2);
                                    }
/* 3 */                             return null;
                                default:
/* 13 */                            Object obj3 = qy2Var.f15801a.get("adBreak");
/* 17 */                            if (obj3 != null) {
/* 23 */                                return new ud1((Map) obj3);
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
                }
            }
