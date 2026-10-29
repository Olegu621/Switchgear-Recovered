            package io.sentry;

            import io.sentry.android.replay.C1326k;
            import java.io.File;
            import java.io.FilenameFilter;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: io.sentry.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1694u implements FilenameFilter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11717a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f11718b;

                public /* synthetic */ C1694u(Object obj, int i) {
/* 1 */             this.f11717a = i;
/* 3 */             this.f11718b = obj;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) throws Exception {
/* 1 */             int i = this.f11717a;
/* 3 */             Object obj = this.f11718b;
                    switch (i) {
                        case 0:
/* 66 */                    return ((AbstractC1733w) obj).mo5057a(str);
                        default:
/* 8 */                     C1326k c1326k = (C1326k) obj;
/* 10 */                    str.getClass();
/* 20 */                    if (C1852e.m6257g(str, ".jpg", false)) {
/* 24 */                        File file2 = new File(file, str);
/* 27 */                        String name = file2.getName();
/* 31 */                        name.getClass();
/* 37 */                        int iM6229E = StringsKt.m6229E(6, name, ".");
/* 42 */                        if (iM6229E != -1) {
/* 45 */                            name = name.substring(0, iM6229E);
                                }
/* 49 */                        Long lM6238N = StringsKt.m6238N(name);
/* 53 */                        if (lM6238N != null) {
/* 60 */                            c1326k.m5013c(file2, lM6238N.longValue(), null);
                                }
                            }
/* 15 */                    return false;
                    }
                }
            }
