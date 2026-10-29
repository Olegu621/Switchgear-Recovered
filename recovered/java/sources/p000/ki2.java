            package p000;

            import java.util.Map;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ki2 {

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ u21[] f12790d = {new sy1(ki2.class, "userId", "getUserId()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, ki2.class, "networkUserId", "getNetworkUserId()Ljava/lang/String;", 0), new sy1(ki2.class, "domainUserId", "getDomainUserId()Ljava/lang/String;", 0), new sy1(ki2.class, "userAgent", "getUserAgent()Ljava/lang/String;", 0), new sy1(ki2.class, "ipAddress", "getIpAddress()Ljava/lang/String;", 0), new sy1(ki2.class, "timezone", "getTimezone()Ljava/lang/String;", 0), new sy1(ki2.class, "language", "getLanguage()Ljava/lang/String;", 0), new sy1(ki2.class, "screenResolution", "getScreenResolution()Lkotlin/Pair;", 0), new sy1(ki2.class, "screenViewport", "getScreenViewport()Lkotlin/Pair;", 0), new sy1(ki2.class, "colorDepth", "getColorDepth()Ljava/lang/Double;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f12791a;

                /* JADX INFO: renamed from: b */
                public final hk2 f12792b;

                /* JADX INFO: renamed from: c */
                public final hk2 f12793c;

                public ki2(Map map) {
/* 15 */            this.f12791a = mc1.m6639b(map, new C0197bz(23));
/* 19 */            final int i = 0;
/* 27 */            this.f12792b = r51.m8065b(new Function0(this) { // from class: ji2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ki2 f12318b;

                        {
/* 3 */                     this.f12318b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i2 = i;
/* 4 */                     ki2 ki2Var = this.f12318b;
                            switch (i2) {
                                case 0:
/* 68 */                            Pair pair = (Pair) mc1.m6638a(ki2Var.f12791a, ki2.f12790d[7].getName());
/* 70 */                            if (pair != null) {
/* 92 */                                return new te2((int) ((Number) pair.f12908a).doubleValue(), (int) ((Number) pair.f12909b).doubleValue());
                                    }
/* 3 */                             return null;
                                default:
/* 25 */                            Pair pair2 = (Pair) mc1.m6638a(ki2Var.f12791a, ki2.f12790d[8].getName());
/* 27 */                            if (pair2 != null) {
/* 49 */                                return new te2((int) ((Number) pair2.f12908a).doubleValue(), (int) ((Number) pair2.f12909b).doubleValue());
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
/* 31 */            final int i2 = 1;
/* 39 */            this.f12793c = r51.m8065b(new Function0(this) { // from class: ji2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ki2 f12318b;

                        {
/* 3 */                     this.f12318b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     int i3 = i2;
/* 4 */                     ki2 ki2Var = this.f12318b;
                            switch (i3) {
                                case 0:
/* 68 */                            Pair pair = (Pair) mc1.m6638a(ki2Var.f12791a, ki2.f12790d[7].getName());
/* 70 */                            if (pair != null) {
/* 92 */                                return new te2((int) ((Number) pair.f12908a).doubleValue(), (int) ((Number) pair.f12909b).doubleValue());
                                    }
/* 3 */                             return null;
                                default:
/* 25 */                            Pair pair2 = (Pair) mc1.m6638a(ki2Var.f12791a, ki2.f12790d[8].getName());
/* 27 */                            if (pair2 != null) {
/* 49 */                                return new te2((int) ((Number) pair2.f12908a).doubleValue(), (int) ((Number) pair2.f12909b).doubleValue());
                                    }
/* 3 */                             return null;
                            }
                        }
                    });
                }
            }
